package typingsSlinky.googleCloudDatastore.transactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginTransactionResponse extends js.Object {
  var transaction: String = js.native
}

object BeginTransactionResponse {
  @scala.inline
  def apply(transaction: String): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal(transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginTransactionResponse]
  }
  @scala.inline
  implicit class BeginTransactionResponseOps[Self <: BeginTransactionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

