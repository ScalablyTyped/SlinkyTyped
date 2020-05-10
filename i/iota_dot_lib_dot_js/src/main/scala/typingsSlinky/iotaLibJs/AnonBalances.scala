package typingsSlinky.iotaLibJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBalances extends js.Object {
  var balances: js.Array[Double] = js.native
  var duration: Double = js.native
  var milestone: String = js.native
  var milestoneIndex: Double = js.native
}

object AnonBalances {
  @scala.inline
  def apply(balances: js.Array[Double], duration: Double, milestone: String, milestoneIndex: Double): AnonBalances = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], milestoneIndex = milestoneIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBalances]
  }
  @scala.inline
  implicit class AnonBalancesOps[Self <: AnonBalances] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalances(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestoneIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

