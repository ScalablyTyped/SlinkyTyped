package typingsSlinky.reactNativeDatepicker.mod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerCustomStylesProps extends js.Object {
  var btnCancel: js.UndefOr[StyleProp[_]] = js.native
  var btnConfirm: js.UndefOr[StyleProp[_]] = js.native
  var btnTextCancel: js.UndefOr[StyleProp[TextStyle]] = js.native
  var btnTextConfirm: js.UndefOr[StyleProp[TextStyle]] = js.native
  var dateIcon: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var dateInput: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var datePicker: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var datePickerCon: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dateText: js.UndefOr[StyleProp[TextStyle]] = js.native
  var dateTouchBody: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var disabled: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var placeholderText: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object DatePickerCustomStylesProps {
  @scala.inline
  def apply(): DatePickerCustomStylesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerCustomStylesProps]
  }
  @scala.inline
  implicit class DatePickerCustomStylesPropsOps[Self <: DatePickerCustomStylesProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnCancel(value: StyleProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnCancelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnCancel")(null)
        ret
    }
    @scala.inline
    def withBtnConfirm(value: StyleProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnConfirmNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnConfirm")(null)
        ret
    }
    @scala.inline
    def withBtnTextCancel(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTextCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnTextCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTextCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnTextCancelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTextCancel")(null)
        ret
    }
    @scala.inline
    def withBtnTextConfirm(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTextConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnTextConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTextConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnTextConfirmNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnTextConfirm")(null)
        ret
    }
    @scala.inline
    def withDateIcon(value: StyleProp[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDateIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIcon")(null)
        ret
    }
    @scala.inline
    def withDateInput(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateInput")(js.undefined)
        ret
    }
    @scala.inline
    def withDateInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateInput")(null)
        ret
    }
    @scala.inline
    def withDatePicker(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePickerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePicker")(null)
        ret
    }
    @scala.inline
    def withDatePickerCon(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerCon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePickerCon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerCon")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePickerConNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePickerCon")(null)
        ret
    }
    @scala.inline
    def withDateText(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateText")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateText")(null)
        ret
    }
    @scala.inline
    def withDateTouchBody(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTouchBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTouchBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTouchBody")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTouchBodyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTouchBody")(null)
        ret
    }
    @scala.inline
    def withDisabled(value: StyleProp[ViewStyle]): Self = {
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
    def withDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(null)
        ret
    }
    @scala.inline
    def withPlaceholderText(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(null)
        ret
    }
  }
  
}

