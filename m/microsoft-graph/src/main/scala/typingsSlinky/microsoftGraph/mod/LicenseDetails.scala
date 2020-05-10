package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseDetails extends Entity {
  // Information about the service plans assigned with the license. Read-only, Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.native
  /**
    * Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object.
    * Read-only
    */
  var skuId: js.UndefOr[String] = js.native
  /**
    * Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'.
    * Read-only
    */
  var skuPartNumber: js.UndefOr[String] = js.native
}

object LicenseDetails {
  @scala.inline
  def apply(): LicenseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseDetails]
  }
  @scala.inline
  implicit class LicenseDetailsOps[Self <: LicenseDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

