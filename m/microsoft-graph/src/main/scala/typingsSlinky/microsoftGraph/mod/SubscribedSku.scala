package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribedSku extends Entity {
  // For example, 'User' or 'Company'.
  var appliesTo: js.UndefOr[String] = js.native
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[String] = js.native
  // The number of licenses that have been assigned.
  var consumedUnits: js.UndefOr[Double] = js.native
  // Information about the number and status of prepaid licenses.
  var prepaidUnits: js.UndefOr[LicenseUnitsDetail] = js.native
  // Information about the service plans that are available with the SKU. Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.native
  // The unique identifier (GUID) for the service SKU.
  var skuId: js.UndefOr[String] = js.native
  // The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'.
  var skuPartNumber: js.UndefOr[String] = js.native
}

object SubscribedSku {
  @scala.inline
  def apply(): SubscribedSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribedSku]
  }
  @scala.inline
  implicit class SubscribedSkuOps[Self <: SubscribedSku] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppliesTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliesTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumedUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumedUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepaidUnits(value: LicenseUnitsDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepaidUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepaidUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepaidUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePlans(value: js.Array[ServicePlanInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlans")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuPartNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuPartNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuPartNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuPartNumber")(js.undefined)
        ret
    }
  }
  
}

