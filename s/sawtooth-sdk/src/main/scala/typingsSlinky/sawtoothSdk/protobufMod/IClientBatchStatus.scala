package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBatchStatus extends js.Object {
  /** ClientBatchStatus batchId */
  var batchId: js.UndefOr[String | Null] = js.native
  /** ClientBatchStatus invalidTransactions */
  var invalidTransactions: js.UndefOr[js.Array[IInvalidTransaction] | Null] = js.native
  /** ClientBatchStatus status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientBatchStatus {
  @scala.inline
  def apply(): IClientBatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatus]
  }
  @scala.inline
  implicit class IClientBatchStatusOps[Self <: IClientBatchStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(null)
        ret
    }
    @scala.inline
    def withInvalidTransactions(value: js.Array[IInvalidTransaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidTransactions")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidTransactionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidTransactions")(null)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(null)
        ret
    }
  }
  
}

