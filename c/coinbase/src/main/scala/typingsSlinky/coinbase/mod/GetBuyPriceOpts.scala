package typingsSlinky.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBuyPriceOpts extends StObject {
  
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String = js.native
}
object GetBuyPriceOpts {
  
  @scala.inline
  def apply(currencyPair: String): GetBuyPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBuyPriceOpts]
  }
  
  @scala.inline
  implicit class GetBuyPriceOptsMutableBuilder[Self <: GetBuyPriceOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyPair(value: String): Self = StObject.set(x, "currencyPair", value.asInstanceOf[js.Any])
  }
}
