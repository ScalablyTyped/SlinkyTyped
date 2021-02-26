package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressCreateRequest extends StObject {
  
  var company: js.UndefOr[String] = js.native
  
  var countryCodeAlpha2: js.UndefOr[String] = js.native
  
  var countryCodeAlpha3: js.UndefOr[String] = js.native
  
  var countryCodeNumeric: js.UndefOr[String] = js.native
  
  var countryName: js.UndefOr[String] = js.native
  
  var customerId: String = js.native
  
  var extendedAddress: js.UndefOr[String] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var locality: js.UndefOr[String] = js.native
  
  var postalCode: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var streetAddress: js.UndefOr[String] = js.native
}
object AddressCreateRequest {
  
  @scala.inline
  def apply(customerId: String): AddressCreateRequest = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressCreateRequest]
  }
  
  @scala.inline
  implicit class AddressCreateRequestMutableBuilder[Self <: AddressCreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setCountryCodeAlpha2(value: String): Self = StObject.set(x, "countryCodeAlpha2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeAlpha2Undefined: Self = StObject.set(x, "countryCodeAlpha2", js.undefined)
    
    @scala.inline
    def setCountryCodeAlpha3(value: String): Self = StObject.set(x, "countryCodeAlpha3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeAlpha3Undefined: Self = StObject.set(x, "countryCodeAlpha3", js.undefined)
    
    @scala.inline
    def setCountryCodeNumeric(value: String): Self = StObject.set(x, "countryCodeNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeNumericUndefined: Self = StObject.set(x, "countryCodeNumeric", js.undefined)
    
    @scala.inline
    def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNameUndefined: Self = StObject.set(x, "countryName", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
