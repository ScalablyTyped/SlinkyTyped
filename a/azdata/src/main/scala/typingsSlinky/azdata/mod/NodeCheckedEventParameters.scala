package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeCheckedEventParameters[T] extends StObject {
  
  var checked: Boolean = js.native
  
  var element: T = js.native
}
object NodeCheckedEventParameters {
  
  @scala.inline
  def apply[T](checked: Boolean, element: T): NodeCheckedEventParameters[T] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCheckedEventParameters[T]]
  }
  
  @scala.inline
  implicit class NodeCheckedEventParametersMutableBuilder[Self <: NodeCheckedEventParameters[_], T] (val x: Self with NodeCheckedEventParameters[T]) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: T): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
