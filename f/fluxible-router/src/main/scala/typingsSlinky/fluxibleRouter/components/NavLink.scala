package typingsSlinky.fluxibleRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.fluxibleRouter.mod.NavLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Not a trait */
object NavLink {
  @JSImport("fluxible-router", "NavLink")
  @js.native
  object component extends js.Object
  
  def apply(p: NavLinkProps): Default[tag.type, typingsSlinky.fluxibleRouter.mod.NavLink] = new Default[tag.type, typingsSlinky.fluxibleRouter.mod.NavLink](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NavLink.type): Default[tag.type, typingsSlinky.fluxibleRouter.mod.NavLink] = new Default[tag.type, typingsSlinky.fluxibleRouter.mod.NavLink](js.Array(this.component, js.Dictionary.empty))()
}

