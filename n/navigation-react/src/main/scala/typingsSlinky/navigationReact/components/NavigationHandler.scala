package typingsSlinky.navigationReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.navigationReact.anon.StateNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationHandler {
  
  @JSImport("navigation-react", "NavigationHandler")
  @js.native
  object component extends js.Object
  
  def withProps(p: StateNavigator): Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler] = new Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(stateNavigator: typingsSlinky.navigation.mod.StateNavigator): Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler] = {
    val __props = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler](js.Array(this.component, __props.asInstanceOf[StateNavigator]))
  }
}
