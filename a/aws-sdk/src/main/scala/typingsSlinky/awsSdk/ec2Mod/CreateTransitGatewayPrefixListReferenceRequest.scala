package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransitGatewayPrefixListReferenceRequest extends StObject {
  
  /**
    * Indicates whether to drop traffic that matches this route.
    */
  var Blackhole: js.UndefOr[Boolean] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the prefix list that is used for destination matches.
    */
  var PrefixListId: PrefixListResourceId = js.native
  
  /**
    * The ID of the attachment to which traffic is routed.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentId] = js.native
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTableId = js.native
}
object CreateTransitGatewayPrefixListReferenceRequest {
  
  @scala.inline
  def apply(PrefixListId: PrefixListResourceId, TransitGatewayRouteTableId: TransitGatewayRouteTableId): CreateTransitGatewayPrefixListReferenceRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayPrefixListReferenceRequest]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayPrefixListReferenceRequestMutableBuilder[Self <: CreateTransitGatewayPrefixListReferenceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackhole(value: Boolean): Self = StObject.set(x, "Blackhole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackholeUndefined: Self = StObject.set(x, "Blackhole", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
  }
}
