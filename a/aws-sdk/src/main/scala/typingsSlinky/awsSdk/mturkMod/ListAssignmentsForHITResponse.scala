package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssignmentsForHITResponse extends js.Object {
  /**
    *  The collection of Assignment data structures returned by this call.
    */
  var Assignments: js.UndefOr[AssignmentList] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
}

object ListAssignmentsForHITResponse {
  @scala.inline
  def apply(): ListAssignmentsForHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignmentsForHITResponse]
  }
  @scala.inline
  implicit class ListAssignmentsForHITResponseOps[Self <: ListAssignmentsForHITResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: AssignmentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assignments")(js.undefined)
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
    @scala.inline
    def withNumResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(js.undefined)
        ret
    }
  }
  
}

