package typingsSlinky.blueprintjsTimezone.anon

import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/timezone.@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker.ITimezonePickerProps> */
@js.native
trait PartialITimezonePickerPro extends js.Object {
  var buttonProps: js.UndefOr[PartialIButtonProps] = js.native
  var className: js.UndefOr[String] = js.native
  var date: js.UndefOr[js.Date] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  var onChange: js.UndefOr[js.Function1[/* timezone */ String, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  var showLocalTimezone: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
  var valueDisplayFormat: js.UndefOr[TimezoneDisplayFormat] = js.native
}

object PartialITimezonePickerPro {
  @scala.inline
  def apply(): PartialITimezonePickerPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITimezonePickerPro]
  }
  @scala.inline
  implicit class PartialITimezonePickerProOps[Self <: PartialITimezonePickerPro] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOnChange(value: /* timezone */ String => Unit): Self = {
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
    def withValueDisplayFormat(value: TimezoneDisplayFormat): Self = {
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

