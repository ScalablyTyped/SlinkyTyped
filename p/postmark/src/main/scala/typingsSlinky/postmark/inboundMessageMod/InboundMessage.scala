package typingsSlinky.postmark.inboundMessageMod

import typingsSlinky.postmark.messageSupportingTypesMod.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundMessage extends js.Object {
  var Attachments: js.Array[Attachment] = js.native
  var Bcc: String = js.native
  var BccFull: js.Array[InboundRecipient] = js.native
  var Cc: String = js.native
  var CcFull: js.Array[InboundRecipient] = js.native
  var Date: String = js.native
  var From: String = js.native
  var FromFull: InboundRecipient = js.native
  var FromName: String = js.native
  var MailboxHash: String = js.native
  var MessageID: String = js.native
  var MessageStream: String = js.native
  var OriginalRecipient: String = js.native
  var ReplyTo: String = js.native
  var Status: String = js.native
  var Subject: String = js.native
  var Tag: js.UndefOr[String] = js.native
  var To: String = js.native
  var ToFull: js.Array[InboundRecipient] = js.native
}

object InboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: String,
    BccFull: js.Array[InboundRecipient],
    Cc: String,
    CcFull: js.Array[InboundRecipient],
    Date: String,
    From: String,
    FromFull: InboundRecipient,
    FromName: String,
    MailboxHash: String,
    MessageID: String,
    MessageStream: String,
    OriginalRecipient: String,
    ReplyTo: String,
    Status: String,
    Subject: String,
    To: String,
    ToFull: js.Array[InboundRecipient]
  ): InboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BccFull = BccFull.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CcFull = CcFull.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], FromFull = FromFull.asInstanceOf[js.Any], FromName = FromName.asInstanceOf[js.Any], MailboxHash = MailboxHash.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OriginalRecipient = OriginalRecipient.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], ToFull = ToFull.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundMessage]
  }
  @scala.inline
  implicit class InboundMessageOps[Self <: InboundMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBcc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBccFull(value: js.Array[InboundRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BccFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCcFull(value: js.Array[InboundRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromFull(value: InboundRecipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailboxHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailboxHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageStream(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalRecipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToFull(value: js.Array[InboundRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

