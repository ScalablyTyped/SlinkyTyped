package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.DefaultActionsContainer
import typingsSlinky.reactNativeMaterialUi.mod.DialogDefaultActionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogDefaultActions {
  
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogDefaultActionsProps]))
  }
  
  @JSImport("react-native-material-ui", "DialogDefaultActions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.DialogDefaultActions] {
    
    @scala.inline
    def style(value: DefaultActionsContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogDefaultActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
