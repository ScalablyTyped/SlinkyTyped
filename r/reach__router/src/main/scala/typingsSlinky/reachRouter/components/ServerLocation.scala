package typingsSlinky.reachRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reachRouter.mod.ServerLocationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServerLocation {
  
  @scala.inline
  def apply(url: String): Default[tag.type, typingsSlinky.reachRouter.mod.ServerLocation] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reachRouter.mod.ServerLocation](js.Array(this.component, __props.asInstanceOf[ServerLocationProps]))
  }
  
  @JSImport("@reach/router", "ServerLocation")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ServerLocationProps): Default[tag.type, typingsSlinky.reachRouter.mod.ServerLocation] = new Default[tag.type, typingsSlinky.reachRouter.mod.ServerLocation](js.Array(this.component, p.asInstanceOf[js.Any]))
}
