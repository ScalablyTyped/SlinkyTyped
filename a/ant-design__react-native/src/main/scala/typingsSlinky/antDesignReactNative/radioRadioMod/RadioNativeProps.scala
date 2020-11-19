package typingsSlinky.antDesignReactNative.radioRadioMod

import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.radioPropsTypeMod.RadioPropsType
import typingsSlinky.antDesignReactNative.radioStyleMod.RadioStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioNativeProps
  extends RadioPropsType
     with WithThemeStyles[RadioStyle] {
  
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object RadioNativeProps {
  
  @scala.inline
  def apply(): RadioNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioNativeProps]
  }
  
  @scala.inline
  implicit class RadioNativePropsOps[Self <: RadioNativeProps] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
