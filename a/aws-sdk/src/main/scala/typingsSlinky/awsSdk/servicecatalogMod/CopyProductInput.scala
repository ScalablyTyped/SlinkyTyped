package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The copy options. If the value is CopyTags, the tags from the source product are copied to the target product.
    */
  var CopyOptions: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.CopyOptions] = js.native
  /**
    *  A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request. 
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The Amazon Resource Name (ARN) of the source product.
    */
  var SourceProductArn: ProductArn = js.native
  /**
    * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all provisioning artifacts are copied.
    */
  var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.native
  /**
    * The identifier of the target product. By default, a new product is created.
    */
  var TargetProductId: js.UndefOr[Id] = js.native
  /**
    * A name for the target product. The default is the name of the source product.
    */
  var TargetProductName: js.UndefOr[ProductViewName] = js.native
}

object CopyProductInput {
  @scala.inline
  def apply(IdempotencyToken: IdempotencyToken, SourceProductArn: ProductArn): CopyProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], SourceProductArn = SourceProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyProductInput]
  }
  @scala.inline
  implicit class CopyProductInputOps[Self <: CopyProductInput] (val x: Self) extends AnyVal {
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
    def withSourceProductArn(value: ProductArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceProductArn")(value.asInstanceOf[js.Any])
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
    def withCopyOptions(value: CopyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceProvisioningArtifactIdentifiers(value: SourceProvisioningArtifactProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceProvisioningArtifactIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceProvisioningArtifactIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceProvisioningArtifactIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetProductName(value: ProductViewName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetProductName")(js.undefined)
        ret
    }
  }
  
}

