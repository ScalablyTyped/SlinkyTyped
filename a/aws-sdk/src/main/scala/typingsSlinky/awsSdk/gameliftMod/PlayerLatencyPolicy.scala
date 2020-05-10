package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerLatencyPolicy extends js.Object {
  /**
    * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for this property.
    */
  var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.native
  /**
    * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for this property means that the policy is enforced until the queue times out.
    */
  var PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.native
}

object PlayerLatencyPolicy {
  @scala.inline
  def apply(): PlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLatencyPolicy]
  }
  @scala.inline
  implicit class PlayerLatencyPolicyOps[Self <: PlayerLatencyPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumIndividualPlayerLatencyMilliseconds(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumIndividualPlayerLatencyMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumIndividualPlayerLatencyMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumIndividualPlayerLatencyMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDurationSeconds(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDurationSeconds")(js.undefined)
        ret
    }
  }
  
}

