package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerPlanDetails extends Entity {
  // An object that specifies the descriptions of the six categories that can be associated with tasks in the plan
  var categoryDescriptions: js.UndefOr[PlannerCategoryDescriptions] = js.native
  /**
    * Set of user ids that this plan is shared with. If you are leveraging Office 365 Groups, use the Groups API to manage
    * group membership to share the group's plan. You can also add existing members of the group to this collection though it
    * is not required for them to access the plan owned by the group.
    */
  var sharedWith: js.UndefOr[PlannerUserIds] = js.native
}

object PlannerPlanDetails {
  @scala.inline
  def apply(): PlannerPlanDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerPlanDetails]
  }
  @scala.inline
  implicit class PlannerPlanDetailsOps[Self <: PlannerPlanDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryDescriptions(value: PlannerCategoryDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedWith(value: PlannerUserIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWith")(js.undefined)
        ret
    }
  }
  
}

