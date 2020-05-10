package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupManagersListInstancesResponse extends js.Object {
  /** List of managed instances. */
  var managedInstances: js.UndefOr[js.Array[ManagedInstance]] = js.native
}

object RegionInstanceGroupManagersListInstancesResponse {
  @scala.inline
  def apply(): RegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersListInstancesResponse]
  }
  @scala.inline
  implicit class RegionInstanceGroupManagersListInstancesResponseOps[Self <: RegionInstanceGroupManagersListInstancesResponse] (val x: Self) extends AnyVal {
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

