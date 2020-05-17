package typingsSlinky.firebaseMessaging.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserErrorMessage extends js.Object {
  var browserErrorMessage: String = js.native
}

object BrowserErrorMessage {
  @scala.inline
  def apply(browserErrorMessage: String): BrowserErrorMessage = {
    val __obj = js.Dynamic.literal(browserErrorMessage = browserErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserErrorMessage]
  }
  @scala.inline
  implicit class BrowserErrorMessageOps[Self <: BrowserErrorMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

