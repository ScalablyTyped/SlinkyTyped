package typingsSlinky.reactBootstrap.components

import typingsSlinky.reactBootstrap.navbarMod.NavbarLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @scala.inline
  def apply(href: String): SharedBuilder_NavbarLinkProps583584615[typingsSlinky.reactBootstrap.navbarMod.Link] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_NavbarLinkProps583584615[typingsSlinky.reactBootstrap.navbarMod.Link](js.Array(this.component, __props.asInstanceOf[NavbarLinkProps]))
  }
  
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavbarLinkProps): SharedBuilder_NavbarLinkProps583584615[typingsSlinky.reactBootstrap.navbarMod.Link] = new SharedBuilder_NavbarLinkProps583584615[typingsSlinky.reactBootstrap.navbarMod.Link](js.Array(this.component, p.asInstanceOf[js.Any]))
}
