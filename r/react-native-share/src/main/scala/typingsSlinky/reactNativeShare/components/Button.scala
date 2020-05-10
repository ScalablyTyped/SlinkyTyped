package typingsSlinky.reactNativeShare.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeShare.buttonMod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("react-native-share/Button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def buttonStyle(value: StyleProp[ViewProps]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonStyleNull: this.type = set("buttonStyle", null)
    @scala.inline
    def textStyle(value: StyleProp[TextProps]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(iconSrc: ImageSourcePropType, onPress: () => Unit): Builder = {
    val __props = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonProps]))
  }
}

