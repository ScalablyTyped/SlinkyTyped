package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTemplatesRequest extends js.Object {
  var assessmentTemplateArns: BatchDescribeArnList = js.native
}

object DescribeAssessmentTemplatesRequest {
  @scala.inline
  def apply(assessmentTemplateArns: BatchDescribeArnList): DescribeAssessmentTemplatesRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTemplatesRequest]
  }
  @scala.inline
  implicit class DescribeAssessmentTemplatesRequestOps[Self <: DescribeAssessmentTemplatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentTemplateArns(value: BatchDescribeArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTemplateArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

