package typingsSlinky.navigationReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.navigation.mod.StateNavigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationHandler {
  
  @scala.inline
  def apply(stateNavigator: StateNavigator): Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler] = {
    val __props = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler](js.Array(this.component, __props.asInstanceOf[typingsSlinky.navigationReact.anon.StateNavigator]))
  }
  
  @JSImport("navigation-react", "NavigationHandler")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: typingsSlinky.navigationReact.anon.StateNavigator): Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler] = new Default[tag.type, typingsSlinky.navigationReact.mod.NavigationHandler](js.Array(this.component, p.asInstanceOf[js.Any]))
}
