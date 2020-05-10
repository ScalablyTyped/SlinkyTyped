package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.NotificationArns] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * An idempotency token that uniquely identifies the provisioning request.
    */
  var ProvisionToken: IdempotencyToken = js.native
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
  var ProvisioningParameters: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningParameters] = js.native
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningPreferences] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}

object ProvisionProductInput {
  @scala.inline
  def apply(
    ProductId: Id,
    ProvisionToken: IdempotencyToken,
    ProvisionedProductName: ProvisionedProductName,
    ProvisioningArtifactId: Id
  ): ProvisionProductInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisionToken = ProvisionToken.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionProductInput]
  }
  @scala.inline
  implicit class ProvisionProductInputOps[Self <: ProvisionProductInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionToken")(value.asInstanceOf[js.Any])
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
    def withProvisioningParameters(value: ProvisioningParameters): Self = {
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
    def withProvisioningPreferences(value: ProvisioningPreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningPreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningPreferences")(js.undefined)
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

