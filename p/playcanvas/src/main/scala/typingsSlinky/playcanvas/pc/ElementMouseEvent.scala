package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ElementMouseEvent
  * @augments pc.ElementInputEvent
  * @classdesc Represents a Mouse event fired on a {@link pc.ElementComponent}.
  * @description Create an instance of a pc.ElementMouseEvent.
  * @param {MouseEvent} event - The MouseEvent that was originally raised.
  * @param {pc.ElementComponent} element - The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera - The CameraComponent that this event was originally raised via.
  * @param {number} x - The x coordinate.
  * @param {number} y - The y coordinate.
  * @param {number} lastX - The last x coordinate.
  * @param {number} lastY - The last y coordinate.
  * @property {boolean} ctrlKey Whether the ctrl key was pressed.
  * @property {boolean} altKey Whether the alt key was pressed.
  * @property {boolean} shiftKey Whether the shift key was pressed.
  * @property {boolean} metaKey Whether the meta key was pressed.
  * @property {number} button The mouse button.
  * @property {number} dx The amount of horizontal movement of the cursor.
  * @property {number} dy The amount of vertical movement of the cursor.
  * @property {number} wheelDelta The amount of the wheel movement.
  */
@js.native
trait ElementMouseEvent extends ElementInputEvent {
  /**
    * Whether the alt key was pressed.
    */
  var altKey: Boolean = js.native
  /**
    * The mouse button.
    */
  var button: Double = js.native
  /**
    * Whether the ctrl key was pressed.
    */
  var ctrlKey: Boolean = js.native
  /**
    * The amount of horizontal movement of the cursor.
    */
  var dx: Double = js.native
  /**
    * The amount of vertical movement of the cursor.
    */
  var dy: Double = js.native
  /**
    * Whether the meta key was pressed.
    */
  var metaKey: Boolean = js.native
  /**
    * Whether the shift key was pressed.
    */
  var shiftKey: Boolean = js.native
  /**
    * The amount of the wheel movement.
    */
  var wheelDelta: Double = js.native
}

object ElementMouseEvent {
  @scala.inline
  def apply(
    altKey: Boolean,
    button: Double,
    camera: CameraComponent,
    ctrlKey: Boolean,
    dx: Double,
    dy: Double,
    element: ElementComponent,
    event: MouseEvent | TouchEvent,
    metaKey: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    wheelDelta: Double
  ): ElementMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), wheelDelta = wheelDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementMouseEvent]
  }
  @scala.inline
  implicit class ElementMouseEventOps[Self <: ElementMouseEvent] (val x: Self) extends AnyVal {
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
  }
  
}

