package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStatus extends js.Object {
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Any scheduled events associated with the instance.
    */
  var Events: js.UndefOr[InstanceStatusEventList] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The intended state of the instance. DescribeInstanceStatus requires that an instance be in the running state.
    */
  var InstanceState: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceState] = js.native
  /**
    * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
    */
  var InstanceStatus: js.UndefOr[InstanceStatusSummary] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * Reports impaired functionality that stems from issues related to the systems that support an instance, such as hardware failures and network connectivity problems.
    */
  var SystemStatus: js.UndefOr[InstanceStatusSummary] = js.native
}

object InstanceStatus {
  @scala.inline
  def apply(): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatus]
  }
  @scala.inline
  implicit class InstanceStatusOps[Self <: InstanceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: InstanceStatusEventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
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
    def withInstanceState(value: InstanceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceState")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceStatus(value: InstanceStatusSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemStatus(value: InstanceStatusSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SystemStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SystemStatus")(js.undefined)
        ret
    }
  }
  
}

