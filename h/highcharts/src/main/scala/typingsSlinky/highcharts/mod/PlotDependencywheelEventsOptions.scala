package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotDependencywheelEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Fires after the series has finished its
    * initial animation, or in case animation is disabled, immediately as the
    * series is displayed.
    */
  var afterAnimate: js.UndefOr[SeriesAfterAnimateCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the checkbox next to the series' name in the
    * legend is clicked. One parameter, `event`, is passed to the function. The
    * state of the checkbox is found by `event.checked`. The checked item is
    * found by `event.item`. Return `false` to prevent the default action which
    * is to toggle the select state of the series.
    */
  var checkboxClick: js.UndefOr[SeriesCheckboxClickCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the series is clicked. One parameter, `event`, is
    * passed to the function, containing common event information.
    * Additionally, `event.point` holds a pointer to the nearest point on the
    * graph.
    */
  var click: js.UndefOr[SeriesClickCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the series is hidden after chart generation time,
    * either by clicking the legend item or by calling `.hide()`.
    */
  var hide: js.UndefOr[SeriesHideCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the legend item belonging to the series is
    * clicked. One parameter, `event`, is passed to the function. The default
    * action is to toggle the visibility of the series. This can be prevented
    * by returning `false` or calling `event.preventDefault()`.
    */
  var legendItemClick: js.UndefOr[SeriesLegendItemClickCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the mouse leaves the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    * If the stickyTracking option is true, `mouseOut` doesn't happen before
    * the mouse enters another graph or leaves the plot area.
    */
  var mouseOut: js.UndefOr[SeriesMouseOutCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the mouse enters the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var mouseOver: js.UndefOr[SeriesMouseOverCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the series is shown after chart generation time,
    * either by clicking the legend item or by calling `.show()`.
    */
  var show: js.UndefOr[SeriesShowCallbackFunction] = js.native
}

object PlotDependencywheelEventsOptions {
  @scala.inline
  def apply(): PlotDependencywheelEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDependencywheelEventsOptions]
  }
  @scala.inline
  implicit class PlotDependencywheelEventsOptionsOps[Self <: PlotDependencywheelEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAnimate(value: SeriesAfterAnimateCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAnimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxClick(value: SeriesCheckboxClickCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClick")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: SeriesClickCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: SeriesHideCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemClick(value: SeriesLegendItemClickCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOut(value: SeriesMouseOutCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOver(value: SeriesMouseOverCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: SeriesShowCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

