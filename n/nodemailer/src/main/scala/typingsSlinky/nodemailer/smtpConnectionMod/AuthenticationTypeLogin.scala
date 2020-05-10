package typingsSlinky.nodemailer.smtpConnectionMod

import typingsSlinky.nodemailer.nodemailerStrings.LOGIN
import typingsSlinky.nodemailer.nodemailerStrings.Login_
import typingsSlinky.nodemailer.nodemailerStrings.login__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationTypeLogin
  extends Credentials
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[login__ | Login_ | LOGIN] = js.native
}

object AuthenticationTypeLogin {
  @scala.inline
  def apply(pass: String, user: String): AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeLogin]
  }
  @scala.inline
  implicit class AuthenticationTypeLoginOps[Self <: AuthenticationTypeLogin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: login__ | Login_ | LOGIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

