package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.olkAttachmentsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsChangedEventArgs extends js.Object {
  /** 
    * Represents the set of attachments that were added or removed. 
    * For each such attachment, gets a subset of {@link Office.AttachmentDetails | AttachmentDetails} properties: `id`, `name`, `size`, and `attachmentType`.
    * 
    * [Api set: Mailbox 1.8]
    */
  var attachmentDetails: js.Array[js.Object] = js.native
  /**
    * Gets whether the attachments were added or removed. See {@link Office.MailboxEnums.AttachmentStatus | MailboxEnums.AttachmentStatus} for details.
    * 
    * [Api set: Mailbox 1.8]
    */ 
  var attachmentStatus: AttachmentStatus | String = js.native
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    * 
    * [Api set: Mailbox 1.8]
    */
  var `type`: olkAttachmentsChanged = js.native
}

object AttachmentsChangedEventArgs {
  @scala.inline
  def apply(
    attachmentDetails: js.Array[js.Object],
    attachmentStatus: AttachmentStatus | String,
    `type`: olkAttachmentsChanged
  ): AttachmentsChangedEventArgs = {
    val __obj = js.Dynamic.literal(attachmentDetails = attachmentDetails.asInstanceOf[js.Any], attachmentStatus = attachmentStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsChangedEventArgs]
  }
  @scala.inline
  implicit class AttachmentsChangedEventArgsOps[Self <: AttachmentsChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentDetails(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentStatus(value: AttachmentStatus | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: olkAttachmentsChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

