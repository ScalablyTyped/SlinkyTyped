package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTemplatesResponse extends js.Object {
  /**
    * Information about the assessment templates.
    */
  var assessmentTemplates: AssessmentTemplateList = js.native
  /**
    * Assessment template details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object DescribeAssessmentTemplatesResponse {
  @scala.inline
  def apply(assessmentTemplates: AssessmentTemplateList, failedItems: FailedItems): DescribeAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplates = assessmentTemplates.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTemplatesResponse]
  }
  @scala.inline
  implicit class DescribeAssessmentTemplatesResponseOps[Self <: DescribeAssessmentTemplatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentTemplates(value: AssessmentTemplateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTemplates")(value.asInstanceOf[js.Any])
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

