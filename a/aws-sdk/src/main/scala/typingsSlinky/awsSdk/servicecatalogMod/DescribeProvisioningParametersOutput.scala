package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningParametersOutput extends js.Object {
  /**
    * Information about the constraints used to provision the product.
    */
  var ConstraintSummaries: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ConstraintSummaries] = js.native
  /**
    * Information about the parameters used to provision the product.
    */
  var ProvisioningArtifactParameters: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactParameters] = js.native
  /**
    * An object that contains information about preferences, such as regions and accounts, for the provisioning artifact.
    */
  var ProvisioningArtifactPreferences: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactPreferences] = js.native
  /**
    * Information about the TagOptions associated with the resource.
    */
  var TagOptions: js.UndefOr[TagOptionSummaries] = js.native
  /**
    * Any additional metadata specifically related to the provisioning of the product. For example, see the Version field of the CloudFormation template.
    */
  var UsageInstructions: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.UsageInstructions] = js.native
}

object DescribeProvisioningParametersOutput {
  @scala.inline
  def apply(): DescribeProvisioningParametersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningParametersOutput]
  }
  @scala.inline
  implicit class DescribeProvisioningParametersOutputOps[Self <: DescribeProvisioningParametersOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraintSummaries(value: ConstraintSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactParameters(value: ProvisioningArtifactParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactPreferences(value: ProvisioningArtifactPreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactPreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactPreferences")(js.undefined)
        ret
    }
    @scala.inline
    def withTagOptions(value: TagOptionSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageInstructions(value: UsageInstructions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageInstructions")(js.undefined)
        ret
    }
  }
  
}

