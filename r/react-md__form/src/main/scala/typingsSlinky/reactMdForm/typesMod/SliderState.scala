package typingsSlinky.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderState extends StObject {
  
  var dragType: SliderDraggingType = js.native
  
  var dragging: Boolean = js.native
  
  var value: Double = js.native
}
object SliderState {
  
  @scala.inline
  def apply(dragging: Boolean, value: Double): SliderState = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderState]
  }
  
  @scala.inline
  implicit class SliderStateMutableBuilder[Self <: SliderState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragType(value: SliderDraggingType): Self = StObject.set(x, "dragType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragTypeNull: Self = StObject.set(x, "dragType", null)
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
