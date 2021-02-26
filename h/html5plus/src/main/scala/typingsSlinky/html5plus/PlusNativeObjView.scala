package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生控件对象
  * 原生控件对象可用于在屏幕上绘制图片或文本内容，当控件不再使用时需要调用close方法销毁控件。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjView extends StObject {
  
  /**
    * 添加事件监听器
    * 向View控件添加事件监听器，当指定的事件发生时，将触发listener函数的执行。
    *         可多次调用此方法向Webview添加多个监听器，当监听的事件发生时，将按照添加的先后顺序执行。
    *         可通过setTouchEventRect方法指定监听触屏操作的区域。
    *         注意：默认View控件拦截处理触屏事件，可调用view.interceptTouchEvent(false)改变为不拦截处理触屏事件（透传）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(event: js.UndefOr[scala.Nothing], listener: js.UndefOr[scala.Nothing], capture: Boolean): Unit = js.native
  def addEventListener(event: js.UndefOr[scala.Nothing], listener: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addEventListener(
    event: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* result */ js.Any, Unit],
    capture: Boolean
  ): Unit = js.native
  def addEventListener(event: PlusNativeObjViewEvents): Unit = js.native
  def addEventListener(event: PlusNativeObjViewEvents, listener: js.UndefOr[scala.Nothing], capture: Boolean): Unit = js.native
  def addEventListener(event: PlusNativeObjViewEvents, listener: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addEventListener(
    event: PlusNativeObjViewEvents,
    listener: js.Function1[/* result */ js.Any, Unit],
    capture: Boolean
  ): Unit = js.native
  
  /**
    * View控件内容动画
    * 动画后可能会导致View控件显示内容改变，可通过调用restore方法恢复。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def animate(): Unit = js.native
  def animate(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def animate(options: PlusNativeObjViewAnimationOptions): Unit = js.native
  def animate(options: PlusNativeObjViewAnimationOptions, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 静态方法，关闭原生动画窗口
    * 通过plus.nativeObj.View.startAnimation方法开始原生动画后，不会自动关闭原生动画窗口对象，需要调用此方法关闭原生动画。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def clearAnimation(): Unit = js.native
  def clearAnimation(`type`: String): Unit = js.native
  
  /**
    * 清空矩形区域
    * 清除指定矩形区域内容，透明显示其后面的内容。
    *     可多次调用设置多个区域透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def clearRect(): Unit = js.native
  def clearRect(position: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def clearRect(position: PlusNativeObjPosition): Unit = js.native
  def clearRect(position: PlusNativeObjPosition, id: String): Unit = js.native
  
  /**
    * 关闭View控件
    * 释放View控件资源，View对象不可再操作，如果View控件已经显示则自动隐藏。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def close(): Unit = js.native
  
  /**
    * 绘制内容
    * 在当前View控件之上绘制指定的内容，可一次指定绘制多个元素，绘制元素可以是图片/矩形区域/文本，
    *     即将多次调用drawBitmap/drawRect/drawText方法合并调用一次draw方法来实现，
    *     推荐使用draw方法来替换多次调用drawBitmap/drawRect/drawText。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def draw(): Unit = js.native
  def draw(tags: js.Array[PlusNativeObj]): Unit = js.native
  
  /**
    * 绘制图片
    * 在当前View控件之上绘制指定的图片，如果图片无效则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawBitmap(): Unit = js.native
  def drawBitmap(
    src: js.UndefOr[scala.Nothing],
    sprite: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    id: String
  ): Unit = js.native
  def drawBitmap(src: js.UndefOr[scala.Nothing], sprite: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition): Unit = js.native
  def drawBitmap(
    src: js.UndefOr[scala.Nothing],
    sprite: js.UndefOr[scala.Nothing],
    position: PlusNativeObjPosition,
    id: String
  ): Unit = js.native
  def drawBitmap(src: js.UndefOr[scala.Nothing], sprite: PlusNativeObjPosition): Unit = js.native
  def drawBitmap(
    src: js.UndefOr[scala.Nothing],
    sprite: PlusNativeObjPosition,
    position: js.UndefOr[scala.Nothing],
    id: String
  ): Unit = js.native
  def drawBitmap(src: js.UndefOr[scala.Nothing], sprite: PlusNativeObjPosition, position: PlusNativeObjPosition): Unit = js.native
  def drawBitmap(
    src: js.UndefOr[scala.Nothing],
    sprite: PlusNativeObjPosition,
    position: PlusNativeObjPosition,
    id: String
  ): Unit = js.native
  def drawBitmap(src: String): Unit = js.native
  def drawBitmap(src: String, sprite: js.UndefOr[scala.Nothing], position: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawBitmap(src: String, sprite: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition): Unit = js.native
  def drawBitmap(src: String, sprite: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition, id: String): Unit = js.native
  def drawBitmap(src: String, sprite: PlusNativeObjPosition): Unit = js.native
  def drawBitmap(src: String, sprite: PlusNativeObjPosition, position: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawBitmap(src: String, sprite: PlusNativeObjPosition, position: PlusNativeObjPosition): Unit = js.native
  def drawBitmap(src: String, sprite: PlusNativeObjPosition, position: PlusNativeObjPosition, id: String): Unit = js.native
  
  /**
    * 绘制输入框
    * 在当前View控件之上绘制输入框。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawInput(): Unit = js.native
  def drawInput(position: js.UndefOr[scala.Nothing], styles: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawInput(position: js.UndefOr[scala.Nothing], styles: PlusNativeObjInputStyles): Unit = js.native
  def drawInput(position: js.UndefOr[scala.Nothing], styles: PlusNativeObjInputStyles, id: String): Unit = js.native
  def drawInput(position: PlusNativeObjPosition): Unit = js.native
  def drawInput(position: PlusNativeObjPosition, styles: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawInput(position: PlusNativeObjPosition, styles: PlusNativeObjInputStyles): Unit = js.native
  def drawInput(position: PlusNativeObjPosition, styles: PlusNativeObjInputStyles, id: String): Unit = js.native
  
  /**
    * 绘制矩形区域
    * 在当前View控件之上绘制指定颜色的矩形区域。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawRect(): Unit = js.native
  def drawRect(styles: js.UndefOr[scala.Nothing], position: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawRect(styles: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition): Unit = js.native
  def drawRect(styles: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition, id: String): Unit = js.native
  def drawRect(styles: PlusNativeObjRectStyles): Unit = js.native
  def drawRect(styles: PlusNativeObjRectStyles, position: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawRect(styles: PlusNativeObjRectStyles, position: PlusNativeObjPosition): Unit = js.native
  def drawRect(styles: PlusNativeObjRectStyles, position: PlusNativeObjPosition, id: String): Unit = js.native
  
  /**
    * 绘制富文本
    * 在当前View控件之上绘制指定的文本内容，如果文本为空则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawRichText(): Unit = js.native
  def drawRichText(
    text: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    id: String
  ): Unit = js.native
  def drawRichText(
    text: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    styles: PlusNativeObjRichTextStyles
  ): Unit = js.native
  def drawRichText(
    text: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    styles: PlusNativeObjRichTextStyles,
    id: String
  ): Unit = js.native
  def drawRichText(text: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition): Unit = js.native
  def drawRichText(
    text: js.UndefOr[scala.Nothing],
    position: PlusNativeObjPosition,
    styles: js.UndefOr[scala.Nothing],
    id: String
  ): Unit = js.native
  def drawRichText(
    text: js.UndefOr[scala.Nothing],
    position: PlusNativeObjPosition,
    styles: PlusNativeObjRichTextStyles
  ): Unit = js.native
  def drawRichText(
    text: js.UndefOr[scala.Nothing],
    position: PlusNativeObjPosition,
    styles: PlusNativeObjRichTextStyles,
    id: String
  ): Unit = js.native
  def drawRichText(text: String): Unit = js.native
  def drawRichText(text: String, position: js.UndefOr[scala.Nothing], styles: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawRichText(text: String, position: js.UndefOr[scala.Nothing], styles: PlusNativeObjRichTextStyles): Unit = js.native
  def drawRichText(text: String, position: js.UndefOr[scala.Nothing], styles: PlusNativeObjRichTextStyles, id: String): Unit = js.native
  def drawRichText(text: String, position: PlusNativeObjPosition): Unit = js.native
  def drawRichText(text: String, position: PlusNativeObjPosition, styles: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawRichText(text: String, position: PlusNativeObjPosition, styles: PlusNativeObjRichTextStyles): Unit = js.native
  def drawRichText(text: String, position: PlusNativeObjPosition, styles: PlusNativeObjRichTextStyles, id: String): Unit = js.native
  
  /**
    * 绘制文本
    * 在当前View控件之上绘制指定的文本内容，如果文本为空则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def drawText(): Unit = js.native
  def drawText(
    text: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    styles: js.UndefOr[scala.Nothing],
    id: String
  ): Unit = js.native
  def drawText(
    text: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    styles: PlusNativeObjTextStyles
  ): Unit = js.native
  def drawText(
    text: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    styles: PlusNativeObjTextStyles,
    id: String
  ): Unit = js.native
  def drawText(text: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition): Unit = js.native
  def drawText(
    text: js.UndefOr[scala.Nothing],
    position: PlusNativeObjPosition,
    styles: js.UndefOr[scala.Nothing],
    id: String
  ): Unit = js.native
  def drawText(text: js.UndefOr[scala.Nothing], position: PlusNativeObjPosition, styles: PlusNativeObjTextStyles): Unit = js.native
  def drawText(
    text: js.UndefOr[scala.Nothing],
    position: PlusNativeObjPosition,
    styles: PlusNativeObjTextStyles,
    id: String
  ): Unit = js.native
  def drawText(text: String): Unit = js.native
  def drawText(text: String, position: js.UndefOr[scala.Nothing], styles: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawText(text: String, position: js.UndefOr[scala.Nothing], styles: PlusNativeObjTextStyles): Unit = js.native
  def drawText(text: String, position: js.UndefOr[scala.Nothing], styles: PlusNativeObjTextStyles, id: String): Unit = js.native
  def drawText(text: String, position: PlusNativeObjPosition): Unit = js.native
  def drawText(text: String, position: PlusNativeObjPosition, styles: js.UndefOr[scala.Nothing], id: String): Unit = js.native
  def drawText(text: String, position: PlusNativeObjPosition, styles: PlusNativeObjTextStyles): Unit = js.native
  def drawText(text: String, position: PlusNativeObjPosition, styles: PlusNativeObjTextStyles, id: String): Unit = js.native
  
  /**
    * 获取编辑框的焦点状态
    * 通过id查找到指定的编辑框，获取其焦点状态。
    *     如果指定的id无效则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getInputFocusById(): Boolean = js.native
  def getInputFocusById(id: String): Boolean = js.native
  
  /**
    * 获取编辑框的内容
    * 通过id查找到指定的编辑框，获取其输入的字符串。
    *     如果指定的id无效则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getInputValueById(): String = js.native
  def getInputValueById(id: String): String = js.native
  
  /**
    * 静态方法，获取指定标识的View控件对象
    * 如果存在多个指定id标识的View对象，则返回第一个创建的View控件对象。
    *     如果不存在指定id标识的View对象，则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def getViewById(): PlusNativeObjView = js.native
  def getViewById(id: String): PlusNativeObjView = js.native
  
  /**
    * 隐藏View控件
    * 将View控件从屏幕隐藏，如果View控件未显示则不做任何操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def hide(): Unit = js.native
  
  /**
    * View对象的标识
    * 在创建原生控件View对象时设置，如果没有设置标识，此属性值为null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 是否拦截View控件的触屏事件
    * 设置为拦截后View控件上的触屏事件不再传递（即不透传），否则触屏事件将继续传递给View控件下的其它窗口处理（即透传）。
    *     注意：View控件默认拦截触屏事件（不透传）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def interceptTouchEvent(): Unit = js.native
  def interceptTouchEvent(intercept: Boolean): Unit = js.native
  
  /**
    * 获取View控件的显示状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def isVisible(): Boolean = js.native
  
  /**
    * 重置view控件显示内容
    * 清除调用drawBitmap、drawText方法绘制的内容，将View控件重置为空内容（透明不可见）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def reset(): Unit = js.native
  
  /**
    * 恢复View控件显示内容
    * 恢复调用animate方法改变View控件的内容，更新至动画前的内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def restore(): Unit = js.native
  
  /**
    * 设置编辑框的焦点状态
    * 通过id查找到指定的编辑框，并设置编辑框的焦点状态。
    *     如果指定的id无效则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def setInputFocusById(): String = js.native
  def setInputFocusById(id: js.UndefOr[scala.Nothing], focusable: Boolean): String = js.native
  def setInputFocusById(id: String): String = js.native
  def setInputFocusById(id: String, focusable: Boolean): String = js.native
  
  /**
    * 设置View控件的样式
    * 动态更新View控件样式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def setStyle(): Unit = js.native
  def setStyle(styles: PlusNativeObjViewStyles): Unit = js.native
  
  /**
    * 指定监听触屏事件区域
    * 当调用addEventListener监听View控件事件时，可调用此方法限定监听事件的区域，仅当用户触屏操作在指定区域时才触发监听事件。
    *     非限定监听事件的区域则不拦截，透传给其它窗口处理。
    *     注意：此操作覆盖之前设置的区域。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def setTouchEventRect(): Unit = js.native
  def setTouchEventRect(rect: js.Array[PlusNativeObj]): Unit = js.native
  
  /**
    * 显示View控件
    * 将View控件显示到屏幕，显示在所有Webview窗口之上。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def show(): Unit = js.native
  
  /**
    * 静态方法，开始原生动画
    * 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  def startAnimation(): Unit = js.native
  def startAnimation(
    options: js.UndefOr[scala.Nothing],
    view: js.UndefOr[scala.Nothing],
    otherview: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def startAnimation(
    options: js.UndefOr[scala.Nothing],
    view: js.UndefOr[scala.Nothing],
    otherview: PlusNativeObjAnimationViewStyles
  ): Unit = js.native
  def startAnimation(
    options: js.UndefOr[scala.Nothing],
    view: js.UndefOr[scala.Nothing],
    otherview: PlusNativeObjAnimationViewStyles,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def startAnimation(options: js.UndefOr[scala.Nothing], view: PlusNativeObjAnimationViewStyles): Unit = js.native
  def startAnimation(
    options: js.UndefOr[scala.Nothing],
    view: PlusNativeObjAnimationViewStyles,
    otherview: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def startAnimation(
    options: js.UndefOr[scala.Nothing],
    view: PlusNativeObjAnimationViewStyles,
    otherview: PlusNativeObjAnimationViewStyles
  ): Unit = js.native
  def startAnimation(
    options: js.UndefOr[scala.Nothing],
    view: PlusNativeObjAnimationViewStyles,
    otherview: PlusNativeObjAnimationViewStyles,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def startAnimation(options: PlusNativeObjAnimationOptions): Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: js.UndefOr[scala.Nothing],
    otherview: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: js.UndefOr[scala.Nothing],
    otherview: PlusNativeObjAnimationViewStyles
  ): Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: js.UndefOr[scala.Nothing],
    otherview: PlusNativeObjAnimationViewStyles,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def startAnimation(options: PlusNativeObjAnimationOptions, view: PlusNativeObjAnimationViewStyles): Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: PlusNativeObjAnimationViewStyles,
    otherview: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: PlusNativeObjAnimationViewStyles,
    otherview: PlusNativeObjAnimationViewStyles
  ): Unit = js.native
  def startAnimation(
    options: PlusNativeObjAnimationOptions,
    view: PlusNativeObjAnimationViewStyles,
    otherview: PlusNativeObjAnimationViewStyles,
    callback: js.Function0[Unit]
  ): Unit = js.native
}
