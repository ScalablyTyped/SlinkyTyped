package typingsSlinky.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptDirectConnectGatewayAssociationProposalRequest extends StObject {
  
  /**
    * The ID of the AWS account that owns the virtual private gateway or transit gateway.
    */
  var associatedGatewayOwnerAccount: OwnerAccount = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  
  /**
    * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * The ID of the request proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId = js.native
}
object AcceptDirectConnectGatewayAssociationProposalRequest {
  
  @scala.inline
  def apply(
    associatedGatewayOwnerAccount: OwnerAccount,
    directConnectGatewayId: DirectConnectGatewayId,
    proposalId: DirectConnectGatewayAssociationProposalId
  ): AcceptDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(associatedGatewayOwnerAccount = associatedGatewayOwnerAccount.asInstanceOf[js.Any], directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], proposalId = proposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalRequest]
  }
  
  @scala.inline
  implicit class AcceptDirectConnectGatewayAssociationProposalRequestMutableBuilder[Self <: AcceptDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedGatewayOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "associatedGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "overrideAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "overrideAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setOverrideAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "overrideAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
  }
}
