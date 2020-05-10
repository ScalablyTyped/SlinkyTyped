package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountBalanceResponse extends js.Object {
  var AvailableBalance: js.UndefOr[CurrencyAmount] = js.native
  var OnHoldBalance: js.UndefOr[CurrencyAmount] = js.native
}

object GetAccountBalanceResponse {
  @scala.inline
  def apply(): GetAccountBalanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountBalanceResponse]
  }
  @scala.inline
  implicit class GetAccountBalanceResponseOps[Self <: GetAccountBalanceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableBalance(value: CurrencyAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHoldBalance(value: CurrencyAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnHoldBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHoldBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnHoldBalance")(js.undefined)
        ret
    }
  }
  
}

