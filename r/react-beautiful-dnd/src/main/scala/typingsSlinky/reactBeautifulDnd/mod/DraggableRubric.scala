package typingsSlinky.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableRubric extends StObject {
  
  var draggableId: DraggableId = js.native
  
  var mode: MovementMode = js.native
  
  var source: DraggableLocation = js.native
}
object DraggableRubric {
  
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation): DraggableRubric = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableRubric]
  }
  
  @scala.inline
  implicit class DraggableRubricMutableBuilder[Self <: DraggableRubric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: MovementMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: DraggableLocation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
