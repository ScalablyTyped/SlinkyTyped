package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.Target
import typingsSlinky.antDesignReactNative.radioItemMod.RadioItemNativeProps
import typingsSlinky.antDesignReactNative.radioItemMod.default
import typingsSlinky.antDesignReactNative.radioStyleMod.RadioStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioItem {
  
  @JSImport("@ant-design/react-native/lib/radio/RadioItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ Target => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPress(value: () => _): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def radioProps(value: js.Object): this.type = set("radioProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioStyle(value: StyleProp[ImageStyle]): this.type = set("radioStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioStyleNull: this.type = set("radioStyle", null)
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[RadioStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapLabel(value: Boolean): this.type = set("wrapLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioItemNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RadioItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
