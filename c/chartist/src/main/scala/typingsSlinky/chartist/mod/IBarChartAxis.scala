package typingsSlinky.chartist.mod

import typingsSlinky.chartist.AnonY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBarChartAxis extends js.Object {
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.native
  var labelOffset: js.UndefOr[AnonY] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onlyInteger: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
  var scaleMinSpace: js.UndefOr[Double] = js.native
  var showGrid: js.UndefOr[Boolean] = js.native
  var showLabel: js.UndefOr[Boolean] = js.native
}

object IBarChartAxis {
  @scala.inline
  def apply(): IBarChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBarChartAxis]
  }
  @scala.inline
  implicit class IBarChartAxisOps[Self <: IBarChartAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelInterpolationFnc(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInterpolationFnc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInterpolationFnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInterpolationFnc")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOffset(value: AnonY): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyInteger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleMinSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMinSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMinSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMinSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(js.undefined)
        ret
    }
  }
  
}

