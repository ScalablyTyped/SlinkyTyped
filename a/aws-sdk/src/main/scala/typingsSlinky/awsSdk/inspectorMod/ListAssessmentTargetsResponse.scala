package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssessmentTargetsResponse extends js.Object {
  /**
    * A list of ARNs that specifies the assessment targets that are returned by the action.
    */
  var assessmentTargetArns: ListReturnedArnList = js.native
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAssessmentTargetsResponse {
  @scala.inline
  def apply(assessmentTargetArns: ListReturnedArnList): ListAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArns = assessmentTargetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentTargetsResponse]
  }
  @scala.inline
  implicit class ListAssessmentTargetsResponseOps[Self <: ListAssessmentTargetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssessmentTargetArns(value: ListReturnedArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTargetArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

