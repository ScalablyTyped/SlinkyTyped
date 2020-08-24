package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.NavigatorIOSProps
import typingsSlinky.reactNative.mod.Route
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigatorIOS {
  @JSImport("react-native", "NavigatorIOS")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.NavigatorIOS] {
    @scala.inline
    def barTintColor(value: ColorValue): this.type = set("barTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def interactivePopGestureEnabled(value: Boolean): this.type = set("interactivePopGestureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def itemWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("itemWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemWrapperStyleNull: this.type = set("itemWrapperStyle", null)
    @scala.inline
    def navigationBarHidden(value: Boolean): this.type = set("navigationBarHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def shadowHidden(value: Boolean): this.type = set("shadowHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def tintColor(value: ColorValue): this.type = set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def titleTextColor(value: ColorValue): this.type = set("titleTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def translucent(value: Boolean): this.type = set("translucent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NavigatorIOSProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(initialRoute: Route): Builder = {
    val __props = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NavigatorIOSProps]))
  }
}

