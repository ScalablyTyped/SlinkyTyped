package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of goals that were reached in an activity.
  */
@js.native
trait SchemaGoalSetData extends js.Object {
  /**
    * All the goals that were reached in the current activity.
    */
  var goals: js.UndefOr[js.Array[SchemaGoalData]] = js.native
}

object SchemaGoalSetData {
  @scala.inline
  def apply(): SchemaGoalSetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoalSetData]
  }
  @scala.inline
  implicit class SchemaGoalSetDataOps[Self <: SchemaGoalSetData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoals(value: js.Array[SchemaGoalData]): Self = {
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

