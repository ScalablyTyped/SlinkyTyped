package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.BlobSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a Gmail draft.
  */
@js.native
trait GmailAdvancedOptions extends js.Object {
  /**
    * An array of files to send with the email.
    */
  var attachments: js.UndefOr[js.Array[BlobSource]] = js.native
  /**
    * A comma-separated list of email addresses to BCC.
    */
  var bcc: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of email addresses to CC.
    */
  var cc: js.UndefOr[String] = js.native
  /**
    * The address that the email should be sent from, which must be one of the values returned by `GmailApp.getAliases()`.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * If set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional `inlineImages` field in HTML body if you have inlined images for your email.
    */
  var htmlBody: js.UndefOr[String] = js.native
  /**
    * A JavaScript object containing a mapping from image key (`String`) to image data (`BlobSource`) ; this assumes that the `htmlBody` parameter is used and contains references to these images in the format `<img src="cid:imageKey" />`.
    */
  var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.native
  /**
    * The name of the sender of the email (default: the user's name).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An email address to use as the default reply-to address (default: the user's email address).
    */
  var replyTo: js.UndefOr[String] = js.native
}

object GmailAdvancedOptions {
  @scala.inline
  def apply(): GmailAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmailAdvancedOptions]
  }
  @scala.inline
  implicit class GmailAdvancedOptionsOps[Self <: GmailAdvancedOptions] (val x: Self) extends AnyVal {
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
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
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
  }
  
}

