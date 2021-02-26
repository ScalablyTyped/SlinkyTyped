package typingsSlinky.invityApi.mod

import typingsSlinky.invityApi.invityApiStrings.QUOTE_TIMEOUT
import typingsSlinky.invityApi.invityApiStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyTradeResponse extends StObject {
  
  var newQuote: js.UndefOr[BuyTrade] = js.native
  
  var requestTradeErrorType: js.UndefOr[QUOTE_TIMEOUT | UNKNOWN] = js.native
  
  var trade: BuyTrade = js.native
  
  var tradeForm: js.UndefOr[BuyTradeFormResponse] = js.native
}
object BuyTradeResponse {
  
  @scala.inline
  def apply(trade: BuyTrade): BuyTradeResponse = {
    val __obj = js.Dynamic.literal(trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeResponse]
  }
  
  @scala.inline
  implicit class BuyTradeResponseMutableBuilder[Self <: BuyTradeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewQuote(value: BuyTrade): Self = StObject.set(x, "newQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewQuoteUndefined: Self = StObject.set(x, "newQuote", js.undefined)
    
    @scala.inline
    def setRequestTradeErrorType(value: QUOTE_TIMEOUT | UNKNOWN): Self = StObject.set(x, "requestTradeErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTradeErrorTypeUndefined: Self = StObject.set(x, "requestTradeErrorType", js.undefined)
    
    @scala.inline
    def setTrade(value: BuyTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradeForm(value: BuyTradeFormResponse): Self = StObject.set(x, "tradeForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradeFormUndefined: Self = StObject.set(x, "tradeForm", js.undefined)
  }
}
