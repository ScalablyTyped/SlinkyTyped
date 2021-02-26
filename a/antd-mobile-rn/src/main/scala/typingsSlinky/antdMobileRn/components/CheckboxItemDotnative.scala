package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.checkboxItemNativeMod.ICheckboxItemNativeProps
import typingsSlinky.antdMobileRn.checkboxItemNativeMod.default
import typingsSlinky.antdMobileRn.checkboxPropsTypeMod.OnChangeParams
import typingsSlinky.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxItemDotnative {
  
  @JSImport("antd-mobile-rn/lib/checkbox/CheckboxItem.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def checkboxStyle(value: StyleProp[ImageStyle]): this.type = set("checkboxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkboxStyleNull: this.type = set("checkboxStyle", null)
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* params */ OnChangeParams => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: /* e */ js.UndefOr[js.Any] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: ICheckboxStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CheckboxItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICheckboxItemNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
