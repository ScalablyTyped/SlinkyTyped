package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.mouseWheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWheelInputEvent extends MouseInputEvent {
  
  // Docs: https://electronjs.org/docs/api/structures/mouse-wheel-input-event
  var accelerationRatioX: js.UndefOr[Double] = js.native
  
  var accelerationRatioY: js.UndefOr[Double] = js.native
  
  var canScroll: js.UndefOr[Boolean] = js.native
  
  var deltaX: js.UndefOr[Double] = js.native
  
  var deltaY: js.UndefOr[Double] = js.native
  
  var hasPreciseScrollingDeltas: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of the event, can be `mouseWheel`.
    */
  @JSName("type")
  var type_MouseWheelInputEvent: mouseWheel = js.native
  
  var wheelTicksX: js.UndefOr[Double] = js.native
  
  var wheelTicksY: js.UndefOr[Double] = js.native
}
object MouseWheelInputEvent {
  
  @scala.inline
  def apply(`type`: mouseWheel, x: Double, y: Double): MouseWheelInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelInputEvent]
  }
  
  @scala.inline
  implicit class MouseWheelInputEventMutableBuilder[Self <: MouseWheelInputEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerationRatioX(value: Double): Self = StObject.set(x, "accelerationRatioX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationRatioXUndefined: Self = StObject.set(x, "accelerationRatioX", js.undefined)
    
    @scala.inline
    def setAccelerationRatioY(value: Double): Self = StObject.set(x, "accelerationRatioY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationRatioYUndefined: Self = StObject.set(x, "accelerationRatioY", js.undefined)
    
    @scala.inline
    def setCanScroll(value: Boolean): Self = StObject.set(x, "canScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanScrollUndefined: Self = StObject.set(x, "canScroll", js.undefined)
    
    @scala.inline
    def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    @scala.inline
    def setHasPreciseScrollingDeltas(value: Boolean): Self = StObject.set(x, "hasPreciseScrollingDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPreciseScrollingDeltasUndefined: Self = StObject.set(x, "hasPreciseScrollingDeltas", js.undefined)
    
    @scala.inline
    def setType(value: mouseWheel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelTicksX(value: Double): Self = StObject.set(x, "wheelTicksX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelTicksXUndefined: Self = StObject.set(x, "wheelTicksX", js.undefined)
    
    @scala.inline
    def setWheelTicksY(value: Double): Self = StObject.set(x, "wheelTicksY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelTicksYUndefined: Self = StObject.set(x, "wheelTicksY", js.undefined)
  }
}
