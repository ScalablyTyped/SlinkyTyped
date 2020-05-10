package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTargetsRequest extends js.Object {
  /**
    * The ARNs that specifies the assessment targets that you want to describe.
    */
  var assessmentTargetArns: BatchDescribeArnList = js.native
}

object DescribeAssessmentTargetsRequest {
  @scala.inline
  def apply(assessmentTargetArns: BatchDescribeArnList): DescribeAssessmentTargetsRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArns = assessmentTargetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTargetsRequest]
  }
  @scala.inline
  implicit class DescribeAssessmentTargetsRequestOps[Self <: DescribeAssessmentTargetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentTargetArns(value: BatchDescribeArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTargetArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

