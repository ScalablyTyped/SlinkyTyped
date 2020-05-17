package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentText extends js.Object {
  var currentText: js.UndefOr[String] = js.native
  var dateRestriction: js.UndefOr[Hint] = js.native
  var dateTimeRange: js.UndefOr[MessageDetail] = js.native
  var nextText: js.UndefOr[String] = js.native
  var prevText: js.UndefOr[String] = js.native
  var regexp: js.UndefOr[MessageSummary] = js.native
  var required: js.UndefOr[Hint] = js.native
  var tooltipCalendar: js.UndefOr[String] = js.native
  var tooltipCalendarDisabled: js.UndefOr[String] = js.native
  var tooltipCalendarTime: js.UndefOr[String] = js.native
  var tooltipCalendarTimeDisabled: js.UndefOr[String] = js.native
  var weekHeader: js.UndefOr[String] = js.native
}

object CurrentText {
  @scala.inline
  def apply(): CurrentText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentText]
  }
  @scala.inline
  implicit class CurrentTextOps[Self <: CurrentText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRestriction(value: Hint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeRange(value: MessageDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexp(value: MessageSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Hint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipCalendar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendar")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipCalendarDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendarDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipCalendarDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendarDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipCalendarTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendarTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipCalendarTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendarTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipCalendarTimeDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendarTimeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipCalendarTimeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipCalendarTimeDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekHeader")(js.undefined)
        ret
    }
  }
  
}

