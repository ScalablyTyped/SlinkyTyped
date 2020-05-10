package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimateTemplateCostInput extends js.Object {
  /**
    * A list of Parameter structures that specify input parameters.
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Parameters] = js.native
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) Conditional: You must pass TemplateBody or TemplateURL. If both are passed, only TemplateBody is used.
    */
  var TemplateBody: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateBody] = js.native
  /**
    * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3 bucket. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
    */
  var TemplateURL: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateURL] = js.native
}

object EstimateTemplateCostInput {
  @scala.inline
  def apply(): EstimateTemplateCostInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimateTemplateCostInput]
  }
  @scala.inline
  implicit class EstimateTemplateCostInputOps[Self <: EstimateTemplateCostInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: Parameters): Self = {
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
    def withTemplateBody(value: TemplateBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateURL(value: TemplateURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateURL")(js.undefined)
        ret
    }
  }
  
}

