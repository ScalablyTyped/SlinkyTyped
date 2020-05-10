package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBlockGetByTransactionIdRequest extends js.Object {
  /** ClientBlockGetByTransactionIdRequest transactionId */
  var transactionId: js.UndefOr[String | Null] = js.native
}

object IClientBlockGetByTransactionIdRequest {
  @scala.inline
  def apply(): IClientBlockGetByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByTransactionIdRequest]
  }
  @scala.inline
  implicit class IClientBlockGetByTransactionIdRequestOps[Self <: IClientBlockGetByTransactionIdRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(null)
        ret
    }
  }
  
}

