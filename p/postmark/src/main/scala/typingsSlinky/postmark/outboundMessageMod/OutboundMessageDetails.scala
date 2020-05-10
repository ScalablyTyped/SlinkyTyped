package typingsSlinky.postmark.outboundMessageMod

import typingsSlinky.postmark.messageSupportingTypesMod.Attachment
import typingsSlinky.postmark.messageSupportingTypesMod.LinkTrackingOptions
import typingsSlinky.postmark.outboundMessageEventsMod.MessageEvent
import typingsSlinky.postmark.supportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessageDetails extends OutboundMessage {
  var Body: String = js.native
  var HtmlBody: js.UndefOr[String] = js.native
  var MessageEvents: js.Array[MessageEvent] = js.native
  var TextBody: js.UndefOr[String] = js.native
}

object OutboundMessageDetails {
  @scala.inline
  def apply(
    Attachments: js.Array[Attachment],
    Bcc: js.Array[Recipient],
    Body: String,
    Cc: js.Array[Recipient],
    From: String,
    MessageEvents: js.Array[MessageEvent],
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
  ): OutboundMessageDetails = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageEvents = MessageEvents.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TrackLinks = TrackLinks.asInstanceOf[js.Any], TrackOpens = TrackOpens.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessageDetails]
  }
  @scala.inline
  implicit class OutboundMessageDetailsOps[Self <: OutboundMessageDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageEvents(value: js.Array[MessageEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextBody")(js.undefined)
        ret
    }
  }
  
}

