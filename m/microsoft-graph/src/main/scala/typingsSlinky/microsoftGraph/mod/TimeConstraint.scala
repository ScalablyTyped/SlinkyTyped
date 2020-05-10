package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeConstraint extends js.Object {
  // The nature of the activity, optional. The possible values are: work, personal, unrestricted, or unknown.
  var activityDomain: js.UndefOr[ActivityDomain] = js.native
  var timeSlots: js.UndefOr[js.Array[TimeSlot]] = js.native
}

object TimeConstraint {
  @scala.inline
  def apply(): TimeConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeConstraint]
  }
  @scala.inline
  implicit class TimeConstraintOps[Self <: TimeConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityDomain(value: ActivityDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSlots(value: js.Array[TimeSlot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlots")(js.undefined)
        ret
    }
  }
  
}

