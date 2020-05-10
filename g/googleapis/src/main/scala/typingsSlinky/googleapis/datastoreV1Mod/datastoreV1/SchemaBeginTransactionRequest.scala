package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.BeginTransaction.
  */
@js.native
trait SchemaBeginTransactionRequest extends js.Object {
  /**
    * Options for a new transaction.
    */
  var transactionOptions: js.UndefOr[SchemaTransactionOptions] = js.native
}

object SchemaBeginTransactionRequest {
  @scala.inline
  def apply(): SchemaBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeginTransactionRequest]
  }
  @scala.inline
  implicit class SchemaBeginTransactionRequestOps[Self <: SchemaBeginTransactionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionOptions(value: SchemaTransactionOptions): Self = {
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

