package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTransactionResult extends js.Object {
  /**
    * The transaction id of the started transaction.
    */
  var TransactionId: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.TransactionId] = js.native
}

object StartTransactionResult {
  @scala.inline
  def apply(): StartTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTransactionResult]
  }
  @scala.inline
  implicit class StartTransactionResultOps[Self <: StartTransactionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionId(value: TransactionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransactionId")(js.undefined)
        ret
    }
  }
  
}

