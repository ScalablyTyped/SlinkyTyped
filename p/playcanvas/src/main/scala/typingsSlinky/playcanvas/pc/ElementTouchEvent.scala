package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ElementTouchEvent
  * @augments pc.ElementInputEvent
  * @classdesc Represents a TouchEvent fired on a {@link pc.ElementComponent}.
  * @description Create an instance of a pc.ElementTouchEvent.
  * @param {TouchEvent} event - The TouchEvent that was originally raised.
  * @param {pc.ElementComponent} element - The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera - The CameraComponent that this event was originally raised via.
  * @param {number} x - The x coordinate of the touch that triggered the event.
  * @param {number} y - The y coordinate of the touch that triggered the event.
  * @param {Touch} touch - The touch object that triggered the event.
  * @property {Touch[]} touches The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
  * @property {Touch[]} changedTouches The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
  * @property {Touch} touch The touch object that triggered the event.
  */
@js.native
trait ElementTouchEvent extends ElementInputEvent {
  /**
    * The Touch objects representing individual points of contact whose states changed between the previous touch event and this one.
    */
  var changedTouches: js.Array[Touch] = js.native
  /**
    * The touch object that triggered the event.
    */
  var touch: Touch = js.native
  /**
    * The Touch objects representing all current points of contact with the surface, regardless of target or changed status.
    */
  var touches: js.Array[Touch] = js.native
}

object ElementTouchEvent {
  @scala.inline
  def apply(
    camera: CameraComponent,
    changedTouches: js.Array[Touch],
    element: ElementComponent,
    event: MouseEvent | TouchEvent,
    stopPropagation: () => Unit,
    touch: Touch,
    touches: js.Array[Touch]
  ): ElementTouchEvent = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), touch = touch.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementTouchEvent]
  }
  @scala.inline
  implicit class ElementTouchEventOps[Self <: ElementTouchEvent] (val x: Self) extends AnyVal {
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
    def withTouch(value: Touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
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

