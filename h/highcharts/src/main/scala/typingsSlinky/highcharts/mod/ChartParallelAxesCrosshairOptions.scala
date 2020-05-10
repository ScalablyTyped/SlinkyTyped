package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartParallelAxesCrosshairOptions extends js.Object {
  /**
    * (Highcharts) A class name for the crosshair, especially as a hook for
    * styling.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The color of the crosshair. Defaults to `#cccccc` for
    * numeric and datetime axes, and `rgba(204,214,235,0.25)` for category
    * axes, where the crosshair by default highlights the whole category.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The dash style for the crosshair. See
    * plotOptions.series.dashStyle for possible values.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highstock) A label on the axis next to the crosshair.
    *
    * In styled mode, the label is styled with the
    * `.highcharts-crosshair-label` class.
    */
  var label: js.UndefOr[ChartParallelAxesCrosshairLabelOptions] = js.native
  /**
    * (Highcharts) Whether the crosshair should snap to the point or follow the
    * pointer independent of points.
    */
  var snap: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The pixel width of the crosshair. Defaults to 1 for numeric
    * or datetime axes, and for one category width for category axes.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The Z index of the crosshair. Higher Z indices allow drawing
    * the crosshair on top of the series or behind the grid lines.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object ChartParallelAxesCrosshairOptions {
  @scala.inline
  def apply(): ChartParallelAxesCrosshairOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesCrosshairOptions]
  }
  @scala.inline
  implicit class ChartParallelAxesCrosshairOptionsOps[Self <: ChartParallelAxesCrosshairOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDashStyle(value: DashStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: ChartParallelAxesCrosshairLabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

