package typingsSlinky.reactNativeShare.mod

import typingsSlinky.reactNativeShare.reactNativeShareStrings.text
import typingsSlinky.reactNativeShare.reactNativeShareStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityItem extends StObject {
  
  var content: String = js.native
  
  var `type`: text | url = js.native
}
object ActivityItem {
  
  @scala.inline
  def apply(content: String, `type`: text | url): ActivityItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItem]
  }
  
  @scala.inline
  implicit class ActivityItemMutableBuilder[Self <: ActivityItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: text | url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
