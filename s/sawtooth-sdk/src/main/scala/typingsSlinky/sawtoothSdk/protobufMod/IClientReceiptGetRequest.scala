package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientReceiptGetRequest extends js.Object {
  /** ClientReceiptGetRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}

object IClientReceiptGetRequest {
  @scala.inline
  def apply(): IClientReceiptGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReceiptGetRequest]
  }
  @scala.inline
  implicit class IClientReceiptGetRequestOps[Self <: IClientReceiptGetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIds")(null)
        ret
    }
  }
  
}

