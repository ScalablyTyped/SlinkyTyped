package typingsSlinky.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodLimits extends StObject {
  
  var buy: js.Array[PaymentMethodLimit] = js.native
  
  var deposit: js.Array[PaymentMethodLimit] = js.native
  
  var instant_buy: js.Array[PaymentMethodLimit] = js.native
  
  var sell: js.Array[PaymentMethodLimit] = js.native
}
object PaymentMethodLimits {
  
  @scala.inline
  def apply(
    buy: js.Array[PaymentMethodLimit],
    deposit: js.Array[PaymentMethodLimit],
    instant_buy: js.Array[PaymentMethodLimit],
    sell: js.Array[PaymentMethodLimit]
  ): PaymentMethodLimits = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], deposit = deposit.asInstanceOf[js.Any], instant_buy = instant_buy.asInstanceOf[js.Any], sell = sell.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodLimits]
  }
  
  @scala.inline
  implicit class PaymentMethodLimitsMutableBuilder[Self <: PaymentMethodLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuy(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "buy", js.Array(value :_*))
    
    @scala.inline
    def setDeposit(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "deposit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepositVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "deposit", js.Array(value :_*))
    
    @scala.inline
    def setInstant_buy(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "instant_buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_buyVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "instant_buy", js.Array(value :_*))
    
    @scala.inline
    def setSell(value: js.Array[PaymentMethodLimit]): Self = StObject.set(x, "sell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellVarargs(value: PaymentMethodLimit*): Self = StObject.set(x, "sell", js.Array(value :_*))
  }
}
