package typingsSlinky.antDesignReactNative.checkboxItemMod

import typingsSlinky.antDesignReactNative.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsSlinky.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxItemProps
  extends CheckboxItemPropsType
     with WithThemeStyles[CheckboxStyle] {
  var checkboxStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object CheckboxItemProps {
  @scala.inline
  def apply(): CheckboxItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxItemProps]
  }
  @scala.inline
  implicit class CheckboxItemPropsOps[Self <: CheckboxItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckboxStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxStyle")(null)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

