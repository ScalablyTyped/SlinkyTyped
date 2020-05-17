package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailSignature extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val EmailSignatureEntries: typingsSlinky.activexWord.Word.EmailSignatureEntries = js.native
  var NewMessageSignature: String = js.native
  val Parent: js.Any = js.native
  var ReplyMessageSignature: String = js.native
  @JSName("Word.EmailSignature_typekey")
  var WordDotEmailSignature_typekey: EmailSignature = js.native
}

object EmailSignature {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    EmailSignatureEntries: EmailSignatureEntries,
    NewMessageSignature: String,
    Parent: js.Any,
    ReplyMessageSignature: String,
    WordDotEmailSignature_typekey: EmailSignature
  ): EmailSignature = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmailSignatureEntries = EmailSignatureEntries.asInstanceOf[js.Any], NewMessageSignature = NewMessageSignature.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplyMessageSignature = ReplyMessageSignature.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignature_typekey")(WordDotEmailSignature_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignature]
  }
  @scala.inline
  implicit class EmailSignatureOps[Self <: EmailSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailSignatureEntries(value: EmailSignatureEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailSignatureEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewMessageSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewMessageSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyMessageSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyMessageSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotEmailSignature_typekey(value: EmailSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.EmailSignature_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

