package typingsSlinky.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.layuiSrc.layuiSrcStrings.dialog
import typingsSlinky.layuiSrc.layuiSrcStrings.iframe
import typingsSlinky.layuiSrc.layuiSrcStrings.loading
import typingsSlinky.layuiSrc.layuiSrcStrings.page
import typingsSlinky.layuiSrc.layuiSrcStrings.tips
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layer object
  * https://www.layui.com/doc/modules/layer.html#layer.tips
  */
@js.native
trait Layer extends js.Object {
  
  /**
    * 普通信息框
    */
  def alert(content: String): Double = js.native
  def alert(content: String, options: js.UndefOr[scala.Nothing], yes: LayerCallbackYes): Double = js.native
  def alert(content: String, options: LayerOptions): Double = js.native
  def alert(content: String, options: LayerOptions, yes: LayerCallbackYes): Double = js.native
  def alert(content: String, yes: LayerCallbackYes): Double = js.native
  
  // tips(content: string, follow: string | this, options?: LayerOptions): number;
  def close(index: Double): Unit = js.native
  
  def closeAll(): Unit = js.native
  @JSName("closeAll")
  def closeAll_dialog(`type`: dialog): Unit = js.native
  @JSName("closeAll")
  def closeAll_iframe(`type`: iframe): Unit = js.native
  @JSName("closeAll")
  def closeAll_loading(`type`: loading): Unit = js.native
  @JSName("closeAll")
  def closeAll_page(`type`: page): Unit = js.native
  @JSName("closeAll")
  def closeAll_tips(`type`: tips): Unit = js.native
  
  /**
    * 初始化全局配置
    */
  def config(options: LayerConfigOptions): Unit = js.native
  
  def confirm(content: String): Double = js.native
  def confirm(
    content: String,
    options: js.UndefOr[LayerCallbackYes],
    yes: LayerCallbackCancel | LayerCallbackYes
  ): Double = js.native
  def confirm(
    content: String,
    options: js.UndefOr[scala.Nothing],
    yes: js.UndefOr[LayerCallbackYes],
    cancel: LayerCallbackCancel
  ): Double = js.native
  def confirm(content: String, options: LayerOptions): Double = js.native
  def confirm(
    content: String,
    options: LayerOptions,
    yes: js.UndefOr[LayerCallbackYes],
    cancel: LayerCallbackCancel
  ): Double = js.native
  def confirm(content: String, options: LayerOptions, yes: LayerCallbackYes): Double = js.native
  def confirm(content: String, yes: LayerCallbackYes): Double = js.native
  
  def full(): Unit = js.native
  
  def getChildFrame(selector: String, index: Double): JQuery[HTMLElement] = js.native
  def getChildFrame(selector: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
  
  def getFrameIndex(windowName: String): Double = js.native
  
  def iframeAuto(index: Double): Unit = js.native
  
  def iframeSrc(index: Double, url: String): Unit = js.native
  
  def load(): Double = js.native
  def load(icon: js.UndefOr[scala.Nothing], options: LayerOptions): Double = js.native
  def load(icon: Double): Double = js.native
  def load(icon: Double, options: LayerOptions): Double = js.native
  def load(options: LayerOptions): Double = js.native
  
  def min(): Unit = js.native
  
  def msg(content: String): Double = js.native
  def msg(content: String, end: LayerCallbackEnd): Double = js.native
  def msg(content: String, options: js.UndefOr[scala.Nothing], end: LayerCallbackEnd): Double = js.native
  def msg(content: String, options: LayerOptions): Double = js.native
  def msg(content: String, options: LayerOptions, end: LayerCallbackEnd): Double = js.native
  
  /**
    * 原始核心方法
    */
  def open(): Double = js.native
  def open(options: LayerOptions): Double = js.native
  
  def photos(options: LayerPhotosOptions): Double = js.native
  
  def prompt(): Double = js.native
  def prompt(options: js.UndefOr[scala.Nothing], yes: LayerCallbackPrompt): Double = js.native
  def prompt(options: LayerPromptOptions): Double = js.native
  def prompt(options: LayerPromptOptions, yes: LayerCallbackPrompt): Double = js.native
  def prompt(yes: LayerCallbackPrompt): Double = js.native
  
  /**
    * 初始化就绪
    */
  // ready(path: string, callback: () => void): void; //兼容旧版？
  /**
    * 初始化就绪
    */
  def ready(callback: js.Function0[Unit]): Unit = js.native
  
  def restore(): Unit = js.native
  
  def setTop(layero: JQuery[HTMLElement]): Unit = js.native
  
  def style(index: Double, options: StringDictionary[String | Double]): Unit = js.native
  def style(index: Double, options: StringDictionary[String | Double], limit: Boolean): Unit = js.native
  
  def tab(options: LayerTabOptions): Double = js.native
  
  // 第二参数可以是'#id' 获取document.bod 或者JQuery
  def tips(content: String, follow: String): Double = js.native
  def tips(content: String, follow: String, options: LayerOptions): Double = js.native
  def tips(content: String, follow: JQuery[HTMLElement]): Double = js.native
  def tips(content: String, follow: JQuery[HTMLElement], options: LayerOptions): Double = js.native
  def tips(content: String, follow: HTMLElement): Double = js.native
  def tips(content: String, follow: HTMLElement, options: LayerOptions): Double = js.native
  
  def title(title: String, index: Double): Unit = js.native
}
