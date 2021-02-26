package typingsSlinky.baseui.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewIndex extends StObject {
  
  var newIndex: Double = js.native
  
  var newState: js.Array[ReactElement] = js.native
  
  var oldIndex: Double = js.native
}
object NewIndex {
  
  @scala.inline
  def apply(newIndex: Double, newState: js.Array[ReactElement], oldIndex: Double): NewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewIndex]
  }
  
  @scala.inline
  implicit class NewIndexMutableBuilder[Self <: NewIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewState(value: js.Array[ReactElement]): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStateVarargs(value: ReactElement*): Self = StObject.set(x, "newState", js.Array(value :_*))
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
  }
}
