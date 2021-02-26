package typingsSlinky.braintreeWebDropIn.mod

import typingsSlinky.braintreeWeb.threeDSecureMod.ThreeDSecureVerifyPayload
import typingsSlinky.braintreeWebDropIn.anon.Bin
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait cardPaymentMethodPayload extends PaymentMethodPayload {
  
  var binData: typingsSlinky.braintreeWebDropIn.mod.binData = js.native
  
  var details: Bin = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var liabilityShiftPossible: js.UndefOr[Boolean] = js.native
  
  var liabilityShifted: js.UndefOr[Boolean] = js.native
  
  var nonce: String = js.native
  
  var threeDSecureInfo: js.UndefOr[ThreeDSecureVerifyPayload] = js.native
  
  var `type`: CreditCard = js.native
  
  var vaulted: js.UndefOr[Boolean] = js.native
}
object cardPaymentMethodPayload {
  
  @scala.inline
  def apply(binData: binData, details: Bin, nonce: String, `type`: CreditCard): cardPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[cardPaymentMethodPayload]
  }
  
  @scala.inline
  implicit class cardPaymentMethodPayloadMutableBuilder[Self <: cardPaymentMethodPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinData(value: binData): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Bin): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setLiabilityShiftPossible(value: Boolean): Self = StObject.set(x, "liabilityShiftPossible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShiftPossibleUndefined: Self = StObject.set(x, "liabilityShiftPossible", js.undefined)
    
    @scala.inline
    def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilityShiftedUndefined: Self = StObject.set(x, "liabilityShifted", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureInfo(value: ThreeDSecureVerifyPayload): Self = StObject.set(x, "threeDSecureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureInfoUndefined: Self = StObject.set(x, "threeDSecureInfo", js.undefined)
    
    @scala.inline
    def setType(value: CreditCard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaulted(value: Boolean): Self = StObject.set(x, "vaulted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultedUndefined: Self = StObject.set(x, "vaulted", js.undefined)
  }
}
