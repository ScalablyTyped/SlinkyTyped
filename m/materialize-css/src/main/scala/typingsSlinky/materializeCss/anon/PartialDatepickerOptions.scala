package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.DatepickerOptions> */
@js.native
trait PartialDatepickerOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[Element] = js.native
  var defaultDate: js.UndefOr[js.Date] = js.native
  var disableDayFn: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.native
  var disableWeekends: js.UndefOr[Boolean] = js.native
  var events: js.UndefOr[js.Array[String]] = js.native
  var firstDay: js.UndefOr[Double] = js.native
  var format: js.UndefOr[String] = js.native
  var i18n: js.UndefOr[PartialInternationalizati] = js.native
  var isRTL: js.UndefOr[Boolean] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var onDraw: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var onSelect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* selectedDate */ js.Date, Unit]] = js.native
  var parse: js.UndefOr[js.Function2[/* value */ String, /* format */ String, js.Date]] = js.native
  var setDefaultDate: js.UndefOr[Boolean] = js.native
  var showClearBtn: js.UndefOr[Boolean] = js.native
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.native
  var showMonthAfterYear: js.UndefOr[Boolean] = js.native
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.native
}

object PartialDatepickerOptions {
  @scala.inline
  def apply(): PartialDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatepickerOptions]
  }
  @scala.inline
  implicit class PartialDatepickerOptionsOps[Self <: PartialDatepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Date): Self = {
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
    def withDisableDayFn(value: /* day */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDayFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisableDayFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDayFn")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWeekends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWeekends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekends")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
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
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: PartialInternationalizati): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.undefined)
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
    def withOnClose(value: js.ThisFunction0[PartialDatepickerOptions, Unit]): Self = {
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
    def withOnDraw(value: js.ThisFunction0[PartialDatepickerOptions, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDraw")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: js.ThisFunction0[PartialDatepickerOptions, Unit]): Self = {
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
    def withOnSelect(value: js.ThisFunction1[PartialDatepickerOptions, /* selectedDate */ js.Date, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: (/* value */ String, /* format */ String) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClearBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDaysInNextAndPreviousMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDaysInNextAndPreviousMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDaysInNextAndPreviousMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDaysInNextAndPreviousMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthAfterYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthAfterYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthAfterYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthAfterYear")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRange(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(js.undefined)
        ret
    }
  }
  
}

