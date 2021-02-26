package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for address of a customer.
  */
@js.native
trait SchemaAddress extends StObject {
  
  /**
    * A customer&#39;s physical address. An address can be composed of one to
    * three lines. The addressline2 and addressLine3 are optional.
    */
  var addressLine1: js.UndefOr[String] = js.native
  
  /**
    * Line 2 of the address.
    */
  var addressLine2: js.UndefOr[String] = js.native
  
  /**
    * Line 3 of the address.
    */
  var addressLine3: js.UndefOr[String] = js.native
  
  /**
    * The customer contact&#39;s name. This is required.
    */
  var contactName: js.UndefOr[String] = js.native
  
  /**
    * For countryCode information, see the ISO 3166 country code elements.
    * Verify that country is approved for resale of Google products. This
    * property is required when creating a new customer.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as a customer address. Value: customers#address
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An example of a locality value is the city of San Francisco.
    */
  var locality: js.UndefOr[String] = js.native
  
  /**
    * The company or company division name. This is required.
    */
  var organizationName: js.UndefOr[String] = js.native
  
  /**
    * A postalCode example is a postal zip code such as 94043. This property is
    * required when creating a new customer.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * An example of a region value is CA for the state of California.
    */
  var region: js.UndefOr[String] = js.native
}
object SchemaAddress {
  
  @scala.inline
  def apply(): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddress]
  }
  
  @scala.inline
  implicit class SchemaAddressMutableBuilder[Self <: SchemaAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
    
    @scala.inline
    def setAddressLine2(value: String): Self = StObject.set(x, "addressLine2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLine2Undefined: Self = StObject.set(x, "addressLine2", js.undefined)
    
    @scala.inline
    def setAddressLine3(value: String): Self = StObject.set(x, "addressLine3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLine3Undefined: Self = StObject.set(x, "addressLine3", js.undefined)
    
    @scala.inline
    def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
