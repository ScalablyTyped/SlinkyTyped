package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterNetworkServicesRequest extends js.Object {
  /**
    * The network service, for example Amazon DNS, that you want to mirror.
    */
  var AddNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The network service, for example Amazon DNS, that you no longer want to mirror.
    */
  var RemoveNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterId = js.native
}

object ModifyTrafficMirrorFilterNetworkServicesRequest {
  @scala.inline
  def apply(TrafficMirrorFilterId: TrafficMirrorFilterId): ModifyTrafficMirrorFilterNetworkServicesRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesRequest]
  }
  @scala.inline
  implicit class ModifyTrafficMirrorFilterNetworkServicesRequestOps[Self <: ModifyTrafficMirrorFilterNetworkServicesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddNetworkServices(value: TrafficMirrorNetworkServiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNetworkServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddNetworkServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNetworkServices")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveNetworkServices(value: TrafficMirrorNetworkServiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveNetworkServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveNetworkServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveNetworkServices")(js.undefined)
        ret
    }
  }
  
}

