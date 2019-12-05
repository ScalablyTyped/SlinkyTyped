package typingsSlinky.emailDashTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emailDashTemplatesMod {
  import typingsSlinky.nodemailer.libSmtpDashPoolMod.Options

  // email-templates accepts nodemailer.createTransport options directly
  // too and calls createTransport if given a non-function, thus a lot
  // of different types accepted for transport
  type NodeMailerTransportOptions = typingsSlinky.nodemailer.libMailerMod.^  | typingsSlinky.nodemailer.libSmtpDashPoolMod.^  | Options | typingsSlinky.nodemailer.libSendmailDashTransportMod.^  | typingsSlinky.nodemailer.libSendmailDashTransportMod.Options | typingsSlinky.nodemailer.libStreamDashTransportMod.^  | typingsSlinky.nodemailer.libStreamDashTransportMod.Options | typingsSlinky.nodemailer.libJsonDashTransportMod.^  | typingsSlinky.nodemailer.libJsonDashTransportMod.Options | typingsSlinky.nodemailer.libSesDashTransportMod.^  | typingsSlinky.nodemailer.libSesDashTransportMod.Options | typingsSlinky.nodemailer.libSmtpDashTransportMod.^  | typingsSlinky.nodemailer.libSmtpDashTransportMod.Options | String
}
