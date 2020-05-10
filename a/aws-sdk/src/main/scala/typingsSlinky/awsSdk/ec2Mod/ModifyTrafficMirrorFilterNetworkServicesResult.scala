package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTrafficMirrorFilterNetworkServicesResult extends js.Object {
  /**
    * The Traffic Mirror filter that the network service is associated with.
    */
  var TrafficMirrorFilter: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilter] = js.native
}

object ModifyTrafficMirrorFilterNetworkServicesResult {
  @scala.inline
  def apply(): ModifyTrafficMirrorFilterNetworkServicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesResult]
  }
  @scala.inline
  implicit class ModifyTrafficMirrorFilterNetworkServicesResultOps[Self <: ModifyTrafficMirrorFilterNetworkServicesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficMirrorFilter(value: TrafficMirrorFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilter")(js.undefined)
        ret
    }
  }
  
}

