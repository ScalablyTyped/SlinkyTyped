package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderpaymentsNotifyChargeRequest extends js.Object {
  var chargeState: js.UndefOr[String] = js.native
  var invoiceId: js.UndefOr[String] = js.native
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
}

object OrderpaymentsNotifyChargeRequest {
  @scala.inline
  def apply(): OrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderpaymentsNotifyChargeRequest]
  }
  @scala.inline
  implicit class OrderpaymentsNotifyChargeRequestOps[Self <: OrderpaymentsNotifyChargeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChargeState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chargeState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChargeState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chargeState")(js.undefined)
        ret
    }
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
  }
  
}

