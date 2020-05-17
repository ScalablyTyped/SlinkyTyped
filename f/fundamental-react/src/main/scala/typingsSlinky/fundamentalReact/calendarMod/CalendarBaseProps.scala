package typingsSlinky.fundamentalReact.calendarMod

import typingsSlinky.fundamentalReact.anon.NextMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarBaseProps extends js.Object {
  var blockedDates: js.UndefOr[js.Array[js.Date]] = js.native
  var disableAfterDate: js.UndefOr[js.Date] = js.native
  var disableBeforeDate: js.UndefOr[js.Date] = js.native
  var disableFutureDates: js.UndefOr[Boolean] = js.native
  var disablePastDates: js.UndefOr[Boolean] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disableWeekday: js.UndefOr[js.Array[String]] = js.native
  var disableWeekends: js.UndefOr[Boolean] = js.native
  var disabledDates: js.UndefOr[js.Array[js.Date]] = js.native
  var localizedText: js.UndefOr[NextMonth] = js.native
}

object CalendarBaseProps {
  @scala.inline
  def apply(): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarBaseProps]
  }
  @scala.inline
  implicit class CalendarBasePropsOps[Self <: CalendarBaseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockedDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAfterDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAfterDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAfterDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAfterDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableBeforeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBeforeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBeforeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBeforeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFutureDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFutureDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFutureDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFutureDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePastDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePastDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePastDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePastDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWeekday(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekday")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWeekends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWeekends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekends")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizedText(value: NextMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(js.undefined)
        ret
    }
  }
  
}

