package typingsSlinky.fundamentalReact.calendarMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fundamentalReact.anon.NextMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  monthListProps ? :{[x: string] : any},   tableBodyProps ? :{[x: string] : any},   tableHeaderProps ? :{[x: string] : any},   tableProps ? :{[x: string] : any},   yearListProps ? :{[x: string] : any}, onChange ? (date : std.Date): void, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
@js.native
trait CalendarProps
  extends /* x */ StringDictionary[js.Any] {
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
  var monthListProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  var tableBodyProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var tableHeaderProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var tableProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var yearListProps: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object CalendarProps {
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withMonthListProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthListProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthListProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthListProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTableProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableProps")(js.undefined)
        ret
    }
    @scala.inline
    def withYearListProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearListProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearListProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearListProps")(js.undefined)
        ret
    }
  }
  
}

