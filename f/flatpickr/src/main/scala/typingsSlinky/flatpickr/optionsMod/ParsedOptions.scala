package typingsSlinky.flatpickr.optionsMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedOptions extends js.Object {
  var _disable: js.Array[DateLimit[Date]] = js.native
  var _enable: js.Array[DateLimit[Date]] = js.native
  var _maxDate: js.UndefOr[Date] = js.native
  var _maxTime: js.UndefOr[Date] = js.native
  var _minDate: js.UndefOr[Date] = js.native
  var _minTime: js.UndefOr[Date] = js.native
  var allowInput: Boolean = js.native
  var altFormat: String = js.native
  var altInput: Boolean = js.native
  var altInputClass: String = js.native
  var animate: Boolean = js.native
  var appendTo: js.UndefOr[HTMLElement] = js.native
  var ariaDateFormat: String = js.native
  var clickOpens: Boolean = js.native
  var closeOnSelect: Boolean = js.native
  var conjunction: String = js.native
  var dateFormat: String = js.native
  var defaultDate: js.UndefOr[Date | js.Array[Date]] = js.native
  var defaultHour: Double = js.native
  var defaultMinute: Double = js.native
  var defaultSeconds: Double = js.native
  var disable: js.Array[DateLimit[Date]] = js.native
  var disableMobile: Boolean = js.native
  var enable: js.Array[DateLimit[Date]] = js.native
  var enableSeconds: Boolean = js.native
  var enableTime: Boolean = js.native
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.native
  var hourIncrement: Double = js.native
  var ignoredFocusElements: js.Array[HTMLElement] = js.native
  var `inline`: Boolean = js.native
  var locale: key | CustomLocale = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var maxTime: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var minTime: js.UndefOr[Date] = js.native
  var minuteIncrement: Double = js.native
  var mode: single | multiple | range | time = js.native
  var monthSelectorType: String = js.native
  var nextArrow: String = js.native
  var noCalendar: Boolean = js.native
  var now: Date = js.native
  var onChange: js.Array[Hook] = js.native
  var onClose: js.Array[Hook] = js.native
  var onDayCreate: js.Array[Hook] = js.native
  var onDestroy: js.Array[Hook] = js.native
  var onKeyDown: js.Array[Hook] = js.native
  var onMonthChange: js.Array[Hook] = js.native
  var onOpen: js.Array[Hook] = js.native
  var onParseConfig: js.Array[Hook] = js.native
  var onPreCalendarPosition: js.Array[Hook] = js.native
  var onReady: js.Array[Hook] = js.native
  var onValueUpdate: js.Array[Hook] = js.native
  var onYearChange: js.Array[Hook] = js.native
  var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.native
  var plugins: js.Array[Plugin[js.Object]] = js.native
  var position: auto | above | below = js.native
  var positionElement: js.UndefOr[HTMLElement] = js.native
  var prevArrow: String = js.native
  var shorthandCurrentMonth: Boolean = js.native
  var showMonths: Double = js.native
  var static: Boolean = js.native
  var time_24hr: Boolean = js.native
  var weekNumbers: Boolean = js.native
  var wrap: Boolean = js.native
  def errorHandler(err: js.Error): Unit = js.native
  def getWeek(date: Date): String | Double = js.native
}

