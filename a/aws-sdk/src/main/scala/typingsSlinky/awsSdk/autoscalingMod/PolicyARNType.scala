package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyARNType extends js.Object {
  /**
    * The CloudWatch alarms created for the target tracking scaling policy.
    */
  var Alarms: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Alarms] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.native
}

object PolicyARNType {
  @scala.inline
  def apply(): PolicyARNType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyARNType]
  }
  @scala.inline
  implicit class PolicyARNTypeOps[Self <: PolicyARNType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlarms(value: Alarms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alarms")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyARN(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyARN")(js.undefined)
        ret
    }
  }
  
}

