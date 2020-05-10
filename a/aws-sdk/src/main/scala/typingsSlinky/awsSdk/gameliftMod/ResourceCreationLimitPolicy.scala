package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCreationLimitPolicy extends js.Object {
  /**
    * The maximum number of game sessions that an individual can create during the policy period. 
    */
  var NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.native
  /**
    * The time span used in evaluating the resource creation limit policy. 
    */
  var PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.native
}

object ResourceCreationLimitPolicy {
  @scala.inline
  def apply(): ResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCreationLimitPolicy]
  }
  @scala.inline
  implicit class ResourceCreationLimitPolicyOps[Self <: ResourceCreationLimitPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewGameSessionsPerCreator(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewGameSessionsPerCreator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewGameSessionsPerCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewGameSessionsPerCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyPeriodInMinutes(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyPeriodInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyPeriodInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyPeriodInMinutes")(js.undefined)
        ret
    }
  }
  
}

