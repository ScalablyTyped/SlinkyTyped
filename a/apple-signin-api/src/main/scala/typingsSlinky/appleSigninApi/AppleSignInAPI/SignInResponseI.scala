package typingsSlinky.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/signinresponsei
@js.native
trait SignInResponseI extends js.Object {
  var authorization: AuthorizationI = js.native
  var user: js.UndefOr[UserI] = js.native
}

object SignInResponseI {
  @scala.inline
  def apply(authorization: AuthorizationI): SignInResponseI = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInResponseI]
  }
  @scala.inline
  implicit class SignInResponseIOps[Self <: SignInResponseI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: AuthorizationI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: UserI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

