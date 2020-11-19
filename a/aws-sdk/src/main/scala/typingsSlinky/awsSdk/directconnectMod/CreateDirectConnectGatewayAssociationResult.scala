package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectConnectGatewayAssociationResult extends js.Object {
  
  /**
    * The association to be created.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}
object CreateDirectConnectGatewayAssociationResult {
  
  @scala.inline
  def apply(): CreateDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationResult]
  }
  
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationResultOps[Self <: CreateDirectConnectGatewayAssociationResult] (val x: Self) extends AnyVal {
    
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
