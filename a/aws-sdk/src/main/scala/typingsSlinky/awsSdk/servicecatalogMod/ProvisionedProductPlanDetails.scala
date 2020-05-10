package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedProductPlanDetails extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.NotificationArns] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
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
  var ProductId: js.UndefOr[Id] = js.native
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
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[ProvisionedProductPlanStatus] = js.native
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StatusMessage] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
  /**
    * The time when the plan was last updated.
    */
  var UpdatedTime: js.UndefOr[js.Date] = js.native
}

object ProvisionedProductPlanDetails {
  @scala.inline
  def apply(): ProvisionedProductPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductPlanDetails]
  }
  @scala.inline
  implicit class ProvisionedProductPlanDetailsOps[Self <: ProvisionedProductPlanDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationArns(value: NotificationArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationArns")(js.undefined)
        ret
    }
    @scala.inline
    def withPathId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathId")(js.undefined)
        ret
    }
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
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(js.undefined)
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
    @scala.inline
    def withProvisioningParameters(value: UpdateProvisioningParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ProvisionedProductPlanStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTime")(js.undefined)
        ret
    }
  }
  
}

