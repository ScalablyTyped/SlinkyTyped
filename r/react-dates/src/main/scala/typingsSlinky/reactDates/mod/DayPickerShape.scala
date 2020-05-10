package typingsSlinky.reactDates.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactDates.AnonIsVisible
import typingsSlinky.reactDates.mod.momentPropTypes.momentObj
import typingsSlinky.reactDates.reactDatesNumbers.`0`
import typingsSlinky.reactDates.reactDatesNumbers.`1`
import typingsSlinky.reactDates.reactDatesNumbers.`2`
import typingsSlinky.reactDates.reactDatesNumbers.`3`
import typingsSlinky.reactDates.reactDatesNumbers.`4`
import typingsSlinky.reactDates.reactDatesNumbers.`5`
import typingsSlinky.reactDates.reactDatesNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerShape.jsx
@js.native
trait DayPickerShape extends js.Object {
  var calendarInfoPosition: js.UndefOr[CalendarInfoPositionShape] = js.native
  var dayAriaLabelFormat: js.UndefOr[String] = js.native
  var daySize: js.UndefOr[Double] = js.native
  var enableOutsideDays: js.UndefOr[Boolean] = js.native
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  var hideKeyboardShortcutsPanel: js.UndefOr[Boolean] = js.native
  var horizontalMonthPadding: js.UndefOr[Double] = js.native
  var initialVisibleMonth: js.UndefOr[js.Function0[momentObj]] = js.native
  var isFocused: js.UndefOr[Boolean] = js.native
  var isRTL: js.UndefOr[Boolean] = js.native
  // i18n
  var monthFormat: js.UndefOr[String] = js.native
  var navNext: js.UndefOr[String | ReactElement] = js.native
  var navPrev: js.UndefOr[String | ReactElement] = js.native
  var noBorder: js.UndefOr[Boolean] = js.native
  var numberOfMonths: js.UndefOr[Double] = js.native
  // accessibility
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  var onNextMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  var onOutsideClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  var onPrevMonthClick: js.UndefOr[js.Function1[/* newCurrentMonth */ momentObj, Unit]] = js.native
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.native
  var phrases: js.UndefOr[SingleDatePickerPhrases] = js.native
  var renderCalendarDay: js.UndefOr[js.Function1[/* day */ momentObj, String | ReactElement]] = js.native
  var renderCalendarInfo: js.UndefOr[js.Function0[String | ReactElement]] = js.native
  var renderDayContents: js.UndefOr[js.Function1[/* day */ momentObj, String | ReactElement]] = js.native
  var renderMonthElement: js.UndefOr[js.Function1[/* props */ AnonIsVisible, String | ReactElement]] = js.native
  var renderMonthText: js.UndefOr[js.Function1[/* day */ momentObj, String | ReactElement]] = js.native
  var showKeyboardShortcuts: js.UndefOr[Boolean] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var verticalHeight: js.UndefOr[Double] = js.native
  var weekDayFormat: js.UndefOr[String] = js.native
  var withPortal: js.UndefOr[Boolean] = js.native
}

object DayPickerShape {
  @scala.inline
  def apply(): DayPickerShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerShape]
  }
  @scala.inline
  implicit class DayPickerShapeOps[Self <: DayPickerShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarInfoPosition(value: CalendarInfoPositionShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarInfoPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarInfoPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarInfoPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDayAriaLabelFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayAriaLabelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayAriaLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayAriaLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDaySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOutsideDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOutsideDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOutsideDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOutsideDays")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withHideKeyboardShortcutsPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideKeyboardShortcutsPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideKeyboardShortcutsPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideKeyboardShortcutsPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalMonthPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalMonthPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalMonthPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalMonthPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialVisibleMonth(value: () => momentObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVisibleMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitialVisibleMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVisibleMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNavNextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavNext(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navNext")(js.undefined)
        ret
    }
    @scala.inline
    def withNavPrevReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavPrev(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withNoBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNextMonthClick(value: /* newCurrentMonth */ momentObj => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextMonthClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNextMonthClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextMonthClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOutsideClick(value: /* e */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOutsideClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOutsideClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOutsideClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevMonthClick(value: /* newCurrentMonth */ momentObj => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevMonthClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPrevMonthClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevMonthClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: ScrollableOrientationShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPhrases(value: SingleDatePickerPhrases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCalendarDay(value: /* day */ momentObj => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCalendarDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderCalendarDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCalendarDay")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCalendarInfo(value: () => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCalendarInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderCalendarInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCalendarInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDayContents(value: /* day */ momentObj => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDayContents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderDayContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDayContents")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMonthElement(value: /* props */ AnonIsVisible => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMonthElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderMonthElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMonthElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMonthText(value: /* day */ momentObj => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMonthText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderMonthText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMonthText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowKeyboardShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboardShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowKeyboardShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboardShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekDayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekDayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekDayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekDayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withWithPortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPortal")(js.undefined)
        ret
    }
  }
  
}

