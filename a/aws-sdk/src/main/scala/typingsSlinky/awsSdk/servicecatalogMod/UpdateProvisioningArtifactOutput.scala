package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisioningArtifactOutput extends js.Object {
  /**
    * The URL of the CloudFormation template in Amazon S3.
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.native
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactDetail] = js.native
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Status] = js.native
}

object UpdateProvisioningArtifactOutput {
  @scala.inline
  def apply(): UpdateProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisioningArtifactOutput]
  }
  @scala.inline
  implicit class UpdateProvisioningArtifactOutputOps[Self <: UpdateProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: ProvisioningArtifactInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Info")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactDetail(value: ProvisioningArtifactDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
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
  }
  
}

