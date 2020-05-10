package typingsSlinky.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetResourceCreationLimitPolicy extends js.Object {
  /**
    * Maximum number of game sessions that an individual can create during the policy period.
    */
  var newGameSessionsPerCreator: js.UndefOr[Double] = js.native
  /**
    * Time span used in evaluating the resource creation limit policy.
    */
  var policyPeriodInMinutes: js.UndefOr[Double] = js.native
}

object FleetResourceCreationLimitPolicy {
  @scala.inline
  def apply(): FleetResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetResourceCreationLimitPolicy]
  }
  @scala.inline
  implicit class FleetResourceCreationLimitPolicyOps[Self <: FleetResourceCreationLimitPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewGameSessionsPerCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGameSessionsPerCreator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewGameSessionsPerCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGameSessionsPerCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyPeriodInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyPeriodInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyPeriodInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyPeriodInMinutes")(js.undefined)
        ret
    }
  }
  
}

