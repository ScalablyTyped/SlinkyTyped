package typingsSlinky.reactGateway.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatewayProvider {
  @JSImport("react-gateway", "GatewayProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.reactGateway.mod.GatewayProvider] = new Default[tag.type, typingsSlinky.reactGateway.mod.GatewayProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GatewayProvider.type): Default[tag.type, typingsSlinky.reactGateway.mod.GatewayProvider] = new Default[tag.type, typingsSlinky.reactGateway.mod.GatewayProvider](js.Array(this.component, js.Dictionary.empty))()
}

