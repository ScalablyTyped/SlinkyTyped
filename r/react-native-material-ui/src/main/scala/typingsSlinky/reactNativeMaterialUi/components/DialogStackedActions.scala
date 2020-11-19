package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.StackedActionsContainer
import typingsSlinky.reactNativeMaterialUi.mod.DialogStackedActionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogStackedActions {
  
  @JSImport("react-native-material-ui", "DialogStackedActions")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.DialogStackedActions] {
    
    @scala.inline
    def style(value: StackedActionsContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogStackedActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogStackedActionsProps]))
  }
}
