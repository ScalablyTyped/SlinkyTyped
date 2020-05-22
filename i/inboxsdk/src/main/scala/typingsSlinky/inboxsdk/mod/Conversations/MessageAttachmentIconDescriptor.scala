package typingsSlinky.inboxsdk.mod.Conversations

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor
  - typingsSlinky.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor
*/
trait MessageAttachmentIconDescriptor extends js.Object

object MessageAttachmentIconDescriptor {
  @scala.inline
  def MessageAttachmentIconUrlDescriptor(
    iconUrl: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: () => Unit = null
  ): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
  @scala.inline
  def MessageAttachmentIconHtmlDescriptor(
    iconHtml: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: () => Unit = null
  ): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
}

