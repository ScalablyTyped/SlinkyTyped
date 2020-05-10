package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonContainerViewStyle
import typingsSlinky.reactNativeMaterialUi.mod.DialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog {
  @JSImport("react-native-material-ui", "Dialog")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog] {
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def style(value: AnonContainerViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dialog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

