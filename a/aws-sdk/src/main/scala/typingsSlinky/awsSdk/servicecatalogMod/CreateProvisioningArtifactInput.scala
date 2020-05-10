package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The configuration for the provisioning artifact.
    */
  var Parameters: ProvisioningArtifactProperties = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
}

object CreateProvisioningArtifactInput {
  @scala.inline
  def apply(IdempotencyToken: IdempotencyToken, Parameters: ProvisioningArtifactProperties, ProductId: Id): CreateProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningArtifactInput]
  }
  @scala.inline
  implicit class CreateProvisioningArtifactInputOps[Self <: CreateProvisioningArtifactInput] (val x: Self) extends AnyVal {
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
    def withParameters(value: ProvisioningArtifactProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
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
  }
  
}

