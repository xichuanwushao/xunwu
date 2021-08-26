package com.xichuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(Model modl) {
        modl.addAttribute("name"," 西川");
        return "index";
    }

}
