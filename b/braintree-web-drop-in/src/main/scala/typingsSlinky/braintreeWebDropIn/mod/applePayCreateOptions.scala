package typingsSlinky.braintreeWebDropIn.mod

import typingsSlinky.braintreeWeb.applePayMod.ApplePayPaymentRequest
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.`white-outline`
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.black
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait applePayCreateOptions extends StObject {
  
  var applePaySessionVersion: js.UndefOr[Double] = js.native
  
  var buttonStyle: js.UndefOr[black | white | `white-outline`] = js.native
  
  var displayName: String = js.native
  
  var paymentRequest: ApplePayPaymentRequest = js.native
}
object applePayCreateOptions {
  
  @scala.inline
  def apply(displayName: String, paymentRequest: ApplePayPaymentRequest): applePayCreateOptions = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], paymentRequest = paymentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[applePayCreateOptions]
  }
  
  @scala.inline
  implicit class applePayCreateOptionsMutableBuilder[Self <: applePayCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplePaySessionVersion(value: Double): Self = StObject.set(x, "applePaySessionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplePaySessionVersionUndefined: Self = StObject.set(x, "applePaySessionVersion", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: black | white | `white-outline`): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentRequest(value: ApplePayPaymentRequest): Self = StObject.set(x, "paymentRequest", value.asInstanceOf[js.Any])
  }
}
