package typingsSlinky.nodemailer.smtpTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeLogin
  - typingsSlinky.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends js.Object

object AuthenticationType {
  @scala.inline
  implicit def apply(value: AuthenticationTypeLogin): AuthenticationType = value.asInstanceOf[AuthenticationType]
  @scala.inline
  implicit def apply(value: AuthenticationTypeOAuth2): AuthenticationType = value.asInstanceOf[AuthenticationType]
}

