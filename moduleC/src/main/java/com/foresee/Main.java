package com.foresee;

import org.yuanrui.controller.MulController;
import org.yuanrui.service.AServicce;

/**
 * @author: yuanrui
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(MulController.getDetail());

        System.out.println(AServicce.service());
    }
}