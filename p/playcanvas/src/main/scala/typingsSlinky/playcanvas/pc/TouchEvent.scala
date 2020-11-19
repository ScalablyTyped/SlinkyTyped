package typingsSlinky.playcanvas.pc

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new TouchEvent from an existing browser event.
  * @property element - The target Element that the event was fired from.
  * @property touches - A list of all touches currently in contact with the device.
  * @property changedTouches - A list of touches that have changed since the last event.
  * @property event - The original browser TouchEvent.
  * @param device - The source device of the touch events.
  * @param event - The original browser TouchEvent.
  */
@js.native
trait TouchEvent extends js.Object {
  
  /**
    * A list of touches that have changed since the last event.
    */
  var changedTouches: js.Array[Touch] = js.native
  
  /**
    * The target Element that the event was fired from.
    */
  var element: Element = js.native
  
  /**
    * The original browser TouchEvent.
    */
  var event: TouchEvent = js.native
  
  /**
    * Get an event from one of the touch lists by the id. It is useful to access
    * touches by their id so that you can be sure you are referencing the same touch.
    * @param id - The identifier of the touch.
    * @param list - An array of touches to search.
    * @returns The {@link pc.Touch} object or null.
    */
  def getTouchById(id: Double, list: js.Array[Touch]): Touch = js.native
  
  /**
    * A list of all touches currently in contact with the device.
    */
  var touches: js.Array[Touch] = js.native
}
object TouchEvent {
  
  @scala.inline
  def apply(
    changedTouches: js.Array[Touch],
    element: Element,
    event: TouchEvent,
    getTouchById: (Double, js.Array[Touch]) => Touch,
    touches: js.Array[Touch]
  ): TouchEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getTouchById = js.Any.fromFunction2(getTouchById), touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent]
  }
  
  @scala.inline
  implicit class TouchEventOps[Self <: TouchEvent] (val x: Self) extends AnyVal {
    
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
    def setChangedTouchesVarargs(value: Touch*): Self = this.set("changedTouches", js.Array(value :_*))
    
    @scala.inline
    def setChangedTouches(value: js.Array[Touch]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: TouchEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTouchById(value: (Double, js.Array[Touch]) => Touch): Self = this.set("getTouchById", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTouchesVarargs(value: Touch*): Self = this.set("touches", js.Array(value :_*))
    
    @scala.inline
    def setTouches(value: js.Array[Touch]): Self = this.set("touches", value.asInstanceOf[js.Any])
  }
}
