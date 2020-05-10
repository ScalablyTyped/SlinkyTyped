package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorOptions extends js.Object {
  /**
    * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
    * updated data in the base X axis. When loading data async, as in the demo
    * below, this should be `false`. Otherwise new data will trigger navigator
    * redraw, which will cause unwanted looping. In the demo below, the data in
    * the navigator is set only once. On navigating, only the main chart
    * content is updated.
    */
  var adaptToUpdatedData: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Enable or disable the navigator.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
    */
  var handles: js.UndefOr[NavigatorHandlesOptions] = js.native
  /**
    * (Highstock, Gantt) The height of the navigator.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The distance from the nearest element, the X axis or X
    * axis labels.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The color of the mask covering the areas of the
    * navigator series that are currently not visible in the main series. The
    * default color is bluish with an opacity of 0.3 to see the series below.
    */
  var maskFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock, Gantt) Whether the mask should be inside the range marking
    * the zoomed range, or outside. In Highstock 1.x it was always `false`.
    */
  var maskInside: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) When the chart is inverted, whether to draw the
    * navigator on the opposite side.
    */
  var opposite: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) The color of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock, Gantt) The width of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) Options for the navigator series. Available options
    * are the same as any series, documented at plotOptions and series.
    *
    * Unless data is explicitly defined on navigator.series, the data is
    * borrowed from the first series in the chart.
    *
    * Default series options for the navigator series are:
    *
    *  (see online documentation for example)
    */
  var series: js.UndefOr[
    NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType])
  ] = js.native
  /**
    * (Highstock, Gantt) Options for the navigator X axis. Default series
    * options for the navigator xAxis are:
    *
    *  (see online documentation for example)
    */
  var xAxis: js.UndefOr[NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions]] = js.native
  /**
    * (Highstock, Gantt) Options for the navigator Y axis. Default series
    * options for the navigator yAxis are:
    *
    *  (see online documentation for example)
    */
  var yAxis: js.UndefOr[NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions]] = js.native
}

object NavigatorOptions {
  @scala.inline
  def apply(): NavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorOptions]
  }
  @scala.inline
  implicit class NavigatorOptionsOps[Self <: NavigatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptToUpdatedData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptToUpdatedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptToUpdatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptToUpdatedData")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHandles(value: NavigatorHandlesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskFill(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskFill")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskInside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskInside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskInside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskInside")(js.undefined)
        ret
    }
    @scala.inline
    def withOpposite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposite")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(
      value: NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
  }
  
}

