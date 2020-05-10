package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyRefundRequest extends js.Object {
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * Invoice IDs from the orderinvoices service that correspond to the refund.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether refund was successful.
    */
  var refundState: js.UndefOr[String] = js.native
}

object SchemaOrderpaymentsNotifyRefundRequest {
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyRefundRequest]
  }
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyRefundRequestOps[Self <: SchemaOrderpaymentsNotifyRefundRequest] (val x: Self) extends AnyVal {
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

