package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoolsRemoveInstanceRequest extends js.Object {
  /** URLs of the instances to be removed from target pool. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.native
}

object TargetPoolsRemoveInstanceRequest {
  @scala.inline
  def apply(): TargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsRemoveInstanceRequest]
  }
  @scala.inline
  implicit class TargetPoolsRemoveInstanceRequestOps[Self <: TargetPoolsRemoveInstanceRequest] (val x: Self) extends AnyVal {
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

