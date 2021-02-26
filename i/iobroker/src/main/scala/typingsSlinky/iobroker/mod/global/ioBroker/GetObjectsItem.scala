package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.objectsMod.global.ioBroker.BaseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectsItem[T /* <: BaseObject */] extends StObject {
  
  /** The ID of this object */
  var id: String = js.native
  
  /** A copy of the object from the DB */
  var value: T = js.native
}
object GetObjectsItem {
  
  @scala.inline
  def apply[T /* <: BaseObject */](id: String, value: T): GetObjectsItem[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsItem[T]]
  }
  
  @scala.inline
  implicit class GetObjectsItemMutableBuilder[Self <: GetObjectsItem[_], T /* <: BaseObject */] (val x: Self with GetObjectsItem[T]) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
