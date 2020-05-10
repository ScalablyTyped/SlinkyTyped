package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateOutput extends js.Object {
  /**
    * The stage of the template that you can retrieve. For stacks, the Original and Processed templates are always available. For change sets, the Original template is always available. After AWS CloudFormation finishes creating the change set, the Processed template becomes available.
    */
  var StagesAvailable: js.UndefOr[StageList] = js.native
  /**
    * Structure containing the template body. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) AWS CloudFormation returns the same template that was used when the stack was created.
    */
  var TemplateBody: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateBody] = js.native
}

object GetTemplateOutput {
  @scala.inline
  def apply(): GetTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateOutput]
  }
  @scala.inline
  implicit class GetTemplateOutputOps[Self <: GetTemplateOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStagesAvailable(value: StageList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StagesAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStagesAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StagesAvailable")(js.undefined)
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
  }
  
}

