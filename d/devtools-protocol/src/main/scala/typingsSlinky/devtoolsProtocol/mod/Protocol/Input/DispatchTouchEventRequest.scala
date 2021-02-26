package typingsSlinky.devtoolsProtocol.mod.Protocol.Input

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchCancel
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchEnd
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchMove
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchStart
import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatchTouchEventRequest extends StObject {
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.native
  
  /**
    * Time at which the event occurred.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.native
  
  /**
    * Active touch points on the touch device. One event per any changed point (compared to
    * previous touch event in a sequence) is generated, emulating pressing/moving/releasing points
    * one by one.
    */
  var touchPoints: js.Array[TouchPoint] = js.native
  
  /**
    * Type of the touch event. TouchEnd and TouchCancel must not contain any touch points, while
    * TouchStart and TouchMove must contains at least one. (DispatchTouchEventRequestType enum)
    */
  var `type`: touchStart | touchEnd | touchMove | touchCancel = js.native
}
object DispatchTouchEventRequest {
  
  @scala.inline
  def apply(touchPoints: js.Array[TouchPoint], `type`: touchStart | touchEnd | touchMove | touchCancel): DispatchTouchEventRequest = {
    val __obj = js.Dynamic.literal(touchPoints = touchPoints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchTouchEventRequest]
  }
  
  @scala.inline
  implicit class DispatchTouchEventRequestMutableBuilder[Self <: DispatchTouchEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(value: integer): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTouchPoints(value: js.Array[TouchPoint]): Self = StObject.set(x, "touchPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPointsVarargs(value: TouchPoint*): Self = StObject.set(x, "touchPoints", js.Array(value :_*))
    
    @scala.inline
    def setType(value: touchStart | touchEnd | touchMove | touchCancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
