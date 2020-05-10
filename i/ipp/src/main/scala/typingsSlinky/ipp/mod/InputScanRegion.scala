package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputScanRegion extends js.Object {
  var `x-dimension`: js.UndefOr[String] = js.native
  var `x-origin`: js.UndefOr[String] = js.native
  var `y-dimension`: js.UndefOr[String] = js.native
  var `y-origin`: js.UndefOr[String] = js.native
}

object InputScanRegion {
  @scala.inline
  def apply(): InputScanRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputScanRegion]
  }
  @scala.inline
  implicit class InputScanRegionOps[Self <: InputScanRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-dimension`(value: String): Self = {
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
    def `withX-origin`(value: String): Self = {
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
    def `withY-dimension`(value: String): Self = {
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
    def `withY-origin`(value: String): Self = {
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

