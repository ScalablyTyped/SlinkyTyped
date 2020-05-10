package typingsSlinky.reactNativeMaterialMenu.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMaterialMenu.mod.MenuItemProps
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.head
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.middle
import typingsSlinky.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  @JSImport("react-native-material-menu", "MenuItem")
  @js.native
  object component extends js.Object
  
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
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

