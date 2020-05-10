package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoneyData extends js.Object {
  /**
    * An amount of money in the smallest sub-division of the currency, e.g. 12.60 EUR would be represented as 1260 whereas 12 JPY would be represented as just 12)
    */
  var Amount: Double = js.native
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO = js.native
}

object MoneyData {
  @scala.inline
  def apply(Amount: Double, Currency: CurrencyISO): MoneyData = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyData]
  }
  @scala.inline
  implicit class MoneyDataOps[Self <: MoneyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Currency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

