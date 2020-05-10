package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangePlanRequest extends js.Object {
  var dealCode: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var planName: js.UndefOr[String] = js.native
  var purchaseOrderId: js.UndefOr[String] = js.native
  var seats: js.UndefOr[Seats] = js.native
}

object ChangePlanRequest {
  @scala.inline
  def apply(): ChangePlanRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangePlanRequest]
  }
  @scala.inline
  implicit class ChangePlanRequestOps[Self <: ChangePlanRequest] (val x: Self) extends AnyVal {
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
    def withSeats(value: Seats): Self = {
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

