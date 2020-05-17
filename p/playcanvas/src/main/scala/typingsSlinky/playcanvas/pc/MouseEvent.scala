package typingsSlinky.playcanvas.pc

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.MouseEvent
  * @classdesc MouseEvent object that is passed to events 'mousemove', 'mouseup', 'mousedown' and 'mousewheel'.
  * @description Create an new MouseEvent.
  * @param {pc.Mouse} mouse - The Mouse device that is firing this event.
  * @param {MouseEvent} event - The original browser event that fired.
  * @property {number} x The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property {number} y The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
  * @property {number} dx The change in x co-ordinate since the last mouse event.
  * @property {number} dy The change in y co-ordinate since the last mouse event.
  * @property {number} button The mouse button associated with this event. Can be:
  *
  * * {@link pc.MOUSEBUTTON_LEFT}
  * * {@link pc.MOUSEBUTTON_MIDDLE}
  * * {@link pc.MOUSEBUTTON_RIGHT}
  *
  * @property {number} wheelDelta A value representing the amount the mouse wheel has moved, only
  * valid for {@link mousewheel} events.
  * @property {Element} element The element that the mouse was fired from.
  * @property {boolean} ctrlKey True if the ctrl key was pressed when this event was fired.
  * @property {boolean} shiftKey True if the shift key was pressed when this event was fired.
  * @property {boolean} altKey True if the alt key was pressed when this event was fired.
  * @property {boolean} metaKey True if the meta key was pressed when this event was fired.
  * @property {MouseEvent} event The original browser event.
  */
@js.native
trait MouseEvent extends js.Object {
  /**
    * True if the alt key was pressed when this event was fired.
    */
  var altKey: Boolean = js.native
  /**
    * The mouse button associated with this event. Can be:
    * * {@link pc.MOUSEBUTTON_LEFT}
    * * {@link pc.MOUSEBUTTON_MIDDLE}
    * * {@link pc.MOUSEBUTTON_RIGHT}
    */
  var button: Double = js.native
  /**
    * True if the ctrl key was pressed when this event was fired.
    */
  var ctrlKey: Boolean = js.native
  /**
    * The change in x co-ordinate since the last mouse event.
    */
  var dx: Double = js.native
  /**
    * The change in y co-ordinate since the last mouse event.
    */
  var dy: Double = js.native
  /**
    * The element that the mouse was fired from.
    */
  var element: Element = js.native
  /**
    * The original browser event.
    */
  var event: MouseEvent = js.native
  /**
    * True if the meta key was pressed when this event was fired.
    */
  var metaKey: Boolean = js.native
  /**
    * True if the shift key was pressed when this event was fired.
    */
  var shiftKey: Boolean = js.native
  /**
    * A value representing the amount the mouse wheel has moved, only
    * valid for {@link mousewheel} events.
    */
  var wheelDelta: Double = js.native
  /**
    * The x co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
    */
  var x: Double = js.native
  /**
    * The y co-ordinate of the mouse pointer relative to the element pc.Mouse is attached to.
    */
  var y: Double = js.native
}

object MouseEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    button: Double,
    ctrlKey: Boolean,
    dx: Double,
    dy: Double,
    element: Element,
    event: MouseEvent,
    metaKey: Boolean,
    shiftKey: Boolean,
    wheelDelta: Double,
    x: Double,
    y: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], wheelDelta = wheelDelta.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  @scala.inline
  implicit class MouseEventOps[Self <: MouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShiftKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWheelDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

