package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.Text
import typingsSlinky.reactNativeMaterialUi.mod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("react-native-material-ui", "Button")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Button] {
    @scala.inline
    def accent(value: Boolean): this.type = set("accent", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: String | ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def primary(value: Boolean): this.type = set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: Text): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def upperCase(value: Boolean): this.type = set("upperCase", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonProps]))
  }
}

