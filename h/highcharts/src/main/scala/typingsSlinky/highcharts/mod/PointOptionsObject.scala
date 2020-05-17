package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointOptionsObject extends PointOptionsType {
  /**
    * An additional, individual class name for the data point's graphic
    * representation.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Individual color for the point. By default the color is pulled from the
    * global colors array. In styled mode, the color option doesn't take
    * effect. Instead, use colorIndex.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * A specific color index to use for the point, so its graphic
    * representations are given the class name highcharts-color-{n}. In styled
    * mode this will change the color of the graphic. In non-styled mode, the
    * color by is set by the fill attribute, so the change in class name won't
    * have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  /**
    * A name for the dash style to use for the column or bar. Overrides
    * dashStyle on the series. In styled mode, the stroke dash-array can be set
    * with the same classes as listed under
    * Highcharts.PointOptionsObject#color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * Individual data labels for each point.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.native
  /**
    * The id of a series in the drilldown.series array to use for a drilldown
    * for this point.
    */
  var drilldown: js.UndefOr[String] = js.native
  /**
    * The individual point events.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.native
  /**
    * Range series only. The high or maximum value for each data point.
    */
  var high: js.UndefOr[Double] = js.native
  /**
    * An id for the point. This can be used after render time to get a pointer
    * to the point object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The rank for this point's data label in case of collision. If two data
    * labels are about to overlap, only the one with the highest labelrank will
    * be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  /**
    * The sequential index of the data point in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.native
  /**
    * Range series only. The low or minimum value for each data point.
    */
  var low: js.UndefOr[Double] = js.native
  /**
    * Options for the point markers of line-like series.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  /**
    * The name of the point as shown in the legend, tooltip, dataLabels etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Heatmap series only. Point padding for a single point.
    */
  var pointPadding: js.UndefOr[Double] = js.native
  /**
    * A pixel value specifying a fixed width for the column or bar. Overrides
    * pointWidth on the series.
    */
  var pointWidth: js.UndefOr[Double] = js.native
  /**
    * Whether the data point is selected initially.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Pie series only. Whether to display a slice offset from the center.
    */
  var sliced: js.UndefOr[Boolean] = js.native
  /**
    * Heatmap series only. The value of the point, resulting in a color
    * controled by options as set in the colorAxis configuration.
    */
  var value: js.UndefOr[Double | Null] = js.native
  /**
    * The x value of the point. For datetime axes, the X value is the timestamp
    * in milliseconds since 1970.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.native
  /**
    * The y value of the point.
    */
  var y: js.UndefOr[Double | Null] = js.native
}

object PointOptionsObject {
  @scala.inline
  def apply(): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptionsObject]
  }
  @scala.inline
  implicit class PointOptionsObjectOps[Self <: PointOptionsObject] (val x: Self) extends AnyVal {
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
    def withColorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(js.undefined)
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
    def withDataLabels(value: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilldown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: PointEventsOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelrank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelrank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelrank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelrank")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: PointMarkerOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPointPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withPointWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSliced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliced")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withX2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(null)
        ret
    }
  }
  
}

