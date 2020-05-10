package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompassHeading extends js.Object {
  var headingAccuracy: js.UndefOr[Double] = js.native
  var magneticHeading: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var trueHeading: js.UndefOr[Double] = js.native
}

object CompassHeading {
  @scala.inline
  def apply(): CompassHeading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompassHeading]
  }
  @scala.inline
  implicit class CompassHeadingOps[Self <: CompassHeading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadingAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withMagneticHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagneticHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(js.undefined)
        ret
    }
  }
  
}

