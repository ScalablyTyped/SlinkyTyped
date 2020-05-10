package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSizeSupported extends js.Object {
  var `x-dimension`: js.UndefOr[Double | String] = js.native
  var `y-dimension`: js.UndefOr[Double | String] = js.native
}

object MediaSizeSupported {
  @scala.inline
  def apply(): MediaSizeSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSizeSupported]
  }
  @scala.inline
  implicit class MediaSizeSupportedOps[Self <: MediaSizeSupported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-dimension`(value: Double | String): Self = {
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
    def `withY-dimension`(value: Double | String): Self = {
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
  }
  
}

