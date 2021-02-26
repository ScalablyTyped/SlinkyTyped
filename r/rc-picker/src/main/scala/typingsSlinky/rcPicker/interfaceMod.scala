package typingsSlinky.rcPicker

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcPicker.anon.Label
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.rcPickerStrings.key
import typingsSlinky.rcPicker.rcPickerStrings.mouse
import typingsSlinky.rcPicker.rcPickerStrings.submit
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait Components extends StObject {
    
    var button: js.UndefOr[ReactComponentClass[js.Object] | String] = js.native
    
    var rangeItem: js.UndefOr[ReactComponentClass[js.Object] | String] = js.native
  }
  object Components {
    
    @scala.inline
    def apply(): Components = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Components]
    }
    
    @scala.inline
    implicit class ComponentsMutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: ReactComponentClass[js.Object] | String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setRangeItem(value: ReactComponentClass[js.Object] | String): Self = StObject.set(x, "rangeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeItemComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "rangeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeItemFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "rangeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeItemUndefined: Self = StObject.set(x, "rangeItem", js.undefined)
    }
  }
  
  type CustomFormat[DateType] = js.Function1[/* value */ DateType, String]
  
  type DisabledTime[DateType] = js.Function1[/* date */ DateType | Null, DisabledTimes]
  
  @js.native
  trait DisabledTimes extends StObject {
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
  }
  object DisabledTimes {
    
    @scala.inline
    def apply(): DisabledTimes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisabledTimes]
    }
    
    @scala.inline
    implicit class DisabledTimesMutableBuilder[Self <: DisabledTimes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      @scala.inline
      def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      @scala.inline
      def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
    }
  }
  
  type EventValue[DateType] = DateType | Null
  
  @js.native
  trait Locale extends StObject {
    
    var backToToday: String = js.native
    
    var clear: String = js.native
    
    var dateFormat: String = js.native
    
    var dateSelect: String = js.native
    
    var dateTimeFormat: String = js.native
    
    var dayFormat: String = js.native
    
    var decadeSelect: String = js.native
    
    var locale: String = js.native
    
    var month: String = js.native
    
    /** Display month before year in date panel header */
    var monthBeforeYear: js.UndefOr[Boolean] = js.native
    
    var monthFormat: js.UndefOr[String] = js.native
    
    var monthSelect: String = js.native
    
    var nextCentury: String = js.native
    
    var nextDecade: String = js.native
    
    var nextMonth: String = js.native
    
    var nextYear: String = js.native
    
    var now: String = js.native
    
    var ok: String = js.native
    
    var previousCentury: String = js.native
    
    var previousDecade: String = js.native
    
    var previousMonth: String = js.native
    
    var previousYear: String = js.native
    
    var quarterFormat: js.UndefOr[String] = js.native
    
    var shortMonths: js.UndefOr[js.Array[String]] = js.native
    
    var shortWeekDays: js.UndefOr[js.Array[String]] = js.native
    
    var timeSelect: String = js.native
    
    var today: String = js.native
    
    var weekSelect: js.UndefOr[String] = js.native
    
    var year: String = js.native
    
    var yearFormat: String = js.native
    
    var yearSelect: String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      backToToday: String,
      clear: String,
      dateFormat: String,
      dateSelect: String,
      dateTimeFormat: String,
      dayFormat: String,
      decadeSelect: String,
      locale: String,
      month: String,
      monthSelect: String,
      nextCentury: String,
      nextDecade: String,
      nextMonth: String,
      nextYear: String,
      now: String,
      ok: String,
      previousCentury: String,
      previousDecade: String,
      previousMonth: String,
      previousYear: String,
      timeSelect: String,
      today: String,
      year: String,
      yearFormat: String,
      yearSelect: String
    ): Locale = {
      val __obj = js.Dynamic.literal(backToToday = backToToday.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateSelect = dateSelect.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], dayFormat = dayFormat.asInstanceOf[js.Any], decadeSelect = decadeSelect.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthSelect = monthSelect.asInstanceOf[js.Any], nextCentury = nextCentury.asInstanceOf[js.Any], nextDecade = nextDecade.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], previousCentury = previousCentury.asInstanceOf[js.Any], previousDecade = previousDecade.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], previousYear = previousYear.asInstanceOf[js.Any], timeSelect = timeSelect.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any], yearSelect = yearSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackToToday(value: String): Self = StObject.set(x, "backToToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateSelect(value: String): Self = StObject.set(x, "dateSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeFormat(value: String): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayFormat(value: String): Self = StObject.set(x, "dayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecadeSelect(value: String): Self = StObject.set(x, "decadeSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthBeforeYear(value: Boolean): Self = StObject.set(x, "monthBeforeYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthBeforeYearUndefined: Self = StObject.set(x, "monthBeforeYear", js.undefined)
      
      @scala.inline
      def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
      
      @scala.inline
      def setMonthSelect(value: String): Self = StObject.set(x, "monthSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextCentury(value: String): Self = StObject.set(x, "nextCentury", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextDecade(value: String): Self = StObject.set(x, "nextDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNow(value: String): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCentury(value: String): Self = StObject.set(x, "previousCentury", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousDecade(value: String): Self = StObject.set(x, "previousDecade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousYear(value: String): Self = StObject.set(x, "previousYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuarterFormat(value: String): Self = StObject.set(x, "quarterFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuarterFormatUndefined: Self = StObject.set(x, "quarterFormat", js.undefined)
      
      @scala.inline
      def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortMonthsUndefined: Self = StObject.set(x, "shortMonths", js.undefined)
      
      @scala.inline
      def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value :_*))
      
      @scala.inline
      def setShortWeekDays(value: js.Array[String]): Self = StObject.set(x, "shortWeekDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortWeekDaysUndefined: Self = StObject.set(x, "shortWeekDays", js.undefined)
      
      @scala.inline
      def setShortWeekDaysVarargs(value: String*): Self = StObject.set(x, "shortWeekDays", js.Array(value :_*))
      
      @scala.inline
      def setTimeSelect(value: String): Self = StObject.set(x, "timeSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekSelect(value: String): Self = StObject.set(x, "weekSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekSelectUndefined: Self = StObject.set(x, "weekSelect", js.undefined)
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearFormat(value: String): Self = StObject.set(x, "yearFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearSelect(value: String): Self = StObject.set(x, "yearSelect", value.asInstanceOf[js.Any])
    }
  }
  
  type NullableDateType[DateType] = js.UndefOr[DateType | Null]
  
  type OnPanelChange[DateType] = js.Function2[/* value */ DateType, /* mode */ PanelMode, Unit]
  
  type OnSelect[DateType] = js.Function2[/* value */ DateType, /* type */ key | mouse | submit, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcPicker.rcPickerStrings.time
    - typingsSlinky.rcPicker.rcPickerStrings.date
    - typingsSlinky.rcPicker.rcPickerStrings.week
    - typingsSlinky.rcPicker.rcPickerStrings.month
    - typingsSlinky.rcPicker.rcPickerStrings.quarter
    - typingsSlinky.rcPicker.rcPickerStrings.year
    - typingsSlinky.rcPicker.rcPickerStrings.decade
  */
  trait PanelMode extends StObject
  object PanelMode {
    
    @scala.inline
    def date: typingsSlinky.rcPicker.rcPickerStrings.date = "date".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.date]
    
    @scala.inline
    def decade: typingsSlinky.rcPicker.rcPickerStrings.decade = "decade".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.decade]
    
    @scala.inline
    def month: typingsSlinky.rcPicker.rcPickerStrings.month = "month".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.month]
    
    @scala.inline
    def quarter: typingsSlinky.rcPicker.rcPickerStrings.quarter = "quarter".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.quarter]
    
    @scala.inline
    def time: typingsSlinky.rcPicker.rcPickerStrings.time = "time".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.time]
    
    @scala.inline
    def week: typingsSlinky.rcPicker.rcPickerStrings.week = "week".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.week]
    
    @scala.inline
    def year: typingsSlinky.rcPicker.rcPickerStrings.year = "year".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.year]
  }
  
  @js.native
  trait PanelRefProps extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Boolean]] = js.native
  }
  object PanelRefProps {
    
    @scala.inline
    def apply(): PanelRefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelRefProps]
    }
    
    @scala.inline
    implicit class PanelRefPropsMutableBuilder[Self <: PanelRefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLElement] => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  @js.native
  trait PanelSharedProps[DateType] extends StObject {
    
    /** [Legacy] Set default display picker view date */
    var defaultPickerValue: js.UndefOr[DateType] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    var nextIcon: js.UndefOr[ReactElement] = js.native
    
    def onPanelChange(mode: Null, viewValue: DateType): Unit = js.native
    def onPanelChange(mode: PanelMode, viewValue: DateType): Unit = js.native
    
    var onSelect: OnSelect[DateType] = js.native
    
    def onViewDateChange(value: DateType): Unit = js.native
    
    /**
      * Typescript can not handle generic type so we can not use `forwardRef` here.
      * Thus, move ref into operationRef.
      * This is little hack which should refactor after typescript support.
      */
    var operationRef: MutableRefObject[PanelRefProps] = js.native
    
    var prefixCls: String = js.native
    
    var prevIcon: js.UndefOr[ReactElement] = js.native
    
    var superNextIcon: js.UndefOr[ReactElement] = js.native
    
    var superPrevIcon: js.UndefOr[ReactElement] = js.native
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.native
    
    var viewDate: DateType = js.native
  }
  
  /* Inlined std.Exclude<rc-picker.rc-picker/es/interface.PanelMode, 'datetime' | 'decade'> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcPicker.rcPickerStrings.date
    - typingsSlinky.rcPicker.rcPickerStrings.time
    - typingsSlinky.rcPicker.rcPickerStrings.quarter
    - typingsSlinky.rcPicker.rcPickerStrings.week
    - typingsSlinky.rcPicker.rcPickerStrings.year
    - typingsSlinky.rcPicker.rcPickerStrings.month
  */
  trait PickerMode extends StObject
  object PickerMode {
    
    @scala.inline
    def date: typingsSlinky.rcPicker.rcPickerStrings.date = "date".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.date]
    
    @scala.inline
    def month: typingsSlinky.rcPicker.rcPickerStrings.month = "month".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.month]
    
    @scala.inline
    def quarter: typingsSlinky.rcPicker.rcPickerStrings.quarter = "quarter".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.quarter]
    
    @scala.inline
    def time: typingsSlinky.rcPicker.rcPickerStrings.time = "time".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.time]
    
    @scala.inline
    def week: typingsSlinky.rcPicker.rcPickerStrings.week = "week".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.week]
    
    @scala.inline
    def year: typingsSlinky.rcPicker.rcPickerStrings.year = "year".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.year]
  }
  
  type RangeList = js.Array[Label]
  
  type RangeValue[DateType] = (js.Tuple2[EventValue[DateType], EventValue[DateType]]) | Null
}
