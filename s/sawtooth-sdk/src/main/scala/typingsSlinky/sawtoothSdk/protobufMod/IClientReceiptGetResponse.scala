package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientReceiptGetResponse extends js.Object {
  /** ClientReceiptGetResponse receipts */
  var receipts: js.UndefOr[js.Array[ITransactionReceipt] | Null] = js.native
  /** ClientReceiptGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientReceiptGetResponse {
  @scala.inline
  def apply(): IClientReceiptGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReceiptGetResponse]
  }
  @scala.inline
  implicit class IClientReceiptGetResponseOps[Self <: IClientReceiptGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceipts(value: js.Array[ITransactionReceipt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceipts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipts")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiptsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipts")(null)
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

