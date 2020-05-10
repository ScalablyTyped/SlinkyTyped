package typingsSlinky.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarYearStrings extends js.Object {
  var nextRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.native
  var prevRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.native
  var rangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.native
}

object ICalendarYearStrings {
  @scala.inline
  def apply(): ICalendarYearStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarYearStrings]
  }
  @scala.inline
  implicit class ICalendarYearStringsOps[Self <: ICalendarYearStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRangeAriaLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNextRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRangeAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRangeAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRangeAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevRangeAriaLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrevRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevRangeAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevRangeAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevRangeAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeAriaLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeAriaLabel")(js.undefined)
        ret
    }
  }
  
}

