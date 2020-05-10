package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends js.Object {
  /**
    * Optional description of the refund reason.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [required] Reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  @scala.inline
  def apply(): SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
  @scala.inline
  implicit class SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOptionOps[Self <: SchemaOrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] (val x: Self) extends AnyVal {
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

