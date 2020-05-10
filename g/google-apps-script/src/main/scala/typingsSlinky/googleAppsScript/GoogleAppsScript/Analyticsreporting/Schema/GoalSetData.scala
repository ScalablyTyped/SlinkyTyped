package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalSetData extends js.Object {
  var goals: js.UndefOr[js.Array[GoalData]] = js.native
}

object GoalSetData {
  @scala.inline
  def apply(): GoalSetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalSetData]
  }
  @scala.inline
  implicit class GoalSetDataOps[Self <: GoalSetData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoals(value: js.Array[GoalData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(js.undefined)
        ret
    }
  }
  
}

