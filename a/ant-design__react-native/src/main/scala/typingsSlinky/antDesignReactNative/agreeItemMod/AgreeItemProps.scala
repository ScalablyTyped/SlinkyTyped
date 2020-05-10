package typingsSlinky.antDesignReactNative.agreeItemMod

import typingsSlinky.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType
import typingsSlinky.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgreeItemProps
  extends CheckboxPropsType
     with WithThemeStyles[CheckboxStyle] {
  var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object AgreeItemProps {
  @scala.inline
  def apply(): AgreeItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgreeItemProps]
  }
  @scala.inline
  implicit class AgreeItemPropsOps[Self <: AgreeItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckboxStyle(value: StyleProp[ImageStyle]): Self = {
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

