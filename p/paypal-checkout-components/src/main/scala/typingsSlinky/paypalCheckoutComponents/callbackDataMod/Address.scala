package typingsSlinky.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends StObject {
  
  /**
    * City or locality.
    */
  var city: String = js.native
  
  /**
    * 2 character country code (e.g. US).
    */
  var countryCode: String = js.native
  
  /**
    * Street number and name.
    */
  var line1: String = js.native
  
  /**
    * Extended address.
    */
  var line2: js.UndefOr[String] = js.native
  
  /**
    * Phone number.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * Postal code.
    */
  var postalCode: String = js.native
  
  /**
    * Recipient of postage.
    */
  var recipientName: js.UndefOr[String] = js.native
  
  /**
    * State or region.
    */
  var state: String = js.native
}
object Address {
  
  @scala.inline
  def apply(city: String, countryCode: String, line1: String, postalCode: String, state: String): Address = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
