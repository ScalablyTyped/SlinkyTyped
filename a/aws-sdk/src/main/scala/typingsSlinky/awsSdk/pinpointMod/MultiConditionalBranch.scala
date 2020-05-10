package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiConditionalBranch extends js.Object {
  /**
    * The condition to evaluate for the activity path.
    */
  var Condition: js.UndefOr[SimpleCondition] = js.native
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.native
}

object MultiConditionalBranch {
  @scala.inline
  def apply(): MultiConditionalBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiConditionalBranch]
  }
  @scala.inline
  implicit class MultiConditionalBranchOps[Self <: MultiConditionalBranch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: SimpleCondition): Self = {
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

