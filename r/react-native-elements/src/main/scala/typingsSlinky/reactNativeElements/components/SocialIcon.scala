package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.SocialIconProps
import typingsSlinky.reactNativeElements.mod.SocialMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SocialIcon {
  @JSImport("react-native-elements", "SocialIcon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.SocialIcon] {
    @scala.inline
    def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def button(value: Boolean): this.type = set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def fontStyle(value: StyleProp[TextStyle]): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def fontStyleNull: this.type = set("fontStyle", null)
    @scala.inline
    def fontWeight(value: String): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def iconColor(value: String): this.type = set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def iconSize(value: Double): this.type = set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyle(value: StyleProp[ViewStyle]): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def iconStyleNull: this.type = set("iconStyle", null)
    @scala.inline
    def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SocialIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(`type`: SocialMediaType): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SocialIconProps]))
  }
}

