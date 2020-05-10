package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends js.Object {
  var description: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
}

object OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  @scala.inline
  def apply(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
  @scala.inline
  implicit class OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOptionOps[Self <: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

