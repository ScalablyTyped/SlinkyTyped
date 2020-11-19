package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptDirectConnectGatewayAssociationProposalResult extends js.Object {
  
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}
object AcceptDirectConnectGatewayAssociationProposalResult {
  
  @scala.inline
  def apply(): AcceptDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalResult]
  }
  
  @scala.inline
  implicit class AcceptDirectConnectGatewayAssociationProposalResultOps[Self <: AcceptDirectConnectGatewayAssociationProposalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = this.set("directConnectGatewayAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayAssociation: Self = this.set("directConnectGatewayAssociation", js.undefined)
  }
}
