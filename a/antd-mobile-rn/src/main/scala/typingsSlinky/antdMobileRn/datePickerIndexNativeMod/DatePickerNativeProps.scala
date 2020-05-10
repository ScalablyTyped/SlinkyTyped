package typingsSlinky.antdMobileRn.datePickerIndexNativeMod

import typingsSlinky.antdMobileRn.datePickerPropsTypeMod.DatePickerPropsType
import typingsSlinky.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerNativeProps extends DatePickerPropsType {
  var styles: js.UndefOr[IPickerStyle] = js.native
  var triggerTypes: js.UndefOr[String] = js.native
}

object DatePickerNativeProps {
  @scala.inline
  def apply(): DatePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerNativeProps]
  }
  @scala.inline
  implicit class DatePickerNativePropsOps[Self <: DatePickerNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: IPickerStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerTypes")(js.undefined)
        ret
    }
  }
  
}

