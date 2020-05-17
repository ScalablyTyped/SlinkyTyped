package typingsSlinky.playcanvas.pc

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.TouchEvent
  * @classdesc A Event corresponding to touchstart, touchend, touchmove or touchcancel. TouchEvent wraps the standard
  * browser event and provides lists of {@link pc.Touch} objects.
  * @description Create a new TouchEvent from an existing browser event.
  * @param {pc.TouchDevice} device - The source device of the touch events.
  * @param {TouchEvent} event - The original browser TouchEvent.
  * @property {Element} element The target Element that the event was fired from.
  * @property {pc.Touch[]} touches A list of all touches currently in contact with the device.
  * @property {pc.Touch[]} changedTouches A list of touches that have changed since the last event.
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
    * A list of all touches currently in contact with the device.
    */
  var touches: js.Array[Touch] = js.native
  /**
    * @function
    * @name pc.TouchEvent#getTouchById
    * @description Get an event from one of the touch lists by the id. It is useful to access
    * touches by their id so that you can be sure you are referencing the same touch.
    * @param {number} id - The identifier of the touch.
    * @param {pc.Touch[]} list - An array of touches to search.
    * @returns {pc.Touch} The {@link pc.Touch} object or null.
    */
  def getTouchById(id: Double, list: js.Array[Touch]): Touch = js.native
}

object TouchEvent {
  @scala.inline
  def apply(
    changedTouches: js.Array[Touch],
    element: Element,
    getTouchById: (Double, js.Array[Touch]) => Touch,
    touches: js.Array[Touch]
  ): TouchEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], getTouchById = js.Any.fromFunction2(getTouchById), touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent]
  }
  @scala.inline
  implicit class TouchEventOps[Self <: TouchEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedTouches(value: js.Array[Touch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTouchById(value: (Double, js.Array[Touch]) => Touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTouchById")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTouches(value: js.Array[Touch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

