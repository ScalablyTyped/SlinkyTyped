package typingsSlinky.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorHtml
  - typingsSlinky.inboxsdk.mod.Lists.LabelDescriptorUrl
*/
trait LabelDescriptor extends js.Object
object LabelDescriptor {
  
  @scala.inline
  def LabelDescriptorHtml(iconHtml: String, title: String): LabelDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptor]
  }
  
  @scala.inline
  def LabelDescriptorUrl(iconUrl: String, title: String): LabelDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptor]
  }
}
