package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSplitEntry extends js.Object {
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The percentage of participants to send down the activity path. To determine which participants are sent down each path, Amazon Pinpoint applies a probability-based algorithm to the percentages that you specify for the paths. Therefore, the actual percentage of participants who are sent down a path may not be equal to the percentage that you specify.
    */
  var Percentage: js.UndefOr[integer] = js.native
}

object RandomSplitEntry {
  @scala.inline
  def apply(): RandomSplitEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomSplitEntry]
  }
  @scala.inline
  implicit class RandomSplitEntryOps[Self <: RandomSplitEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPercentage(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(js.undefined)
        ret
    }
  }
  
}

