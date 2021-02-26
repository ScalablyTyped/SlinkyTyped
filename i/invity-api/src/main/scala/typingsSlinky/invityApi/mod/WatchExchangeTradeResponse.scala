package typingsSlinky.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchExchangeTradeResponse extends StObject {
  
  var error: js.UndefOr[String] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var receiveStringAmount: js.UndefOr[String] = js.native
  
  // state of trade after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[ExchangeTradeStatus] = js.native
}
object WatchExchangeTradeResponse {
  
  @scala.inline
  def apply(): WatchExchangeTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchExchangeTradeResponse]
  }
  
  @scala.inline
  implicit class WatchExchangeTradeResponseMutableBuilder[Self <: WatchExchangeTradeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setReceiveStringAmount(value: String): Self = StObject.set(x, "receiveStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveStringAmountUndefined: Self = StObject.set(x, "receiveStringAmount", js.undefined)
    
    @scala.inline
    def setReceiveTxHash(value: String): Self = StObject.set(x, "receiveTxHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTxHashUndefined: Self = StObject.set(x, "receiveTxHash", js.undefined)
    
    @scala.inline
    def setStatus(value: ExchangeTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
