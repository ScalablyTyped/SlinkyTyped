package typingsSlinky.instagramPrivateApi.loginRequiredResponseMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.fail
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.login_required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginRequiredResponse extends js.Object {
  var logout_reason: Double = js.native
  var message: login_required = js.native
  var status: fail = js.native
}

object LoginRequiredResponse {
  @scala.inline
  def apply(logout_reason: Double, message: login_required, status: fail): LoginRequiredResponse = {
    val __obj = js.Dynamic.literal(logout_reason = logout_reason.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRequiredResponse]
  }
  @scala.inline
  implicit class LoginRequiredResponseOps[Self <: LoginRequiredResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogout_reason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: login_required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: fail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

