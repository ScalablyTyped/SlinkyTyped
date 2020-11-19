package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.agreeItemMod.AgreeItemProps
import typingsSlinky.antDesignReactNative.agreeItemMod.default
import typingsSlinky.antDesignReactNative.checkboxPropsTypeMod.OnChangeParams
import typingsSlinky.antDesignReactNative.checkboxStyleMod.CheckboxStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AgreeItem {
  
  @JSImport("@ant-design/react-native/lib/checkbox/AgreeItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
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
    def onChange(value: /* params */ OnChangeParams => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[CheckboxStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AgreeItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AgreeItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
