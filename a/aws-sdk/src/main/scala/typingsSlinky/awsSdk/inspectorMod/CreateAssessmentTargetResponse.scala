package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssessmentTargetResponse extends js.Object {
  /**
    * The ARN that specifies the assessment target that is created.
    */
  var assessmentTargetArn: Arn = js.native
}

object CreateAssessmentTargetResponse {
  @scala.inline
  def apply(assessmentTargetArn: Arn): CreateAssessmentTargetResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTargetResponse]
  }
  @scala.inline
  implicit class CreateAssessmentTargetResponseOps[Self <: CreateAssessmentTargetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentTargetArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTargetArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

