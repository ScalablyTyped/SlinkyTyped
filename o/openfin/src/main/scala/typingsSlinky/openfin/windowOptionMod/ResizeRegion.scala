package typingsSlinky.openfin.windowOptionMod

import typingsSlinky.openfin.AnonBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeRegion extends js.Object {
  var bottomRightCorner: js.UndefOr[Double] = js.native
  var sides: js.UndefOr[AnonBottom] = js.native
  var size: js.UndefOr[Double] = js.native
}

object ResizeRegion {
  @scala.inline
  def apply(): ResizeRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeRegion]
  }
  @scala.inline
  implicit class ResizeRegionOps[Self <: ResizeRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomRightCorner(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRightCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomRightCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRightCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withSides(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

