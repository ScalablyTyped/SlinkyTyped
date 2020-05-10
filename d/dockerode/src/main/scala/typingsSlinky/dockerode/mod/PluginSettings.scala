package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSettings extends js.Object {
  var Args: js.Array[String] = js.native
  var Devices: js.Array[PluginDevice] = js.native
  var Env: js.Array[String] = js.native
  var Mounts: js.Array[PluginMount] = js.native
}

object PluginSettings {
  @scala.inline
  def apply(
    Args: js.Array[String],
    Devices: js.Array[PluginDevice],
    Env: js.Array[String],
    Mounts: js.Array[PluginMount]
  ): PluginSettings = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Devices = Devices.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSettings]
  }
  @scala.inline
  implicit class PluginSettingsOps[Self <: PluginSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevices(value: js.Array[PluginDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounts(value: js.Array[PluginMount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mounts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

