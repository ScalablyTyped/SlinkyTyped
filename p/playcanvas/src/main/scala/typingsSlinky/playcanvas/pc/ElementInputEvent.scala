package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ElementInputEvent
  * @classdesc Represents an input event fired on a {@link pc.ElementComponent}. When an event is raised
  * on an ElementComponent it bubbles up to its parent ElementComponents unless we call stopPropagation().
  * @description Create an instance of a pc.ElementInputEvent.
  * @param {MouseEvent|TouchEvent} event - The MouseEvent or TouchEvent that was originally raised.
  * @param {pc.ElementComponent} element - The ElementComponent that this event was originally raised on.
  * @param {pc.CameraComponent} camera - The CameraComponent that this event was originally raised via.
  * @property {MouseEvent|TouchEvent} event The MouseEvent or TouchEvent that was originally raised.
  * @property {pc.ElementComponent} element The ElementComponent that this event was originally raised on.
  * @property {pc.CameraComponent} camera The CameraComponent that this event was originally raised via.
  */
@js.native
trait ElementInputEvent extends js.Object {
  /**
    * The CameraComponent that this event was originally raised via.
    */
  var camera: CameraComponent = js.native
  /**
    * The ElementComponent that this event was originally raised on.
    */
  var element: ElementComponent = js.native
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    */
  var event: MouseEvent | TouchEvent = js.native
  /**
    * @function
    * @name pc.ElementInputEvent#stopPropagation
    * @description Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  def stopPropagation(): Unit = js.native
}

object ElementInputEvent {
  @scala.inline
  def apply(
    camera: CameraComponent,
    element: ElementComponent,
    event: MouseEvent | TouchEvent,
    stopPropagation: () => Unit
  ): ElementInputEvent = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[ElementInputEvent]
  }
  @scala.inline
  implicit class ElementInputEventOps[Self <: ElementInputEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera(value: CameraComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: ElementComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: MouseEvent | TouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

