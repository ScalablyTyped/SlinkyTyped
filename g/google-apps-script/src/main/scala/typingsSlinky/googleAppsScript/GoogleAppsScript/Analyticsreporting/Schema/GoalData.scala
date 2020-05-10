package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalData extends js.Object {
  var goalCompletionLocation: js.UndefOr[String] = js.native
  var goalCompletions: js.UndefOr[String] = js.native
  var goalIndex: js.UndefOr[Double] = js.native
  var goalName: js.UndefOr[String] = js.native
  var goalPreviousStep1: js.UndefOr[String] = js.native
  var goalPreviousStep2: js.UndefOr[String] = js.native
  var goalPreviousStep3: js.UndefOr[String] = js.native
  var goalValue: js.UndefOr[Double] = js.native
}

object GoalData {
  @scala.inline
  def apply(): GoalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalData]
  }
  @scala.inline
  implicit class GoalDataOps[Self <: GoalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoalCompletionLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalCompletionLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalCompletionLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalCompletionLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalCompletions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalCompletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalCompletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalCompletions")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalName")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalPreviousStep1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalPreviousStep1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalPreviousStep1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalPreviousStep1")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalPreviousStep2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalPreviousStep2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalPreviousStep2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalPreviousStep2")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalPreviousStep3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalPreviousStep3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalPreviousStep3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalPreviousStep3")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalValue")(js.undefined)
        ret
    }
  }
  
}

