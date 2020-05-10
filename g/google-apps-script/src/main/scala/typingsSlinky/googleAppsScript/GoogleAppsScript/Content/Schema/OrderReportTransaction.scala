package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderReportTransaction extends js.Object {
  var disbursementAmount: js.UndefOr[Price] = js.native
  var disbursementCreationDate: js.UndefOr[String] = js.native
  var disbursementDate: js.UndefOr[String] = js.native
  var disbursementId: js.UndefOr[String] = js.native
  var merchantId: js.UndefOr[String] = js.native
  var merchantOrderId: js.UndefOr[String] = js.native
  var orderId: js.UndefOr[String] = js.native
  var productAmount: js.UndefOr[Amount] = js.native
  var productAmountWithRemittedTax: js.UndefOr[ProductAmount] = js.native
  var transactionDate: js.UndefOr[String] = js.native
}

object OrderReportTransaction {
  @scala.inline
  def apply(): OrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderReportTransaction]
  }
  @scala.inline
  implicit class OrderReportTransactionOps[Self <: OrderReportTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisbursementAmount(value: Price): Self = {
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
    def withProductAmount(value: Amount): Self = {
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
    def withProductAmountWithRemittedTax(value: ProductAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAmountWithRemittedTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductAmountWithRemittedTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productAmountWithRemittedTax")(js.undefined)
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

