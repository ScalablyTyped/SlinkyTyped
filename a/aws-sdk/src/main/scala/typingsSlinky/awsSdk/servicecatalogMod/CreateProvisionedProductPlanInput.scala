package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.NotificationArns] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The name of the plan.
    */
  var PlanName: ProvisionedProductPlanName = js.native
  /**
    * The plan type.
    */
  var PlanType: ProvisionedProductPlanType = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
    */
  var ProvisionedProductName: typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductName = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id = js.native
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  /**
    * One or more tags. If the plan is for an existing provisioned product, the product must have a RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}

object CreateProvisionedProductPlanInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    PlanName: ProvisionedProductPlanName,
    PlanType: ProvisionedProductPlanType,
    ProductId: Id,
    ProvisionedProductName: ProvisionedProductName,
    ProvisioningArtifactId: Id
  ): CreateProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PlanName = PlanName.asInstanceOf[js.Any], PlanType = PlanType.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisionedProductPlanInput]
  }
  @scala.inline
  implicit class CreateProvisionedProductPlanInputOps[Self <: CreateProvisionedProductPlanInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdempotencyToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanName(value: ProvisionedProductPlanName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanType(value: ProvisionedProductPlanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionedProductName(value: ProvisionedProductName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisioningArtifactId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptLanguage(value: AcceptLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(js.undefined)
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
  }
  
}

