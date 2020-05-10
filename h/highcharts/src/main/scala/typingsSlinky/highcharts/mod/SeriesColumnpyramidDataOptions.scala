package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesColumnpyramidDataOptions extends js.Object {
  var accessibility: js.UndefOr[SeriesColumnpyramidDataAccessibilityOptions] = js.native
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Individual color for the point. By default
    * the color is pulled from the global `colors` array.
    *
    * In styled mode, the `color` option doesn't take effect. Instead, use
    * `colorIndex`.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Individual data label for each point. The
    * options are the same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.native
  /**
    * (Highcharts, Highstock) A description of the point to add to the screen
    * reader information about the point.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock) Point specific options for the draggable-points
    * module. Overrides options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesColumnpyramidDataDragDropOptions] = js.native
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Individual point events
    */
  var events: js.UndefOr[SeriesColumnpyramidDataEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock) The rank for this point's data label in case of
    * collision. If two data labels are about to overlap, only the one with the
    * highest `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The name of the point as shown in the legend,
    * tooltip, dataLabels etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) The x value of the point. For datetime axes, the
    * X value is the timestamp in milliseconds since 1970.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The y value of the point.
    */
  var y: js.UndefOr[Double | Null] = js.native
}

object SeriesColumnpyramidDataOptions {
  @scala.inline
  def apply(): SeriesColumnpyramidDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesColumnpyramidDataOptions]
  }
  @scala.inline
  implicit class SeriesColumnpyramidDataOptionsOps[Self <: SeriesColumnpyramidDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: SeriesColumnpyramidDataAccessibilityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDrop(value: SeriesColumnpyramidDataDragDropOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDrop")(js.undefined)
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
    def withEvents(value: SeriesColumnpyramidDataEventsOptions): Self = {
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

