package typingsSlinky.reactGateway

import typingsSlinky.react.mod.Component
import typingsSlinky.reactGateway.gatewayDestMod.GatewayDestProps
import typingsSlinky.reactGateway.gatewayMod.GatewayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Gateway ()
    extends Component[GatewayProps, js.Object, js.Any]
  
  @js.native
  class GatewayDest ()
    extends Component[GatewayDestProps, js.Object, js.Any]
  
  @js.native
  class GatewayProvider ()
    extends Component[js.Object, js.Object, js.Any]
  
  @js.native
  class GatewayRegistry ()
    extends typingsSlinky.reactGateway.gatewayRegistryMod.GatewayRegistry
}
