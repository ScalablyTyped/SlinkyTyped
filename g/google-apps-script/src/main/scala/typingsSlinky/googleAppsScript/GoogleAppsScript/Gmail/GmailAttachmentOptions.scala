package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a Gmail Attachments.
  */
@js.native
trait GmailAttachmentOptions extends js.Object {
  /**
    *  If the returned array of Blob attachments should include regular (non-inline) attachments.
    */
  var includeAttachments: js.UndefOr[Boolean] = js.native
  /**
    * If the returned array of Blob attachments should include inline images.
    */
  var includeInlineImages: js.UndefOr[Boolean] = js.native
}

object GmailAttachmentOptions {
  @scala.inline
  def apply(): GmailAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmailAttachmentOptions]
  }
  @scala.inline
  implicit class GmailAttachmentOptionsOps[Self <: GmailAttachmentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInlineImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInlineImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInlineImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInlineImages")(js.undefined)
        ret
    }
  }
  
}

