package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains an ordered list of nodes appearing in the query plan.
  */
@js.native
trait SchemaQueryPlan extends js.Object {
  /**
    * The nodes in the query plan. Plan nodes are returned in pre-order
    * starting with the plan root. Each PlanNode&#39;s `id` corresponds to its
    * index in `plan_nodes`.
    */
  var planNodes: js.UndefOr[js.Array[SchemaPlanNode]] = js.native
}

object SchemaQueryPlan {
  @scala.inline
  def apply(): SchemaQueryPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryPlan]
  }
  @scala.inline
  implicit class SchemaQueryPlanOps[Self <: SchemaQueryPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlanNodes(value: js.Array[SchemaPlanNode]): Self = {
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

