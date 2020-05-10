package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerAssignment extends js.Object {
  // The identity of the user that performed the assignment of the task, i.e. the assignor.
  var assignedBy: js.UndefOr[IdentitySet] = js.native
  /**
    * The time at which the task was assigned. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[String] = js.native
  // Hint used to order assignees in a task. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.native
}

object PlannerAssignment {
  @scala.inline
  def apply(): PlannerAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerAssignment]
  }
  @scala.inline
  implicit class PlannerAssignmentOps[Self <: PlannerAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(js.undefined)
        ret
    }
  }
  
}

