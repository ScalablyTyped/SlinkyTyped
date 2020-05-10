package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldoutActivity extends js.Object {
  /**
    * The unique identifier for the next activity to perform, after performing the holdout activity.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The percentage of participants who shouldn't continue the journey. To determine which participants are held out, Amazon Pinpoint applies a probability-based algorithm to the percentage that you specify. Therefore, the actual percentage of participants who are held out may not be equal to the percentage that you specify.
    */
  var Percentage: integer = js.native
}

object HoldoutActivity {
  @scala.inline
  def apply(Percentage: integer): HoldoutActivity = {
    val __obj = js.Dynamic.literal(Percentage = Percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldoutActivity]
  }
  @scala.inline
  implicit class HoldoutActivityOps[Self <: HoldoutActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercentage(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextActivity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextActivity")(js.undefined)
        ret
    }
  }
  
}

