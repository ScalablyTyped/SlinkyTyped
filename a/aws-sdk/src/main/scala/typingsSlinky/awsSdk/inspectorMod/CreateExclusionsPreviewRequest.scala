package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExclusionsPreviewRequest extends js.Object {
  /**
    * The ARN that specifies the assessment template for which you want to create an exclusions preview.
    */
  var assessmentTemplateArn: Arn = js.native
}

object CreateExclusionsPreviewRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): CreateExclusionsPreviewRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExclusionsPreviewRequest]
  }
  @scala.inline
  implicit class CreateExclusionsPreviewRequestOps[Self <: CreateExclusionsPreviewRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentTemplateArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTemplateArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

