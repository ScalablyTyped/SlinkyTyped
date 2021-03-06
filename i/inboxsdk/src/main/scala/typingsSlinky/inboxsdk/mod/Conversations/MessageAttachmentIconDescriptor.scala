package typingsSlinky.inboxsdk.mod.Conversations

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor
  - typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor
*/
trait MessageAttachmentIconDescriptor extends StObject
object MessageAttachmentIconDescriptor {
  
  @scala.inline
  def MessageAttachmentIconHtmlDescriptor(iconHtml: String, tooltip: String | HTMLElement): typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor]
  }
  
  @scala.inline
  def MessageAttachmentIconUrlDescriptor(iconUrl: String, tooltip: String | HTMLElement): typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor]
  }
}
