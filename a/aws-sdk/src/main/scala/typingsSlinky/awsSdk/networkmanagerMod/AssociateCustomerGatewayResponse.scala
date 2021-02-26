package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateCustomerGatewayResponse extends StObject {
  
  /**
    * The customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.CustomerGatewayAssociation] = js.native
}
object AssociateCustomerGatewayResponse {
  
  @scala.inline
  def apply(): AssociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateCustomerGatewayResponse]
  }
  
  @scala.inline
  implicit class AssociateCustomerGatewayResponseMutableBuilder[Self <: AssociateCustomerGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGatewayAssociation(value: CustomerGatewayAssociation): Self = StObject.set(x, "CustomerGatewayAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewayAssociationUndefined: Self = StObject.set(x, "CustomerGatewayAssociation", js.undefined)
  }
}
