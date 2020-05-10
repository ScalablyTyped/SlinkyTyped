package typingsSlinky.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerAnalogOption extends AccelerometerGeneralOption {
  var aref: js.UndefOr[Double] = js.native
  var autoCalibrate: js.UndefOr[Boolean] = js.native
  var pins: js.Array[String] = js.native
  var sensitivity: js.UndefOr[Double] = js.native
  var zeroV: js.UndefOr[Double | js.Array[Double]] = js.native
}

object AccelerometerAnalogOption {
  @scala.inline
  def apply(pins: js.Array[String]): AccelerometerAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerAnalogOption]
  }
  @scala.inline
  implicit class AccelerometerAnalogOptionOps[Self <: AccelerometerAnalogOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAref(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aref")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCalibrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCalibrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCalibrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCalibrate")(js.undefined)
        ret
    }
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
    @scala.inline
    def withZeroV(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroV")(js.undefined)
        ret
    }
  }
  
}

