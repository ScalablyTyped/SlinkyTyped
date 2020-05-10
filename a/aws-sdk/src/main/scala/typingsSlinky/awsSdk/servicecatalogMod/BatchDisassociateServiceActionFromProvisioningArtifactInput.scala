package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  var ServiceActionAssociations: typingsSlinky.awsSdk.servicecatalogMod.ServiceActionAssociations = js.native
}

object BatchDisassociateServiceActionFromProvisioningArtifactInput {
  @scala.inline
  def apply(ServiceActionAssociations: ServiceActionAssociations): BatchDisassociateServiceActionFromProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ServiceActionAssociations = ServiceActionAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactInput]
  }
  @scala.inline
  implicit class BatchDisassociateServiceActionFromProvisioningArtifactInputOps[Self <: BatchDisassociateServiceActionFromProvisioningArtifactInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceActionAssociations(value: ServiceActionAssociations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceActionAssociations")(value.asInstanceOf[js.Any])
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

