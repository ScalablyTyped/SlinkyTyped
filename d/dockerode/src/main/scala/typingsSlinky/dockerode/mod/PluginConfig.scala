package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginConfig extends js.Object {
  var Args: typingsSlinky.dockerode.mod.Args = js.native
  var Description: String = js.native
  var Documentation: String = js.native
  var Entrypoint: js.Array[String] = js.native
  var Env: js.Array[PluginEnv] = js.native
  var Interface: js.Any = js.native
  var Linux: typingsSlinky.dockerode.mod.Linux = js.native
  var Mounts: js.Array[PluginMount] = js.native
  var Network: typingsSlinky.dockerode.mod.Network = js.native
  var PropagatedMount: String = js.native
  var User: js.UndefOr[typingsSlinky.dockerode.mod.User] = js.native
  var WorkDir: String = js.native
  var rootfs: js.Any = js.native
}

object PluginConfig {
  @scala.inline
  def apply(
    Args: Args,
    Description: String,
    Documentation: String,
    Entrypoint: js.Array[String],
    Env: js.Array[PluginEnv],
    Interface: js.Any,
    Linux: Linux,
    Mounts: js.Array[PluginMount],
    Network: Network,
    PropagatedMount: String,
    WorkDir: String,
    rootfs: js.Any
  ): PluginConfig = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Documentation = Documentation.asInstanceOf[js.Any], Entrypoint = Entrypoint.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], Linux = Linux.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], PropagatedMount = PropagatedMount.asInstanceOf[js.Any], WorkDir = WorkDir.asInstanceOf[js.Any], rootfs = rootfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfig]
  }
  @scala.inline
  implicit class PluginConfigOps[Self <: PluginConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: Args): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntrypoint(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entrypoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Array[PluginEnv]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterface(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinux(value: Linux): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Linux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounts(value: js.Array[PluginMount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagatedMount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropagatedMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootfs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(js.undefined)
        ret
    }
  }
  
}

