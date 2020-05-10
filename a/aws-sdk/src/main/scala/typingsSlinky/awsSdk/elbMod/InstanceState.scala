package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * A description of the instance state. This string can contain one or more of the following messages.    N/A     A transient error occurred. Please try again later.     Instance has failed at least the UnhealthyThreshold number of health checks consecutively.     Instance has not passed the configured HealthyThreshold number of health checks consecutively.     Instance registration is still in progress.     Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.     Instance is not currently registered with the LoadBalancer.     Instance deregistration currently in progress.     Disable Availability Zone is currently in progress.     Instance is in pending state.     Instance is in stopped state.     Instance is in terminated state.   
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elbMod.Description] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.elbMod.InstanceId] = js.native
  /**
    * Information about the cause of OutOfService instances. Specifically, whether the cause is Elastic Load Balancing or the instance. Valid values: ELB | Instance | N/A 
    */
  var ReasonCode: js.UndefOr[typingsSlinky.awsSdk.elbMod.ReasonCode] = js.native
  /**
    * The current state of the instance. Valid values: InService | OutOfService | Unknown 
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.elbMod.State] = js.native
}

object InstanceState {
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  @scala.inline
  implicit class InstanceStateOps[Self <: InstanceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: ReasonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

