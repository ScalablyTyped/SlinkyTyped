package typingsSlinky.nodemailer.mailComposerMod

import typingsSlinky.nodemailer.mailerMod.Attachment
import typingsSlinky.nodemailer.mailerMod.Options
import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
@JSImport("nodemailer/lib/mail-composer", JSImport.Namespace)
@js.native
class ^ protected () extends MailComposer {
  def this(mail: Options) = this()
  /* CompleteClass */
  override var mail: Options = js.native
  /* CompleteClass */
  override var message: typingsSlinky.nodemailer.mimeNodeMod.^  | `false` = js.native
  /** Builds MimeNode instance */
  /* CompleteClass */
  override def compile(): typingsSlinky.nodemailer.mimeNodeMod.^ = js.native
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  /* CompleteClass */
  override def getAlternatives(): js.Array[Attachment] = js.native
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  /* CompleteClass */
  override def getAttachments(findRelated: Boolean): js.Array[Attachment] = js.native
}

