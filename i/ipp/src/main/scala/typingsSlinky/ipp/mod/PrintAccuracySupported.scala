package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintAccuracySupported extends js.Object {
  var `accuracy-units`: js.UndefOr[AccuracyUnits] = js.native
  var `x-accuracy`: js.UndefOr[Double] = js.native
  var `y-accuracy`: js.UndefOr[Double] = js.native
  var `z-accuracy`: js.UndefOr[Double] = js.native
}

object PrintAccuracySupported {
  @scala.inline
  def apply(): PrintAccuracySupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintAccuracySupported]
  }
  @scala.inline
  implicit class PrintAccuracySupportedOps[Self <: PrintAccuracySupported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAccuracy-units`(value: AccuracyUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy-units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccuracy-units`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy-units")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-accuracy`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-accuracy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-accuracy`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-accuracy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def `withZ-accuracy`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZ-accuracy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-accuracy")(js.undefined)
        ret
    }
  }
  
}

