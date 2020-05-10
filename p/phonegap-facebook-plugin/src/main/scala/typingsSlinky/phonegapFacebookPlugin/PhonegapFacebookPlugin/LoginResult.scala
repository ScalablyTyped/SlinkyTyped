package typingsSlinky.phonegapFacebookPlugin.PhonegapFacebookPlugin

import typingsSlinky.phonegapFacebookPlugin.AnonAccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Callback Results
/**
  * Result for the login() and getLoginStatus() success callbacks.
  */
@js.native
trait LoginResult extends js.Object {
  var authResponse: AnonAccessToken = js.native
  var status: String = js.native
}

object LoginResult {
  @scala.inline
  def apply(authResponse: AnonAccessToken, status: String): LoginResult = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  @scala.inline
  implicit class LoginResultOps[Self <: LoginResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthResponse(value: AnonAccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

