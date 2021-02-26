package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contract extends DirectoryObject {
  
  /**
    * Type of contract.Possible values are: SyndicationPartner - Partner that exclusively resells and manages O365 and Intune
    * for this customer. They resell and support their customers. BreadthPartner - Partner has the ability to provide
    * administrative support for this customer. However, the partner is not allowed to resell to the customer.ResellerPartner
    * - Partner that is similar to a syndication partner, except that the partner doesn’t have exclusive access to a tenant.
    * In the syndication case, the customer cannot buy additional direct subscriptions from Microsoft or from other partners.
    */
  var contractType: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the
    * customer tenant's organization resource.
    */
  var customerId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A copy of the customer tenant's default domain name. The copy is made when the partnership with the customer is
    * established. It is not automatically updated if the customer tenant's default domain name changes.
    */
  var defaultDomainName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A copy of the customer tenant's display name. The copy is made when the partnership with the customer is established.
    * It is not automatically updated if the customer tenant's display name changes.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
}
object Contract {
  
  @scala.inline
  def apply(): Contract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contract]
  }
  
  @scala.inline
  implicit class ContractMutableBuilder[Self <: Contract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContractType(value: NullableOption[String]): Self = StObject.set(x, "contractType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractTypeNull: Self = StObject.set(x, "contractType", null)
    
    @scala.inline
    def setContractTypeUndefined: Self = StObject.set(x, "contractType", js.undefined)
    
    @scala.inline
    def setCustomerId(value: NullableOption[String]): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdNull: Self = StObject.set(x, "customerId", null)
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDefaultDomainName(value: NullableOption[String]): Self = StObject.set(x, "defaultDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDomainNameNull: Self = StObject.set(x, "defaultDomainName", null)
    
    @scala.inline
    def setDefaultDomainNameUndefined: Self = StObject.set(x, "defaultDomainName", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
