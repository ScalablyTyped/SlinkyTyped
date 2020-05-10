package typingsSlinky.coinbase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrency extends js.Object {
  /**
    * Base currency
    */
  var currency: String = js.native
  /**
    * Rates as floating points in strings; indexed by currency id
    */
  var rates: StringDictionary[String] = js.native
}

object AnonCurrency {
  @scala.inline
  def apply(currency: String, rates: StringDictionary[String]): AnonCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
  @scala.inline
  implicit class AnonCurrencyOps[Self <: AnonCurrency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRates(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

