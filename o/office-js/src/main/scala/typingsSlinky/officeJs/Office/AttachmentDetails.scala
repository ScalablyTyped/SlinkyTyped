package typingsSlinky.officeJs.Office

import typingsSlinky.officeJs.Office.MailboxEnums.AttachmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an attachment on an item from the server. Read mode only.
  *
  * An array of `AttachmentDetails` objects is returned as the attachments property of an appointment or message item.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait AttachmentDetails extends js.Object {
  /**
    * Gets a value that indicates the type of an attachment.
    */
  var attachmentType: AttachmentType | String = js.native
  /**
    * Gets the MIME content type of the attachment.
    * 
    * This property is only available in Read mode.
    */
  var contentType: String = js.native
  /**
    * Gets the Exchange attachment ID of the attachment.
    */
  var id: String = js.native
  /**
    * Gets a value that indicates whether the attachment should be displayed in the body of the item.
    */
  var isInline: Boolean = js.native
  /**
    * Gets the name of the attachment.
    * 
    * **Important**: For message or appointment items that were attached by drag-and-drop or "Attach Item",
    * `name` includes a file extension in Outlook on Mac, but excludes the extension on the web or Windows.
    */
  var name: String = js.native
  /**
    * Gets the size of the attachment in bytes.
    */
  var size: Double = js.native
  /**
    * Gets the url of the attachment if its type is `MailboxEnums.AttachmentType.Cloud`.
    * 
    * [Api set: Mailbox 1.8]
    */
  var url: String = js.native
}

object AttachmentDetails {
  @scala.inline
  def apply(
    attachmentType: AttachmentType | String,
    contentType: String,
    id: String,
    isInline: Boolean,
    name: String,
    size: Double,
    url: String
  ): AttachmentDetails = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentDetails]
  }
  @scala.inline
  implicit class AttachmentDetailsOps[Self <: AttachmentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentType(value: AttachmentType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

