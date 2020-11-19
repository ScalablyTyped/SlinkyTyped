package typingsSlinky.antDesignReactNative.agreeItemMod

import typingsSlinky.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType
import typingsSlinky.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckboxStyle(value: StyleProp[ImageStyle]): Self = this.set("checkboxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxStyle: Self = this.set("checkboxStyle", js.undefined)
    
    @scala.inline
    def setCheckboxStyleNull: Self = this.set("checkboxStyle", null)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
