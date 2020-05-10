package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Planner extends Entity {
  // Read-only. Nullable. Returns a collection of the specified buckets
  var buckets: js.UndefOr[js.Array[PlannerBucket]] = js.native
  // Read-only. Nullable. Returns a collection of the specified plans
  var plans: js.UndefOr[js.Array[PlannerPlan]] = js.native
  // Read-only. Nullable. Returns a collection of the specified tasks
  var tasks: js.UndefOr[js.Array[PlannerTask]] = js.native
}

object Planner {
  @scala.inline
  def apply(): Planner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Planner]
  }
  @scala.inline
  implicit class PlannerOps[Self <: Planner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[PlannerBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
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
    @scala.inline
    def withTasks(value: js.Array[PlannerTask]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(js.undefined)
        ret
    }
  }
  
}

