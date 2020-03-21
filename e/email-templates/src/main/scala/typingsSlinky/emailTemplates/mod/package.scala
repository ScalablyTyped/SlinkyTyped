package typingsSlinky.emailTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // email-templates accepts nodemailer.createTransport options directly
  // too and calls createTransport if given a non-function, thus a lot
  // of different types accepted for transport
  type NodeMailerTransportOptions = typingsSlinky.nodemailer.mailerMod.^  | typingsSlinky.nodemailer.smtpPoolMod.^  | typingsSlinky.nodemailer.smtpPoolMod.Options | typingsSlinky.nodemailer.sendmailTransportMod.^  | typingsSlinky.nodemailer.sendmailTransportMod.Options | typingsSlinky.nodemailer.streamTransportMod.^  | typingsSlinky.nodemailer.streamTransportMod.Options | typingsSlinky.nodemailer.jsonTransportMod.^  | typingsSlinky.nodemailer.jsonTransportMod.Options | typingsSlinky.nodemailer.sesTransportMod.^  | typingsSlinky.nodemailer.sesTransportMod.Options | typingsSlinky.nodemailer.smtpTransportMod.^  | typingsSlinky.nodemailer.smtpTransportMod.Options | java.lang.String
}
