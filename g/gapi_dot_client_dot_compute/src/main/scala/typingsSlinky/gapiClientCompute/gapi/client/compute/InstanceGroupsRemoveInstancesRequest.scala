package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupsRemoveInstancesRequest extends js.Object {
  /** The list of instances to remove from the instance group. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.native
}

object InstanceGroupsRemoveInstancesRequest {
  @scala.inline
  def apply(): InstanceGroupsRemoveInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsRemoveInstancesRequest]
  }
  @scala.inline
  implicit class InstanceGroupsRemoveInstancesRequestOps[Self <: InstanceGroupsRemoveInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: js.Array[InstanceReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.undefined)
        ret
    }
  }
  
}

