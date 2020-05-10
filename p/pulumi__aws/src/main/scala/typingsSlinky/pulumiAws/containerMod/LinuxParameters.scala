package typingsSlinky.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxParameters extends js.Object {
  var capabilities: js.UndefOr[KernelCapabilities] = js.native
  var devices: js.UndefOr[js.Array[Device]] = js.native
  var initProcessEnabled: js.UndefOr[Boolean] = js.native
}

object LinuxParameters {
  @scala.inline
  def apply(): LinuxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxParameters]
  }
  @scala.inline
  implicit class LinuxParametersOps[Self <: LinuxParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: KernelCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDevices(value: js.Array[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(js.undefined)
        ret
    }
    @scala.inline
    def withInitProcessEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initProcessEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitProcessEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initProcessEnabled")(js.undefined)
        ret
    }
  }
  
}

