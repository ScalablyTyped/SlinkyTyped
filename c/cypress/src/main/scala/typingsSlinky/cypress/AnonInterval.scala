package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInterval extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: Double = js.native
  /**
    * Globally disable all animations.
    */
  var off: Boolean = js.native
  var speeds: AnonFast = js.native
  var step: js.Any = js.native
  def stop(): Unit = js.native
  def tick(): Unit = js.native
}

object AnonInterval {
  @scala.inline
  def apply(interval: Double, off: Boolean, speeds: AnonFast, step: js.Any, stop: () => Unit, tick: () => Unit): AnonInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick))
    __obj.asInstanceOf[AnonInterval]
  }
  @scala.inline
  implicit class AnonIntervalOps[Self <: AnonInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeeds(value: AnonFast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

