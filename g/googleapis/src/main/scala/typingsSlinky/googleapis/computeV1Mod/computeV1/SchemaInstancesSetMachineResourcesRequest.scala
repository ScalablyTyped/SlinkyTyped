package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetMachineResourcesRequest extends js.Object {
  /**
    * A list of the type and count of accelerator cards attached to the
    * instance.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
}

object SchemaInstancesSetMachineResourcesRequest {
  @scala.inline
  def apply(): SchemaInstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetMachineResourcesRequest]
  }
  @scala.inline
  implicit class SchemaInstancesSetMachineResourcesRequestOps[Self <: SchemaInstancesSetMachineResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuestAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = {
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

