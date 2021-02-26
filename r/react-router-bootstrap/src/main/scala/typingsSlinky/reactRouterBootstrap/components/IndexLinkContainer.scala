package typingsSlinky.reactRouterBootstrap.components

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterBootstrap.mod.IndexLinkContainerCls
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexLinkContainer {
  
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
  ): SharedBuilder_NavLinkProps2090642569[IndexLinkContainerCls] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps2090642569[IndexLinkContainerCls](js.Array(this.component, __props.asInstanceOf[NavLinkProps[LocationState]]))
  }
  
  @JSImport("react-router-bootstrap", "IndexLinkContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavLinkProps[LocationState]): SharedBuilder_NavLinkProps2090642569[IndexLinkContainerCls] = new SharedBuilder_NavLinkProps2090642569[IndexLinkContainerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
