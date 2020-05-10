package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyChargeRequest extends js.Object {
  /**
    * Whether charge was successful.
    */
  var chargeState: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * Invoice IDs from the orderinvoices service that correspond to the charge.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOrderpaymentsNotifyChargeRequest {
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyChargeRequest]
  }
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyChargeRequestOps[Self <: SchemaOrderpaymentsNotifyChargeRequest] (val x: Self) extends AnyVal {
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

