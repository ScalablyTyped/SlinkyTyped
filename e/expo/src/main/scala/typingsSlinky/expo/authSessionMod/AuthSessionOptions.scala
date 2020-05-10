package typingsSlinky.expo.authSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthSessionOptions extends js.Object {
  var authUrl: String = js.native
  var returnUrl: js.UndefOr[String] = js.native
}

object AuthSessionOptions {
  @scala.inline
  def apply(authUrl: String): AuthSessionOptions = {
    val __obj = js.Dynamic.literal(authUrl = authUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionOptions]
  }
  @scala.inline
  implicit class AuthSessionOptionsOps[Self <: AuthSessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnUrl")(js.undefined)
        ret
    }
  }
  
}

