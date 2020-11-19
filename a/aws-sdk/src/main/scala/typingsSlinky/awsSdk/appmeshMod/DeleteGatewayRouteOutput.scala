package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGatewayRouteOutput extends js.Object {
  
  /**
    * The gateway route that was deleted.
    */
  var gatewayRoute: GatewayRouteData = js.native
}
object DeleteGatewayRouteOutput {
  
  @scala.inline
  def apply(gatewayRoute: GatewayRouteData): DeleteGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGatewayRouteOutput]
  }
  
  @scala.inline
  implicit class DeleteGatewayRouteOutputOps[Self <: DeleteGatewayRouteOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatewayRoute(value: GatewayRouteData): Self = this.set("gatewayRoute", value.asInstanceOf[js.Any])
  }
}
