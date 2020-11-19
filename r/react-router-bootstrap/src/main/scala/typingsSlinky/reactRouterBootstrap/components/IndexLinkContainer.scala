package typingsSlinky.reactRouterBootstrap.components

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexLinkContainer {
  
  @JSImport("react-router-bootstrap", "IndexLinkContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: NavLinkProps[LocationState]): SharedBuilder_NavLinkProps_2092935726 = new SharedBuilder_NavLinkProps_2092935726(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
  ): SharedBuilder_NavLinkProps_2092935726 = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps_2092935726(js.Array(this.component, __props.asInstanceOf[NavLinkProps[LocationState]]))
  }
}
