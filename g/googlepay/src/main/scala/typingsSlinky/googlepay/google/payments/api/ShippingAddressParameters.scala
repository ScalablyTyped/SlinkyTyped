package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayBooleans.`false`
import typingsSlinky.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional shipping address parameters for the returned shipping address.
  */
@js.native
trait ShippingAddressParameters extends StObject {
  
  /**
    * Allowed country codes for the shipping address.
    *
    * This list should be an array of ISO 3166-1 alpha-2 country codes
    * (e.g., `["US", "CA", "JP"]`).
    *
    * If omitted, a shipping address from any supported country may be
    * returned.
    */
  var allowedCountryCodes: js.Array[String] = js.native
  
  /**
    * Whether a phone number is additionally required from the buyer for
    * the shipping address (the phone number will only be returned if an
    * address is required, otherwise this field has no effect).
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var phoneNumberRequired: js.UndefOr[`false` | `true`] = js.native
}
object ShippingAddressParameters {
  
  @scala.inline
  def apply(allowedCountryCodes: js.Array[String]): ShippingAddressParameters = {
    val __obj = js.Dynamic.literal(allowedCountryCodes = allowedCountryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddressParameters]
  }
  
  @scala.inline
  implicit class ShippingAddressParametersMutableBuilder[Self <: ShippingAddressParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedCountryCodes(value: js.Array[String]): Self = StObject.set(x, "allowedCountryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCountryCodesVarargs(value: String*): Self = StObject.set(x, "allowedCountryCodes", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberRequired(value: `false` | `true`): Self = StObject.set(x, "phoneNumberRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberRequiredUndefined: Self = StObject.set(x, "phoneNumberRequired", js.undefined)
  }
}
