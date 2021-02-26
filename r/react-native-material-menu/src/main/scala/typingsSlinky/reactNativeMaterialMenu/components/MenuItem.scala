package typingsSlinky.reactNativeMaterialMenu.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMaterialMenu.mod.MenuItemProps
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.head
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.middle
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItem {
  
  @JSImport("react-native-material-menu", "MenuItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialMenu.mod.MenuItem] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledTextColor(value: String): this.type = set("disabledTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ellipsizeMode(value: head | middle | tail | clip): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
