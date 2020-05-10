package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesSetMachineResourcesRequest extends js.Object {
  /** List of the type and count of accelerator cards attached to the instance. */
  var guestAccelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
}

object InstancesSetMachineResourcesRequest {
  @scala.inline
  def apply(): InstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetMachineResourcesRequest]
  }
  @scala.inline
  implicit class InstancesSetMachineResourcesRequestOps[Self <: InstancesSetMachineResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuestAccelerators(value: js.Array[AcceleratorConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestAccelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestAccelerators")(js.undefined)
        ret
    }
  }
  
}

