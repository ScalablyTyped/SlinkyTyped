package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VmServer extends js.Object {
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.native
  /**
    * The type of VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.native
  /**
    * The name of the VM.
    */
  var vmName: js.UndefOr[VmName] = js.native
  /**
    * The VM folder path in the vCenter Server virtual machine inventory tree.
    */
  var vmPath: js.UndefOr[VmPath] = js.native
  /**
    * Information about the VM server location.
    */
  var vmServerAddress: js.UndefOr[VmServerAddress] = js.native
}

object VmServer {
  @scala.inline
  def apply(): VmServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServer]
  }
  @scala.inline
  implicit class VmServerOps[Self <: VmServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVmManagerName(value: VmManagerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmManagerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerName")(js.undefined)
        ret
    }
    @scala.inline
    def withVmManagerType(value: VmManagerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmManagerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerType")(js.undefined)
        ret
    }
    @scala.inline
    def withVmName(value: VmName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmName")(js.undefined)
        ret
    }
    @scala.inline
    def withVmPath(value: VmPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmPath")(js.undefined)
        ret
    }
    @scala.inline
    def withVmServerAddress(value: VmServerAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmServerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmServerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmServerAddress")(js.undefined)
        ret
    }
  }
  
}

