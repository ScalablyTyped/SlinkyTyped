package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignedPlan extends js.Object {
  /**
    * The date and time at which the plan was assigned; for example: 2013-01-02T19:32:30Z. The Timestamp type represents date
    * and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
    * look like this: '2014-01-01T00:00:00Z'
    */
  var assignedDateTime: js.UndefOr[String] = js.native
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[String] = js.native
  // The name of the service; for example, 'Exchange'.
  var service: js.UndefOr[String] = js.native
  // A GUID that identifies the service plan.
  var servicePlanId: js.UndefOr[String] = js.native
}

object AssignedPlan {
  @scala.inline
  def apply(): AssignedPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedPlan]
  }
  @scala.inline
  implicit class AssignedPlanOps[Self <: AssignedPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCapabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePlanId")(js.undefined)
        ret
    }
  }
  
}

