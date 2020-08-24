package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.ButtonInformation
import typingsSlinky.reactNativeElements.mod.PricingCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PricingCard {
  @JSImport("react-native-elements", "PricingCard")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.PricingCard] {
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def infoVarargs(value: String*): this.type = set("info", js.Array(value :_*))
    @scala.inline
    def info(value: js.Array[String]): this.type = set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def infoStyle(value: StyleProp[TextStyle]): this.type = set("infoStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def infoStyleNull: this.type = set("infoStyle", null)
    @scala.inline
    def onButtonPress(value: () => Unit): this.type = set("onButtonPress", js.Any.fromFunction0(value))
    @scala.inline
    def pricingStyle(value: StyleProp[TextStyle]): this.type = set("pricingStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def pricingStyleNull: this.type = set("pricingStyle", null)
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
    @scala.inline
    def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperStyleNull: this.type = set("wrapperStyle", null)
  }
  
  def withProps(p: PricingCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(button: ButtonInformation, price: String): Builder = {
    val __props = js.Dynamic.literal(button = button.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PricingCardProps]))
  }
}

