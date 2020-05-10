package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonContentContainer
import typingsSlinky.reactNativeMaterialUi.mod.Dialog.Content
import typingsSlinky.reactNativeMaterialUi.mod.DialogContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogContent {
  @JSImport("react-native-material-ui", "Dialog.Content")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Content] {
    @scala.inline
    def style(value: AnonContentContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DialogContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

