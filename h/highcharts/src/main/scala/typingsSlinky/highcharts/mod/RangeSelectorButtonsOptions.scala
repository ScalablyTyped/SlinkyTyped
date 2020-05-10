package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelectorButtonsOptions extends js.Object {
  /**
    * (Highstock, Gantt) How many units of the defined type the button should
    * span. If `type` is "month" and `count` is 3, the button spans three
    * months.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * (Highstock) A custom data grouping object for each button.
    */
  var dataGrouping: js.UndefOr[RangeSelectorButtonsDataGroupingOptions] = js.native
  var events: js.UndefOr[RangeSelectorButtonsEventsOptions] = js.native
  /**
    * (Highstock, Gantt) Additional range (in milliseconds) added to the end of
    * the calculated time span.
    */
  var offsetMax: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) Additional range (in milliseconds) added to the start
    * of the calculated time span.
    */
  var offsetMin: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) When buttons apply dataGrouping on a series, by
    * default zooming in/out will deselect buttons and unset dataGrouping.
    * Enable this option to keep buttons selected when extremes change.
    */
  var preserveDataGrouping: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) The text for the button itself.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) Defined the time span for the button. Can be one of
    * `millisecond`, `second`, `minute`, `hour`, `day`, `week`, `month`,
    * `year`, `ytd`, and `all`.
    */
  var `type`: js.UndefOr[RangeSelectorButtonTypeValue] = js.native
}

object RangeSelectorButtonsOptions {
  @scala.inline
  def apply(): RangeSelectorButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonsOptions]
  }
  @scala.inline
  implicit class RangeSelectorButtonsOptionsOps[Self <: RangeSelectorButtonsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDataGrouping(value: RangeSelectorButtonsDataGroupingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: RangeSelectorButtonsEventsOptions): Self = {
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
    def withOffsetMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMax")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMin")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDataGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDataGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDataGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDataGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RangeSelectorButtonTypeValue): Self = {
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

