package typingsSlinky.emailTemplates.mod

import typingsSlinky.nodemailer.jsonTransportMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// email-templates accepts nodemailer.createTransport options directly
// too and calls createTransport if given a non-function, thus a lot
// of different types accepted for transport
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.mailerMod.^
  - typingsSlinky.nodemailer.smtpPoolMod.^
  - typingsSlinky.nodemailer.smtpPoolMod.Options
  - typingsSlinky.nodemailer.sendmailTransportMod.^
  - typingsSlinky.nodemailer.sendmailTransportMod.Options
  - typingsSlinky.nodemailer.streamTransportMod.^
  - typingsSlinky.nodemailer.streamTransportMod.Options
  - typingsSlinky.nodemailer.jsonTransportMod.^
  - typingsSlinky.nodemailer.jsonTransportMod.Options
  - typingsSlinky.nodemailer.sesTransportMod.^
  - typingsSlinky.nodemailer.sesTransportMod.Options
  - typingsSlinky.nodemailer.smtpTransportMod.^
  - typingsSlinky.nodemailer.smtpTransportMod.Options
  - java.lang.String
*/
trait NodeMailerTransportOptions extends js.Object

object NodeMailerTransportOptions {
  @scala.inline
  implicit def apply(value: Options): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.streamTransportMod.Options): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.smtpPoolMod.Options): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.sesTransportMod.Options): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.sendmailTransportMod.Options): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.smtpTransportMod.Options): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: String): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.mailerMod.^): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.sendmailTransportMod.^): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.sesTransportMod.^): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.streamTransportMod.^): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.jsonTransportMod.^): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.smtpPoolMod.^): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodemailer.smtpTransportMod.^): NodeMailerTransportOptions = value.asInstanceOf[NodeMailerTransportOptions]
}

