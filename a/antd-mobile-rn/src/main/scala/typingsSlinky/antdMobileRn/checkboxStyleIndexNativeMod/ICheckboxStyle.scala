package typingsSlinky.antdMobileRn.checkboxStyleIndexNativeMod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxStyle extends js.Object {
  var agreeItem: ViewStyle = js.native
  var agreeItemCheckbox: ViewStyle = js.native
  var checkboxItemCheckbox: ViewStyle = js.native
  var icon: ViewStyle = js.native
  var iconRight: ViewStyle = js.native
  var wrapper: ViewStyle = js.native
}

object ICheckboxStyle {
  @scala.inline
  def apply(
    agreeItem: ViewStyle,
    agreeItemCheckbox: ViewStyle,
    checkboxItemCheckbox: ViewStyle,
    icon: ViewStyle,
    iconRight: ViewStyle,
    wrapper: ViewStyle
  ): ICheckboxStyle = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxStyle]
  }
  @scala.inline
  implicit class ICheckboxStyleOps[Self <: ICheckboxStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgreeItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agreeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgreeItemCheckbox(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agreeItemCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckboxItemCheckbox(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxItemCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconRight(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

