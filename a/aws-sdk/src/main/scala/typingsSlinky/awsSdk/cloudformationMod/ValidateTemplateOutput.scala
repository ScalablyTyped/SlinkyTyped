package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateTemplateOutput extends js.Object {
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
    * The description found within the template.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * A list of TemplateParameter structures.
    */
  var Parameters: js.UndefOr[TemplateParameters] = js.native
}

object ValidateTemplateOutput {
  @scala.inline
  def apply(): ValidateTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateTemplateOutput]
  }
  @scala.inline
  implicit class ValidateTemplateOutputOps[Self <: ValidateTemplateOutput] (val x: Self) extends AnyVal {
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
    def withParameters(value: TemplateParameters): Self = {
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
  }
  
}

