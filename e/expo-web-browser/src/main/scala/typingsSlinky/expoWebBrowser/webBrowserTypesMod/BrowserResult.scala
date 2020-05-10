package typingsSlinky.expoWebBrowser.webBrowserTypesMod

import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.cancel
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.dismiss
import typingsSlinky.expoWebBrowser.expoWebBrowserStrings.opened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserResult extends AuthSessionResult {
  var `type`: cancel | dismiss | opened = js.native
}

object BrowserResult {
  @scala.inline
  def apply(`type`: cancel | dismiss | opened): BrowserResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserResult]
  }
  @scala.inline
  implicit class BrowserResultOps[Self <: BrowserResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: cancel | dismiss | opened): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

