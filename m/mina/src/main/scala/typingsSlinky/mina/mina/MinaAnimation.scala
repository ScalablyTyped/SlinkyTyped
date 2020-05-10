package typingsSlinky.mina.mina

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinaAnimation extends js.Object {
  var id: String = js.native
  def duration(): Double = js.native
  def easing(): Double = js.native
  def speed(): Double = js.native
  def status(): Double = js.native
  def stop(): Unit = js.native
}

object MinaAnimation {
  @scala.inline
  def apply(
    duration: () => Double,
    easing: () => Double,
    id: String,
    speed: () => Double,
    status: () => Double,
    stop: () => Unit
  ): MinaAnimation = {
    val __obj = js.Dynamic.literal(duration = js.Any.fromFunction0(duration), easing = js.Any.fromFunction0(easing), id = id.asInstanceOf[js.Any], speed = js.Any.fromFunction0(speed), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MinaAnimation]
  }
  @scala.inline
  implicit class MinaAnimationOps[Self <: MinaAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEasing(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

