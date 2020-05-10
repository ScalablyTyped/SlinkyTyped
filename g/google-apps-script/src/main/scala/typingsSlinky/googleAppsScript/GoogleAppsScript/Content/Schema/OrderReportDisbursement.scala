package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderReportDisbursement extends js.Object {
  var disbursementAmount: js.UndefOr[Price] = js.native
  var disbursementCreationDate: js.UndefOr[String] = js.native
  var disbursementDate: js.UndefOr[String] = js.native
  var disbursementId: js.UndefOr[String] = js.native
  var merchantId: js.UndefOr[String] = js.native
}

object OrderReportDisbursement {
  @scala.inline
  def apply(): OrderReportDisbursement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderReportDisbursement]
  }
  @scala.inline
  implicit class OrderReportDisbursementOps[Self <: OrderReportDisbursement] (val x: Self) extends AnyVal {
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
  }
  
}

