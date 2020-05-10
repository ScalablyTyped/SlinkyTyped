package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiConditionalSplitActivity extends js.Object {
  /**
    * The paths for the activity, including the conditions for entering each path and the activity to perform for each path.
    */
  var Branches: js.UndefOr[ListOfMultiConditionalBranch] = js.native
  /**
    * The unique identifier for the activity to perform for participants who don't meet any of the conditions specified for other paths in the activity.
    */
  var DefaultActivity: js.UndefOr[string] = js.native
  /**
    * The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are met.
    */
  var EvaluationWaitTime: js.UndefOr[WaitTime] = js.native
}

object MultiConditionalSplitActivity {
  @scala.inline
  def apply(): MultiConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiConditionalSplitActivity]
  }
  @scala.inline
  implicit class MultiConditionalSplitActivityOps[Self <: MultiConditionalSplitActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranches(value: ListOfMultiConditionalBranch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Branches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Branches")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActivity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultActivity")(js.undefined)
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
  }
  
}

