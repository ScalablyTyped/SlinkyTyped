package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerCreateRequest extends StObject {
  
  var company: js.UndefOr[String] = js.native
  
  var creditCard: js.UndefOr[CreditCardCreateRequest] = js.native
  
  var customFields: js.UndefOr[js.Any] = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var fax: js.UndefOr[String] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var paymentMethodNonce: js.UndefOr[String] = js.native
  
  var phone: js.UndefOr[String] = js.native
  
  var riskData: js.UndefOr[CustomerRiskData] = js.native
  
  var website: js.UndefOr[String] = js.native
}
object CustomerCreateRequest {
  
  @scala.inline
  def apply(): CustomerCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerCreateRequest]
  }
  
  @scala.inline
  implicit class CustomerCreateRequestMutableBuilder[Self <: CustomerCreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setCreditCard(value: CreditCardCreateRequest): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    @scala.inline
    def setCustomFields(value: js.Any): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setRiskData(value: CustomerRiskData): Self = StObject.set(x, "riskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskDataUndefined: Self = StObject.set(x, "riskData", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
