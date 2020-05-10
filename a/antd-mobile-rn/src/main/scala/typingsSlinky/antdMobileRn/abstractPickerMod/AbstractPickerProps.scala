package typingsSlinky.antdMobileRn.abstractPickerMod

import typingsSlinky.antdMobileRn.pickerPropsTypeMod.PickerData
import typingsSlinky.antdMobileRn.pickerPropsTypeMod.PickerPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPickerProps extends PickerPropsType {
  var pickerPrefixCls: js.UndefOr[String] = js.native
  var popupPrefixCls: js.UndefOr[String] = js.native
}

object AbstractPickerProps {
  @scala.inline
  def apply(data: js.Array[js.Array[PickerData] | PickerData]): AbstractPickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractPickerProps]
  }
  @scala.inline
  implicit class AbstractPickerPropsOps[Self <: AbstractPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickerPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPrefixCls")(js.undefined)
        ret
    }
  }
  
}

