package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange extends js.Object {
  var effective_date: String = js.native
  var id: Double = js.native
  var plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChangePlan = js.native
  var unit_count: Null = js.native
}

object AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange {
  @scala.inline
  def apply(
    effective_date: String,
    id: Double,
    plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChangePlan,
    unit_count: Null
  ): AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange = {
    val __obj = js.Dynamic.literal(effective_date = effective_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange]
  }
  @scala.inline
  implicit class AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChangeOps[Self <: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffective_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePendingChangePlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit_count(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

