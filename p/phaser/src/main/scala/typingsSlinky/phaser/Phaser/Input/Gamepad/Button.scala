package typingsSlinky.phaser.Phaser.Input.Gamepad

import typingsSlinky.phaser.Phaser.Events.EventEmitter
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific button on a Gamepad.
  * Button objects are created automatically by the Gamepad as they are needed.
  */
@js.native
trait Button extends js.Object {
  /**
    * An event emitter to use to emit the button events.
    */
  var events: EventEmitter = js.native
  /**
    * The index of this Button.
    */
  var index: integer = js.native
  /**
    * A reference to the Gamepad that this Button belongs to.
    */
  var pad: typingsSlinky.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  /**
    * Is the Button being pressed down or not?
    */
  var pressed: Boolean = js.native
  /**
    * Can be set for analogue buttons to enable a 'pressure' threshold,
    * before a button is considered as being 'pressed'.
    */
  var threshold: Double = js.native
  /**
    * Between 0 and 1.
    */
  var value: Double = js.native
  /**
    * Destroys this Button instance and releases external references it holds.
    */
  def destroy(): Unit = js.native
}

object Button {
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: EventEmitter,
    index: integer,
    pad: typingsSlinky.phaser.Phaser.Input.Gamepad.Gamepad,
    pressed: Boolean,
    threshold: Double,
    value: Double
  ): Button = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvents(value: EventEmitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPad(value: typingsSlinky.phaser.Phaser.Input.Gamepad.Gamepad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

