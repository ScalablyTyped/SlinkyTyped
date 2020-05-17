package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dur extends js.Object {
  var circles: Double = js.native
  var dur: Double = js.native
  var elmDuration: Boolean = js.native
  def fn(): Cx = js.native
}

object Dur {
  @scala.inline
  def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: () => Cx): Dur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], elmDuration = elmDuration.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[Dur]
  }
  @scala.inline
  implicit class DurOps[Self <: Dur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElmDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elmDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: () => Cx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

