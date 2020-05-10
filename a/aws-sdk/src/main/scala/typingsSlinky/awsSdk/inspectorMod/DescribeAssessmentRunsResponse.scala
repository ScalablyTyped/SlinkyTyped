package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentRunsResponse extends js.Object {
  /**
    * Information about the assessment run.
    */
  var assessmentRuns: AssessmentRunList = js.native
  /**
    * Assessment run details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object DescribeAssessmentRunsResponse {
  @scala.inline
  def apply(assessmentRuns: AssessmentRunList, failedItems: FailedItems): DescribeAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRuns = assessmentRuns.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentRunsResponse]
  }
  @scala.inline
  implicit class DescribeAssessmentRunsResponseOps[Self <: DescribeAssessmentRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentRuns(value: AssessmentRunList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedItems(value: FailedItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

