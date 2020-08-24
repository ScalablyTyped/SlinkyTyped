package typingsSlinky.reactRouterBootstrap.components

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IndexLinkContainer {
  @JSImport("react-router-bootstrap", "IndexLinkContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: NavLinkProps[LocationState]): SharedBuilder_NavLinkProps2090642569[js.Object] = new SharedBuilder_NavLinkProps2090642569[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
  ): SharedBuilder_NavLinkProps2090642569[js.Object] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps2090642569[js.Object](js.Array(this.component, __props.asInstanceOf[NavLinkProps[LocationState]]))
  }
}

