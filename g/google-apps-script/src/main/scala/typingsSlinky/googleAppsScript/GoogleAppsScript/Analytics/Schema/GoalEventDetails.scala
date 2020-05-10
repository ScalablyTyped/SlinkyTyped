package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalEventDetails extends js.Object {
  var eventConditions: js.UndefOr[js.Array[GoalEventDetailsEventConditions]] = js.native
  var useEventValue: js.UndefOr[Boolean] = js.native
}

object GoalEventDetails {
  @scala.inline
  def apply(): GoalEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalEventDetails]
  }
  @scala.inline
  implicit class GoalEventDetailsOps[Self <: GoalEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventConditions(value: js.Array[GoalEventDetailsEventConditions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEventValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEventValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEventValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEventValue")(js.undefined)
        ret
    }
  }
  
}

