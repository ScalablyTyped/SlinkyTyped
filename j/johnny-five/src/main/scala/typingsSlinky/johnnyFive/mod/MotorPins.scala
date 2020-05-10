package typingsSlinky.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotorPins extends js.Object {
  var brake: js.UndefOr[Double] = js.native
  var cdir: js.UndefOr[Double] = js.native
  var dir: Double = js.native
  var pwm: Double = js.native
}

object MotorPins {
  @scala.inline
  def apply(dir: Double, pwm: Double): MotorPins = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorPins]
  }
  @scala.inline
  implicit class MotorPinsOps[Self <: MotorPins] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPwm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrake(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brake")(js.undefined)
        ret
    }
    @scala.inline
    def withCdir(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdir")(js.undefined)
        ret
    }
  }
  
}

