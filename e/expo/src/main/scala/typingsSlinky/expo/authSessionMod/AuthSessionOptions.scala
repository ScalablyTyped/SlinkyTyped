package typingsSlinky.expo.authSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSessionOptions extends js.Object {
  var authUrl: String
  var returnUrl: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthUrl(value: String): Self = this.set("authUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnUrl(value: String): Self = this.set("returnUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnUrl: Self = this.set("returnUrl", js.undefined)
  }
  
}

