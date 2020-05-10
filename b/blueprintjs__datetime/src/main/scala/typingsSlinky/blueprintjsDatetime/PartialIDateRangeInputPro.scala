package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.dateUtilsMod.DateRange
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateRangeInput.IDateRangeInputProps> */
@js.native
trait PartialIDateRangeInputPro extends js.Object {
  var allowSingleDayRange: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var closeOnSelection: js.UndefOr[Boolean] = js.native
  var contiguousCalendarMonths: js.UndefOr[Boolean] = js.native
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  var defaultValue: js.UndefOr[DateRange] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endInputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
  var formatDate: js.UndefOr[js.Function2[/* date */ js.Date, /* locale */ js.UndefOr[String], String]] = js.native
  var initialMonth: js.UndefOr[js.Date] = js.native
  var invalidDateMessage: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.native
  var onChange: js.UndefOr[js.Function1[/* selectedRange */ DateRange, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* errorRange */ DateRange, Unit]] = js.native
  var outOfRangeMessage: js.UndefOr[String] = js.native
  var overlappingDatesMessage: js.UndefOr[String] = js.native
  var parseDate: js.UndefOr[
    js.Function2[/* str */ String, /* locale */ js.UndefOr[String], js.Date | `false` | Null]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.native
  var singleMonthOnly: js.UndefOr[Boolean] = js.native
  var startInputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
  var timePrecision: js.UndefOr[TimePrecision] = js.native
  var value: js.UndefOr[DateRange] = js.native
}

object PartialIDateRangeInputPro {
  @scala.inline
  def apply(): PartialIDateRangeInputPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDateRangeInputPro]
  }
  @scala.inline
  implicit class PartialIDateRangeInputProOps[Self <: PartialIDateRangeInputPro] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSingleDayRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleDayRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSingleDayRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleDayRange")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withContiguousCalendarMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contiguousCalendarMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContiguousCalendarMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contiguousCalendarMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPickerProps(value: DayPickerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPickerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: DateRange): Self = {
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEndInputProps(value: HTMLInputProps with IInputGroupProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endInputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDate(value: (/* date */ js.Date, /* locale */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialMonth(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidDateMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidDateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
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
    def withLocaleUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeUtils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleUtils: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeUtils")(js.undefined)
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
    def withModifiers(value: IDatePickerModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* selectedRange */ DateRange => Unit): Self = {
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
    def withOnError(value: /* errorRange */ DateRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOutOfRangeMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRangeMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutOfRangeMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOfRangeMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlappingDatesMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlappingDatesMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlappingDatesMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlappingDatesMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withParseDate(value: (/* str */ String, /* locale */ js.UndefOr[String]) => js.Date | `false` | Null): Self = {
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
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverProps(value: PartialIPopoverProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseMonthAndYearMenus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMonthAndYearMenus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseMonthAndYearMenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMonthAndYearMenus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: Boolean | js.Array[IDateRangeShortcut]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleMonthOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleMonthOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleMonthOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleMonthOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withStartInputProps(value: HTMLInputProps with IInputGroupProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startInputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startInputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePickerProps(value: ITimePickerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePrecision(value: TimePrecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: DateRange): Self = {
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
  }
  
}

