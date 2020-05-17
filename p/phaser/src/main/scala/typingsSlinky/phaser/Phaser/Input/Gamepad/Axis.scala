package typingsSlinky.phaser.Phaser.Input.Gamepad

import typingsSlinky.phaser.Phaser.Events.EventEmitter
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a specific Gamepad Axis.
  * Axis objects are created automatically by the Gamepad as they are needed.
  */
@js.native
trait Axis extends js.Object {
  /**
    * An event emitter to use to emit the axis events.
    */
  var events: EventEmitter = js.native
  /**
    * The index of this Axis.
    */
  var index: integer = js.native
  /**
    * A reference to the Gamepad that this Axis belongs to.
    */
  var pad: typingsSlinky.phaser.Phaser.Input.Gamepad.Gamepad = js.native
  /**
    * Movement tolerance threshold below which axis values are ignored in `getValue`.
    */
  var threshold: Double = js.native
  /**
    * The raw axis value, between -1 and 1 with 0 being dead center.
    * Use the method `getValue` to get a normalized value with the threshold applied.
    */
  var value: Double = js.native
  /**
    * Destroys this Axis instance and releases external references it holds.
    */
  def destroy(): Unit = js.native
  /**
    * Applies the `threshold` value to the axis and returns it.
    */
  def getValue(): Double = js.native
}

object Axis {
  @scala.inline
  def apply(
    destroy: () => Unit,
    events: EventEmitter,
    getValue: () => Double,
    index: integer,
    pad: typingsSlinky.phaser.Phaser.Input.Gamepad.Gamepad,
    threshold: Double,
    value: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), index = index.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
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
    def withGetValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
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

