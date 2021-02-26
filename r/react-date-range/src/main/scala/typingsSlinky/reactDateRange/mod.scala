package typingsSlinky.reactDateRange

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactDateRange.anon.PartialClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-date-range", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[CalendarProps, js.Object, js.Any] {
    def this(props: CalendarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CalendarProps, context: js.Any) = this()
  }
  
  @JSImport("react-date-range", "DateRange")
  @js.native
  class DateRange protected ()
    extends Component[DateRangeProps, js.Object, js.Any] {
    def this(props: DateRangeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DateRangeProps, context: js.Any) = this()
  }
  
  @JSImport("react-date-range", "DateRangePicker")
  @js.native
  class DateRangePicker protected ()
    extends Component[DateRangeProps, js.Object, js.Any] {
    def this(props: DateRangeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DateRangeProps, context: js.Any) = this()
  }
  
  type AnyDate = String | js.Date
  
  @js.native
  trait CalendarProps extends CommonCalendarProps {
    
    /** default: today */
    var date: DateInputType = js.native
  }
  object CalendarProps {
    
    @scala.inline
    def apply(date: DateInputType): CalendarProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarProps]
    }
    
    @scala.inline
    implicit class CalendarPropsMutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: DateInputType): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFunction1(value: /* now */ js.Date => AnyDate): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CalendarTheme extends StObject {
    
    var Calendar: js.UndefOr[CSSProperties] = js.native
    
    var DateRange: js.UndefOr[CSSProperties] = js.native
    
    var Day: js.UndefOr[CSSProperties] = js.native
    
    var DayActive: js.UndefOr[CSSProperties] = js.native
    
    var DayEndEdge: js.UndefOr[CSSProperties] = js.native
    
    var DayHover: js.UndefOr[CSSProperties] = js.native
    
    var DayInRange: js.UndefOr[CSSProperties] = js.native
    
    var DayPassive: js.UndefOr[CSSProperties] = js.native
    
    var DaySelected: js.UndefOr[CSSProperties] = js.native
    
    var DaySpecialDay: js.UndefOr[CSSProperties] = js.native
    
    var DayStartEdge: js.UndefOr[CSSProperties] = js.native
    
    var DaySunday: js.UndefOr[CSSProperties] = js.native
    
    var DayToday: js.UndefOr[CSSProperties] = js.native
    
    var MonthAndYear: js.UndefOr[CSSProperties] = js.native
    
    var MonthArrow: js.UndefOr[CSSProperties] = js.native
    
    var MonthArrowNext: js.UndefOr[CSSProperties] = js.native
    
    var MonthArrowPrev: js.UndefOr[CSSProperties] = js.native
    
    var MonthButton: js.UndefOr[CSSProperties] = js.native
    
    var PredefinedRanges: js.UndefOr[CSSProperties] = js.native
    
    var PredefinedRangesItem: js.UndefOr[CSSProperties] = js.native
    
    var PredefinedRangesItemActive: js.UndefOr[CSSProperties] = js.native
    
    var Weekday: js.UndefOr[CSSProperties] = js.native
  }
  object CalendarTheme {
    
    @scala.inline
    def apply(): CalendarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarTheme]
    }
    
    @scala.inline
    implicit class CalendarThemeMutableBuilder[Self <: CalendarTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendar(value: CSSProperties): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      @scala.inline
      def setDateRange(value: CSSProperties): Self = StObject.set(x, "DateRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRangeUndefined: Self = StObject.set(x, "DateRange", js.undefined)
      
      @scala.inline
      def setDay(value: CSSProperties): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayActive(value: CSSProperties): Self = StObject.set(x, "DayActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayActiveUndefined: Self = StObject.set(x, "DayActive", js.undefined)
      
      @scala.inline
      def setDayEndEdge(value: CSSProperties): Self = StObject.set(x, "DayEndEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayEndEdgeUndefined: Self = StObject.set(x, "DayEndEdge", js.undefined)
      
      @scala.inline
      def setDayHover(value: CSSProperties): Self = StObject.set(x, "DayHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayHoverUndefined: Self = StObject.set(x, "DayHover", js.undefined)
      
      @scala.inline
      def setDayInRange(value: CSSProperties): Self = StObject.set(x, "DayInRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayInRangeUndefined: Self = StObject.set(x, "DayInRange", js.undefined)
      
      @scala.inline
      def setDayPassive(value: CSSProperties): Self = StObject.set(x, "DayPassive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPassiveUndefined: Self = StObject.set(x, "DayPassive", js.undefined)
      
      @scala.inline
      def setDaySelected(value: CSSProperties): Self = StObject.set(x, "DaySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaySelectedUndefined: Self = StObject.set(x, "DaySelected", js.undefined)
      
      @scala.inline
      def setDaySpecialDay(value: CSSProperties): Self = StObject.set(x, "DaySpecialDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaySpecialDayUndefined: Self = StObject.set(x, "DaySpecialDay", js.undefined)
      
      @scala.inline
      def setDayStartEdge(value: CSSProperties): Self = StObject.set(x, "DayStartEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayStartEdgeUndefined: Self = StObject.set(x, "DayStartEdge", js.undefined)
      
      @scala.inline
      def setDaySunday(value: CSSProperties): Self = StObject.set(x, "DaySunday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaySundayUndefined: Self = StObject.set(x, "DaySunday", js.undefined)
      
      @scala.inline
      def setDayToday(value: CSSProperties): Self = StObject.set(x, "DayToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayTodayUndefined: Self = StObject.set(x, "DayToday", js.undefined)
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "Day", js.undefined)
      
      @scala.inline
      def setMonthAndYear(value: CSSProperties): Self = StObject.set(x, "MonthAndYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAndYearUndefined: Self = StObject.set(x, "MonthAndYear", js.undefined)
      
      @scala.inline
      def setMonthArrow(value: CSSProperties): Self = StObject.set(x, "MonthArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthArrowNext(value: CSSProperties): Self = StObject.set(x, "MonthArrowNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthArrowNextUndefined: Self = StObject.set(x, "MonthArrowNext", js.undefined)
      
      @scala.inline
      def setMonthArrowPrev(value: CSSProperties): Self = StObject.set(x, "MonthArrowPrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthArrowPrevUndefined: Self = StObject.set(x, "MonthArrowPrev", js.undefined)
      
      @scala.inline
      def setMonthArrowUndefined: Self = StObject.set(x, "MonthArrow", js.undefined)
      
      @scala.inline
      def setMonthButton(value: CSSProperties): Self = StObject.set(x, "MonthButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthButtonUndefined: Self = StObject.set(x, "MonthButton", js.undefined)
      
      @scala.inline
      def setPredefinedRanges(value: CSSProperties): Self = StObject.set(x, "PredefinedRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedRangesItem(value: CSSProperties): Self = StObject.set(x, "PredefinedRangesItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedRangesItemActive(value: CSSProperties): Self = StObject.set(x, "PredefinedRangesItemActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedRangesItemActiveUndefined: Self = StObject.set(x, "PredefinedRangesItemActive", js.undefined)
      
      @scala.inline
      def setPredefinedRangesItemUndefined: Self = StObject.set(x, "PredefinedRangesItem", js.undefined)
      
      @scala.inline
      def setPredefinedRangesUndefined: Self = StObject.set(x, "PredefinedRanges", js.undefined)
      
      @scala.inline
      def setWeekday(value: CSSProperties): Self = StObject.set(x, "Weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayUndefined: Self = StObject.set(x, "Weekday", js.undefined)
    }
  }
  
  @js.native
  trait ClassNames extends StObject {
    
    var calendarWrapper: String = js.native
    
    var dateDisplay: String = js.native
    
    var dateDisplayItem: String = js.native
    
    var dateDisplayItemActive: String = js.native
    
    var dateDisplayWrapper: String = js.native
    
    var dateRangePickerWrapper: String = js.native
    
    var dateRangeWrapper: String = js.native
    
    var day: String = js.native
    
    var dayActive: String = js.native
    
    var dayDisabled: String = js.native
    
    var dayEndOfMonth: String = js.native
    
    var dayEndOfWeek: String = js.native
    
    var dayEndPreview: String = js.native
    
    var dayHovered: String = js.native
    
    var dayInPreview: String = js.native
    
    var dayNumber: String = js.native
    
    var dayPassive: String = js.native
    
    var daySelected: String = js.native
    
    var dayStartOfMonth: String = js.native
    
    var dayStartOfWeek: String = js.native
    
    var dayStartPreview: String = js.native
    
    var dayToday: String = js.native
    
    var dayWeekend: String = js.native
    
    var days: String = js.native
    
    var definedRangesWrapper: String = js.native
    
    var endEdge: String = js.native
    
    var inRange: String = js.native
    
    var infiniteMonths: String = js.native
    
    var inputRange: String = js.native
    
    var inputRangeInput: String = js.native
    
    var inputRanges: String = js.native
    
    var month: String = js.native
    
    var monthAndYearPickers: String = js.native
    
    var monthAndYearWrapper: String = js.native
    
    var monthName: String = js.native
    
    var monthPicker: String = js.native
    
    var months: String = js.native
    
    var monthsHorizontal: String = js.native
    
    var monthsVertical: String = js.native
    
    var nextButton: String = js.native
    
    var nextPrevButton: String = js.native
    
    var prevButton: String = js.native
    
    var selected: String = js.native
    
    var startEdge: String = js.native
    
    var staticRange: String = js.native
    
    var staticRangeLabel: String = js.native
    
    var staticRangeSelected: String = js.native
    
    var staticRanges: String = js.native
    
    var weekDay: String = js.native
    
    var weekDays: String = js.native
    
    var yearPicker: String = js.native
  }
  object ClassNames {
    
    @scala.inline
    def apply(
      calendarWrapper: String,
      dateDisplay: String,
      dateDisplayItem: String,
      dateDisplayItemActive: String,
      dateDisplayWrapper: String,
      dateRangePickerWrapper: String,
      dateRangeWrapper: String,
      day: String,
      dayActive: String,
      dayDisabled: String,
      dayEndOfMonth: String,
      dayEndOfWeek: String,
      dayEndPreview: String,
      dayHovered: String,
      dayInPreview: String,
      dayNumber: String,
      dayPassive: String,
      daySelected: String,
      dayStartOfMonth: String,
      dayStartOfWeek: String,
      dayStartPreview: String,
      dayToday: String,
      dayWeekend: String,
      days: String,
      definedRangesWrapper: String,
      endEdge: String,
      inRange: String,
      infiniteMonths: String,
      inputRange: String,
      inputRangeInput: String,
      inputRanges: String,
      month: String,
      monthAndYearPickers: String,
      monthAndYearWrapper: String,
      monthName: String,
      monthPicker: String,
      months: String,
      monthsHorizontal: String,
      monthsVertical: String,
      nextButton: String,
      nextPrevButton: String,
      prevButton: String,
      selected: String,
      startEdge: String,
      staticRange: String,
      staticRangeLabel: String,
      staticRangeSelected: String,
      staticRanges: String,
      weekDay: String,
      weekDays: String,
      yearPicker: String
    ): ClassNames = {
      val __obj = js.Dynamic.literal(calendarWrapper = calendarWrapper.asInstanceOf[js.Any], dateDisplay = dateDisplay.asInstanceOf[js.Any], dateDisplayItem = dateDisplayItem.asInstanceOf[js.Any], dateDisplayItemActive = dateDisplayItemActive.asInstanceOf[js.Any], dateDisplayWrapper = dateDisplayWrapper.asInstanceOf[js.Any], dateRangePickerWrapper = dateRangePickerWrapper.asInstanceOf[js.Any], dateRangeWrapper = dateRangeWrapper.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], dayActive = dayActive.asInstanceOf[js.Any], dayDisabled = dayDisabled.asInstanceOf[js.Any], dayEndOfMonth = dayEndOfMonth.asInstanceOf[js.Any], dayEndOfWeek = dayEndOfWeek.asInstanceOf[js.Any], dayEndPreview = dayEndPreview.asInstanceOf[js.Any], dayHovered = dayHovered.asInstanceOf[js.Any], dayInPreview = dayInPreview.asInstanceOf[js.Any], dayNumber = dayNumber.asInstanceOf[js.Any], dayPassive = dayPassive.asInstanceOf[js.Any], daySelected = daySelected.asInstanceOf[js.Any], dayStartOfMonth = dayStartOfMonth.asInstanceOf[js.Any], dayStartOfWeek = dayStartOfWeek.asInstanceOf[js.Any], dayStartPreview = dayStartPreview.asInstanceOf[js.Any], dayToday = dayToday.asInstanceOf[js.Any], dayWeekend = dayWeekend.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], definedRangesWrapper = definedRangesWrapper.asInstanceOf[js.Any], endEdge = endEdge.asInstanceOf[js.Any], inRange = inRange.asInstanceOf[js.Any], infiniteMonths = infiniteMonths.asInstanceOf[js.Any], inputRange = inputRange.asInstanceOf[js.Any], inputRangeInput = inputRangeInput.asInstanceOf[js.Any], inputRanges = inputRanges.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthAndYearPickers = monthAndYearPickers.asInstanceOf[js.Any], monthAndYearWrapper = monthAndYearWrapper.asInstanceOf[js.Any], monthName = monthName.asInstanceOf[js.Any], monthPicker = monthPicker.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsHorizontal = monthsHorizontal.asInstanceOf[js.Any], monthsVertical = monthsVertical.asInstanceOf[js.Any], nextButton = nextButton.asInstanceOf[js.Any], nextPrevButton = nextPrevButton.asInstanceOf[js.Any], prevButton = prevButton.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], startEdge = startEdge.asInstanceOf[js.Any], staticRange = staticRange.asInstanceOf[js.Any], staticRangeLabel = staticRangeLabel.asInstanceOf[js.Any], staticRangeSelected = staticRangeSelected.asInstanceOf[js.Any], staticRanges = staticRanges.asInstanceOf[js.Any], weekDay = weekDay.asInstanceOf[js.Any], weekDays = weekDays.asInstanceOf[js.Any], yearPicker = yearPicker.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassNames]
    }
    
    @scala.inline
    implicit class ClassNamesMutableBuilder[Self <: ClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendarWrapper(value: String): Self = StObject.set(x, "calendarWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDisplay(value: String): Self = StObject.set(x, "dateDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDisplayItem(value: String): Self = StObject.set(x, "dateDisplayItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDisplayItemActive(value: String): Self = StObject.set(x, "dateDisplayItemActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDisplayWrapper(value: String): Self = StObject.set(x, "dateDisplayWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRangePickerWrapper(value: String): Self = StObject.set(x, "dateRangePickerWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateRangeWrapper(value: String): Self = StObject.set(x, "dateRangeWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayActive(value: String): Self = StObject.set(x, "dayActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayDisabled(value: String): Self = StObject.set(x, "dayDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayEndOfMonth(value: String): Self = StObject.set(x, "dayEndOfMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayEndOfWeek(value: String): Self = StObject.set(x, "dayEndOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayEndPreview(value: String): Self = StObject.set(x, "dayEndPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayHovered(value: String): Self = StObject.set(x, "dayHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayInPreview(value: String): Self = StObject.set(x, "dayInPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNumber(value: String): Self = StObject.set(x, "dayNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPassive(value: String): Self = StObject.set(x, "dayPassive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaySelected(value: String): Self = StObject.set(x, "daySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayStartOfMonth(value: String): Self = StObject.set(x, "dayStartOfMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayStartOfWeek(value: String): Self = StObject.set(x, "dayStartOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayStartPreview(value: String): Self = StObject.set(x, "dayStartPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayToday(value: String): Self = StObject.set(x, "dayToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayWeekend(value: String): Self = StObject.set(x, "dayWeekend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinedRangesWrapper(value: String): Self = StObject.set(x, "definedRangesWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEdge(value: String): Self = StObject.set(x, "endEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInRange(value: String): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteMonths(value: String): Self = StObject.set(x, "infiniteMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRange(value: String): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRangeInput(value: String): Self = StObject.set(x, "inputRangeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRanges(value: String): Self = StObject.set(x, "inputRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAndYearPickers(value: String): Self = StObject.set(x, "monthAndYearPickers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAndYearWrapper(value: String): Self = StObject.set(x, "monthAndYearWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthName(value: String): Self = StObject.set(x, "monthName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthPicker(value: String): Self = StObject.set(x, "monthPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsHorizontal(value: String): Self = StObject.set(x, "monthsHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsVertical(value: String): Self = StObject.set(x, "monthsVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPrevButton(value: String): Self = StObject.set(x, "nextPrevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButton(value: String): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEdge(value: String): Self = StObject.set(x, "startEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRange(value: String): Self = StObject.set(x, "staticRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRangeLabel(value: String): Self = StObject.set(x, "staticRangeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRangeSelected(value: String): Self = StObject.set(x, "staticRangeSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRanges(value: String): Self = StObject.set(x, "staticRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekDay(value: String): Self = StObject.set(x, "weekDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekDays(value: String): Self = StObject.set(x, "weekDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearPicker(value: String): Self = StObject.set(x, "yearPicker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommonCalendarProps extends StObject {
    
    /** Custom class names for elements */
    var classNames: js.UndefOr[PartialClassNames] = js.native
    
    var firstDayOfWeek: js.UndefOr[Double] = js.native
    
    /** default: DD/MM/YYY */
    var format: js.UndefOr[String] = js.native
    
    /**
      * Calendar languages.
      * ('cn' - Chinese, 'jp' - Japanese,
      * 'fr' - French, 'it' - Italian,
      * 'de' - German, 'ko' - Korean,
      * 'es' - Spanish, 'ru' - Russian,
      * 'tr' - Turkish) default: none
      */
    var lang: js.UndefOr[LanguageType] = js.native
    
    /** default: none */
    var maxDate: js.UndefOr[DateInputType] = js.native
    
    /** default: none */
    var minDate: js.UndefOr[DateInputType] = js.native
    
    /** default: none */
    var onChange: js.UndefOr[js.Function1[/* range */ OnChangeProps, Unit]] = js.native
    
    /** default: none */
    var onInit: js.UndefOr[js.Function1[/* range */ Range, Unit]] = js.native
    
    var theme: js.UndefOr[CalendarTheme] = js.native
  }
  object CommonCalendarProps {
    
    @scala.inline
    def apply(): CommonCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonCalendarProps]
    }
    
    @scala.inline
    implicit class CommonCalendarPropsMutableBuilder[Self <: CommonCalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: PartialClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLang(value: LanguageType): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMaxDate(value: DateInputType): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateFunction1(value: /* now */ js.Date => AnyDate): Self = StObject.set(x, "maxDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: DateInputType): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateFunction1(value: /* now */ js.Date => AnyDate): Self = StObject.set(x, "minDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* range */ OnChangeProps => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnInit(value: /* range */ Range => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setTheme(value: CalendarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait DateContainerType extends StObject {
    
    var date: js.Date = js.native
  }
  object DateContainerType {
    
    @scala.inline
    def apply(date: js.Date): DateContainerType = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateContainerType]
    }
    
    @scala.inline
    implicit class DateContainerTypeMutableBuilder[Self <: DateContainerType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  type DateFunc = js.Function1[/* now */ js.Date, AnyDate]
  
  type DateInputType = AnyDate | DateFunc
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactDateRange.reactDateRangeStrings.Today
    - typingsSlinky.reactDateRange.reactDateRangeStrings.Yesterday
    - typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 7 Days`
    - typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 30 Days`
  */
  trait DateRangeIndex extends StObject
  object DateRangeIndex {
    
    @scala.inline
    def `Last 30 Days`: typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 30 Days` = ("Last 30 Days").asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 30 Days`]
    
    @scala.inline
    def `Last 7 Days`: typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 7 Days` = ("Last 7 Days").asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.`Last 7 Days`]
    
    @scala.inline
    def Today: typingsSlinky.reactDateRange.reactDateRangeStrings.Today = "Today".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.Today]
    
    @scala.inline
    def Yesterday: typingsSlinky.reactDateRange.reactDateRangeStrings.Yesterday = "Yesterday".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.Yesterday]
  }
  
  @js.native
  trait DateRangeObject extends StObject {
    
    def endDate(now: js.Date): js.Date = js.native
    
    def startDate(now: js.Date): js.Date = js.native
  }
  object DateRangeObject {
    
    @scala.inline
    def apply(endDate: js.Date => js.Date, startDate: js.Date => js.Date): DateRangeObject = {
      val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), startDate = js.Any.fromFunction1(startDate))
      __obj.asInstanceOf[DateRangeObject]
    }
    
    @scala.inline
    implicit class DateRangeObjectMutableBuilder[Self <: DateRangeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndDate(value: js.Date => js.Date): Self = StObject.set(x, "endDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartDate(value: js.Date => js.Date): Self = StObject.set(x, "startDate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DateRangeProps
    extends Range
       with CommonCalendarProps {
    
    /** default: 2 */
    var calendars: js.UndefOr[Double] = js.native
    
    /** default: */
    var className: js.UndefOr[String] = js.native
    
    /** default: MMM d, yyyy */
    var dateDisplayFormat: js.UndefOr[String] = js.native
    
    /** default: d */
    var dayDisplayFormat: js.UndefOr[String] = js.native
    
    /** default: vertical */
    var direction: js.UndefOr[String] = js.native
    
    /** default: */
    var disabledDates: js.UndefOr[js.Array[js.Date]] = js.native
    
    /** default: false */
    var editableDateInputs: js.UndefOr[Boolean] = js.native
    
    /** default: Continuous */
    var endDatePlaceholder: js.UndefOr[String] = js.native
    
    /** default: false */
    var linkedCalendars: js.UndefOr[Boolean] = js.native
    
    /** default: enUs from locale. Complete list here https://github.com/Adphorus/react-date-range/blob/next/src/locale/index.js */
    var locale: js.UndefOr[js.Object] = js.native
    
    /** default: MMM yyyy */
    var monthDisplayFormat: js.UndefOr[String] = js.native
    
    /** default: 1 */
    var months: js.UndefOr[Double] = js.native
    
    /** default: false */
    var moveRangeOnFirstSelection: js.UndefOr[Boolean] = js.native
    
    /** default: [] */
    var rangeColors: js.UndefOr[js.Array[String]] = js.native
    
    /** default: false */
    var rangedCalendars: js.UndefOr[Boolean] = js.native
    
    /** default: none */
    var ranges: js.UndefOr[js.Object] = js.native
    
    /** default: { enabled: false } */
    var scroll: js.UndefOr[js.Object] = js.native
    
    /** default: true */
    var showMonthAndYearPickers: js.UndefOr[Boolean] = js.native
    
    /** default: true */
    var showMonthArrow: js.UndefOr[Boolean] = js.native
    
    /** default: false */
    var showSelectionPreview: js.UndefOr[Boolean] = js.native
    
    /** default: */
    var shownDate: js.UndefOr[js.Date] = js.native
    
    /** default: none */
    var specialDays: js.UndefOr[js.Array[DateContainerType]] = js.native
    
    /** default: Early */
    var startDatePlaceholder: js.UndefOr[String] = js.native
    
    /** default: false */
    var twoStepChange: js.UndefOr[Boolean] = js.native
    
    /** default: */
    var weekStartsOn: js.UndefOr[Double] = js.native
    
    /** default: E */
    var weekdayDisplayFormat: js.UndefOr[String] = js.native
  }
  object DateRangeProps {
    
    @scala.inline
    def apply(): DateRangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeProps]
    }
    
    @scala.inline
    implicit class DateRangePropsMutableBuilder[Self <: DateRangeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendars(value: Double): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDateDisplayFormat(value: String): Self = StObject.set(x, "dateDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDisplayFormatUndefined: Self = StObject.set(x, "dateDisplayFormat", js.undefined)
      
      @scala.inline
      def setDayDisplayFormat(value: String): Self = StObject.set(x, "dayDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayDisplayFormatUndefined: Self = StObject.set(x, "dayDisplayFormat", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setEditableDateInputs(value: Boolean): Self = StObject.set(x, "editableDateInputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableDateInputsUndefined: Self = StObject.set(x, "editableDateInputs", js.undefined)
      
      @scala.inline
      def setEndDatePlaceholder(value: String): Self = StObject.set(x, "endDatePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDatePlaceholderUndefined: Self = StObject.set(x, "endDatePlaceholder", js.undefined)
      
      @scala.inline
      def setLinkedCalendars(value: Boolean): Self = StObject.set(x, "linkedCalendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedCalendarsUndefined: Self = StObject.set(x, "linkedCalendars", js.undefined)
      
      @scala.inline
      def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMonthDisplayFormat(value: String): Self = StObject.set(x, "monthDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthDisplayFormatUndefined: Self = StObject.set(x, "monthDisplayFormat", js.undefined)
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setMoveRangeOnFirstSelection(value: Boolean): Self = StObject.set(x, "moveRangeOnFirstSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveRangeOnFirstSelectionUndefined: Self = StObject.set(x, "moveRangeOnFirstSelection", js.undefined)
      
      @scala.inline
      def setRangeColors(value: js.Array[String]): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
      
      @scala.inline
      def setRangeColorsVarargs(value: String*): Self = StObject.set(x, "rangeColors", js.Array(value :_*))
      
      @scala.inline
      def setRangedCalendars(value: Boolean): Self = StObject.set(x, "rangedCalendars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangedCalendarsUndefined: Self = StObject.set(x, "rangedCalendars", js.undefined)
      
      @scala.inline
      def setRanges(value: js.Object): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setScroll(value: js.Object): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setShowMonthAndYearPickers(value: Boolean): Self = StObject.set(x, "showMonthAndYearPickers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthAndYearPickersUndefined: Self = StObject.set(x, "showMonthAndYearPickers", js.undefined)
      
      @scala.inline
      def setShowMonthArrow(value: Boolean): Self = StObject.set(x, "showMonthArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthArrowUndefined: Self = StObject.set(x, "showMonthArrow", js.undefined)
      
      @scala.inline
      def setShowSelectionPreview(value: Boolean): Self = StObject.set(x, "showSelectionPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSelectionPreviewUndefined: Self = StObject.set(x, "showSelectionPreview", js.undefined)
      
      @scala.inline
      def setShownDate(value: js.Date): Self = StObject.set(x, "shownDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShownDateUndefined: Self = StObject.set(x, "shownDate", js.undefined)
      
      @scala.inline
      def setSpecialDays(value: js.Array[DateContainerType]): Self = StObject.set(x, "specialDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecialDaysUndefined: Self = StObject.set(x, "specialDays", js.undefined)
      
      @scala.inline
      def setSpecialDaysVarargs(value: DateContainerType*): Self = StObject.set(x, "specialDays", js.Array(value :_*))
      
      @scala.inline
      def setStartDatePlaceholder(value: String): Self = StObject.set(x, "startDatePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDatePlaceholderUndefined: Self = StObject.set(x, "startDatePlaceholder", js.undefined)
      
      @scala.inline
      def setTwoStepChange(value: Boolean): Self = StObject.set(x, "twoStepChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoStepChangeUndefined: Self = StObject.set(x, "twoStepChange", js.undefined)
      
      @scala.inline
      def setWeekStartsOn(value: Double): Self = StObject.set(x, "weekStartsOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekStartsOnUndefined: Self = StObject.set(x, "weekStartsOn", js.undefined)
      
      @scala.inline
      def setWeekdayDisplayFormat(value: String): Self = StObject.set(x, "weekdayDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayDisplayFormatUndefined: Self = StObject.set(x, "weekdayDisplayFormat", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactDateRange.reactDateRangeStrings.cn
    - typingsSlinky.reactDateRange.reactDateRangeStrings.jp
    - typingsSlinky.reactDateRange.reactDateRangeStrings.fr
    - typingsSlinky.reactDateRange.reactDateRangeStrings.it
    - typingsSlinky.reactDateRange.reactDateRangeStrings.de
    - typingsSlinky.reactDateRange.reactDateRangeStrings.ko
    - typingsSlinky.reactDateRange.reactDateRangeStrings.es
    - typingsSlinky.reactDateRange.reactDateRangeStrings.ru
    - typingsSlinky.reactDateRange.reactDateRangeStrings.tr
  */
  trait LanguageType extends StObject
  object LanguageType {
    
    @scala.inline
    def cn: typingsSlinky.reactDateRange.reactDateRangeStrings.cn = "cn".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.cn]
    
    @scala.inline
    def de: typingsSlinky.reactDateRange.reactDateRangeStrings.de = "de".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.de]
    
    @scala.inline
    def es: typingsSlinky.reactDateRange.reactDateRangeStrings.es = "es".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.es]
    
    @scala.inline
    def fr: typingsSlinky.reactDateRange.reactDateRangeStrings.fr = "fr".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.fr]
    
    @scala.inline
    def it: typingsSlinky.reactDateRange.reactDateRangeStrings.it = "it".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.it]
    
    @scala.inline
    def jp: typingsSlinky.reactDateRange.reactDateRangeStrings.jp = "jp".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.jp]
    
    @scala.inline
    def ko: typingsSlinky.reactDateRange.reactDateRangeStrings.ko = "ko".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.ko]
    
    @scala.inline
    def ru: typingsSlinky.reactDateRange.reactDateRangeStrings.ru = "ru".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.ru]
    
    @scala.inline
    def tr: typingsSlinky.reactDateRange.reactDateRangeStrings.tr = "tr".asInstanceOf[typingsSlinky.reactDateRange.reactDateRangeStrings.tr]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactDateRange.mod.Range
    - typingsSlinky.reactDateRange.anon.Selection
    - typingsSlinky.std.Date
  */
  type OnChangeProps = _OnChangeProps | js.Date
  
  @js.native
  trait Range extends _OnChangeProps {
    
    /** default: today */
    var endDate: js.UndefOr[js.Date] = js.native
    
    /** default: today */
    var startDate: js.UndefOr[js.Date] = js.native
  }
  object Range {
    
    @scala.inline
    def apply(): Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  type SizeType = Double
  
  trait _OnChangeProps extends StObject
  object _OnChangeProps {
    
    @scala.inline
    def Range(): typingsSlinky.reactDateRange.mod.Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.reactDateRange.mod.Range]
    }
    
    @scala.inline
    def Selection(selection: Range): typingsSlinky.reactDateRange.anon.Selection = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactDateRange.anon.Selection]
    }
  }
}
