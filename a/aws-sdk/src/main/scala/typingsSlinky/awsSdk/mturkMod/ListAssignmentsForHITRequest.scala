package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssignmentsForHITRequest extends js.Object {
  /**
    * The status of the assignments to return: Submitted | Approved | Rejected
    */
  var AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.native
  /**
    * The ID of the HIT.
    */
  var HITId: EntityId = js.native
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListAssignmentsForHITRequest {
  @scala.inline
  def apply(HITId: EntityId): ListAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssignmentsForHITRequest]
  }
  @scala.inline
  implicit class ListAssignmentsForHITRequestOps[Self <: ListAssignmentsForHITRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignmentStatuses(value: AssignmentStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignmentStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: ResultSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

