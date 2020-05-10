package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailContent extends js.Object {
  /**
    * The raw email message. The message has to meet the following criteria:   The message has to contain a header and a body, separated by one blank line.   All of the required header fields must be present in the message.   Each part of a multipart MIME message must be formatted properly.   If you include attachments, they must be in a file format that Amazon Pinpoint supports.    The entire message must be Base64 encoded.   If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you should encode that content to ensure that recipients' email clients render the message properly.   The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined in RFC 5321.  
    */
  var Raw: js.UndefOr[RawMessage] = js.native
  /**
    * The simple email message. The message consists of a subject and a message body.
    */
  var Simple: js.UndefOr[Message] = js.native
  /**
    * The template to use for the email message.
    */
  var Template: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.Template] = js.native
}

object EmailContent {
  @scala.inline
  def apply(): EmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailContent]
  }
  @scala.inline
  implicit class EmailContentOps[Self <: EmailContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaw(value: RawMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSimple(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Simple")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Template")(js.undefined)
        ret
    }
  }
  
}

