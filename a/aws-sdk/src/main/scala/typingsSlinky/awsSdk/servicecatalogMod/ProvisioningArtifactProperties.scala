package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactProperties extends js.Object {
  /**
    * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.native
  /**
    * If set to true, AWS Service Catalog stops validating the specified provisioning artifact even if it is invalid.
    */
  var DisableTemplateValidation: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.DisableTemplateValidation] = js.native
  /**
    * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:  "LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..." 
    */
  var Info: ProvisioningArtifactInfo = js.native
  /**
    * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.native
}

object ProvisioningArtifactProperties {
  @scala.inline
  def apply(Info: ProvisioningArtifactInfo): ProvisioningArtifactProperties = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactProperties]
  }
  @scala.inline
  implicit class ProvisioningArtifactPropertiesOps[Self <: ProvisioningArtifactProperties] (val x: Self) extends AnyVal {
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
    def withDescription(value: ProvisioningArtifactDescription): Self = {
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
    def withDisableTemplateValidation(value: DisableTemplateValidation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableTemplateValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTemplateValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableTemplateValidation")(js.undefined)
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

