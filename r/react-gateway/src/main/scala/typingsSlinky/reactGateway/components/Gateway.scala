package typingsSlinky.reactGateway.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactGateway.gatewayMod.GatewayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gateway {
  
  @scala.inline
  def apply(into: String): Default[tag.type, typingsSlinky.reactGateway.mod.Gateway] = {
    val __props = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactGateway.mod.Gateway](js.Array(this.component, __props.asInstanceOf[GatewayProps]))
  }
  
  @JSImport("react-gateway", "Gateway")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: GatewayProps): Default[tag.type, typingsSlinky.reactGateway.mod.Gateway] = new Default[tag.type, typingsSlinky.reactGateway.mod.Gateway](js.Array(this.component, p.asInstanceOf[js.Any]))
}
