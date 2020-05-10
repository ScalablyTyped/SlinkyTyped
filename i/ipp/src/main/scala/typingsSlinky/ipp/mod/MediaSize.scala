package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSize extends js.Object {
  var `x-dimension`: js.UndefOr[Double] = js.native
  var `y-dimension`: js.UndefOr[Double] = js.native
}

object MediaSize {
  @scala.inline
  def apply(): MediaSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSize]
  }
  @scala.inline
  implicit class MediaSizeOps[Self <: MediaSize] (val x: Self) extends AnyVal {
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
  }
  
}

