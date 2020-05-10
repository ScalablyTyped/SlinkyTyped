package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReviewPolicyResultsForHITResponse extends js.Object {
  /**
    *  The name of the Assignment-level Review Policy. This contains only the PolicyName element. 
    */
  var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  /**
    *  Contains both ReviewResult and ReviewAction elements for an Assignment. 
    */
  var AssignmentReviewReport: js.UndefOr[ReviewReport] = js.native
  /**
    * The HITId of the HIT for which results have been returned.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  /**
    * The name of the HIT-level Review Policy. This contains only the PolicyName element.
    */
  var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  /**
    * Contains both ReviewResult and ReviewAction elements for a particular HIT. 
    */
  var HITReviewReport: js.UndefOr[ReviewReport] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListReviewPolicyResultsForHITResponse {
  @scala.inline
  def apply(): ListReviewPolicyResultsForHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewPolicyResultsForHITResponse]
  }
  @scala.inline
  implicit class ListReviewPolicyResultsForHITResponseOps[Self <: ListReviewPolicyResultsForHITResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentReviewPolicy(value: ReviewPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentReviewPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentReviewPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentReviewPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentReviewReport(value: ReviewReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentReviewReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentReviewReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentReviewReport")(js.undefined)
        ret
    }
    @scala.inline
    def withHITId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(js.undefined)
        ret
    }
    @scala.inline
    def withHITReviewPolicy(value: ReviewPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITReviewPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withHITReviewReport(value: ReviewReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITReviewReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITReviewReport")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

