package typingsSlinky.meteorPrime8consultingOauth2.OAuth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthCodeGrantResult extends js.Object {
  var authorizationCode: String = js.native
  var error: js.Any = js.native
  var redirectToUri: String = js.native
  var success: Boolean = js.native
}

object AuthCodeGrantResult {
  @scala.inline
  def apply(authorizationCode: String, error: js.Any, redirectToUri: String, success: Boolean): AuthCodeGrantResult = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], redirectToUri = redirectToUri.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCodeGrantResult]
  }
  @scala.inline
  implicit class AuthCodeGrantResultOps[Self <: AuthCodeGrantResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectToUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectToUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

