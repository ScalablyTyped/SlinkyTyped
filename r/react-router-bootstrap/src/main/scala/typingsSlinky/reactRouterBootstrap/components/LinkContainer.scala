package typingsSlinky.reactRouterBootstrap.components

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterBootstrap.mod.LinkContainerCls
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinkContainer {
  @JSImport("react-router-bootstrap", "LinkContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: NavLinkProps[LocationState]): SharedBuilder_NavLinkProps2090642569[LinkContainerCls] = new SharedBuilder_NavLinkProps2090642569[LinkContainerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
  ): SharedBuilder_NavLinkProps2090642569[LinkContainerCls] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps2090642569[LinkContainerCls](js.Array(this.component, __props.asInstanceOf[NavLinkProps[LocationState]]))
  }
}

