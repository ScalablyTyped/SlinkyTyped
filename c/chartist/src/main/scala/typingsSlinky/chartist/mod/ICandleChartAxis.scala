package typingsSlinky.chartist.mod

import typingsSlinky.chartist.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleChartAxis extends js.Object {
  /**
    * Interpolation function that allows you to intercept the value from the axis label
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.native
  /**
    * Allows you to correct label positioning on this axis by positive or negative x and y offset.
    */
  var labelOffset: js.UndefOr[Y] = js.native
  /**
    * The offset of the chart drawing area to the border of the container
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Position where labels are placed. Can be set to `start` or `end` where `start` is equivalent to left or top on vertical axis and `end` is equivalent to right or bottom on horizontal axis.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * If the axis grid should be drawn or not
    */
  var showGrid: js.UndefOr[Boolean] = js.native
  /**
    * If labels should be shown or not
    */
  var showLabel: js.UndefOr[Boolean] = js.native
  /**
    * Set the axis type to be used to project values on this axis. If not defined, Chartist.StepAxis will be used for the X-Axis, where the ticks option will be set to the labels in the data and the stretch option will be set to the global fullWidth option. This type can be changed to any axis constructor available (e.g. Chartist.FixedScaleAxis), where all axis options should be present here.
    */
  var `type`: js.UndefOr[js.Any] = js.native
}

object ICandleChartAxis {
  @scala.inline
  def apply(): ICandleChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleChartAxis]
  }
  @scala.inline
  implicit class ICandleChartAxisOps[Self <: ICandleChartAxis] (val x: Self) extends AnyVal {
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
    def withLabelOffset(value: Y): Self = {
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
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

