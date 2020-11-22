package typingsSlinky.flatpickr.anon

import typingsSlinky.flatpickr.flatpickrStrings.above
import typingsSlinky.flatpickr.flatpickrStrings.auto
import typingsSlinky.flatpickr.flatpickrStrings.below
import typingsSlinky.flatpickr.flatpickrStrings.multiple
import typingsSlinky.flatpickr.flatpickrStrings.range
import typingsSlinky.flatpickr.flatpickrStrings.single
import typingsSlinky.flatpickr.flatpickrStrings.time
import typingsSlinky.flatpickr.globalsMod.global.Date
import typingsSlinky.flatpickr.globalsMod.global.HTMLElement
import typingsSlinky.flatpickr.localeMod.CustomLocale
import typingsSlinky.flatpickr.localeMod.Locale
import typingsSlinky.flatpickr.localeMod.key
import typingsSlinky.flatpickr.optionsMod.DateLimit
import typingsSlinky.flatpickr.optionsMod.Hook
import typingsSlinky.flatpickr.optionsMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<flatpickr.flatpickr/dist/types/options.ParsedOptions> */
@js.native
trait PartialParsedOptions extends js.Object {
  
  var _disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
  
  var _enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
  
  var _maxDate: js.UndefOr[Date] = js.native
  
  var _maxTime: js.UndefOr[Date] = js.native
  
  var _minDate: js.UndefOr[Date] = js.native
  
  var _minTime: js.UndefOr[Date] = js.native
  
  var allowInput: js.UndefOr[Boolean] = js.native
  
  var allowInvalidPreload: js.UndefOr[Boolean] = js.native
  
  var altFormat: js.UndefOr[String] = js.native
  
  var altInput: js.UndefOr[Boolean] = js.native
  
  var altInputClass: js.UndefOr[String] = js.native
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var appendTo: js.UndefOr[HTMLElement] = js.native
  
  var ariaDateFormat: js.UndefOr[String] = js.native
  
  var autoFillDefaultTime: js.UndefOr[Boolean] = js.native
  
  var clickOpens: js.UndefOr[Boolean] = js.native
  
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  var conjunction: js.UndefOr[String] = js.native
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var defaultDate: js.UndefOr[Date | js.Array[Date]] = js.native
  
  var defaultHour: js.UndefOr[Double] = js.native
  
  var defaultMinute: js.UndefOr[Double] = js.native
  
  var defaultSeconds: js.UndefOr[Double] = js.native
  
  var disable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
  
  var disableMobile: js.UndefOr[Boolean] = js.native
  
  var enable: js.UndefOr[js.Array[DateLimit[Date]]] = js.native
  
  var enableSeconds: js.UndefOr[Boolean] = js.native
  
  var enableTime: js.UndefOr[Boolean] = js.native
  
  var errorHandler: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.native
  
  var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.native
  
  var hourIncrement: js.UndefOr[Double] = js.native
  
  var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[key | CustomLocale] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var maxTime: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var minTime: js.UndefOr[Date] = js.native
  
  var minuteIncrement: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[single | multiple | range | time] = js.native
  
  var monthSelectorType: js.UndefOr[String] = js.native
  
  var nextArrow: js.UndefOr[String] = js.native
  
  var noCalendar: js.UndefOr[Boolean] = js.native
  
  var now: js.UndefOr[Date] = js.native
  
  var onChange: js.UndefOr[js.Array[Hook]] = js.native
  
  var onClose: js.UndefOr[js.Array[Hook]] = js.native
  
  var onDayCreate: js.UndefOr[js.Array[Hook]] = js.native
  
  var onDestroy: js.UndefOr[js.Array[Hook]] = js.native
  
  var onKeyDown: js.UndefOr[js.Array[Hook]] = js.native
  
  var onMonthChange: js.UndefOr[js.Array[Hook]] = js.native
  
  var onOpen: js.UndefOr[js.Array[Hook]] = js.native
  
  var onParseConfig: js.UndefOr[js.Array[Hook]] = js.native
  
  var onPreCalendarPosition: js.UndefOr[js.Array[Hook]] = js.native
  
  var onReady: js.UndefOr[js.Array[Hook]] = js.native
  
  var onValueUpdate: js.UndefOr[js.Array[Hook]] = js.native
  
  var onYearChange: js.UndefOr[js.Array[Hook]] = js.native
  
  var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.native
  
  var plugins: js.UndefOr[js.Array[Plugin[js.Object]]] = js.native
  
  var position: js.UndefOr[auto | above | below] = js.native
  
  var positionElement: js.UndefOr[HTMLElement] = js.native
  
  var prevArrow: js.UndefOr[String] = js.native
  
  var shorthandCurrentMonth: js.UndefOr[Boolean] = js.native
  
  var showMonths: js.UndefOr[Double] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
  
  var time_24hr: js.UndefOr[Boolean] = js.native
  
