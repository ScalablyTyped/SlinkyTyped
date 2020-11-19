package typingsSlinky.antdMobileRn.checkboxItemNativeMod

import typingsSlinky.antdMobileRn.checkboxPropsTypeMod.CheckboxItemPropsType
import typingsSlinky.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckboxItemNativeProps extends CheckboxItemPropsType {
  
  var checkboxStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: js.UndefOr[ICheckboxStyle] = js.native
}
object ICheckboxItemNativeProps {
  
  @scala.inline
  def apply(): ICheckboxItemNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxItemNativeProps]
  }
  
  @scala.inline
  implicit class ICheckboxItemNativePropsOps[Self <: ICheckboxItemNativeProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setStyles(value: ICheckboxStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
