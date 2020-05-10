package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderReportTransaction extends js.Object {
  /**
    * The disbursement amount.
    */
  var disbursementAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The date the disbursement was created, in ISO 8601 format.
    */
  var disbursementCreationDate: js.UndefOr[String] = js.native
  /**
    * The date the disbursement was initiated, in ISO 8601 format.
    */
  var disbursementDate: js.UndefOr[String] = js.native
  /**
    * The ID of the disbursement.
    */
  var disbursementId: js.UndefOr[String] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * Merchant-provided ID of the order.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The ID of the order.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * Total amount for the items.
    */
  var productAmount: js.UndefOr[SchemaProductAmount] = js.native
  /**
    * The date of the transaction, in ISO 8601 format.
    */
  var transactionDate: js.UndefOr[String] = js.native
}

object SchemaOrderReportTransaction {
  @scala.inline
  def apply(): SchemaOrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderReportTransaction]
  }
  @scala.inline
  implicit class SchemaOrderReportTransactionOps[Self <: SchemaOrderReportTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisbursementAmount(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisbursementAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withDisbursementCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementCreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisbursementCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementCreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisbursementDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisbursementDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisbursementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisbursementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementId")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductAmount(value: SchemaProductAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionDate")(js.undefined)
        ret
    }
  }
  
}

