package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectTransitGatewayVpcAttachmentRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentId = js.native
}
object RejectTransitGatewayVpcAttachmentRequest {
  
  @scala.inline
  def apply(TransitGatewayAttachmentId: TransitGatewayAttachmentId): RejectTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectTransitGatewayVpcAttachmentRequest]
  }
  
  @scala.inline
  implicit class RejectTransitGatewayVpcAttachmentRequestMutableBuilder[Self <: RejectTransitGatewayVpcAttachmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
  }
}
