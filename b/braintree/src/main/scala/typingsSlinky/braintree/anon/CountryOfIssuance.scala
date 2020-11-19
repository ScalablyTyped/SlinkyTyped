package typingsSlinky.braintree.anon

import typingsSlinky.braintree.mod.DurbinRegulated
import typingsSlinky.braintree.mod.HealthCare
import typingsSlinky.braintree.mod.Payroll
import typingsSlinky.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryOfIssuance extends js.Object {
  
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
  
  var token: String = js.native
}
object CountryOfIssuance {
  
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
    token: String
  ): CountryOfIssuance = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], maskedNumber = maskedNumber.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryOfIssuance]
  }
  
  @scala.inline
  implicit class CountryOfIssuanceOps[Self <: CountryOfIssuance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderName(value: String): Self = this.set("cardholderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommercial(value: typingsSlinky.braintree.mod.Commercial): Self = this.set("commercial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = this.set("countryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerLocation(value: typingsSlinky.braintree.mod.CustomerLocation): Self = this.set("customerLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebit(value: typingsSlinky.braintree.mod.Debit): Self = this.set("debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = this.set("durbinRegulated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonth(value: String): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYear(value: String): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcare(value: HealthCare): Self = this.set("healthcare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = this.set("issuingBank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskedNumber(value: String): Self = this.set("maskedNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayroll(value: Payroll): Self = this.set("payroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaid(value: Prepaid): Self = this.set("prepaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
