package typingsSlinky.nodemailer.smtpConnectionMod

import typingsSlinky.nodemailer.nodemailerStrings.CUSTOM
import typingsSlinky.nodemailer.nodemailerStrings.Custom_
import typingsSlinky.nodemailer.nodemailerStrings.custom__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeCustom
  - typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeLogin
  - typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends js.Object
object AuthenticationType {
  
  @scala.inline
  def AuthenticationTypeCustom(method: String, pass: String, `type`: custom__ | Custom_ | CUSTOM, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  
  @scala.inline
  def AuthenticationTypeLogin(pass: String, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  
  @scala.inline
  def AuthenticationTypeOAuth2(): AuthenticationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationType]
  }
}
