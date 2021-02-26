package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentStatus
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.olkAttachmentsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsChangedEventArgs extends StObject {
  
  /**
    * Represents the set of attachments that were added or removed.
    * For each such attachment, gets `id`, `name`, `size`, and `attachmentType` properties.
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
  implicit class AttachmentsChangedEventArgsMutableBuilder[Self <: AttachmentsChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentDetails(value: js.Array[js.Object]): Self = StObject.set(x, "attachmentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentDetailsVarargs(value: js.Object*): Self = StObject.set(x, "attachmentDetails", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentStatus(value: AttachmentStatus | String): Self = StObject.set(x, "attachmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: olkAttachmentsChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
