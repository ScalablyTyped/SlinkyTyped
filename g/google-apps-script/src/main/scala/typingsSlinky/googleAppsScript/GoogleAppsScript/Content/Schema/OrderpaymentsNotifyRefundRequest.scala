package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderpaymentsNotifyRefundRequest extends js.Object {
  var invoiceId: js.UndefOr[String] = js.native
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
  var refundState: js.UndefOr[String] = js.native
}

object OrderpaymentsNotifyRefundRequest {
  @scala.inline
  def apply(): OrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderpaymentsNotifyRefundRequest]
  }
  @scala.inline
  implicit class OrderpaymentsNotifyRefundRequestOps[Self <: OrderpaymentsNotifyRefundRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvoiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInvoiceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoiceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRefundState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefundState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refundState")(js.undefined)
        ret
    }
  }
  
}

