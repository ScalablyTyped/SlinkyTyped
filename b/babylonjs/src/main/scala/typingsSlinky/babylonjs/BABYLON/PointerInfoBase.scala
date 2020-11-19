package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInfoBase extends js.Object {
  
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
  implicit class PointerInfoBaseOps[Self <: PointerInfoBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventPointerEvent(value: PointerEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWheelEvent(value: WheelEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: PointerEvent | WheelEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
