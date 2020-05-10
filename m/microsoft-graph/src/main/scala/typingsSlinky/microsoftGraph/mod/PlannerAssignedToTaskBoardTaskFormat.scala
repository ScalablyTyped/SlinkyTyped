package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerAssignedToTaskBoardTaskFormat extends Entity {
  /**
    * Dictionary of hints used to order tasks on the AssignedTo view of the Task Board. The key of each entry is one of the
    * users the task is assigned to and the value is the order hint. The format of each value is defined as outlined here.
    */
  var orderHintsByAssignee: js.UndefOr[PlannerOrderHintsByAssignee] = js.native
  /**
    * Hint value used to order the task on the AssignedTo view of the Task Board when the task is not assigned to anyone, or
    * if the orderHintsByAssignee dictionary does not provide an order hint for the user the task is assigned to. The format
    * is defined as outlined here.
    */
  var unassignedOrderHint: js.UndefOr[String] = js.native
}

object PlannerAssignedToTaskBoardTaskFormat {
  @scala.inline
  def apply(): PlannerAssignedToTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerAssignedToTaskBoardTaskFormat]
  }
  @scala.inline
  implicit class PlannerAssignedToTaskBoardTaskFormatOps[Self <: PlannerAssignedToTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrderHintsByAssignee(value: PlannerOrderHintsByAssignee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHintsByAssignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderHintsByAssignee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHintsByAssignee")(js.undefined)
        ret
    }
    @scala.inline
    def withUnassignedOrderHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unassignedOrderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnassignedOrderHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unassignedOrderHint")(js.undefined)
        ret
    }
  }
  
}

