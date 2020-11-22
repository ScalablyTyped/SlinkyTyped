package typingsSlinky.antvGBase

import typingsSlinky.antvGBase.interfacesMod.ICanvas
import typingsSlinky.antvGBase.interfacesMod.IElement
import typingsSlinky.d3Timer.mod.Timer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/animate/timeline", JSImport.Namespace)
@js.native
object timelineMod extends js.Object {
  
  @js.native
  trait Timeline extends js.Object {
    
    /**
      * 增加动画元素
      */
    def addAnimator(shape: js.Any): Unit = js.native
    
    /**
      * 执行动画的元素列表
      * @type {IElement[]}
      */
    var animators: js.Array[IElement] = js.native
    
    /**
      * 画布
      * @type {ICanvas}
      */
    var canvas: ICanvas = js.native
    
    /**
      * 当前时间
      * @type {number}
      */
    var current: Double = js.native
    
    /**
      * 获取当前时间
      */
    def getTime(): Double = js.native
    
    /**
      * 初始化定时器
      */
    def initTimer(): Unit = js.native
    
    /**
      * 是否有动画在执行
      */
    def isAnimating(): Boolean = js.native
    
    /**
      * 移除动画元素
      */
    def removeAnimator(index: js.Any): Unit = js.native
    
    /**
      * 停止定时器
      */
    def stop(): Unit = js.native
    
    /**
      * 停止时间轴上所有元素的动画，并置空动画元素列表
      * @param {boolean} toEnd 是否到动画的最终状态，用来透传给动画元素的 stopAnimate 方法
      */
    def stopAllAnimations(): Unit = js.native
    def stopAllAnimations(toEnd: Boolean): Unit = js.native
    
    /**
      * 定时器
      * @type {d3Timer.Timer}
      */
    var timer: Timer_ = js.native
  }
  
  @js.native
  class default protected () extends Timeline {
    /**
      * 时间轴构造函数，依赖于画布
      * @param {}
      */
    def this(canvas: ICanvas) = this()
  }
}
