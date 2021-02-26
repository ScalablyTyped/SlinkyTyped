package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayBooleans.`false`
import typingsSlinky.googlepay.googlepayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional billing address parameters for the returned billing address.
  */
@js.native
trait BillingAddressParameters extends StObject {
  
  /**
    * Billing address format.
    *
    * If omitted, defaults to [[BillingAddressFormat|`MIN`]].
    *
    * Note: you should only set format to [[BillingAddressFormat|`FULL`]]
    * when it is required to process the order. Additional form entry or
    * customer data requests can increase friction during the checkout
    * process and can lead to a lower conversion rate.
    */
  var format: BillingAddressFormat = js.native
  
  /**
    * Whether billing phone number required.
    *
    * If omitted, defaults to `false`.
    *
    * Note: you should only set this to `true` when a phone number
    * is required to process the order. Additional form entry or customer
    * data requests can increase friction during the checkout process and
    * can lead to a lower conversion rate.
    *
    * @default false
    */
  var phoneNumberRequired: js.UndefOr[`false` | `true`] = js.native
}
object BillingAddressParameters {
  
  @scala.inline
  def apply(format: BillingAddressFormat): BillingAddressParameters = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAddressParameters]
  }
  
  @scala.inline
  implicit class BillingAddressParametersMutableBuilder[Self <: BillingAddressParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: BillingAddressFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberRequired(value: `false` | `true`): Self = StObject.set(x, "phoneNumberRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberRequiredUndefined: Self = StObject.set(x, "phoneNumberRequired", js.undefined)
  }
}
