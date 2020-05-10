package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order disbursement. All methods require the payment analyst role.
  */
@js.native
trait SchemaOrderReportDisbursement extends js.Object {
  /**
    * The disbursement amount.
    */
  var disbursementAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The disbursement date, in ISO 8601 format.
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
}

object SchemaOrderReportDisbursement {
  @scala.inline
  def apply(): SchemaOrderReportDisbursement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderReportDisbursement]
  }
  @scala.inline
  implicit class SchemaOrderReportDisbursementOps[Self <: SchemaOrderReportDisbursement] (val x: Self) extends AnyVal {
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
  }
  
}

