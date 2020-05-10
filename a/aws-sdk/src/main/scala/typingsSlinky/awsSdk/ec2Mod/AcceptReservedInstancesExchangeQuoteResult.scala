package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptReservedInstancesExchangeQuoteResult extends js.Object {
  /**
    * The ID of the successful exchange.
    */
  var ExchangeId: js.UndefOr[String] = js.native
}

object AcceptReservedInstancesExchangeQuoteResult {
  @scala.inline
  def apply(): AcceptReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptReservedInstancesExchangeQuoteResult]
  }
  @scala.inline
  implicit class AcceptReservedInstancesExchangeQuoteResultOps[Self <: AcceptReservedInstancesExchangeQuoteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExchangeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExchangeId")(js.undefined)
        ret
    }
  }
  
}

