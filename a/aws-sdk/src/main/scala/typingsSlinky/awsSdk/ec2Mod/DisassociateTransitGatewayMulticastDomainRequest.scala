package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateTransitGatewayMulticastDomainRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of the subnets;
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentId] = js.native
  
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayMulticastDomainId] = js.native
}
object DisassociateTransitGatewayMulticastDomainRequest {
  
  @scala.inline
  def apply(): DisassociateTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTransitGatewayMulticastDomainRequest]
  }
  
  @scala.inline
  implicit class DisassociateTransitGatewayMulticastDomainRequestOps[Self <: DisassociateTransitGatewayMulticastDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: ValueStringList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = this.set("TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("TransitGatewayAttachmentId", js.undefined)
    
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = this.set("TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayMulticastDomainId: Self = this.set("TransitGatewayMulticastDomainId", js.undefined)
  }
}
