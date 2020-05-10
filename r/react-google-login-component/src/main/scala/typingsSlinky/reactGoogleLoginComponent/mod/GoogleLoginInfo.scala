package typingsSlinky.reactGoogleLoginComponent.mod

import typingsSlinky.reactGoogleLoginComponent.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleLoginInfo extends js.Object {
  def getAuthResponse(): AnonAccesstoken = js.native
}

object GoogleLoginInfo {
  @scala.inline
  def apply(getAuthResponse: () => AnonAccesstoken): GoogleLoginInfo = {
    val __obj = js.Dynamic.literal(getAuthResponse = js.Any.fromFunction0(getAuthResponse))
    __obj.asInstanceOf[GoogleLoginInfo]
  }
  @scala.inline
  implicit class GoogleLoginInfoOps[Self <: GoogleLoginInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAuthResponse(value: () => AnonAccesstoken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthResponse")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

