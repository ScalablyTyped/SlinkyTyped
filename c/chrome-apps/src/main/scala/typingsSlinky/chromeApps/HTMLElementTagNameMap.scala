package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElementTagNameMap extends js.Object {
  var appview: HTMLAppViewElement = js.native
  var webview: HTMLWebViewElement = js.native
}

object HTMLElementTagNameMap {
  @scala.inline
  def apply(appview: HTMLAppViewElement, webview: HTMLWebViewElement): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal(appview = appview.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
  @scala.inline
  implicit class HTMLElementTagNameMapOps[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppview(value: HTMLAppViewElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebview(value: HTMLWebViewElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

