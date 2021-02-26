package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomerGatewayAssociationsResponse extends StObject {
  
  /**
    * The customer gateway associations.
    */
  var CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object GetCustomerGatewayAssociationsResponse {
  
  @scala.inline
  def apply(): GetCustomerGatewayAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerGatewayAssociationsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerGatewayAssociationsResponseMutableBuilder[Self <: GetCustomerGatewayAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerGatewayAssociations(value: CustomerGatewayAssociationList): Self = StObject.set(x, "CustomerGatewayAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerGatewayAssociationsUndefined: Self = StObject.set(x, "CustomerGatewayAssociations", js.undefined)
    
    @scala.inline
    def setCustomerGatewayAssociationsVarargs(value: CustomerGatewayAssociation*): Self = StObject.set(x, "CustomerGatewayAssociations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
