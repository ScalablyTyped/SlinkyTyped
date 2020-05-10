package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetInstanceHealthQuery extends js.Object {
  /**
    * The health status of the instance. Set to Healthy to have the instance remain in service. Set to Unhealthy to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces the unhealthy instance.
    */
  var HealthStatus: XmlStringMaxLen32 = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19 = js.native
  /**
    * If the Auto Scaling group of the specified instance has a HealthCheckGracePeriod specified for the group, by default, this call respects the grace period. Set this to False, to have the call not respect the grace period associated with the group. For more information about the health check grace period, see CreateAutoScalingGroup.
    */
  var ShouldRespectGracePeriod: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.ShouldRespectGracePeriod] = js.native
}

object SetInstanceHealthQuery {
  @scala.inline
  def apply(HealthStatus: XmlStringMaxLen32, InstanceId: XmlStringMaxLen19): SetInstanceHealthQuery = {
    val __obj = js.Dynamic.literal(HealthStatus = HealthStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstanceHealthQuery]
  }
  @scala.inline
  implicit class SetInstanceHealthQueryOps[Self <: SetInstanceHealthQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthStatus(value: XmlStringMaxLen32): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: XmlStringMaxLen19): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldRespectGracePeriod(value: ShouldRespectGracePeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShouldRespectGracePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRespectGracePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShouldRespectGracePeriod")(js.undefined)
        ret
    }
  }
  
}

