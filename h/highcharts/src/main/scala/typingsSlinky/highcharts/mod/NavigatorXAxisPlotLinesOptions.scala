package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorXAxisPlotLinesOptions extends js.Object {
  /**
    * (Highstock) Flag to decide if plotLine should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
    * default `highcharts-plot-line`, to apply to each individual line.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The color of the line.
    */
  var color: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
    * line. For possible values see this overview.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An object defining mouse events for the
    * plot line. Supported properties are `click`, `mouseover`, `mouseout`,
    * `mousemove`.
    */
  var events: js.UndefOr[NavigatorXAxisPlotLinesEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
    * in Axis.removePlotLine.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[NavigatorXAxisPlotLinesLabelOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The position of the line in axis units.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The z index of the plot line within the
    * chart.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object NavigatorXAxisPlotLinesOptions {
  @scala.inline
  def apply(): NavigatorXAxisPlotLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorXAxisPlotLinesOptions]
  }
  @scala.inline
  implicit class NavigatorXAxisPlotLinesOptionsOps[Self <: NavigatorXAxisPlotLinesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcrossPanes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acrossPanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcrossPanes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acrossPanes")(js.undefined)
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
    def withColor(value: ColorString): Self = {
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
    def withEvents(value: NavigatorXAxisPlotLinesEventsOptions): Self = {
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
    def withLabel(value: NavigatorXAxisPlotLinesLabelOptions): Self = {
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

