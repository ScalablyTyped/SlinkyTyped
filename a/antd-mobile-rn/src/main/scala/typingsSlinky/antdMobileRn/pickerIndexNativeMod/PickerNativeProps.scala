package typingsSlinky.antdMobileRn.pickerIndexNativeMod

import typingsSlinky.antdMobileRn.pickerPropsTypeMod.PickerData
import typingsSlinky.antdMobileRn.pickerPropsTypeMod.PickerPropsType
import typingsSlinky.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerNativeProps extends PickerPropsType {
  @JSName("styles")
  var styles_PickerNativeProps: js.UndefOr[IPickerStyle] = js.native
}

object PickerNativeProps {
  @scala.inline
  def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerNativeProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerNativeProps]
  }
  @scala.inline
  implicit class PickerNativePropsOps[Self <: PickerNativeProps] (val x: Self) extends AnyVal {
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
  }
  
}

