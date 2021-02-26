package typingsSlinky.reactRouterBootstrap.components

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterBootstrap.mod.LinkContainerCls
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkContainer {
  
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
  ): SharedBuilder_NavLinkProps2090642569[LinkContainerCls] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps2090642569[LinkContainerCls](js.Array(this.component, __props.asInstanceOf[NavLinkProps[LocationState]]))
  }
  
  @JSImport("react-router-bootstrap", "LinkContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavLinkProps[LocationState]): SharedBuilder_NavLinkProps2090642569[LinkContainerCls] = new SharedBuilder_NavLinkProps2090642569[LinkContainerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
