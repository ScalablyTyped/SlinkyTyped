package typingsSlinky.nodemailer.smtpTransportMod

import typingsSlinky.nodemailer.nodemailerStrings.OAUTH2
import typingsSlinky.nodemailer.nodemailerStrings.XOAUTH2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationTypeOAuth2 extends AuthenticationType {
  var method: XOAUTH2 = js.native
  var oauth2: typingsSlinky.nodemailer.xoauth2Mod.^ = js.native
  var `type`: OAUTH2 = js.native
  var user: String = js.native
}

object AuthenticationTypeOAuth2 {
  @scala.inline
  def apply(method: XOAUTH2, oauth2: typingsSlinky.nodemailer.xoauth2Mod.^, `type`: OAUTH2, user: String): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
  @scala.inline
  implicit class AuthenticationTypeOAuth2Ops[Self <: AuthenticationTypeOAuth2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: XOAUTH2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOauth2(value: typingsSlinky.nodemailer.xoauth2Mod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: OAUTH2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

