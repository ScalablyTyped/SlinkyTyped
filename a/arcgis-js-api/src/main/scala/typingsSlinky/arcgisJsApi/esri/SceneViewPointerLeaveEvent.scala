package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`pointer-leave`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mouse
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewPointerLeaveEvent extends StObject {
  
  var button: Double = js.native
  
  var buttons: Double = js.native
  
  var native: js.Any = js.native
  
  var pointerId: Double = js.native
  
  var pointerType: mouse | touch = js.native
  
  var stopPropagation: js.Function = js.native
  
  var timestamp: Double = js.native
  
  var `type`: `pointer-leave` = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SceneViewPointerLeaveEvent {
  
  @scala.inline
  def apply(
    button: Double,
    buttons: Double,
    native: js.Any,
    pointerId: Double,
    pointerType: mouse | touch,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `pointer-leave`,
    x: Double,
    y: Double
  ): SceneViewPointerLeaveEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewPointerLeaveEvent]
  }
  
  @scala.inline
  implicit class SceneViewPointerLeaveEventMutableBuilder[Self <: SceneViewPointerLeaveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerType(value: mouse | touch): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `pointer-leave`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
