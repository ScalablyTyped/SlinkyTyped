package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.Office.MailboxEnums.AttachmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an attachment on an item. Compose mode only.
  *
  * An array of `AttachmentDetailsCompose` objects is returned as the attachments property of an appointment or message item.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait AttachmentDetailsCompose extends js.Object {
  
  /**
    * Gets a value that indicates the type of an attachment.
    */
  var attachmentType: AttachmentType | String = js.native
  
  /**
    * Gets the index of the attachment.
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
    */
  var url: js.UndefOr[String] = js.native
}
object AttachmentDetailsCompose {
  
  @scala.inline
  def apply(attachmentType: AttachmentType | String, id: String, isInline: Boolean, name: String, size: Double): AttachmentDetailsCompose = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentDetailsCompose]
  }
  
  @scala.inline
  implicit class AttachmentDetailsComposeOps[Self <: AttachmentDetailsCompose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachmentType(value: AttachmentType | String): Self = this.set("attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
