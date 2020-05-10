package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PPScanRegions extends js.Object {
  var `x-dimension`: js.UndefOr[Double] = js.native
  var `x-origin`: js.UndefOr[Double] = js.native
  var `y-dimension`: js.UndefOr[Double] = js.native
  var `y-origin`: js.UndefOr[Double] = js.native
}

object PPScanRegions {
  @scala.inline
  def apply(): PPScanRegions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PPScanRegions]
  }
  @scala.inline
  implicit class PPScanRegionsOps[Self <: PPScanRegions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-dimension`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-dimension`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-dimension")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-origin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-origin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-origin")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-dimension`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-dimension`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-dimension")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-origin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-origin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-origin")(js.undefined)
        ret
    }
  }
  
}

