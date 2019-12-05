package typingsSlinky.nodemailerDashMailgunDashTransport.nodemailerDashMailgunDashTransportMod

import typingsSlinky.nodemailer.nodemailerMod.SentMessageInfo
import typingsSlinky.nodemailer.nodemailerMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer-mailgun-transport", "MailgunTransport")
@js.native
class MailgunTransport () extends Transport {
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def send(
    mail: typingsSlinky.nodemailer.libMailerMailDashMessageMod.^,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
}

