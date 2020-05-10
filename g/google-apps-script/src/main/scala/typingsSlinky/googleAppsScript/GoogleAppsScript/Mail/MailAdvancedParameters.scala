package typingsSlinky.googleAppsScript.GoogleAppsScript.Mail

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.BlobSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailAdvancedParameters extends js.Object {
  /** an array of files to send with the email */
  var attachments: js.UndefOr[js.Array[BlobSource]] = js.native
  /** a comma-separated list of email addresses to BCC */
  var bcc: js.UndefOr[String] = js.native
  /** the body of the email */
  var body: js.UndefOr[String] = js.native
  /** a comma-separated list of email addresses to CC */
  var cc: js.UndefOr[String] = js.native
  /** if set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional inlineImages field in HTML body if you have inlined images for your email */
  var htmlBody: js.UndefOr[String] = js.native
  /** a JavaScript object containing a mapping from image key (String) to image data (BlobSource); this assumes that the htmlBody parameter is used and contains references to these images in the format <img src="cid:imageKey" /> */
  var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.native
  /** the name of the sender of the email (default: the user's name) */
  var name: js.UndefOr[String] = js.native
  /** true if the email should be sent from a generic no-reply email address to discourage recipients from responding to emails; this option is only possible for G Suite accounts, not Gmail users */
  var noReply: js.UndefOr[Boolean] = js.native
  /** an email address to use as the default reply-to address (default: the user's email address) */
  var replyTo: js.UndefOr[String] = js.native
  /** the subject of the email */
  var subject: js.UndefOr[String] = js.native
  /** the address of the recipient */
  var to: js.UndefOr[String] = js.native
}

object MailAdvancedParameters {
  @scala.inline
  def apply(): MailAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailAdvancedParameters]
  }
  @scala.inline
  implicit class MailAdvancedParametersOps[Self <: MailAdvancedParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[BlobSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withBcc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlBody")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineImages(value: StringDictionary[BlobSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImages")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoReply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noReply")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

