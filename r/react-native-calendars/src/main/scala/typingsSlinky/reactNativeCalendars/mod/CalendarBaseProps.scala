package typingsSlinky.reactNativeCalendars.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.left
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarBaseProps extends StObject {
  
  /**
    *  Initially visible month. Default = Date()
    */
  var current: js.UndefOr[TCalendarDate] = js.native
  
  /**
    *  Provide custom day rendering component.
    */
  var dayComponent: js.UndefOr[ReactComponentClass[DayComponentProps]] = js.native
  
  /**
    *  Disable left arrow. Default = false
    */
  var disableArrowLeft: js.UndefOr[Boolean] = js.native
  
  /**
    *  Disable right arrow. Default = false
    */
  var disableArrowRight: js.UndefOr[Boolean] = js.native
  
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
    *  Style passed to the header
    */
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
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
  var renderArrow: js.UndefOr[js.Function1[/* direction */ left | right, ReactElement]] = js.native
  
  /*
    *  Replace default month and year title with custom one. the function receive a date as parameter.
    */
  var renderHeader: js.UndefOr[js.Function1[/* date */ js.Date, ReactElement]] = js.native
  
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
  
  /**
    *  Provide aria-level for calendar heading for proper accessibility when used with web (react-native-web)
    */
  var webAriaLevel: js.UndefOr[Double] = js.native
}
object CalendarBaseProps {
  
  @scala.inline
  def apply(): CalendarBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarBaseProps]
  }
  
  @scala.inline
  implicit class CalendarBasePropsMutableBuilder[Self <: CalendarBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: TCalendarDate): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDate(value: js.Date): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setDayComponent(value: ReactComponentClass[DayComponentProps]): Self = StObject.set(x, "dayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayComponentComponent(value: ReactComponentClass[DayComponentProps]): Self = StObject.set(x, "dayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayComponentFunctionComponent(value: ReactComponentClass[DayComponentProps]): Self = StObject.set(x, "dayComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayComponentUndefined: Self = StObject.set(x, "dayComponent", js.undefined)
    
    @scala.inline
    def setDisableArrowLeft(value: Boolean): Self = StObject.set(x, "disableArrowLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableArrowLeftUndefined: Self = StObject.set(x, "disableArrowLeft", js.undefined)
    
    @scala.inline
    def setDisableArrowRight(value: Boolean): Self = StObject.set(x, "disableArrowRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableArrowRightUndefined: Self = StObject.set(x, "disableArrowRight", js.undefined)
    
    @scala.inline
    def setDisableMonthChange(value: Boolean): Self = StObject.set(x, "disableMonthChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMonthChangeUndefined: Self = StObject.set(x, "disableMonthChange", js.undefined)
    
    @scala.inline
    def setDisabledByDefault(value: Boolean): Self = StObject.set(x, "disabledByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledByDefaultUndefined: Self = StObject.set(x, "disabledByDefault", js.undefined)
    
    @scala.inline
    def setDisplayLoadingIndicator(value: Boolean): Self = StObject.set(x, "displayLoadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLoadingIndicatorUndefined: Self = StObject.set(x, "displayLoadingIndicator", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
    
    @scala.inline
    def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
    
    @scala.inline
    def setHideArrows(value: Boolean): Self = StObject.set(x, "hideArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideArrowsUndefined: Self = StObject.set(x, "hideArrows", js.undefined)
    
    @scala.inline
    def setHideDayNames(value: Boolean): Self = StObject.set(x, "hideDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDayNamesUndefined: Self = StObject.set(x, "hideDayNames", js.undefined)
    
    @scala.inline
    def setHideExtraDays(value: Boolean): Self = StObject.set(x, "hideExtraDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideExtraDaysUndefined: Self = StObject.set(x, "hideExtraDays", js.undefined)
    
    @scala.inline
    def setMaxDate(value: TCalendarDate): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: TCalendarDate): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
    
    @scala.inline
    def setOnDayLongPress(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onDayLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayLongPressUndefined: Self = StObject.set(x, "onDayLongPress", js.undefined)
    
    @scala.inline
    def setOnDayPress(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onDayPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDayPressUndefined: Self = StObject.set(x, "onDayPress", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* date */ DateObject => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    @scala.inline
    def setOnPressArrowLeft(value: /* substractMonth */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onPressArrowLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressArrowLeftUndefined: Self = StObject.set(x, "onPressArrowLeft", js.undefined)
    
    @scala.inline
    def setOnPressArrowRight(value: /* addMonth */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onPressArrowRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressArrowRightUndefined: Self = StObject.set(x, "onPressArrowRight", js.undefined)
    
    @scala.inline
    def setOnVisibleMonthsChange(value: /* months */ js.Array[DateObject] => Unit): Self = StObject.set(x, "onVisibleMonthsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVisibleMonthsChangeUndefined: Self = StObject.set(x, "onVisibleMonthsChange", js.undefined)
    
    @scala.inline
    def setRenderArrow(value: /* direction */ left | right => ReactElement): Self = StObject.set(x, "renderArrow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderArrowUndefined: Self = StObject.set(x, "renderArrow", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: /* date */ js.Date => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTheme(value: CalendarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWebAriaLevel(value: Double): Self = StObject.set(x, "webAriaLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAriaLevelUndefined: Self = StObject.set(x, "webAriaLevel", js.undefined)
  }
}
