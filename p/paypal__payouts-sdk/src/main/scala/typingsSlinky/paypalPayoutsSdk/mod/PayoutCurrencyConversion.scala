package typingsSlinky.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutCurrencyConversion extends StObject {
  
  var exchange_rate: js.UndefOr[String] = js.native
  
  var from_amount: js.UndefOr[Currency] = js.native
  
  var to_amount: js.UndefOr[Currency] = js.native
}
object PayoutCurrencyConversion {
  
  @scala.inline
  def apply(): PayoutCurrencyConversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayoutCurrencyConversion]
  }
  
  @scala.inline
  implicit class PayoutCurrencyConversionMutableBuilder[Self <: PayoutCurrencyConversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExchange_rate(value: String): Self = StObject.set(x, "exchange_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchange_rateUndefined: Self = StObject.set(x, "exchange_rate", js.undefined)
    
    @scala.inline
    def setFrom_amount(value: Currency): Self = StObject.set(x, "from_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom_amountUndefined: Self = StObject.set(x, "from_amount", js.undefined)
    
    @scala.inline
    def setTo_amount(value: Currency): Self = StObject.set(x, "to_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo_amountUndefined: Self = StObject.set(x, "to_amount", js.undefined)
  }
}
