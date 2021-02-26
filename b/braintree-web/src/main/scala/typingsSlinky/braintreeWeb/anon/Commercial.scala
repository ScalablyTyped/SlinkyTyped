package typingsSlinky.braintreeWeb.anon

import typingsSlinky.braintreeWeb.googlePaymentMod.GooglePaymentTokenizeValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commercial extends StObject {
  
  var commercial: GooglePaymentTokenizeValues = js.native
  
  var countryOfIssuance: String = js.native
  
  var debit: GooglePaymentTokenizeValues = js.native
  
  var durbinRegulated: GooglePaymentTokenizeValues = js.native
  
  var healthcare: GooglePaymentTokenizeValues = js.native
  
  var issuingBank: GooglePaymentTokenizeValues = js.native
  
  var payroll: GooglePaymentTokenizeValues = js.native
  
  var prepaid: GooglePaymentTokenizeValues = js.native
  
  var productId: String = js.native
}
object Commercial {
  
  @scala.inline
  def apply(
    commercial: GooglePaymentTokenizeValues,
    countryOfIssuance: String,
    debit: GooglePaymentTokenizeValues,
    durbinRegulated: GooglePaymentTokenizeValues,
    healthcare: GooglePaymentTokenizeValues,
    issuingBank: GooglePaymentTokenizeValues,
    payroll: GooglePaymentTokenizeValues,
    prepaid: GooglePaymentTokenizeValues,
    productId: String
  ): Commercial = {
    val __obj = js.Dynamic.literal(commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commercial]
  }
  
  @scala.inline
  implicit class CommercialMutableBuilder[Self <: Commercial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommercial(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: GooglePaymentTokenizeValues): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
