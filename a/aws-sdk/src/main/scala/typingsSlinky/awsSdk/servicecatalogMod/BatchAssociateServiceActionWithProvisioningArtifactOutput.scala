package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.FailedServiceActionAssociations] = js.native
}

object BatchAssociateServiceActionWithProvisioningArtifactOutput {
  @scala.inline
  def apply(): BatchAssociateServiceActionWithProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactOutput]
  }
  @scala.inline
  implicit class BatchAssociateServiceActionWithProvisioningArtifactOutputOps[Self <: BatchAssociateServiceActionWithProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedServiceActionAssociations(value: FailedServiceActionAssociations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedServiceActionAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedServiceActionAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedServiceActionAssociations")(js.undefined)
        ret
    }
  }
  
}

