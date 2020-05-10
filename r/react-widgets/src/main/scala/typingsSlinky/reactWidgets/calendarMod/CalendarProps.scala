package typingsSlinky.reactWidgets.calendarMod

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.ReactComponentClass
import typingsSlinky.reactWidgets.commonPropsMod.AutoFocus
import typingsSlinky.reactWidgets.commonPropsMod.ReactWidgetsCommonProps
import typingsSlinky.reactWidgets.reactWidgetsStrings.century
import typingsSlinky.reactWidgets.reactWidgetsStrings.decade
import typingsSlinky.reactWidgets.reactWidgetsStrings.month
import typingsSlinky.reactWidgets.reactWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps
  extends ReactWidgetsCommonProps
     with AutoFocus {
  /**
    * A formatter for century, the default formats the first and last year of the century like:
    * 1900 - 1999.
    */
  var centuryFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
  /**
    * Set the culture of the Calendar, passed to the configured localizer.
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * Default current date at which the calendar opens. If none is provided, opens at today's
    * date or the value date (if any).
    * @default Date()
    */
  var currentDate: js.UndefOr[js.Date] = js.native
  /**
    * A formatter for day of the month.
    */
  var dateFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
  /**
    * Provide a custom component to render the days of the month.
    * The Component is provided the following props
    * - date: a Date object for the day of the month to render
    * - label: a formatted String of the date to render. To adjust the format of the label
    *          string use the dateFormat prop, listed below.
    */
  var dayComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * A formatter calendar days of the week, the default formats each day as a Narrow name:
    * "Mo", "Tu", etc.
    */
  var dayFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
  /**
    * A formatter for decade, the default formats the first and last year of the decade like:
    * 2000 - 2009.
    */
  var decadeFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[js.Date] = js.native
  /**
    * Set a unique starting view
    */
  var defaultView: js.UndefOr[CalendarView] = js.native
  /**
    * The highest level view the calendar can navigate up to. This value should be higher than
    * initialView
    */
  var finalView: js.UndefOr[month | year | decade | century] = js.native
  /**
    * Show or hide the Calendar footer.
    * @default false
    */
  var footer: js.UndefOr[Boolean] = js.native
  /**
    * A formatter for the Calendar footer, formats Today's Date as a string.
    */
  var footerFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
  /**
    * A formatter for the header button of the month view
    */
  var headerFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
  /**
    * The starting and lowest level view the calendar can navigate down to.
    */
  var initialView: js.UndefOr[month | year | decade | century] = js.native
  /**
    * The maximum date that the Calendar can navigate to.
    */
  var max: js.UndefOr[js.Date] = js.native
  var messages: js.UndefOr[CalendarMessages] = js.native
  /**
    * The minimum date that the Calendar can navigate from.
    */
  var min: js.UndefOr[js.Date] = js.native
  /**
    * A formatter for month name.
    */
  var monthFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * the Date object
    */
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Date], Unit]] = js.native
  /**
    * Change event Handler that is called when the currentDate is changed. The handler is
    * called with the currentDate object.
    */
  var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Date], Unit]] = js.native
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  /**
    * Callback fired when the Calendar navigates between views, or forward and backwards in
    * time.
    */
  var onNavigate: js.UndefOr[
    js.Function3[/* date */ js.Date, /* direction */ String, /* view */ String, Unit]
  ] = js.native
  /**
    * A callback fired when the view changes.
    */
  var onViewChange: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The current selected date, should be a Date object or null.
    */
  var value: js.UndefOr[js.Date] = js.native
  /**
    * Controls the currently displayed calendar view. Use defaultView to set a unique starting view.
    */
  var view: js.UndefOr[CalendarView] = js.native
  /**
    * Defines a list of views the Calendar can traverse through, starting with the first in the list to the last.
    */
  var views: js.UndefOr[js.Array[CalendarView]] = js.native
  /**
    * A formatter for the year.
    */
  var yearFormat: js.UndefOr[String | (js.Function1[/* day */ js.Date, String])] = js.native
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
    def withCenturyFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centuryFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCenturyFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centuryFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenturyFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centuryFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDateFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDayComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayComponent(value: ReactComponentClass[_]): Self = {
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
    def withDayFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDayFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDecadeFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decadeFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecadeFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decadeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecadeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decadeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Date): Self = {
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
    def withDefaultView(value: CalendarView): Self = {
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
    def withFinalView(value: month | year | decade | century): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalView")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFooterFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialView(value: month | year | decade | century): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialView")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: CalendarMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMonthFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
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
    def withOnChange(value: /* date */ js.UndefOr[js.Date] => Unit): Self = {
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
    def withOnCurrentDateChange(value: /* date */ js.UndefOr[js.Date] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCurrentDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigate(value: (/* date */ js.Date, /* direction */ String, /* view */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnViewChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
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
    def withView(value: CalendarView): Self = {
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
    @scala.inline
    def withViews(value: js.Array[CalendarView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
    @scala.inline
    def withYearFormatFunction1(value: /* day */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYearFormat(value: String | (js.Function1[/* day */ js.Date, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFormat")(js.undefined)
        ret
    }
  }
  
}

