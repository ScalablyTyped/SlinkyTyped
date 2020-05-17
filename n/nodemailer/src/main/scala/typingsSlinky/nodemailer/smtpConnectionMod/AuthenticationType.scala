package typingsSlinky.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeCustom
  - typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeLogin
  - typingsSlinky.nodemailer.smtpConnectionMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends js.Object

object AuthenticationType {
  @scala.inline
  implicit def apply(value: AuthenticationTypeCustom): AuthenticationType = value.asInstanceOf[AuthenticationType]
  @scala.inline
  implicit def apply(value: AuthenticationTypeLogin): AuthenticationType = value.asInstanceOf[AuthenticationType]
  @scala.inline
  implicit def apply(value: AuthenticationTypeOAuth2): AuthenticationType = value.asInstanceOf[AuthenticationType]
}

