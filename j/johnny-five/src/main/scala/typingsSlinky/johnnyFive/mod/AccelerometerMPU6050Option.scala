package typingsSlinky.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerMPU6050Option extends AccelerometerGeneralOption {
  var sensitivity: js.UndefOr[Double] = js.native
}

object AccelerometerMPU6050Option {
  @scala.inline
  def apply(): AccelerometerMPU6050Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerMPU6050Option]
  }
  @scala.inline
  implicit class AccelerometerMPU6050OptionOps[Self <: AccelerometerMPU6050Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(js.undefined)
        ret
    }
  }
  
}

