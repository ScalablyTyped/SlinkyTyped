package typingsSlinky.officeUiFabricReact.calendarMonthMod

import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarMonthProps extends ClassAttributes[CalendarMonth] {
  var componentRef: js.UndefOr[IRefObject[ICalendarMonth]] = js.native
  var dateTimeFormatter: ICalendarFormatDateCallbacks = js.native
  var highlightCurrentMonth: Boolean = js.native
  var highlightSelectedMonth: Boolean = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var navigatedDate: js.Date = js.native
  var navigationIcons: ICalendarIconStrings = js.native
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.native
  var selectedDate: js.Date = js.native
  var strings: ICalendarStrings = js.native
  var today: js.UndefOr[js.Date] = js.native
  var yearPickerHidden: js.UndefOr[Boolean] = js.native
  def onNavigateDate(date: js.Date, focusOnNavigatedDay: Boolean): Unit = js.native
}

object ICalendarMonthProps {
  @scala.inline
  def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Unit,
    selectedDate: js.Date,
    strings: ICalendarStrings
  ): ICalendarMonthProps = {
    val __obj = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2(onNavigateDate), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarMonthProps]
  }
  @scala.inline
  implicit class ICalendarMonthPropsOps[Self <: ICalendarMonthProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeFormatter(value: ICalendarFormatDateCallbacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightCurrentMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightSelectedMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationIcons(value: ICalendarIconStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnNavigateDate(value: (js.Date, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigateDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrings(value: ICalendarStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ICalendarMonth | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ICalendarMonth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ICalendarMonth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHeaderSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withToday(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.undefined)
        ret
    }
    @scala.inline
    def withYearPickerHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPickerHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearPickerHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPickerHidden")(js.undefined)
        ret
    }
  }
  
}

