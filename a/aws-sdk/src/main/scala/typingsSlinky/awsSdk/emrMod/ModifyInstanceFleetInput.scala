package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceFleetInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: typingsSlinky.awsSdk.emrMod.ClusterId = js.native
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleet: InstanceFleetModifyConfig = js.native
}

object ModifyInstanceFleetInput {
  @scala.inline
  def apply(ClusterId: ClusterId, InstanceFleet: InstanceFleetModifyConfig): ModifyInstanceFleetInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], InstanceFleet = InstanceFleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceFleetInput]
  }
  @scala.inline
  implicit class ModifyInstanceFleetInputOps[Self <: ModifyInstanceFleetInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceFleet(value: InstanceFleetModifyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

