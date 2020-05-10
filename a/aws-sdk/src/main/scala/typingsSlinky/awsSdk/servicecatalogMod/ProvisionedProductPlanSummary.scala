package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedProductPlanSummary extends js.Object {
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.native
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.native
  /**
    * The plan type.
    */
  var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.native
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.native
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
}

object ProvisionedProductPlanSummary {
  @scala.inline
  def apply(): ProvisionedProductPlanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductPlanSummary]
  }
  @scala.inline
  implicit class ProvisionedProductPlanSummaryOps[Self <: ProvisionedProductPlanSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlanId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanName(value: ProvisionedProductPlanName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanName")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanType(value: ProvisionedProductPlanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanType")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionProductName(value: ProvisionedProductName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionProductName")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactId")(js.undefined)
        ret
    }
  }
  
}

