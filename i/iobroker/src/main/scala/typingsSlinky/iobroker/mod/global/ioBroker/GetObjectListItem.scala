package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.objectsMod.global.ioBroker.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectListItem extends GetObjectViewItem {
  
  /** The same as @link{value} */
  var doc: Object = js.native
  
  /** A copy of the object */
  @JSName("value")
  var value_GetObjectListItem: Object = js.native
}
object GetObjectListItem {
  
  @scala.inline
  def apply(doc: Object, id: String, value: Object): GetObjectListItem = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectListItem]
  }
  
  @scala.inline
  implicit class GetObjectListItemMutableBuilder[Self <: GetObjectListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: Object): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
