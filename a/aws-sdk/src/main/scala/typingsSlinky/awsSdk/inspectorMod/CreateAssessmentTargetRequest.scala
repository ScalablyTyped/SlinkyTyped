package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssessmentTargetRequest extends js.Object {
  /**
    * The user-defined name that identifies the assessment target that you want to create. The name must be unique within the AWS account.
    */
  var assessmentTargetName: AssessmentTargetName = js.native
  /**
    * The ARN that specifies the resource group that is used to create the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.native
}

object CreateAssessmentTargetRequest {
  @scala.inline
  def apply(assessmentTargetName: AssessmentTargetName): CreateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetName = assessmentTargetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTargetRequest]
  }
  @scala.inline
  implicit class CreateAssessmentTargetRequestOps[Self <: CreateAssessmentTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentTargetName(value: AssessmentTargetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTargetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupArn")(js.undefined)
        ret
    }
  }
  
}

