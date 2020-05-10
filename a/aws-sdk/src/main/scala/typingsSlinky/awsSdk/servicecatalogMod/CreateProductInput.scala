package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.native
  /**
    * The distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The name of the product.
    */
  var Name: ProductViewName = js.native
  /**
    * The owner of the product.
    */
  var Owner: ProductViewOwner = js.native
  /**
    * The type of product.
    */
  var ProductType: typingsSlinky.awsSdk.servicecatalogMod.ProductType = js.native
  /**
    * The configuration of the provisioning artifact.
    */
  var ProvisioningArtifactParameters: ProvisioningArtifactProperties = js.native
  /**
    * The support information about the product.
    */
  var SupportDescription: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportDescription] = js.native
  /**
    * The contact email for product support.
    */
  var SupportEmail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportEmail] = js.native
  /**
    * The contact URL for product support.
    */
  var SupportUrl: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportUrl] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[AddTags] = js.native
}

object CreateProductInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Name: ProductViewName,
    Owner: ProductViewOwner,
    ProductType: ProductType,
    ProvisioningArtifactParameters: ProvisioningArtifactProperties
  ): CreateProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any], ProvisioningArtifactParameters = ProvisioningArtifactParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProductInput]
  }
  @scala.inline
  implicit class CreateProductInputOps[Self <: CreateProductInput] (val x: Self) extends AnyVal {
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
    def withName(value: ProductViewName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: ProductViewOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductType(value: ProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisioningArtifactParameters(value: ProvisioningArtifactProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactParameters")(value.asInstanceOf[js.Any])
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
    def withDescription(value: ProductViewShortDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributor(value: ProductViewOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distributor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distributor")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportDescription(value: SupportDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportEmail(value: SupportEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportUrl(value: SupportUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: AddTags): Self = {
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

