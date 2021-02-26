package typingsSlinky.braintree.anon

import typingsSlinky.braintree.mod.DurbinRegulated
import typingsSlinky.braintree.mod.HealthCare
import typingsSlinky.braintree.mod.Payroll
import typingsSlinky.braintree.mod.Prepaid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerLocation extends StObject {
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var cardholderName: String = js.native
  
  var commercial: typingsSlinky.braintree.mod.Commercial = js.native
  
  var countryOfIssuance: String = js.native
  
  var customerLocation: typingsSlinky.braintree.mod.CustomerLocation = js.native
  
  var debit: typingsSlinky.braintree.mod.Debit = js.native
  
  var durbinRegulated: DurbinRegulated = js.native
  
  var expirationDate: String = js.native
  
  var expirationMonth: String = js.native
  
  var expirationYear: String = js.native
  
  var healthcare: HealthCare = js.native
  
  var imageUrl: String = js.native
  
  var issuingBank: String = js.native
  
  var last4: String = js.native
  
  var maskedNumber: String = js.native
  
  var payroll: Payroll = js.native
  
  var prepaid: Prepaid = js.native
  
  var productId: String = js.native
  
  var sourceCardLast4: String = js.native
  
  var token: String = js.native
}
object CustomerLocation {
  
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    commercial: typingsSlinky.braintree.mod.Commercial,
    countryOfIssuance: String,
    customerLocation: typingsSlinky.braintree.mod.CustomerLocation,
    debit: typingsSlinky.braintree.mod.Debit,
    durbinRegulated: DurbinRegulated,
    expirationDate: String,
    expirationMonth: String,
    expirationYear: String,
    healthcare: HealthCare,
    imageUrl: String,
    issuingBank: String,
    last4: String,
    maskedNumber: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    token: String
  ): CustomerLocation = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], maskedNumber = maskedNumber.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerLocation]
  }
  
  @scala.inline
  implicit class CustomerLocationMutableBuilder[Self <: CustomerLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommercial(value: typingsSlinky.braintree.mod.Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerLocation(value: typingsSlinky.braintree.mod.CustomerLocation): Self = StObject.set(x, "customerLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: typingsSlinky.braintree.mod.Debit): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskedNumber(value: String): Self = StObject.set(x, "maskedNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCardLast4(value: String): Self = StObject.set(x, "sourceCardLast4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
