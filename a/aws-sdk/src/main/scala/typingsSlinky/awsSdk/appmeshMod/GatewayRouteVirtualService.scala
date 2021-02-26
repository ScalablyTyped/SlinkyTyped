package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteVirtualService extends StObject {
  
  /**
    * The name of the virtual service that traffic is routed to.
    */
  var virtualServiceName: ResourceName = js.native
}
object GatewayRouteVirtualService {
  
  @scala.inline
  def apply(virtualServiceName: ResourceName): GatewayRouteVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteVirtualService]
  }
  
  @scala.inline
  implicit class GatewayRouteVirtualServiceMutableBuilder[Self <: GatewayRouteVirtualService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualServiceName(value: ResourceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
