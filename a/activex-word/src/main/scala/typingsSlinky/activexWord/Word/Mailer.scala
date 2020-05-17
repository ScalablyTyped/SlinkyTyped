package typingsSlinky.activexWord.Word

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailer extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var BCCRecipients: js.Any = js.native
  var CCRecipients: js.Any = js.native
  val Creator: Double = js.native
  var Enclosures: js.Any = js.native
  val Parent: js.Any = js.native
  val Received: Boolean = js.native
  var Recipients: js.Any = js.native
  val SendDateTime: VarDate = js.native
  val Sender: String = js.native
  var Subject: String = js.native
  @JSName("Word.Mailer_typekey")
  var WordDotMailer_typekey: Mailer = js.native
}

object Mailer {
  @scala.inline
  def apply(
    Application: Application,
    BCCRecipients: js.Any,
    CCRecipients: js.Any,
    Creator: Double,
    Enclosures: js.Any,
    Parent: js.Any,
    Received: Boolean,
    Recipients: js.Any,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    WordDotMailer_typekey: Mailer
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Mailer_typekey")(WordDotMailer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mailer]
  }
  @scala.inline
  implicit class MailerOps[Self <: Mailer] (val x: Self) extends AnyVal {
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
    def withBCCRecipients(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BCCRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCCRecipients(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CCRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnclosures(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enclosures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendDateTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotMailer_typekey(value: Mailer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Mailer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

