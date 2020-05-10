package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateReason extends js.Object {
  /**
    * The reason code for the state change.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The message for the state change.    Server.InsufficientInstanceCapacity: There was insufficient capacity available to satisfy the launch request.    Server.InternalError: An internal error caused the instance to terminate during launch.    Server.ScheduledStop: The instance was stopped due to a scheduled retirement.    Server.SpotInstanceShutdown: The instance was stopped because the number of Spot requests with a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the Spot price.    Server.SpotInstanceTermination: The instance was terminated because the number of Spot requests with a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the Spot price.    Client.InstanceInitiatedShutdown: The instance was shut down using the shutdown -h command from the instance.    Client.InstanceTerminated: The instance was terminated or rebooted during AMI creation.    Client.InternalError: A client error caused the instance to terminate during launch.    Client.InvalidSnapshot.NotFound: The specified snapshot was not found.    Client.UserInitiatedHibernate: Hibernation was initiated on the instance.    Client.UserInitiatedShutdown: The instance was shut down using the Amazon EC2 API.    Client.VolumeLimitExceeded: The limit on the number of EBS volumes or total storage was exceeded. Decrease usage or request an increase in your account limits.  
    */
  var Message: js.UndefOr[String] = js.native
}

object StateReason {
  @scala.inline
  def apply(): StateReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateReason]
  }
  @scala.inline
  implicit class StateReasonOps[Self <: StateReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

