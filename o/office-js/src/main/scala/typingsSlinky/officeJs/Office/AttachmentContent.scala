package typingsSlinky.officeJs.Office

import typingsSlinky.officeJs.Office.MailboxEnums.AttachmentContentFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the content of an attachment on a message or appointment item.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait AttachmentContent extends StObject {
  
  /**
    * The content of an attachment as a string.
    */
  var content: String = js.native
  
  /**
    * The string format to use for an attachment's content.
    * 
    * For file attachments, the formatting is a base64-encoded string.
    * 
    * For item attachments that represent messages and were attached by drag-and-drop or "Attach Item",
    * the formatting is a string representing an .eml formatted file.
    * **Important**: If a message item was attached by drag-and-drop in Outlook on the web, then `getAttachmentContentAsync` throws an error.
    * 
    * For item attachments that represent calendar items and were attached by drag-and-drop or "Attach Item",
    * the formatting is a string representing an .icalendar file.
    * **Important**: If a calendar item was attached by drag-and-drop in Outlook on the web, then `getAttachmentContentAsync` throws an error.
    * 
    * For cloud attachments, the formatting is a URL string.
    */
  var format: AttachmentContentFormat | String = js.native
}
object AttachmentContent {
  
  @scala.inline
  def apply(content: String, format: AttachmentContentFormat | String): AttachmentContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentContent]
  }
  
  @scala.inline
  implicit class AttachmentContentMutableBuilder[Self <: AttachmentContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: AttachmentContentFormat | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
