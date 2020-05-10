package typingsSlinky.flatpickr

import org.scalajs.dom.raw.Element
import typingsSlinky.flatpickr.flatpickrStrings.above
import typingsSlinky.flatpickr.flatpickrStrings.auto
import typingsSlinky.flatpickr.flatpickrStrings.below
import typingsSlinky.flatpickr.flatpickrStrings.dropdown
import typingsSlinky.flatpickr.flatpickrStrings.multiple
import typingsSlinky.flatpickr.flatpickrStrings.range
import typingsSlinky.flatpickr.flatpickrStrings.single
import typingsSlinky.flatpickr.flatpickrStrings.static
import typingsSlinky.flatpickr.flatpickrStrings.time
import typingsSlinky.flatpickr.globalsMod._Global_.Date
import typingsSlinky.flatpickr.globalsMod._Global_.HTMLElement
import typingsSlinky.flatpickr.instanceMod.Instance
import typingsSlinky.flatpickr.localeMod.CustomLocale
import typingsSlinky.flatpickr.localeMod.Locale
import typingsSlinky.flatpickr.localeMod.key
import typingsSlinky.flatpickr.optionsMod.DateLimit
import typingsSlinky.flatpickr.optionsMod.DateOption
import typingsSlinky.flatpickr.optionsMod.Hook
import typingsSlinky.flatpickr.optionsMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ k in keyof flatpickr.flatpickr/dist/types/options.Options ]:? flatpickr.flatpickr/dist/types/options.Options[k]} */
@js.native
trait kinkeyofOptionsOptionsk extends js.Object {
  var allowInput: js.UndefOr[Boolean] = js.native
  var altFormat: js.UndefOr[String] = js.native
  var altInput: js.UndefOr[Boolean] = js.native
  var altInputClass: js.UndefOr[String] = js.native
  var animate: js.UndefOr[Boolean] = js.native
  var appendTo: js.UndefOr[HTMLElement] = js.native
  var ariaDateFormat: js.UndefOr[String] = js.native
  var clickOpens: js.UndefOr[Boolean] = js.native
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  var conjunction: js.UndefOr[String] = js.native
  var dateFormat: js.UndefOr[String] = js.native
  var defaultDate: js.UndefOr[DateOption | js.Array[DateOption]] = js.native
  var defaultHour: js.UndefOr[Double] = js.native
  var defaultMinute: js.UndefOr[Double] = js.native
  var defaultSeconds: js.UndefOr[Double] = js.native
  var disable: js.UndefOr[js.Array[DateLimit[DateOption]]] = js.native
  var disableMobile: js.UndefOr[Boolean] = js.native
  var enable: js.UndefOr[js.Array[DateLimit[DateOption]]] = js.native
  var enableSeconds: js.UndefOr[Boolean] = js.native
  var enableTime: js.UndefOr[Boolean] = js.native
  var errorHandler: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ Locale, String]] = js.native
  var getWeek: js.UndefOr[js.Function1[/* date */ Date, String | Double]] = js.native
  var hourIncrement: js.UndefOr[Double] = js.native
  var ignoredFocusElements: js.UndefOr[js.Array[HTMLElement]] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[key | CustomLocale] = js.native
  var maxDate: js.UndefOr[DateOption] = js.native
  var maxTime: js.UndefOr[DateOption] = js.native
  var minDate: js.UndefOr[DateOption] = js.native
  var minTime: js.UndefOr[DateOption] = js.native
  var minuteIncrement: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[single | multiple | range | time] = js.native
  var monthSelectorType: js.UndefOr[dropdown | static] = js.native
  var nextArrow: js.UndefOr[String] = js.native
  var noCalendar: js.UndefOr[Boolean] = js.native
  var now: js.UndefOr[DateOption] = js.native
  var onChange: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onClose: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onDayCreate: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onDestroy: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onKeyDown: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onMonthChange: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onOpen: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onParseConfig: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onPreCalendarPosition: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onReady: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onValueUpdate: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var onYearChange: js.UndefOr[Hook | js.Array[Hook]] = js.native
  var parseDate: js.UndefOr[js.Function2[/* date */ String, /* format */ String, Date]] = js.native
  var plugins: js.UndefOr[js.Array[Plugin[js.Object]]] = js.native
  var position: js.UndefOr[auto | above | below] = js.native
  var positionElement: js.UndefOr[Element] = js.native
  var prevArrow: js.UndefOr[String] = js.native
  var shorthandCurrentMonth: js.UndefOr[Boolean] = js.native
  var showMonths: js.UndefOr[Double] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var time_24hr: js.UndefOr[Boolean] = js.native
  var weekNumbers: js.UndefOr[Boolean] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
}

object kinkeyofOptionsOptionsk {
  @scala.inline
  def apply(): kinkeyofOptionsOptionsk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[kinkeyofOptionsOptionsk]
  }
  @scala.inline
  implicit class kinkeyofOptionsOptionskOps[Self <: kinkeyofOptionsOptionsk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInput")(js.undefined)
        ret
    }
    @scala.inline
    def withAltFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAltInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInput")(js.undefined)
        ret
    }
    @scala.inline
    def withAltInputClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInputClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltInputClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInputClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
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
    def withAriaDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withClickOpens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOpens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOpens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOpens")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withConjunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConjunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
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
    def withDefaultDate(value: DateOption | js.Array[DateOption]): Self = {
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
    def withDefaultHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHour")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: js.Array[DateLimit[DateOption]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: js.Array[DateLimit[DateOption]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: /* e */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
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
    def withGetWeek(value: /* date */ Date => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withHourIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredFocusElements(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredFocusElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredFocusElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredFocusElements")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: key | CustomLocale): Self = {
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
    def withMaxDate(value: DateOption): Self = {
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
    def withMaxTime(value: DateOption): Self = {
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
    def withMinDate(value: DateOption): Self = {
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
    def withMinTime(value: DateOption): Self = {
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
    def withMinuteIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: single | multiple | range | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthSelectorType(value: dropdown | static): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthSelectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthSelectorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthSelectorType")(js.undefined)
        ret
    }
    @scala.inline
    def withNextArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCalendar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCalendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCalendar")(js.undefined)
        ret
    }
    @scala.inline
    def withNow(value: DateOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnChange(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnClose(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayCreateFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayCreate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnDayCreate(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDayCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroyFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnDestroy(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDownFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnKeyDown(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthChangeFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnMonthChange(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMonthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnParseConfigFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParseConfig")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnParseConfig(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParseConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnParseConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParseConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreCalendarPositionFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreCalendarPosition")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnPreCalendarPosition(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreCalendarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPreCalendarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreCalendarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReadyFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnReady(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueUpdateFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueUpdate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnValueUpdate(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnValueUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYearChangeFunction4(
      value: (/* dates */ js.Array[Date], /* currentDateString */ String, /* self */ Instance, /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnYearChange(value: Hook | js.Array[Hook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnYearChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearChange")(js.undefined)
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
    def withPlugins(value: js.Array[Plugin[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: auto | above | below): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionElement(value: Element): Self = {
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
    @scala.inline
    def withPrevArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withShorthandCurrentMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthandCurrentMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShorthandCurrentMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthandCurrentMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withTime_24hr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_24hr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_24hr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_24hr")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

