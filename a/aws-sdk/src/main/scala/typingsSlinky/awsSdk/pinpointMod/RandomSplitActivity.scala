package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSplitActivity extends js.Object {
  /**
    * The paths for the activity, including the percentage of participants to enter each path and the activity to perform for each path.
    */
  var Branches: js.UndefOr[ListOfRandomSplitEntry] = js.native
}

object RandomSplitActivity {
  @scala.inline
  def apply(): RandomSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomSplitActivity]
  }
  @scala.inline
  implicit class RandomSplitActivityOps[Self <: RandomSplitActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranches(value: ListOfRandomSplitEntry): Self = {
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
  }
  
}

