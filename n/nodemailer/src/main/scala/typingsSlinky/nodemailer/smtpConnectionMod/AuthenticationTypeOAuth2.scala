package typingsSlinky.nodemailer.smtpConnectionMod

import typingsSlinky.nodemailer.nodemailerStrings.OAUTH2
import typingsSlinky.nodemailer.nodemailerStrings.OAuth2_
import typingsSlinky.nodemailer.nodemailerStrings.oauth2__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationTypeOAuth2
  extends typingsSlinky.nodemailer.xoauth2Mod.Options
     with AuthenticationType {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: js.UndefOr[oauth2__ | OAuth2_ | OAUTH2] = js.native
}

object AuthenticationTypeOAuth2 {
  @scala.inline
  def apply(): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
  @scala.inline
  implicit class AuthenticationTypeOAuth2Ops[Self <: AuthenticationTypeOAuth2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: oauth2__ | OAuth2_ | OAUTH2): Self = {
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

