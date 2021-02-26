package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragIndex extends StObject {
  
  var dragIndex: Double = js.native
  
  var dropIndex: Double = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var value: js.Any = js.native
}
object DragIndex {
  
  @scala.inline
  def apply(dragIndex: Double, dropIndex: Double, originalEvent: org.scalajs.dom.raw.Event, value: js.Any): DragIndex = {
    val __obj = js.Dynamic.literal(dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragIndex]
  }
  
  @scala.inline
  implicit class DragIndexMutableBuilder[Self <: DragIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragIndex(value: Double): Self = StObject.set(x, "dragIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropIndex(value: Double): Self = StObject.set(x, "dropIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
