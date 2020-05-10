package typingsSlinky.nodeMailjet.mod.Email

import typingsSlinky.nodeMailjet.AnonEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendParamsMessage extends js.Object {
  var Attachments: js.UndefOr[js.Array[Attachment]] = js.native
  var Bcc: js.UndefOr[js.Array[SendParamsRecipient]] = js.native
  var Cc: js.UndefOr[js.Array[SendParamsRecipient]] = js.native
  var CustomCampaign: js.UndefOr[String] = js.native
  var CustomID: js.UndefOr[String] = js.native
  var DeduplicateCampaign: js.UndefOr[Boolean] = js.native
  var EventPayload: js.UndefOr[String] = js.native
  var From: AnonEmail = js.native
  var HTMLPart: js.UndefOr[String] = js.native
  var Headers: js.UndefOr[js.Object] = js.native
  var InlinedAttachments: js.UndefOr[js.Array[InlinedAttachment]] = js.native
  var MonitoringCategory: js.UndefOr[String] = js.native
  var ReplyTo: js.UndefOr[SendParamsRecipient] = js.native
  var Sender: js.UndefOr[AnonEmail] = js.native
  var Subject: String = js.native
  var TemplateID: js.UndefOr[Double] = js.native
  var TemplateLanguage: js.UndefOr[Boolean] = js.native
  var TextPart: js.UndefOr[String] = js.native
  var To: js.Array[SendParamsRecipient] = js.native
  var URLTags: js.UndefOr[String] = js.native
  var Variables: js.UndefOr[js.Object] = js.native
}

object SendParamsMessage {
  @scala.inline
  def apply(From: AnonEmail, Subject: String, To: js.Array[SendParamsRecipient]): SendParamsMessage = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParamsMessage]
  }
  @scala.inline
  implicit class SendParamsMessageOps[Self <: SendParamsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: js.Array[SendParamsRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("To")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBcc(value: js.Array[SendParamsRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bcc")(js.undefined)
        ret
    }
    @scala.inline
    def withCc(value: js.Array[SendParamsRecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cc")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCampaign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomCampaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCampaign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomCampaign")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomID")(js.undefined)
        ret
    }
    @scala.inline
    def withDeduplicateCampaign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeduplicateCampaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeduplicateCampaign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeduplicateCampaign")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withHTMLPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTMLPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTMLPart")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInlinedAttachments(value: js.Array[InlinedAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlinedAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlinedAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InlinedAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: SendParamsRecipient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSender(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sender")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateID")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateLanguage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextPart")(js.undefined)
        ret
    }
    @scala.inline
    def withURLTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURLTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLTags")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(js.undefined)
        ret
    }
  }
  
}

