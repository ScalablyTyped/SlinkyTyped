package typingsSlinky.antDesignReactNative.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings._empty
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.android
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.down
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.empty
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.ios
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.middle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.up
import typingsSlinky.antDesignReactNative.listItemMod.ListItemProps
import typingsSlinky.antDesignReactNative.listItemMod.default
import typingsSlinky.antDesignReactNative.listStyleMod.ListStyle
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @JSImport("@ant-design/react-native/lib/list/ListItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def activeStyle(value: StyleProp[ViewStyle]): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeStyleNull: this.type = set("activeStyle", null)
    
    @scala.inline
    def align(value: top | middle | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrow(value: horizontal | down | up | empty | _empty): this.type = set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multipleLine(value: Boolean): this.type = set("multipleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def platform(value: android | ios): this.type = set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def styles(value: Partial[ListStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbReactElement(value: ReactElement): this.type = set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumb(value: ReactElement): this.type = set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbNull: this.type = set("thumb", null)
    
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
