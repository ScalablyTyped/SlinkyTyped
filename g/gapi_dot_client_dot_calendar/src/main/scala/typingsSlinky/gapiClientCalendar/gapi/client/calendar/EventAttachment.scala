package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAttachment extends js.Object {
  /**
    * ID of the attached file. Read-only.
    * For Google Drive files, this is the ID of the corresponding Files resource entry in the Drive API.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * URL link to the attachment.
    * For adding Google Drive file attachments use the same format as in alternateLink property of the Files resource in the Drive API.
    * Required when adding an attachment.
    */
  var fileUrl: js.UndefOr[String] = js.native
  /** URL link to the attachment's icon. Read-only. */
  var iconLink: js.UndefOr[String] = js.native
  /** Internet media type (MIME type) of the attachment. */
  var mimeType: js.UndefOr[String] = js.native
  /** Attachment title. */
  var title: js.UndefOr[String] = js.native
}

object EventAttachment {
  @scala.inline
  def apply(): EventAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAttachment]
  }
  @scala.inline
  implicit class EventAttachmentOps[Self <: EventAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIconLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLink")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

