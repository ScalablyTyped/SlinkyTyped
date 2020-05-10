package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalSplitActivity extends js.Object {
  /**
    * The conditions that define the paths for the activity, and the relationship between the conditions.
    */
  var Condition: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Condition] = js.native
  /**
    * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon Pinpoint determines whether the conditions are met.
    */
  var EvaluationWaitTime: js.UndefOr[WaitTime] = js.native
  /**
    * The unique identifier for the activity to perform if the conditions aren't met.
    */
  var FalseActivity: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the activity to perform if the conditions are met.
    */
  var TrueActivity: js.UndefOr[string] = js.native
}

object ConditionalSplitActivity {
  @scala.inline
  def apply(): ConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalSplitActivity]
  }
  @scala.inline
  implicit class ConditionalSplitActivityOps[Self <: ConditionalSplitActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationWaitTime(value: WaitTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationWaitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationWaitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationWaitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFalseActivity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FalseActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FalseActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueActivity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrueActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrueActivity")(js.undefined)
        ret
    }
  }
  
}

