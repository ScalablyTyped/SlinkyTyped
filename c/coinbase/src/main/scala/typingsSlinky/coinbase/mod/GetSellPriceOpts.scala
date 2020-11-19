package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSellPriceOpts extends js.Object {
  
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String = js.native
}
object GetSellPriceOpts {
  
  @scala.inline
  def apply(currencyPair: String): GetSellPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSellPriceOpts]
  }
  
  @scala.inline
  implicit class GetSellPriceOptsOps[Self <: GetSellPriceOpts] (val x: Self) extends AnyVal {
    
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
    def setCurrencyPair(value: String): Self = this.set("currencyPair", value.asInstanceOf[js.Any])
  }
}
