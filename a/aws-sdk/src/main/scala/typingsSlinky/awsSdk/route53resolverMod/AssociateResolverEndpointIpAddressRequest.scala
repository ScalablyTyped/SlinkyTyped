package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResolverEndpointIpAddressRequest extends StObject {
  
  /**
    * Either the IPv4 address that you want to add to a Resolver endpoint or a subnet ID. If you specify a subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
    */
  var IpAddress: IpAddressUpdate = js.native
  
  /**
    * The ID of the Resolver endpoint that you want to associate IP addresses with.
    */
  var ResolverEndpointId: ResourceId = js.native
}
object AssociateResolverEndpointIpAddressRequest {
  
  @scala.inline
  def apply(IpAddress: IpAddressUpdate, ResolverEndpointId: ResourceId): AssociateResolverEndpointIpAddressRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any], ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressRequest]
  }
  
  @scala.inline
  implicit class AssociateResolverEndpointIpAddressRequestMutableBuilder[Self <: AssociateResolverEndpointIpAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddress(value: IpAddressUpdate): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
