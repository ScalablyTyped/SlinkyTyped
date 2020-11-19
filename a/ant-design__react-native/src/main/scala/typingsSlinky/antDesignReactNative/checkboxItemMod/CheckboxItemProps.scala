package typingsSlinky.antDesignReactNative.checkboxItemMod

import typingsSlinky.antDesignReactNative.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsSlinky.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckboxStyle(value: StyleProp[TextStyle]): Self = this.set("checkboxStyle", value.asInstanceOf[js.Any])
    
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
