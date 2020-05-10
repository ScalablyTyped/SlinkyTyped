package typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accountBalance: String = js.native
  var latestSequenceNumber: String = js.native
  var maxGasCost: String = js.native
  var signedTxn: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(accountBalance: String, latestSequenceNumber: String, maxGasCost: String): AsObject = {
    val __obj = js.Dynamic.literal(accountBalance = accountBalance.asInstanceOf[js.Any], latestSequenceNumber = latestSequenceNumber.asInstanceOf[js.Any], maxGasCost = maxGasCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountBalance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestSequenceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxGasCost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGasCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedTxn(value: typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedTxn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedTxn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedTxn")(js.undefined)
        ret
    }
  }
  
}

