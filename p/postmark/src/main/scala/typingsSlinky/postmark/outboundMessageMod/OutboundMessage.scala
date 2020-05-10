package typingsSlinky.postmark.outboundMessageMod

import typingsSlinky.postmark.messageSupportingTypesMod.Attachment
import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typingsSlinky.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessage extends js.Object {
  var Attachments: js.Array[Attachment] = js.native
  var Bcc: js.Array[Recipient] = js.native
  var Cc: js.Array[Recipient] = js.native
  var From: String = js.native
  var MessageID: String = js.native
  var MessageStream: String = js.native
  var Metadata: Hash[String] = js.native
  var ReceivedAt: String = js.native
  var Recipients: js.Array[String] = js.native
  var Status: String = js.native
  var Subject: String = js.native
  var Tag: js.UndefOr[String] = js.native
  var To: js.Array[Recipient] = js.native
  var TrackLinks: LinkTrackingOptions = js.native
  var TrackOpens: Boolean = js.native
}

object OutboundMessage {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: js.Array[Recipient],
    Cc: js.Array[Recipient],
    From: String,
    MessageID: String,
    MessageStream: String,
    Metadata: Hash[String],
    ReceivedAt: String,
    Recipients: js.Array[String],
    Status: String,
    Subject: String,
    To: js.Array[Recipient],
    TrackLinks: LinkTrackingOptions,
    TrackOpens: Boolean
  ): OutboundMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessage]
  }
  @scala.inline
  implicit class OutboundMessageOps[Self <: OutboundMessage] (val x: Self) extends AnyVal {
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
    def withBcc(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCc(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
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
    def withMetadata(value: Hash[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceivedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipients")(value.asInstanceOf[js.Any])
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
    def withTo(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackLinks(value: LinkTrackingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackOpens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackOpens")(value.asInstanceOf[js.Any])
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

