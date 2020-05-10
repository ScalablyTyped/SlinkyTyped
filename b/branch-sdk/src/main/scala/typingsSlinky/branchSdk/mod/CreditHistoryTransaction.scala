package typingsSlinky.branchSdk.mod

import typingsSlinky.branchSdk.AnonAmount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditHistoryTransaction extends js.Object {
  var referree: String = js.native
  var referrer: String = js.native
  var transaction: AnonAmount = js.native
}

object CreditHistoryTransaction {
  @scala.inline
  def apply(referree: String, referrer: String, transaction: AnonAmount): CreditHistoryTransaction = {
    val __obj = js.Dynamic.literal(referree = referree.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditHistoryTransaction]
  }
  @scala.inline
  implicit class CreditHistoryTransactionOps[Self <: CreditHistoryTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction(value: AnonAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

