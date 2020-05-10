package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartParallelAxesEventsOptions extends js.Object {
  /**
    * (Highcharts, Gantt) An event fired after the breaks have rendered.
    */
  var afterBreaks: js.UndefOr[AxisEventCallbackFunction] = js.native
  /**
    * (Highcharts) As opposed to the `setExtremes` event, this event fires
    * after the final min and max values are computed and corrected for
    * `minRange`.
    *
    * Fires when the minimum and maximum is set for the axis, either by calling
    * the `.setExtremes()` method or by selecting an area in the chart. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in axis
    * values. The actual data extremes are found in `event.dataMin` and
    * `event.dataMax`.
    */
  var afterSetExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.native
  /**
    * (Highcharts, Gantt) An event fired when a break from this axis occurs on
    * a point.
    */
  var pointBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Gantt) An event fired when a point falls inside a
    * break from this axis.
    */
  var pointInBreak: js.UndefOr[AxisPointBreakEventCallbackFunction] = js.native
  /**
    * (Highcharts) Fires when the minimum and maximum is set for the axis,
    * either by calling the `.setExtremes()` method or by selecting an area in
    * the chart. One parameter, `event`, is passed to the function, containing
    * common event information.
    *
    * The new user set minimum and maximum values can be found by `event.min`
    * and `event.max`. These reflect the axis minimum and maximum in data
    * values. When an axis is zoomed all the way out from the "Reset zoom"
    * button, `event.min` and `event.max` are null, and the new extremes are
    * set based on `this.dataMin` and `this.dataMax`.
    */
  var setExtremes: js.UndefOr[AxisSetExtremesEventCallbackFunction] = js.native
}

object ChartParallelAxesEventsOptions {
  @scala.inline
  def apply(): ChartParallelAxesEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesEventsOptions]
  }
  @scala.inline
  implicit class ChartParallelAxesEventsOptionsOps[Self <: ChartParallelAxesEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBreaks(value: AxisEventCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetExtremes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterSetExtremes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetExtremes")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBreak(value: AxisPointBreakEventCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withPointInBreak(value: AxisPointBreakEventCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointInBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointInBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointInBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExtremes(value: AxisSetExtremesEventCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtremes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetExtremes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtremes")(js.undefined)
        ret
    }
  }
  
}

