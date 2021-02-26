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
trait Bin extends StObject {
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var cardholderName: js.UndefOr[String] = js.native
  
  var commercial: typingsSlinky.braintree.mod.Commercial = js.native
  
  var countryOfIssuance: String = js.native
  
  var customerLocation: typingsSlinky.braintree.mod.CustomerLocation = js.native
  
  var debit: String = js.native
  
  var durbinRegulated: DurbinRegulated = js.native
  
  var expirationDate: js.UndefOr[String] = js.native
  
  var expirationMonth: js.UndefOr[String] = js.native
  
  var expirationYear: js.UndefOr[String] = js.native
  
  var healthcare: HealthCare = js.native
  
  var issuingBank: String = js.native
  
  var last4: String = js.native
  
  var payroll: Payroll = js.native
  
  var prepaid: Prepaid = js.native
  
  var productId: String = js.native
  
  var token: String = js.native
  
  var uniqueNumberIdentifier: String = js.native
}
object Bin {
  
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    commercial: typingsSlinky.braintree.mod.Commercial,
    countryOfIssuance: String,
    customerLocation: typingsSlinky.braintree.mod.CustomerLocation,
    debit: String,
    durbinRegulated: DurbinRegulated,
    healthcare: HealthCare,
    issuingBank: String,
    last4: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    token: String,
    uniqueNumberIdentifier: String
  ): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uniqueNumberIdentifier = uniqueNumberIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
  
  @scala.inline
  implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    @scala.inline
    def setCommercial(value: typingsSlinky.braintree.mod.Commercial): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerLocation(value: typingsSlinky.braintree.mod.CustomerLocation): Self = StObject.set(x, "customerLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: String): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    @scala.inline
    def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    @scala.inline
    def setHealthcare(value: HealthCare): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: Payroll): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: Prepaid): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNumberIdentifier(value: String): Self = StObject.set(x, "uniqueNumberIdentifier", value.asInstanceOf[js.Any])
  }
}
