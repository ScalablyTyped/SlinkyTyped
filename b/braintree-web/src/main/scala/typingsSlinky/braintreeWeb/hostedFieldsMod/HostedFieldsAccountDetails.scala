package typingsSlinky.braintreeWeb.hostedFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFieldsAccountDetails extends js.Object {
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var expirationMonth: String = js.native
  
  var expirationYear: String = js.native
  
  var lastFour: String = js.native
  
  var lastTwo: String = js.native
}
object HostedFieldsAccountDetails {
  
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    expirationMonth: String,
    expirationYear: String,
    lastFour: String,
    lastTwo: String
  ): HostedFieldsAccountDetails = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsAccountDetails]
  }
  
  @scala.inline
  implicit class HostedFieldsAccountDetailsOps[Self <: HostedFieldsAccountDetails] (val x: Self) extends AnyVal {
    
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
    def setExpirationMonth(value: String): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYear(value: String): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFour(value: String): Self = this.set("lastFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTwo(value: String): Self = this.set("lastTwo", value.asInstanceOf[js.Any])
  }
}
