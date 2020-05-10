package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginTransactionRequest extends js.Object {
  /** Options for a new transaction. */
  var transactionOptions: js.UndefOr[TransactionOptions] = js.native
}

object BeginTransactionRequest {
  @scala.inline
  def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  @scala.inline
  implicit class BeginTransactionRequestOps[Self <: BeginTransactionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionOptions(value: TransactionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionOptions")(js.undefined)
        ret
    }
  }
  
}