object ParsedOptions {
  @scala.inline
  def apply(
    _disable: js.Array[DateLimit[Date]],
    _enable: js.Array[DateLimit[Date]],
    allowInput: Boolean,
    altFormat: String,
    altInput: Boolean,
    altInputClass: String,
    animate: Boolean,
    ariaDateFormat: String,
    clickOpens: Boolean,
    closeOnSelect: Boolean,
    conjunction: String,
    dateFormat: String,
    defaultHour: Double,
    defaultMinute: Double,
    defaultSeconds: Double,
    disable: js.Array[DateLimit[Date]],
    disableMobile: Boolean,
    enable: js.Array[DateLimit[Date]],
    enableSeconds: Boolean,
    enableTime: Boolean,
    errorHandler: js.Error => Unit,
    getWeek: Date => String | Double,
    hourIncrement: Double,
    ignoredFocusElements: js.Array[HTMLElement],
    `inline`: Boolean,
    locale: key | CustomLocale,
    minuteIncrement: Double,
    mode: single | multiple | range | time,
    monthSelectorType: String,
    nextArrow: String,
    noCalendar: Boolean,
    now: Date,
    onChange: js.Array[Hook],
    onClose: js.Array[Hook],
    onDayCreate: js.Array[Hook],
    onDestroy: js.Array[Hook],
    onKeyDown: js.Array[Hook],
    onMonthChange: js.Array[Hook],
    onOpen: js.Array[Hook],
    onParseConfig: js.Array[Hook],
    onPreCalendarPosition: js.Array[Hook],
    onReady: js.Array[Hook],
    onValueUpdate: js.Array[Hook],
    onYearChange: js.Array[Hook],
    plugins: js.Array[Plugin[js.Object]],
    position: auto | above | below,
    prevArrow: String,
    shorthandCurrentMonth: Boolean,
    showMonths: Double,
    static: Boolean,
    time_24hr: Boolean,
    weekNumbers: Boolean,
    wrap: Boolean
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(_disable = _disable.asInstanceOf[js.Any], _enable = _enable.asInstanceOf[js.Any], allowInput = allowInput.asInstanceOf[js.Any], altFormat = altFormat.asInstanceOf[js.Any], altInput = altInput.asInstanceOf[js.Any], altInputClass = altInputClass.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], ariaDateFormat = ariaDateFormat.asInstanceOf[js.Any], clickOpens = clickOpens.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], conjunction = conjunction.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], defaultHour = defaultHour.asInstanceOf[js.Any], defaultMinute = defaultMinute.asInstanceOf[js.Any], defaultSeconds = defaultSeconds.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], disableMobile = disableMobile.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableSeconds = enableSeconds.asInstanceOf[js.Any], enableTime = enableTime.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction1(errorHandler), getWeek = js.Any.fromFunction1(getWeek), hourIncrement = hourIncrement.asInstanceOf[js.Any], ignoredFocusElements = ignoredFocusElements.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minuteIncrement = minuteIncrement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], monthSelectorType = monthSelectorType.asInstanceOf[js.Any], nextArrow = nextArrow.asInstanceOf[js.Any], noCalendar = noCalendar.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDayCreate = onDayCreate.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMonthChange = onMonthChange.asInstanceOf[js.Any], onOpen = onOpen.asInstanceOf[js.Any], onParseConfig = onParseConfig.asInstanceOf[js.Any], onPreCalendarPosition = onPreCalendarPosition.asInstanceOf[js.Any], onReady = onReady.asInstanceOf[js.Any], onValueUpdate = onValueUpdate.asInstanceOf[js.Any], onYearChange = onYearChange.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prevArrow = prevArrow.asInstanceOf[js.Any], shorthandCurrentMonth = shorthandCurrentMonth.asInstanceOf[js.Any], showMonths = showMonths.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], weekNumbers = weekNumbers.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
  @scala.inline
  implicit class ParsedOptionsOps[Self <: ParsedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_disable(value: js.Array[DateLimit[Date]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_enable(value: js.Array[DateLimit[Date]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltInputClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInputClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickOpens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOpens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConjunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: js.Array[DateLimit[Date]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: js.Array[DateLimit[Date]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorHandler(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWeek(value: Date => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHourIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoredFocusElements(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredFocusElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: key | CustomLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinuteIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: single | multiple | range | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthSelectorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthSelectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoCalendar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNow(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDayCreate(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDestroy(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnKeyDown(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMonthChange(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnOpen(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnParseConfig(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParseConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPreCalendarPosition(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreCalendarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnReady(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnValueUpdate(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnYearChange(value: js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[Plugin[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: auto | above | below): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShorthandCurrentMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthandCurrentMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_24hr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_24hr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_maxDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_maxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_maxTime(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_maxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_minDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_minDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_minTime(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_minTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: Date | js.Array[Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDate(value: (/* date */ Date, /* format */ String, /* locale */ Locale) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormatDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: Date): Self = {
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
    def withMaxTime(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: Date): Self = {
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
    def withMinTime(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(js.undefined)
        ret
    }
    @scala.inline
    def withParseDate(value: (/* date */ String, /* format */ String) => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionElement")(js.undefined)
        ret
    }
  }
  
}

