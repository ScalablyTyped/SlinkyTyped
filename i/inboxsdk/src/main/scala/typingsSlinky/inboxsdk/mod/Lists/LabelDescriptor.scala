package typingsSlinky.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorHtml
  - typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorUrl
*/
trait LabelDescriptor extends StObject
object LabelDescriptor {
  
  @scala.inline
  def LabelDescriptorHtml(iconHtml: String, title: String): typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorHtml = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorHtml]
  }
  
  @scala.inline
  def LabelDescriptorUrl(iconUrl: String, title: String): typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorUrl]
  }
}
