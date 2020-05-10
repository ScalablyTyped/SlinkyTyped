package typingsSlinky.nodemailer.mailComposerMod

import typingsSlinky.nodemailer.mailerMod.Attachment
import typingsSlinky.nodemailer.mailerMod.Options
import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the object for composing a MimeNode instance out from the mail options */
@js.native
trait MailComposer extends js.Object {
  var mail: Options = js.native
  var message: typingsSlinky.nodemailer.mimeNodeMod.^  | `false` = js.native
  /** Builds MimeNode instance */
  def compile(): typingsSlinky.nodemailer.mimeNodeMod.^ = js.native
  /** List alternatives. Resulting objects can be used as input for MimeNode nodes */
  def getAlternatives(): js.Array[Attachment] = js.native
  /** List all attachments. Resulting attachment objects can be used as input for MimeNode nodes */
  def getAttachments(findRelated: Boolean): js.Array[Attachment] = js.native
}

object MailComposer {
  @scala.inline
  def apply(
    compile: () => typingsSlinky.nodemailer.mimeNodeMod.^,
    getAlternatives: () => js.Array[Attachment],
    getAttachments: Boolean => js.Array[Attachment],
    mail: Options,
    message: typingsSlinky.nodemailer.mimeNodeMod.^  | `false`
  ): MailComposer = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), getAlternatives = js.Any.fromFunction0(getAlternatives), getAttachments = js.Any.fromFunction1(getAttachments), mail = mail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailComposer]
  }
  @scala.inline
  implicit class MailComposerOps[Self <: MailComposer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompile(value: () => typingsSlinky.nodemailer.mimeNodeMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAlternatives(value: () => js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlternatives")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttachments(value: Boolean => js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMail(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: typingsSlinky.nodemailer.mimeNodeMod.^  | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

