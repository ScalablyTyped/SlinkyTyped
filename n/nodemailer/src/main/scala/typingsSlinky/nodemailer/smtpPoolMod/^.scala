package typingsSlinky.nodemailer.smtpPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a SMTP pool transport object for Nodemailer
  */
@JSImport("nodemailer/lib/smtp-pool", JSImport.Namespace)
@js.native
class ^ () extends SMTPPool {
  def this(options: String) = this()
  def this(options: Options) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def send(
    mail: typingsSlinky.nodemailer.mailMessageMod.^,
    callback: js.Function2[
      /* err */ js.Error | Null, 
      /* info */ typingsSlinky.nodemailer.mod.SentMessageInfo, 
      Unit
    ]
  ): Unit = js.native
}

