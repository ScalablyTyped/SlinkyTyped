package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirclesDur extends js.Object {
  var circles: Double = js.native
  var dur: Double = js.native
  def fn(_underscore: Double, index: Double): RNumber = js.native
}

object CirclesDur {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => RNumber): CirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
    __obj.asInstanceOf[CirclesDur]
  }
  @scala.inline
  implicit class CirclesDurOps[Self <: CirclesDur] (val x: Self) extends AnyVal {
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
    def withFn(value: (Double, Double) => RNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

