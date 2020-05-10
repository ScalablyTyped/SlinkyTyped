package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackTransactionResponse extends js.Object {
  /**
    * The status of the rollback operation.
    */
  var transactionStatus: js.UndefOr[TransactionStatus] = js.native
}

object RollbackTransactionResponse {
  @scala.inline
  def apply(): RollbackTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackTransactionResponse]
  }
  @scala.inline
  implicit class RollbackTransactionResponseOps[Self <: RollbackTransactionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionStatus(value: TransactionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionStatus")(js.undefined)
        ret
    }
  }
  
}

