package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，Webview窗口的系统状态栏区域样式
  * 仅在应用设置为沉浸式状态栏样式下有效，非沉浸式状态栏样式下忽略此属性。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewStatusbarStyles extends js.Object {
  /**
    * 系统状态栏区域背景颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示为红色背景。
    * 	默认值为应用manifest.json中plus-&gt;statusbar-&gt;background属性配置的值，如果未配置此属性值，则使用系统默认状态栏的背景颜色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var background: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewStatusbarStyles {
  @scala.inline
  def apply(): PlusWebviewWebviewStatusbarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewStatusbarStyles]
  }
  @scala.inline
  implicit class PlusWebviewWebviewStatusbarStylesOps[Self <: PlusWebviewWebviewStatusbarStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
  }
  
}

