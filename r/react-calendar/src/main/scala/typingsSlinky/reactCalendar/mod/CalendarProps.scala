package typingsSlinky.reactCalendar.mod

import typingsSlinky.reactCalendar.anon.CalendarTilePropertiesact
import typingsSlinky.reactCalendar.anon.Date
import typingsSlinky.reactCalendar.reactCalendarStrings.end
import typingsSlinky.reactCalendar.reactCalendarStrings.range
import typingsSlinky.reactCalendar.reactCalendarStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps extends js.Object {
  var activeStartDate: js.UndefOr[js.Date] = js.native
  var calendarType: js.UndefOr[CalendarType] = js.native
  var className: js.UndefOr[String | js.Array[String]] = js.native
  var defaultActiveStartDate: js.UndefOr[js.Date] = js.native
  var defaultValue: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
  var defaultView: js.UndefOr[Detail] = js.native
  var formatLongDate: js.UndefOr[FormatterCallback] = js.native
  var formatMonth: js.UndefOr[FormatterCallback] = js.native
  var formatMonthYear: js.UndefOr[FormatterCallback] = js.native
  var formatShortWeekday: js.UndefOr[FormatterCallback] = js.native
  var formatYear: js.UndefOr[FormatterCallback] = js.native
  var locale: js.UndefOr[String] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var maxDetail: js.UndefOr[Detail] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var minDetail: js.UndefOr[Detail] = js.native
  var navigationAriaLabel: js.UndefOr[String] = js.native
  var navigationLabel: js.UndefOr[
    js.Function1[
      /* props */ Date, 
      String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]
  ] = js.native
  var next2AriaLabel: js.UndefOr[String] = js.native
  var next2Label: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
  ] = js.native
  var nextAriaLabel: js.UndefOr[String] = js.native
  var nextLabel: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  var onActiveStartDateChange: js.UndefOr[ViewCallback] = js.native
  var onChange: js.UndefOr[OnChangeDateCallback] = js.native
  var onClickDay: js.UndefOr[DateCallback] = js.native
  var onClickDecade: js.UndefOr[DateCallback] = js.native
  var onClickMonth: js.UndefOr[DateCallback] = js.native
  var onClickWeekNumber: js.UndefOr[ClickWeekNumberCallback] = js.native
  var onClickYear: js.UndefOr[DateCallback] = js.native
  var onDrillDown: js.UndefOr[ViewCallback] = js.native
  var onDrillUp: js.UndefOr[ViewCallback] = js.native
  var onViewChange: js.UndefOr[ViewCallback] = js.native
  var prev2AriaLabel: js.UndefOr[String] = js.native
  var prev2Label: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
  ] = js.native
  var prevAriaLabel: js.UndefOr[String] = js.native
  var prevLabel: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  var renderChildren: js.UndefOr[
    js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]
  ] = js.native
   // For backwards compatibility
  var returnValue: js.UndefOr[start | end | range] = js.native
  var selectRange: js.UndefOr[Boolean] = js.native
  var showDoubleView: js.UndefOr[Boolean] = js.native
  var showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.native
  var showNavigation: js.UndefOr[Boolean] = js.native
  var showNeighboringMonth: js.UndefOr[Boolean] = js.native
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  var tileClassName: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
  ] = js.native
  var tileContent: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ])
  ] = js.native
  var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTilePropertiesact, Boolean]] = js.native
  var value: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
  var view: js.UndefOr[Detail] = js.native
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
    def withActiveStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarType(value: CalendarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String | js.Array[String]): Self = {
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
    def withDefaultActiveStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Date | js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultView(value: Detail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatLongDate(value: (/* locale */ String, /* date */ js.Date) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLongDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatLongDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLongDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMonth(value: (/* locale */ String, /* date */ js.Date) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMonthYear(value: (/* locale */ String, /* date */ js.Date) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonthYear")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatMonthYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMonthYear")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatShortWeekday(value: (/* locale */ String, /* date */ js.Date) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatShortWeekday")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatShortWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatShortWeekday")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatYear(value: (/* locale */ String, /* date */ js.Date) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatYear")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatYear")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
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
    def withMaxDetail(value: Detail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(js.undefined)
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
    def withMinDetail(value: Detail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationLabel(
      value: /* props */ Date => String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNavigationLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNext2AriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next2AriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext2AriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next2AriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNext2Label(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next2Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext2Label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next2Label")(js.undefined)
        ret
    }
    @scala.inline
    def withNext2LabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next2Label")(null)
        ret
    }
    @scala.inline
    def withNextAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNextLabel(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActiveStartDateChange(value: /* props */ ViewCallbackProperties => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveStartDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActiveStartDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveStartDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* date */ js.Date | js.Array[js.Date] => Unit): Self = {
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
    def withOnClickDay(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickDay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickDecade(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickDecade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickDecade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickDecade")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickMonth(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickWeekNumber(value: (/* weekNumber */ Double, /* date */ js.Date) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickWeekNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClickWeekNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickWeekNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickYear(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickYear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrillDown(value: /* props */ ViewCallbackProperties => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrillDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrillDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrillDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrillUp(value: /* props */ ViewCallbackProperties => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrillUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrillUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrillUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewChange(value: /* props */ ViewCallbackProperties => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev2AriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev2AriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev2AriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev2AriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev2Label(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev2Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev2Label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev2Label")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev2LabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev2Label")(null)
        ret
    }
    @scala.inline
    def withPrevAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevLabel(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderChildren(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnValue(value: start | end | range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRange")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDoubleView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoubleView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDoubleView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoubleView")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFixedNumberOfWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFixedNumberOfWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFixedNumberOfWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFixedNumberOfWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNeighboringMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNeighboringMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNeighboringMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNeighboringMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTileClassName(
      value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTileContentFunction1(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTileContent(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTileDisabled(value: /* props */ CalendarTilePropertiesact => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTileDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Date | js.Array[js.Date]): Self = {
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
    def withView(value: Detail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

