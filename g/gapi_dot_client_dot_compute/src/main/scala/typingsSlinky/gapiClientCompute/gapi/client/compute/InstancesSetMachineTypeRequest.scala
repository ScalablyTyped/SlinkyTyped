package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesSetMachineTypeRequest extends js.Object {
  /**
    * Full or partial URL of the machine type resource. See Machine Types for a full list of machine types. For example:
    * zones/us-central1-f/machineTypes/n1-standard-1
    */
  var machineType: js.UndefOr[String] = js.native
}

object InstancesSetMachineTypeRequest {
  @scala.inline
  def apply(): InstancesSetMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetMachineTypeRequest]
  }
  @scala.inline
  implicit class InstancesSetMachineTypeRequestOps[Self <: InstancesSetMachineTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMachineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(js.undefined)
        ret
    }
  }
  
}

