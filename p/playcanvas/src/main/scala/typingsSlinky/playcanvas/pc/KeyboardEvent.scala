package typingsSlinky.playcanvas.pc

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.KeyboardEvent
  * @classdesc The KeyboardEvent is passed into all event callbacks from the {@link pc.Keyboard}. It corresponds to a key press or release.
  * @description Create a new KeyboardEvent.
  * @param {pc.Keyboard} keyboard - The keyboard object which is firing the event.
  * @param {KeyboardEvent} event - The original browser event that was fired.
  * @property {number} key The keyCode of the key that has changed. See the pc.KEY_* constants.
  * @property {Element} element The element that fired the keyboard event.
  * @property {KeyboardEvent} event The original browser event which was fired.
  * @example
  * var onKeyDown = function (e) {
  *     if (e.key === pc.KEY_SPACE) {
  *         // space key pressed
  *     }
  *     e.event.preventDefault(); // Use original browser event to prevent browser action.
  * };
  * app.keyboard.on("keydown", onKeyDown, this);
  */
@js.native
trait KeyboardEvent extends js.Object {
  /**
    * The element that fired the keyboard event.
    */
  var element: Element = js.native
  /**
    * The original browser event which was fired.
    */
  var event: KeyboardEvent = js.native
  /**
    * The keyCode of the key that has changed. See the pc.KEY_* constants.
    */
  var key: Double = js.native
}

object KeyboardEvent {
  @scala.inline
  def apply(element: Element, event: KeyboardEvent, key: Double): KeyboardEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

