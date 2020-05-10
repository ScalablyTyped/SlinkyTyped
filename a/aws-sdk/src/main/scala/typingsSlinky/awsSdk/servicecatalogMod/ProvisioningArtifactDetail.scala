package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactDetail extends js.Object {
  /**
    * Indicates whether the product version is active.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.native
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.native
}

object ProvisioningArtifactDetail {
  @scala.inline
  def apply(): ProvisioningArtifactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactDetail]
  }
  @scala.inline
  implicit class ProvisioningArtifactDetailOps[Self <: ProvisioningArtifactDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: ProvisioningArtifactActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(js.undefined)
        ret
    }
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
    def withDescription(value: ProvisioningArtifactName): Self = {
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
    def withGuidance(value: ProvisioningArtifactGuidance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Guidance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuidance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Guidance")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ProvisioningArtifactName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ProvisioningArtifactType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

