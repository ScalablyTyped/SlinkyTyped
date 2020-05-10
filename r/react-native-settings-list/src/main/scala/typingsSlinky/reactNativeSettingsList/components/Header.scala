package typingsSlinky.reactNativeSettingsList.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeSettingsList.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  @JSImport("react-native-settings-list", "default.Header")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSettingsList.mod.default.Header] {
    @scala.inline
    def headerNumberOfLines(value: Double): this.type = set("headerNumberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRef(value: () => Unit): this.type = set("headerRef", js.Any.fromFunction0(value))
    @scala.inline
    def headerStyle(value: StyleProp[TextStyle]): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def headerStyleNull: this.type = set("headerStyle", null)
    @scala.inline
    def headerText(value: String): this.type = set("headerText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Header.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

