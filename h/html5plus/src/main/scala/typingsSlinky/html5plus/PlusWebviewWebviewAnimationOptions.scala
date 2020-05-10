package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.close
import typingsSlinky.html5plus.html5plusStrings.hide
import typingsSlinky.html5plus.html5plusStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口动画参数
  * 用于指定动画目标窗口，起始位置、目标位置等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewAnimationOptions extends js.Object {
  /**
    * 窗口动画完成后的行为
    * 可取值：
    * 	"none" - 动画完成后不做任何操作；
    * 	"hide" - 动画完成后隐藏窗口；
    * 	"close" - 动画完成后关闭窗口。
    * 	默认值为"none"。
    * - none: 动画完成后不做任何操作
    * - hide: 动画完成后隐藏窗口
    * - close: 动画完成后关闭窗口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var action: js.UndefOr[none | hide | close] = js.native
  /**
    * 动画样式
    * 用于指定动画窗口的起始位置，目标位置等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var styles: js.UndefOr[PlusWebviewWebviewAnimationStyles] = js.native
  /**
    * 执行动画的窗口对象
    * 可取值Webview窗口对象、Webview窗口的id（String类型）、原生View窗口对象（plus.nativeObj.View）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var view: js.UndefOr[PlusWebviewWebviewObject] = js.native
}

object PlusWebviewWebviewAnimationOptions {
  @scala.inline
  def apply(): PlusWebviewWebviewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewAnimationOptions]
  }
  @scala.inline
  implicit class PlusWebviewWebviewAnimationOptionsOps[Self <: PlusWebviewWebviewAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: none | hide | close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PlusWebviewWebviewAnimationStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: PlusWebviewWebviewObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

