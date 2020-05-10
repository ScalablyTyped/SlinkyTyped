package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateSummaryOutput extends js.Object {
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Capabilities] = js.native
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.CapabilitiesReason] = js.native
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.native
  /**
    * The value that is defined in the Description property of the template.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The value that is defined for the Metadata property of the template.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Metadata] = js.native
  /**
    * A list of parameter declarations that describe various properties for each parameter.
    */
  var Parameters: js.UndefOr[ParameterDeclarations] = js.native
  /**
    * A list of resource identifier summaries that describe the target resources of an import operation and the properties you can provide during the import to identify the target resources. For example, BucketName is a possible identifier property for an AWS::S3::Bucket resource. 
    */
  var ResourceIdentifierSummaries: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceIdentifierSummaries] = js.native
  /**
    * A list of all the template resource types that are defined in the template, such as AWS::EC2::Instance, AWS::Dynamo::Table, and Custom::MyCustomInstance.
    */
  var ResourceTypes: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ResourceTypes] = js.native
  /**
    * The AWS template format version, which identifies the capabilities of the template.
    */
  var Version: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Version] = js.native
}

object GetTemplateSummaryOutput {
  @scala.inline
  def apply(): GetTemplateSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateSummaryOutput]
  }
  @scala.inline
  implicit class GetTemplateSummaryOutputOps[Self <: GetTemplateSummaryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: Capabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilitiesReason(value: CapabilitiesReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapabilitiesReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilitiesReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapabilitiesReason")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaredTransforms(value: TransformsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaredTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaredTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaredTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParameterDeclarations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdentifierSummaries(value: ResourceIdentifierSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifierSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifierSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifierSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypes(value: ResourceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

