package typingsSlinky.reactNavigationStack.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNavigationStack.anon.TintColor
import typingsSlinky.reactNavigationStack.headerBackButtonMod.Props
import typingsSlinky.reactNavigationStack.headerBackButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderBackButton {
  @JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderBackButton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def backImage(value: /* props */ TintColor => TagMod[Any]): this.type = set("backImage", js.Any.fromFunction1(value))
    @scala.inline
    def backTitleVisible(value: Boolean): this.type = set("backTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def pressColorAndroid(value: String): this.type = set("pressColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
    @scala.inline
    def truncatedTitle(value: String): this.type = set("truncatedTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onPress: () => Unit): Builder = {
    val __props = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

