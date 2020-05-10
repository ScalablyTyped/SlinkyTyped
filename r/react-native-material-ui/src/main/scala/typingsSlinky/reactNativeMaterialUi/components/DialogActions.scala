package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.AnonActionsContainer
import typingsSlinky.reactNativeMaterialUi.mod.Dialog.Actions
import typingsSlinky.reactNativeMaterialUi.mod.DialogActionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogActions {
  @JSImport("react-native-material-ui", "Dialog.Actions")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Actions] {
    @scala.inline
    def style(value: AnonActionsContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DialogActions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

