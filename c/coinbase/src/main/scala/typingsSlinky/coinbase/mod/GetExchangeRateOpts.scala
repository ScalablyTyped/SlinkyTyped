package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExchangeRateOpts extends js.Object {
  /**
    * Base currency, default USD
    */
  var currency: js.UndefOr[String] = js.native
}

object GetExchangeRateOpts {
  @scala.inline
  def apply(): GetExchangeRateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExchangeRateOpts]
  }
  @scala.inline
  implicit class GetExchangeRateOptsOps[Self <: GetExchangeRateOpts] (val x: Self) extends AnyVal {
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
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
  }
  
}

