package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated template. If you specify a name, you must also specify the StackName.
    */
  var ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.native
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackName] = js.native
  /**
    * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the user-submitted template, specify Original. To get the template after AWS CloudFormation has processed all transforms, specify Processed.  If the template doesn't include transforms, Original and Processed return the same template. By default, AWS CloudFormation specifies Original. 
    */
  var TemplateStage: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateStage] = js.native
}

object GetTemplateInput {
  @scala.inline
  def apply(): GetTemplateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateInput]
  }
  @scala.inline
  implicit class GetTemplateInputOps[Self <: GetTemplateInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSetName(value: ChangeSetNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateStage(value: TemplateStage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateStage")(js.undefined)
        ret
    }
  }
  
}

