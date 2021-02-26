package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInfoBase extends StObject {
  
  /**
    * Defines the related dom event
    */
  var event: PointerEvent | WheelEvent = js.native
  
  /**
    * Defines the type of event (PointerEventTypes)
    */
  var `type`: Double = js.native
}
object PointerInfoBase {
  
  @scala.inline
  def apply(event: PointerEvent | WheelEvent, `type`: Double): PointerInfoBase = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoBase]
  }
  
  @scala.inline
  implicit class PointerInfoBaseMutableBuilder[Self <: PointerInfoBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: PointerEvent | WheelEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPointerEvent(value: PointerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWheelEvent(value: WheelEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
