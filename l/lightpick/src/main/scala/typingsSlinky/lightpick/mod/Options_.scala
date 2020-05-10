package typingsSlinky.lightpick.mod

import org.scalajs.dom.raw.Node
import typingsSlinky.lightpick.mod.Options.DayOfWeek
import typingsSlinky.lightpick.mod.Options.Dropdowns
import typingsSlinky.lightpick.mod.Options.Field
import typingsSlinky.lightpick.mod.Options.Locale
import typingsSlinky.lightpick.mod.Options.OnCloseFn
import typingsSlinky.lightpick.mod.Options.OnErrorFn
import typingsSlinky.lightpick.mod.Options.OnMonthsChangeFn
import typingsSlinky.lightpick.mod.Options.OnOpenFn
import typingsSlinky.lightpick.mod.Options.OnSelectFn
import typingsSlinky.lightpick.mod.Options.OnSelectStartEndFn
import typingsSlinky.lightpick.mod.Options.OnYearsChangeFn
import typingsSlinky.lightpick.mod.Options.Orientation
import typingsSlinky.lightpick.mod.Options.WeekdayStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends js.Object {
  /**
    * Close calendar when picked date/range.
    */
  var autoclose: js.UndefOr[Boolean] = js.native
  var disableDates: js.UndefOr[js.Array[DisabledDate]] = js.native
  /**
    * Disable Saturday and Sunday.
    */
  var disableWeekends: js.UndefOr[Boolean] = js.native
  /**
    * If set to `false` then will reset selected range when disabled dates exists in selected range.
    */
  var disabledDatesInRange: js.UndefOr[Boolean] = js.native
  /**
    * Dropdown selections for years, months. Can be false for disable both dropdowns.
    */
  var dropdowns: js.UndefOr[Boolean | Dropdowns] = js.native
  var endDate: js.UndefOr[InputDate] = js.native
  /**
    * Bind the datepicker to a form field.
    */
  var field: Field = js.native
  /**
    * ISO day of the week.
    */
  var firstDay: js.UndefOr[DayOfWeek] = js.native
  /**
    * Footer calendar, if set to `true` will use default footer (Reset/Apply buttons) or custom string (html).
    */
  var footer: js.UndefOr[Boolean | String] = js.native
  /**
    * The default output format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Close calendar when clicked outside the elements specified in field or parentEl. Recommended use when autoclose is set to false.
    */
  var hideOnBodyClick: js.UndefOr[Boolean] = js.native
  /**
    * Show tooltip.
    */
  var hoveringTooltip: js.UndefOr[Boolean] = js.native
  /**
    * Show calendar inline. If true and parentEl is not provided then will use parentNode of field.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Language code for names of days, months by Date.prototype.toLocaleString(). 'auto' will try detect user browser language.
    */
  var lang: js.UndefOr[String] = js.native
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The maximum/latest date that can be selected.
    */
  var maxDate: js.UndefOr[InputDate] = js.native
  /**
    * The maximum days of the selected range.
    */
  var maxDays: js.UndefOr[Double] = js.native
  /**
    * The minimum/earliest date that can be selected.
    */
  var minDate: js.UndefOr[InputDate] = js.native
  /**
    * The minimum days of the selected range.
    */
  var minDays: js.UndefOr[Double] = js.native
  /**
    * Number of columns months.
    */
  var numberOfColumns: js.UndefOr[Double] = js.native
  /**
    * Number of visible months.
    */
  var numberOfMonths: js.UndefOr[Double] = js.native
  /**
    * Triggered when calendar has been closed.
    */
  var onClose: js.UndefOr[OnCloseFn] = js.native
  var onError: js.UndefOr[OnErrorFn] = js.native
  /**
    * Triggered when the months select is changed.
    */
  var onMonthsChange: js.UndefOr[OnMonthsChangeFn] = js.native
  /**
    * Triggered when calendar has been opened.
    */
  var onOpen: js.UndefOr[OnOpenFn] = js.native
  /**
    * Triggered when either date / start date or end date has been changed.
    */
  var onSelect: js.UndefOr[OnSelectFn] = js.native
  /**
    * Triggered when end date has been changed.
    */
  var onSelectEnd: js.UndefOr[OnSelectStartEndFn] = js.native
  /**
    * Triggered when start date has been changed.
    */
  var onSelectStart: js.UndefOr[OnSelectStartEndFn] = js.native
  /**
    * Triggered when the years select is changed.
    */
  var onYearsChange: js.UndefOr[OnYearsChangeFn] = js.native
  var orientation: js.UndefOr[Orientation] = js.native
  /**
    * Selector of the parent element that the date range picker will be added to, if not provided this will be 'body'.
    */
  var parentEl: js.UndefOr[String | Node] = js.native
  /**
    * Repick start/end instead of new range. This option working only when exists `secondField`.
    */
  var repick: js.UndefOr[Boolean] = js.native
  /**
    * If exists then end of date range will set here.
    */
  var secondField: js.UndefOr[Field] = js.native
  /**
    * Select second date before the first selected date.
    */
  var selectBackward: js.UndefOr[Boolean] = js.native
  /**
    * Select second date after the first selected date.
    */
  var selectForward: js.UndefOr[Boolean] = js.native
  /**
    * Separator between dates when one field.
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Choose a single date instead of a date range.
    */
  var singleDate: js.UndefOr[Boolean] = js.native
  var startDate: js.UndefOr[InputDate] = js.native
  /**
    * Calc date range in nights. (For hotels when last date doesn't include to range.)
    */
  var tooltipNights: js.UndefOr[Boolean] = js.native
  /**
    * Determines the weekday display style.
    * Two weekdays may have the same narrow style for some locales (e.g. Tuesday's narrow style is also T).
    */
  var weekdayStyle: js.UndefOr[WeekdayStyle] = js.native
}

object Options_ {
  @scala.inline
  def apply(field: Field): Options_ = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDates(value: js.Array[DisabledDate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDates")(js.undefined)
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
    def withDisabledDatesInRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDatesInRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDatesInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDatesInRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdowns(value: Boolean | Dropdowns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdowns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdowns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdowns")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: InputDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(null)
        ret
    }
    @scala.inline
    def withFirstDay(value: DayOfWeek): Self = {
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
    def withFooter(value: Boolean | String): Self = {
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
    def withHideOnBodyClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnBodyClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnBodyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnBodyClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHoveringTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveringTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoveringTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoveringTooltip")(js.undefined)
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
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
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
    def withMaxDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: InputDate): Self = {
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
    def withMaxDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(null)
        ret
    }
    @scala.inline
    def withMaxDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: InputDate): Self = {
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
    def withMinDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(null)
        ret
    }
    @scala.inline
    def withMinDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDays")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: OnCloseFn): Self = {
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
    def withOnError(value: OnErrorFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthsChange(value: OnMonthsChangeFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthsChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMonthsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: OnOpenFn): Self = {
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
    def withOnSelect(value: OnSelectFn): Self = {
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
    def withOnSelectEnd(value: OnSelectStartEndFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectStart(value: OnSelectStartEndFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnYearsChange(value: OnYearsChangeFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearsChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnYearsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onYearsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withParentElNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentEl(value: String | Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withRepick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repick")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondField(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondField")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectBackward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectBackward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectBackward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectBackward")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectForward")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: InputDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(null)
        ret
    }
    @scala.inline
    def withTooltipNights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipNights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipNights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipNights")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayStyle(value: WeekdayStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayStyle")(js.undefined)
        ret
    }
  }
  
}

