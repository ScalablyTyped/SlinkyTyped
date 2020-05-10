package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerGroup extends Entity {
  // Read-only. Nullable. Returns the plannerPlans owned by the group.
  var plans: js.UndefOr[js.Array[PlannerPlan]] = js.native
}

object PlannerGroup {
  @scala.inline
  def apply(): PlannerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerGroup]
  }
  @scala.inline
  implicit class PlannerGroupOps[Self <: PlannerGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlans(value: js.Array[PlannerPlan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(js.undefined)
        ret
    }
  }
  
}

