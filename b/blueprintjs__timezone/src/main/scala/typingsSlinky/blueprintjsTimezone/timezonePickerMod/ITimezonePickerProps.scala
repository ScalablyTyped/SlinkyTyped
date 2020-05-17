package typingsSlinky.blueprintjsTimezone.timezonePickerMod

import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTimezone.anon.PartialIButtonProps
import typingsSlinky.blueprintjsTimezone.anon.PartialIPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimezonePickerProps extends IProps {
  /**
    * Props to spread to the target `Button`.
    * This prop will be ignored if `children` is provided.
    */
  var buttonProps: js.UndefOr[PartialIButtonProps] = js.native
  /**
    * The date to use when formatting timezone offsets.
    * An offset date is necessary to account for DST, but typically the default value of `now` will be sufficient.
    * @default now
    */
  var date: js.UndefOr[js.Date] = js.native
  /**
    * Whether this component is non-interactive.
    * This prop will be ignored if `children` is provided.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Props to spread to the filter `InputGroup`.
    * All props are supported except `ref` (use `inputRef` instead).
    * If you want to control the filter input, you can pass `value` and `onChange` here
    * to override `Select`'s own behavior.
    */
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  /**
    * Text to show when no timezone has been selected (`value === undefined`).
    * This prop will be ignored if `children` is provided.
    * @default "Select timezone..."
    */
  var placeholder: js.UndefOr[String] = js.native
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  /**
    * Whether to show the local timezone at the top of the list of initial timezone suggestions.
    * @default true
    */
  var showLocalTimezone: js.UndefOr[Boolean] = js.native
  /**
    * The currently selected timezone UTC identifier, e.g. "Pacific/Honolulu".
    * See https://www.iana.org/time-zones for more information.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Format to use when displaying the selected (or default) timezone within the target element.
    * This prop will be ignored if `children` is provided.
    * @default TimezoneDisplayFormat.OFFSET
    */
  var valueDisplayFormat: js.UndefOr[typingsSlinky.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat] = js.native
  /**
    * Callback invoked when the user selects a timezone.
    */
  def onChange(timezone: String): Unit = js.native
}

object ITimezonePickerProps {
  @scala.inline
  def apply(onChange: String => Unit): ITimezonePickerProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ITimezonePickerProps]
  }
  @scala.inline
  implicit class ITimezonePickerPropsOps[Self <: ITimezonePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChange(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withButtonProps(value: PartialIButtonProps): Self = {
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
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
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
    def withInputProps(value: IInputGroupProps with HTMLInputProps): Self = {
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
    def withShowLocalTimezone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocalTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLocalTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLocalTimezone")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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
    @scala.inline
    def withValueDisplayFormat(value: typingsSlinky.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDisplayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDisplayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDisplayFormat")(js.undefined)
        ret
    }
  }
  
}

