package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for the ChangePlan rpc request.
  */
@js.native
trait SchemaChangePlanRequest extends js.Object {
  /**
    * Google-issued code (100 char max) for discounted pricing on subscription
    * plans. Deal code must be included in changePlan request in order to
    * receive discounted rate. This property is optional. If a deal code has
    * already been added to a subscription, this property may be left empty and
    * the existing discounted rate will still apply (if not empty, only provide
    * the deal code that is already present on the subscription). If a deal
    * code has never been added to a subscription and this property is left
    * blank, regular pricing will apply.
    */
  var dealCode: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a subscription change plan request. Value:
    * subscriptions#changePlanRequest
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The planName property is required. This is the name of the
    * subscription&#39;s payment plan. For more information about the Google
    * payment plans, see API concepts.  Possible values are:   -
    * ANNUAL_MONTHLY_PAY - The annual commitment plan with monthly payments
    * Caution: ANNUAL_MONTHLY_PAY is returned as ANNUAL in all API responses.
    * - ANNUAL_YEARLY_PAY - The annual commitment plan with yearly payments   -
    * FLEXIBLE - The flexible plan   - TRIAL - The 30-day free trial plan
    */
  var planName: js.UndefOr[String] = js.native
  /**
    * This is an optional property. This purchase order (PO) information is for
    * resellers to use for their company tracking usage. If a purchaseOrderId
    * value is given it appears in the API responses and shows up in the
    * invoice. The property accepts up to 80 plain text characters.
    */
  var purchaseOrderId: js.UndefOr[String] = js.native
  /**
    * This is a required property. The seats property is the number of user
    * seat licenses.
    */
  var seats: js.UndefOr[SchemaSeats] = js.native
}

object SchemaChangePlanRequest {
  @scala.inline
  def apply(): SchemaChangePlanRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangePlanRequest]
  }
  @scala.inline
  implicit class SchemaChangePlanRequestOps[Self <: SchemaChangePlanRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDealCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealCode")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planName")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeats(value: SchemaSeats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seats")(js.undefined)
        ret
    }
  }
  
}

