package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgreeItem extends js.Object {
  var agreeItem: RegisteredStyle[ViewStyle] = js.native
  var agreeItemCheckbox: RegisteredStyle[TextStyle] = js.native
  var checkboxItemCheckbox: RegisteredStyle[TextStyle] = js.native
  var icon: RegisteredStyle[TextStyle] = js.native
  var iconRight: RegisteredStyle[TextStyle] = js.native
  var wrapper: RegisteredStyle[ViewStyle] = js.native
}

object AgreeItem {
  @scala.inline
  def apply(
    agreeItem: RegisteredStyle[ViewStyle],
    agreeItemCheckbox: RegisteredStyle[TextStyle],
    checkboxItemCheckbox: RegisteredStyle[TextStyle],
    icon: RegisteredStyle[TextStyle],
    iconRight: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): AgreeItem = {
    val __obj = js.Dynamic.literal(agreeItem = agreeItem.asInstanceOf[js.Any], agreeItemCheckbox = agreeItemCheckbox.asInstanceOf[js.Any], checkboxItemCheckbox = checkboxItemCheckbox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconRight = iconRight.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgreeItem]
  }
  @scala.inline
  implicit class AgreeItemOps[Self <: AgreeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgreeItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agreeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgreeItemCheckbox(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agreeItemCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckboxItemCheckbox(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxItemCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconRight(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

