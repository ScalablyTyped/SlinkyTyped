package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupManagersListManagedInstancesResponse extends js.Object {
  /** [Output Only] The list of instances in the managed instance group. */
  var managedInstances: js.UndefOr[js.Array[ManagedInstance]] = js.native
}

object InstanceGroupManagersListManagedInstancesResponse {
  @scala.inline
  def apply(): InstanceGroupManagersListManagedInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersListManagedInstancesResponse]
  }
  @scala.inline
  implicit class InstanceGroupManagersListManagedInstancesResponseOps[Self <: InstanceGroupManagersListManagedInstancesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagedInstances(value: js.Array[ManagedInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedInstances")(js.undefined)
        ret
    }
  }
  
}

