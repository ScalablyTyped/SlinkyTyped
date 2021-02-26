package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransitGatewayMulticastDomainRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The tags for the transit gateway multicast domain.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayId = js.native
}
object CreateTransitGatewayMulticastDomainRequest {
  
  @scala.inline
  def apply(TransitGatewayId: TransitGatewayId): CreateTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayId = TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayMulticastDomainRequest]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayMulticastDomainRequestMutableBuilder[Self <: CreateTransitGatewayMulticastDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
  }
}
