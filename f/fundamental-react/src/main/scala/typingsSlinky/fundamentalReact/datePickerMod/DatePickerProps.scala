package typingsSlinky.fundamentalReact.datePickerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fundamentalReact.AnonDate
import typingsSlinky.fundamentalReact.AnonNextMonth
import typingsSlinky.fundamentalReact.AnonState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  buttonLabel ? :string,   buttonProps ? :{[x: string] : any},   compact ? :boolean,   defaultValue ? :string,   enableRangeSelection ? :boolean,   inputProps ? :{[x: string] : any},   locale ? :string, onBlur ? (hasDateFormattedDate : {  date  :std.Date,   formattedDate  :string}): void,   validationState ? :{  state ? :'error' | 'warning' | 'information' | 'success',   text ? :string}, [x: string] : any} & fundamental-react.fundamental-react/lib/Calendar/Calendar.CalendarBaseProps */
@js.native
trait DatePickerProps
  extends /* x */ StringDictionary[js.Any] {
  var blockedDates: js.UndefOr[js.Array[js.Date]] = js.native
  var buttonLabel: js.UndefOr[String] = js.native
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var disableAfterDate: js.UndefOr[js.Date] = js.native
  var disableBeforeDate: js.UndefOr[js.Date] = js.native
  var disableFutureDates: js.UndefOr[Boolean] = js.native
  var disablePastDates: js.UndefOr[Boolean] = js.native
  var disableStyles: js.UndefOr[Boolean] = js.native
  var disableWeekday: js.UndefOr[js.Array[String]] = js.native
  var disableWeekends: js.UndefOr[Boolean] = js.native
  var disabledDates: js.UndefOr[js.Array[js.Date]] = js.native
  var enableRangeSelection: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  var locale: js.UndefOr[String] = js.native
  var localizedText: js.UndefOr[AnonNextMonth] = js.native
  var onBlur: js.UndefOr[js.Function1[/* hasDateFormattedDate */ AnonDate, Unit]] = js.native
  var validationState: js.UndefOr[AnonState] = js.native
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockedDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedDates")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonProps(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
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
    def withDisableAfterDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAfterDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAfterDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAfterDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableBeforeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBeforeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBeforeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBeforeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFutureDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFutureDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFutureDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFutureDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePastDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePastDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePastDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePastDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWeekday(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWeekday")(js.undefined)
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
    def withDisabledDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRangeSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRangeSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRangeSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRangeSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: StringDictionary[js.Any]): Self = {
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
    def withLocalizedText(value: AnonNextMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* hasDateFormattedDate */ AnonDate => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationState(value: AnonState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationState")(js.undefined)
        ret
    }
  }
  
}

