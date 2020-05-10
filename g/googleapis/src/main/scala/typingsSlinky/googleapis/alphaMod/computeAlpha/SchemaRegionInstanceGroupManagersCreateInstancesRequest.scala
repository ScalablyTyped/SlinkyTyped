package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RegionInstanceGroupManagers.createInstances
  */
@js.native
trait SchemaRegionInstanceGroupManagersCreateInstancesRequest extends js.Object {
  /**
    * [Required] List of specifications of per-instance configs.
    */
  var instances: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}

object SchemaRegionInstanceGroupManagersCreateInstancesRequest {
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersCreateInstancesRequest]
  }
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersCreateInstancesRequestOps[Self <: SchemaRegionInstanceGroupManagersCreateInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: js.Array[SchemaPerInstanceConfig]): Self = {
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

