package typingsSlinky.nodemailer.libSmtpDashTransportMod

import typingsSlinky.nodemailer.libSmtpDashConnectionMod.Credentials
import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import typingsSlinky.nodemailer.nodemailerStrings.LOGIN
import typingsSlinky.nodemailer.nodemailerStrings.OAUTH2
import typingsSlinky.nodemailer.nodemailerStrings.XOAUTH2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.libSmtpDashTransportMod.AuthenticationTypeLogin
  - typings.nodemailer.libSmtpDashTransportMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends js.Object

object AuthenticationType {
  @scala.inline
  def AuthenticationTypeLogin(credentials: Credentials, method: String | `false`, `type`: LOGIN, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  @scala.inline
  def AuthenticationTypeOAuth2(method: XOAUTH2, oauth2: typingsSlinky.nodemailer.libXoauth2Mod.^, `type`: OAUTH2, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
}

