package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryPlan extends js.Object {
  /**
    * The nodes in the query plan. Plan nodes are returned in pre-order starting
    * with the plan root. Each PlanNode's `id` corresponds to its index in
    * `plan_nodes`.
    */
  var planNodes: js.UndefOr[js.Array[PlanNode]] = js.native
}

object QueryPlan {
  @scala.inline
  def apply(): QueryPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryPlan]
  }
  @scala.inline
  implicit class QueryPlanOps[Self <: QueryPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlanNodes(value: js.Array[PlanNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planNodes")(js.undefined)
        ret
    }
  }
  
}