  var weekNumbers: js.UndefOr[Boolean] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object PartialParsedOptions {
  
  @scala.inline
  def apply(): PartialParsedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParsedOptions]
  }
  
  @scala.inline
  implicit class PartialParsedOptionsOps[Self <: PartialParsedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_disableVarargs(value: DateLimit[Date]*): Self = this.set("_disable", js.Array(value :_*))
    
    @scala.inline
    def set_disable(value: js.Array[DateLimit[Date]]): Self = this.set("_disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_disable: Self = this.set("_disable", js.undefined)
    
    @scala.inline
    def set_enableVarargs(value: DateLimit[Date]*): Self = this.set("_enable", js.Array(value :_*))
    
    @scala.inline
    def set_enable(value: js.Array[DateLimit[Date]]): Self = this.set("_enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_enable: Self = this.set("_enable", js.undefined)
    
    @scala.inline
    def set_maxDate(value: Date): Self = this.set("_maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_maxDate: Self = this.set("_maxDate", js.undefined)
    
    @scala.inline
    def set_maxTime(value: Date): Self = this.set("_maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_maxTime: Self = this.set("_maxTime", js.undefined)
    
    @scala.inline
    def set_minDate(value: Date): Self = this.set("_minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_minDate: Self = this.set("_minDate", js.undefined)
    
    @scala.inline
    def set_minTime(value: Date): Self = this.set("_minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_minTime: Self = this.set("_minTime", js.undefined)
    
    @scala.inline
    def setAllowInput(value: Boolean): Self = this.set("allowInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInput: Self = this.set("allowInput", js.undefined)
    
    @scala.inline
    def setAllowInvalidPreload(value: Boolean): Self = this.set("allowInvalidPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInvalidPreload: Self = this.set("allowInvalidPreload", js.undefined)
    
    @scala.inline
    def setAltFormat(value: String): Self = this.set("altFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltFormat: Self = this.set("altFormat", js.undefined)
    
    @scala.inline
    def setAltInput(value: Boolean): Self = this.set("altInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltInput: Self = this.set("altInput", js.undefined)
    
    @scala.inline
    def setAltInputClass(value: String): Self = this.set("altInputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltInputClass: Self = this.set("altInputClass", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAppendTo(value: HTMLElement): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAriaDateFormat(value: String): Self = this.set("ariaDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDateFormat: Self = this.set("ariaDateFormat", js.undefined)
    
    @scala.inline
    def setAutoFillDefaultTime(value: Boolean): Self = this.set("autoFillDefaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFillDefaultTime: Self = this.set("autoFillDefaultTime", js.undefined)
    
    @scala.inline
    def setClickOpens(value: Boolean): Self = this.set("clickOpens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickOpens: Self = this.set("clickOpens", js.undefined)
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnSelect: Self = this.set("closeOnSelect", js.undefined)
    
    @scala.inline
    def setConjunction(value: String): Self = this.set("conjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConjunction: Self = this.set("conjunction", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDefaultDateVarargs(value: Date*): Self = this.set("defaultDate", js.Array(value :_*))
    
    @scala.inline
    def setDefaultDate(value: Date | js.Array[Date]): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDefaultHour(value: Double): Self = this.set("defaultHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHour: Self = this.set("defaultHour", js.undefined)
    
    @scala.inline
    def setDefaultMinute(value: Double): Self = this.set("defaultMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMinute: Self = this.set("defaultMinute", js.undefined)
    
    @scala.inline
    def setDefaultSeconds(value: Double): Self = this.set("defaultSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSeconds: Self = this.set("defaultSeconds", js.undefined)
    
    @scala.inline
    def setDisableVarargs(value: DateLimit[Date]*): Self = this.set("disable", js.Array(value :_*))
    
    @scala.inline
    def setDisable(value: js.Array[DateLimit[Date]]): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDisableMobile(value: Boolean): Self = this.set("disableMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobile: Self = this.set("disableMobile", js.undefined)
    
    @scala.inline
    def setEnableVarargs(value: DateLimit[Date]*): Self = this.set("enable", js.Array(value :_*))
    
    @scala.inline
    def setEnable(value: js.Array[DateLimit[Date]]): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEnableSeconds(value: Boolean): Self = this.set("enableSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSeconds: Self = this.set("enableSeconds", js.undefined)
    
    @scala.inline
    def setEnableTime(value: Boolean): Self = this.set("enableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTime: Self = this.set("enableTime", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* err */ js.Error => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ Locale) => String): Self = this.set("formatDate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFormatDate: Self = this.set("formatDate", js.undefined)
    
    @scala.inline
    def setGetWeek(value: /* date */ Date => String | Double): Self = this.set("getWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetWeek: Self = this.set("getWeek", js.undefined)
    
    @scala.inline
    def setHourIncrement(value: Double): Self = this.set("hourIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourIncrement: Self = this.set("hourIncrement", js.undefined)
    
    @scala.inline
    def setIgnoredFocusElementsVarargs(value: HTMLElement*): Self = this.set("ignoredFocusElements", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredFocusElements(value: js.Array[HTMLElement]): Self = this.set("ignoredFocusElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoredFocusElements: Self = this.set("ignoredFocusElements", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLocale(value: key | CustomLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMaxTime(value: Date): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinTime(value: Date): Self = this.set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    
    @scala.inline
    def setMinuteIncrement(value: Double): Self = this.set("minuteIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteIncrement: Self = this.set("minuteIncrement", js.undefined)
    
    @scala.inline
    def setMode(value: single | multiple | range | time): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMonthSelectorType(value: String): Self = this.set("monthSelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthSelectorType: Self = this.set("monthSelectorType", js.undefined)
    
    @scala.inline
    def setNextArrow(value: String): Self = this.set("nextArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextArrow: Self = this.set("nextArrow", js.undefined)
    
    @scala.inline
    def setNoCalendar(value: Boolean): Self = this.set("noCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCalendar: Self = this.set("noCalendar", js.undefined)
    
    @scala.inline
    def setNow(value: Date): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setOnChangeVarargs(value: Hook*): Self = this.set("onChange", js.Array(value :_*))
    
    @scala.inline
    def setOnChange(value: js.Array[Hook]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnCloseVarargs(value: Hook*): Self = this.set("onClose", js.Array(value :_*))
    
    @scala.inline
    def setOnClose(value: js.Array[Hook]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnDayCreateVarargs(value: Hook*): Self = this.set("onDayCreate", js.Array(value :_*))
    
    @scala.inline
    def setOnDayCreate(value: js.Array[Hook]): Self = this.set("onDayCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDayCreate: Self = this.set("onDayCreate", js.undefined)
    
    @scala.inline
    def setOnDestroyVarargs(value: Hook*): Self = this.set("onDestroy", js.Array(value :_*))
    
    @scala.inline
    def setOnDestroy(value: js.Array[Hook]): Self = this.set("onDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDestroy: Self = this.set("onDestroy", js.undefined)
    
    @scala.inline
    def setOnKeyDownVarargs(value: Hook*): Self = this.set("onKeyDown", js.Array(value :_*))
    
    @scala.inline
    def setOnKeyDown(value: js.Array[Hook]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnMonthChangeVarargs(value: Hook*): Self = this.set("onMonthChange", js.Array(value :_*))
    
    @scala.inline
    def setOnMonthChange(value: js.Array[Hook]): Self = this.set("onMonthChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMonthChange: Self = this.set("onMonthChange", js.undefined)
    
    @scala.inline
    def setOnOpenVarargs(value: Hook*): Self = this.set("onOpen", js.Array(value :_*))
    
    @scala.inline
    def setOnOpen(value: js.Array[Hook]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnParseConfigVarargs(value: Hook*): Self = this.set("onParseConfig", js.Array(value :_*))
    
    @scala.inline
    def setOnParseConfig(value: js.Array[Hook]): Self = this.set("onParseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnParseConfig: Self = this.set("onParseConfig", js.undefined)
    
    @scala.inline
    def setOnPreCalendarPositionVarargs(value: Hook*): Self = this.set("onPreCalendarPosition", js.Array(value :_*))
    
    @scala.inline
    def setOnPreCalendarPosition(value: js.Array[Hook]): Self = this.set("onPreCalendarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPreCalendarPosition: Self = this.set("onPreCalendarPosition", js.undefined)
    
    @scala.inline
    def setOnReadyVarargs(value: Hook*): Self = this.set("onReady", js.Array(value :_*))
    
    @scala.inline
    def setOnReady(value: js.Array[Hook]): Self = this.set("onReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnValueUpdateVarargs(value: Hook*): Self = this.set("onValueUpdate", js.Array(value :_*))
    
    @scala.inline
    def setOnValueUpdate(value: js.Array[Hook]): Self = this.set("onValueUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnValueUpdate: Self = this.set("onValueUpdate", js.undefined)
    
    @scala.inline
    def setOnYearChangeVarargs(value: Hook*): Self = this.set("onYearChange", js.Array(value :_*))
    
    @scala.inline
    def setOnYearChange(value: js.Array[Hook]): Self = this.set("onYearChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnYearChange: Self = this.set("onYearChange", js.undefined)
    
    @scala.inline
    def setParseDate(value: (/* date */ String, /* format */ String) => Date): Self = this.set("parseDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParseDate: Self = this.set("parseDate", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Plugin[js.Object]*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin[js.Object]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPosition(value: auto | above | below): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionElement(value: HTMLElement): Self = this.set("positionElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionElement: Self = this.set("positionElement", js.undefined)
    
    @scala.inline
    def setPrevArrow(value: String): Self = this.set("prevArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevArrow: Self = this.set("prevArrow", js.undefined)
    
    @scala.inline
    def setShorthandCurrentMonth(value: Boolean): Self = this.set("shorthandCurrentMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShorthandCurrentMonth: Self = this.set("shorthandCurrentMonth", js.undefined)
    
    @scala.inline
    def setShowMonths(value: Double): Self = this.set("showMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMonths: Self = this.set("showMonths", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setTime_24hr(value: Boolean): Self = this.set("time_24hr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_24hr: Self = this.set("time_24hr", js.undefined)
    
    @scala.inline
    def setWeekNumbers(value: Boolean): Self = this.set("weekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumbers: Self = this.set("weekNumbers", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
