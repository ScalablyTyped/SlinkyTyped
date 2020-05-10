package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Linux extends js.Object {
  var AllowAllDevices: Boolean = js.native
  var Capabilities: js.Array[String] = js.native
  var Devices: js.Array[PluginDevice] = js.native
}

object Linux {
  @scala.inline
  def apply(AllowAllDevices: Boolean, Capabilities: js.Array[String], Devices: js.Array[PluginDevice]): Linux = {
    val __obj = js.Dynamic.literal(AllowAllDevices = AllowAllDevices.asInstanceOf[js.Any], Capabilities = Capabilities.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linux]
  }
  @scala.inline
  implicit class LinuxOps[Self <: Linux] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAllDevices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowAllDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevices(value: js.Array[PluginDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Devices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

