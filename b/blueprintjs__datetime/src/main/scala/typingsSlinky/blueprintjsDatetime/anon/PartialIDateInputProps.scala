package typingsSlinky.blueprintjsDatetime.anon

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateInput.IDateInputProps> */
@js.native
trait PartialIDateInputProps extends js.Object {
  var canClearSelection: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var clearButtonText: js.UndefOr[String] = js.native
  var closeOnSelection: js.UndefOr[Boolean] = js.native
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  var defaultValue: js.UndefOr[js.Date] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var formatDate: js.UndefOr[js.Function2[/* date */ js.Date, /* locale */ js.UndefOr[String], String]] = js.native
  var initialMonth: js.UndefOr[js.Date] = js.native
  var inputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.native
  var invalidDateMessage: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.native
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* errorDate */ js.Date, Unit]] = js.native
  var outOfRangeMessage: js.UndefOr[String] = js.native
  var parseDate: js.UndefOr[
    js.Function2[/* str */ String, /* locale */ js.UndefOr[String], js.Date | `false` | Null]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.native
  var rightElement: js.UndefOr[ReactElement] = js.native
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.native
  var showActionsBar: js.UndefOr[Boolean] = js.native
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.native
  var timePrecision: js.UndefOr[TimePrecision] = js.native
  var todayButtonText: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Date] = js.native
}

object PartialIDateInputProps {
  @scala.inline
  def apply(): PartialIDateInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDateInputProps]
  }
  @scala.inline
  implicit class PartialIDateInputPropsOps[Self <: PartialIDateInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanClearSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canClearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanClearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canClearSelection")(js.undefined)
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
    def withClearButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonText")(js.undefined)
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
    def withDefaultValue(value: js.Date): Self = {
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
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
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
    def withInputProps(value: HTMLInputProps with IInputGroupProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
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
    def withOnChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* errorDate */ js.Date => Unit): Self = {
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
    def withPopoverProps(value: PartialIPopoverProps with js.Object): Self = {
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
    def withRightElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: Boolean | js.Array[IDatePickerShortcut]): Self = {
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
    def withShowActionsBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showActionsBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowActionsBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showActionsBar")(js.undefined)
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
    def withTodayButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
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

