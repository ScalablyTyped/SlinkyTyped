package typingsSlinky.reactNativeCalendarPicker.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCalendarPicker.anon.ContainerStyle
import typingsSlinky.reactNativeCalendarPicker.anon.Style
import typingsSlinky.reactNativeCalendarPicker.mod.CalendarPickerProps
import typingsSlinky.reactNativeCalendarPicker.mod.CustomDateStyle
import typingsSlinky.reactNativeCalendarPicker.mod.CustomDatesStylesFunc
import typingsSlinky.reactNativeCalendarPicker.mod.CustomDayHeaderStylesFuncDateArg
import typingsSlinky.reactNativeCalendarPicker.mod.DayOfWeekStyle
import typingsSlinky.reactNativeCalendarPicker.mod.DisabledDatesFunc
import typingsSlinky.reactNativeCalendarPicker.mod.MaxDurationArrayItem
import typingsSlinky.reactNativeCalendarPicker.mod.MinDurationArrayItem
import typingsSlinky.reactNativeCalendarPicker.mod.SwipeConfig
import typingsSlinky.reactNativeCalendarPicker.mod.SwipeDirection
import typingsSlinky.reactNativeCalendarPicker.mod.default
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.END_DATE
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.START_DATE
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.circle
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.customDates
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.dayOfWeek
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCalendarPicker {
  @JSImport("react-native-calendar-picker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowBackwardRangeSelect(value: Boolean): this.type = set("allowBackwardRangeSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def allowRangeSelection(value: Boolean): this.type = set("allowRangeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def customDatesStylesVarargs(value: CustomDateStyle*): this.type = set("customDatesStyles", js.Array(value :_*))
    @scala.inline
    def customDatesStylesFunction1(value: /* date */ Moment => ContainerStyle): this.type = set("customDatesStyles", js.Any.fromFunction1(value))
    @scala.inline
    def customDatesStyles(value: js.Array[CustomDateStyle] | CustomDatesStylesFunc): this.type = set("customDatesStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def customDatesStylesPriority(value: dayOfWeek | customDates): this.type = set("customDatesStylesPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def customDayHeaderStyles(value: /* date */ CustomDayHeaderStylesFuncDateArg => Style): this.type = set("customDayHeaderStyles", js.Any.fromFunction1(value))
    @scala.inline
    def dayLabelsWrapper(value: StyleProp[ViewStyle]): this.type = set("dayLabelsWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def dayLabelsWrapperNull: this.type = set("dayLabelsWrapper", null)
    @scala.inline
    def dayOfWeekStyles(value: DayOfWeekStyle): this.type = set("dayOfWeekStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def dayShape(value: circle | square): this.type = set("dayShape", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value :_*))
    @scala.inline
    def disabledDatesFunction1(value: /* date */ Moment => Boolean): this.type = set("disabledDates", js.Any.fromFunction1(value))
    @scala.inline
    def disabledDates(value: js.Array[js.Date] | DisabledDatesFunc): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledDatesTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledDatesTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledDatesTextStyleNull: this.type = set("disabledDatesTextStyle", null)
    @scala.inline
    def enableDateChange(value: Boolean): this.type = set("enableDateChange", value.asInstanceOf[js.Any])
    @scala.inline
    def enableSwipe(value: Boolean): this.type = set("enableSwipe", value.asInstanceOf[js.Any])
    @scala.inline
    def headingLevel(value: Double): this.type = set("headingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def initialDate(value: js.Date): this.type = set("initialDate", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def maxRangeDurationVarargs(value: MaxDurationArrayItem*): this.type = set("maxRangeDuration", js.Array(value :_*))
    @scala.inline
    def maxRangeDuration(value: Double | js.Array[MaxDurationArrayItem]): this.type = set("maxRangeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minRangeDurationVarargs(value: MinDurationArrayItem*): this.type = set("minRangeDuration", js.Array(value :_*))
    @scala.inline
    def minRangeDuration(value: Double | js.Array[MinDurationArrayItem]): this.type = set("minRangeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def monthYearHeaderWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("monthYearHeaderWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def monthYearHeaderWrapperStyleNull: this.type = set("monthYearHeaderWrapperStyle", null)
    @scala.inline
    def monthsVarargs(value: String*): this.type = set("months", js.Array(value :_*))
    @scala.inline
    def months(value: js.Array[String]): this.type = set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def nextComponentReactElement(value: ReactElement): this.type = set("nextComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def nextComponent(value: ReactElement): this.type = set("nextComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def nextTitle(value: String): this.type = set("nextTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def nextTitleStyle(value: StyleProp[TextStyle]): this.type = set("nextTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def nextTitleStyleNull: this.type = set("nextTitleStyle", null)
    @scala.inline
    def onDateChange(value: (/* date */ Moment, /* type */ js.UndefOr[START_DATE | END_DATE]) => Unit): this.type = set("onDateChange", js.Any.fromFunction2(value))
    @scala.inline
    def onMonthChange(value: (/* date */ Moment, /* type */ js.UndefOr[START_DATE | END_DATE]) => Unit): this.type = set("onMonthChange", js.Any.fromFunction2(value))
    @scala.inline
    def onSwipe(value: /* swipeDirection */ SwipeDirection => Unit): this.type = set("onSwipe", js.Any.fromFunction1(value))
    @scala.inline
    def previousComponentReactElement(value: ReactElement): this.type = set("previousComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def previousComponent(value: ReactElement): this.type = set("previousComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def previousTitle(value: String): this.type = set("previousTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def previousTitleStyle(value: StyleProp[TextStyle]): this.type = set("previousTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def previousTitleStyleNull: this.type = set("previousTitleStyle", null)
    @scala.inline
    def restrictMonthNavigation(value: Boolean): this.type = set("restrictMonthNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleFactor(value: Double): this.type = set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedDayColor(value: String): this.type = set("selectedDayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedDayStyle(value: StyleProp[ViewStyle]): this.type = set("selectedDayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedDayStyleNull: this.type = set("selectedDayStyle", null)
    @scala.inline
    def selectedDayTextColor(value: String): this.type = set("selectedDayTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedEndDate(value: js.Date): this.type = set("selectedEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedRangeEndStyle(value: StyleProp[ViewStyle]): this.type = set("selectedRangeEndStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedRangeEndStyleNull: this.type = set("selectedRangeEndStyle", null)
    @scala.inline
    def selectedRangeStartStyle(value: StyleProp[ViewStyle]): this.type = set("selectedRangeStartStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedRangeStartStyleNull: this.type = set("selectedRangeStartStyle", null)
    @scala.inline
    def selectedRangeStyle(value: StyleProp[ViewStyle]): this.type = set("selectedRangeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedRangeStyleNull: this.type = set("selectedRangeStyle", null)
    @scala.inline
    def selectedStartDate(value: js.Date): this.type = set("selectedStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def showDayStragglers(value: Boolean): this.type = set("showDayStragglers", value.asInstanceOf[js.Any])
    @scala.inline
    def startFromMonday(value: Boolean): this.type = set("startFromMonday", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeConfig(value: SwipeConfig): this.type = set("swipeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
    @scala.inline
    def todayBackgroundColor(value: String): this.type = set("todayBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def todayTextStyle(value: StyleProp[TextStyle]): this.type = set("todayTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def todayTextStyleNull: this.type = set("todayTextStyle", null)
    @scala.inline
    def weekdaysVarargs(value: String*): this.type = set("weekdays", js.Array(value :_*))
    @scala.inline
    def weekdays(value: js.Array[String]): this.type = set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalendarPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeCalendarPicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

