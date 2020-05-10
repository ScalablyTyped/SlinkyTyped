package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VmServerAddress extends js.Object {
  /**
    * The identifier of the VM.
    */
  var vmId: js.UndefOr[VmId] = js.native
  /**
    * The identifier of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.native
}

object VmServerAddress {
  @scala.inline
  def apply(): VmServerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServerAddress]
  }
  @scala.inline
  implicit class VmServerAddressOps[Self <: VmServerAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVmId(value: VmId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmId")(js.undefined)
        ret
    }
    @scala.inline
    def withVmManagerId(value: VmManagerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmManagerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerId")(js.undefined)
        ret
    }
  }
  
}

