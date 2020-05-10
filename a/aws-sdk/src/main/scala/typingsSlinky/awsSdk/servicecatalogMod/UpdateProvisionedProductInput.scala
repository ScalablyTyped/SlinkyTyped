package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisionedProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The new path identifier. This value is optional if the product has a default path, and required if the product has more than one path.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the product.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  /**
    * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The new parameters.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.native
  /**
    * One or more tags. Requires the product to have RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
  /**
    * The idempotency token that uniquely identifies the provisioning update request.
    */
  var UpdateToken: IdempotencyToken = js.native
}

object UpdateProvisionedProductInput {
  @scala.inline
  def apply(UpdateToken: IdempotencyToken): UpdateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisionedProductInput]
  }
  @scala.inline
  implicit class UpdateProvisionedProductInputOps[Self <: UpdateProvisionedProductInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateToken")(value.asInstanceOf[js.Any])
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
    def withProvisionedProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedProductName(value: ProvisionedProductNameOrArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedProductName")(js.undefined)
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
    def withProvisioningPreferences(value: UpdateProvisioningPreferences): Self = {
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

