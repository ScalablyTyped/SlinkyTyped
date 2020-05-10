package typingsSlinky.reactNativeCalendars.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.left
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarBaseProps extends js.Object {
  /**
    *  Initially visible month. Default = Date()
    */
  var current: js.UndefOr[TCalendarDate] = js.native
  /**
    *  Provide custom day rendering component.
    */
  var dayComponent: js.UndefOr[ReactComponentClass[DayComponentProps]] = js.native
  /**
    *  If hideArrows=false and hideExtraDays=false do not switch month when tapping on greyed out
    *  day from another month that is visible in calendar page. Default = false
    */
  var disableMonthChange: js.UndefOr[Boolean] = js.native
  /**
    *  Disable days by default. Default = false
    */
  var disabledByDefault: js.UndefOr[Boolean] = js.native
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.native
  /**
    *  If firstDay=1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.native
  /**
    *  Hide month navigation arrows. Default = false
    */
  var hideArrows: js.UndefOr[Boolean] = js.native
  /**
    *  Hide day names. Default = false
    */
  var hideDayNames: js.UndefOr[Boolean] = js.native
  /**
    *  Do not show days of other months in month page. Default = false
    */
  var hideExtraDays: js.UndefOr[Boolean] = js.native
  /**
    *  Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.native
  /**
    *  Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.native
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[String] = js.native
  /**
    *  Handler which gets executed on day long press. Default = undefined
    */
  var onDayLongPress: js.UndefOr[DateCallbackHandler] = js.native
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.native
  /**
    *  Handler which gets executed when visible month changes in calendar. Default = undefined
    */
  var onMonthChange: js.UndefOr[DateCallbackHandler] = js.native
  /**
    *  Handler which gets executed when press arrow icon left. It receive a callback can go back month
    */
  var onPressArrowLeft: js.UndefOr[js.Function1[/* substractMonth */ js.Function0[Unit], Unit]] = js.native
  /**
    *  Handler which gets executed when press arrow icon left. It receive a callback can go next month
    */
  var onPressArrowRight: js.UndefOr[js.Function1[/* addMonth */ js.Function0[Unit], Unit]] = js.native
  /**
    *  Callback which gets executed when visible months change in scroll view. Default = undefined
    */
  var onVisibleMonthsChange: js.UndefOr[js.Function1[/* months */ js.Array[DateObject], Unit]] = js.native
  /**
    *  Replace default arrows with custom ones (direction can be 'left' or 'right')
    */
  var renderArrow: js.UndefOr[js.Function1[/* direction */ left | right, TagMod[Any]]] = js.native
  /**
    *  Show week numbers to the left. Default = false
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  /**
    *  Calendar container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    *  Specify theme properties to override specific styles for calendar parts. Default = {}
    */
  var theme: js.UndefOr[CalendarTheme] = js.native
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
    def withCurrentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: TCalendarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withDayComponentFunctionComponent(value: ReactComponentClass[DayComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayComponentComponent(value: ReactComponentClass[DayComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayComponent(value: ReactComponentClass[DayComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMonthChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMonthChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMonthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMonthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLoadingIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLoadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLoadingIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLoadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(js.undefined)
        ret
    }
    @scala.inline
    def withHideArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDayNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withHideExtraDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideExtraDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideExtraDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideExtraDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: TCalendarDate): Self = {
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
    def withMinDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: TCalendarDate): Self = {
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
    def withOnDayLongPress(value: /* date */ DateObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDayLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayPress(value: /* date */ DateObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDayPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthChange(value: /* date */ DateObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMonthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressArrowLeft(value: /* substractMonth */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressArrowLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressArrowLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressArrowLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressArrowRight(value: /* addMonth */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressArrowRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressArrowRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressArrowRight")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVisibleMonthsChange(value: /* months */ js.Array[DateObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleMonthsChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVisibleMonthsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleMonthsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderArrow(value: /* direction */ left | right => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderArrow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderArrow")(js.undefined)
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
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTheme(value: CalendarTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

