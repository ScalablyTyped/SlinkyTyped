package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption extends js.Object {
  var description: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
}

object OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption {
  @scala.inline
  def apply(): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption]
  }
  @scala.inline
  implicit class OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOptionOps[Self <: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] (val x: Self) extends AnyVal {
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

