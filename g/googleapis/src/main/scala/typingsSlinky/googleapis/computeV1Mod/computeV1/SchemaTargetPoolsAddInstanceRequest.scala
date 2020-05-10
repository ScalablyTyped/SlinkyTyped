package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsAddInstanceRequest extends js.Object {
  /**
    * A full or partial URL to an instance to add to this target pool. This can
    * be a full or partial URL. For example, the following are valid URLs:   -
    * https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name
    * - projects/project-id/zones/zone/instances/instance-name  -
    * zones/zone/instances/instance-name
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}

object SchemaTargetPoolsAddInstanceRequest {
  @scala.inline
  def apply(): SchemaTargetPoolsAddInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsAddInstanceRequest]
  }
  @scala.inline
  implicit class SchemaTargetPoolsAddInstanceRequestOps[Self <: SchemaTargetPoolsAddInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: js.Array[SchemaInstanceReference]): Self = {
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

