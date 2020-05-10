package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.AnonAttachStderr
import typingsSlinky.dockerode.AnonBridge
import typingsSlinky.dockerode.AnonData
import typingsSlinky.dockerode.AnonDead
import typingsSlinky.dockerode.AnonMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerInspectInfo extends js.Object {
  var AppArmorProfile: String = js.native
  var Args: js.Array[String] = js.native
  var Config: AnonAttachStderr = js.native
  var Created: String = js.native
  var Driver: String = js.native
  var ExecIDs: js.UndefOr[js.Any] = js.native
  var GraphDriver: AnonData = js.native
  var HostConfig: typingsSlinky.dockerode.mod.HostConfig = js.native
  var HostnamePath: String = js.native
  var HostsPath: String = js.native
  var Id: String = js.native
  var Image: String = js.native
  var LogPath: String = js.native
  var MountLabel: String = js.native
  var Mounts: js.Array[AnonMode] = js.native
  var Name: String = js.native
  var NetworkSettings: AnonBridge = js.native
  var Path: String = js.native
  var ProcessLabel: String = js.native
  var ResolvConfPath: String = js.native
  var RestartCount: Double = js.native
  var State: AnonDead = js.native
}

object ContainerInspectInfo {
  @scala.inline
  def apply(
    AppArmorProfile: String,
    Args: js.Array[String],
    Config: AnonAttachStderr,
    Created: String,
    Driver: String,
    GraphDriver: AnonData,
    HostConfig: HostConfig,
    HostnamePath: String,
    HostsPath: String,
    Id: String,
    Image: String,
    LogPath: String,
    MountLabel: String,
    Mounts: js.Array[AnonMode],
    Name: String,
    NetworkSettings: AnonBridge,
    Path: String,
    ProcessLabel: String,
    ResolvConfPath: String,
    RestartCount: Double,
    State: AnonDead
  ): ContainerInspectInfo = {
    val __obj = js.Dynamic.literal(AppArmorProfile = AppArmorProfile.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Driver = Driver.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], HostConfig = HostConfig.asInstanceOf[js.Any], HostnamePath = HostnamePath.asInstanceOf[js.Any], HostsPath = HostsPath.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], LogPath = LogPath.asInstanceOf[js.Any], MountLabel = MountLabel.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkSettings = NetworkSettings.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ProcessLabel = ProcessLabel.asInstanceOf[js.Any], ResolvConfPath = ResolvConfPath.asInstanceOf[js.Any], RestartCount = RestartCount.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInspectInfo]
  }
  @scala.inline
  implicit class ContainerInspectInfoOps[Self <: ContainerInspectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppArmorProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppArmorProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: AnonAttachStderr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphDriver(value: AnonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostConfig(value: HostConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostnamePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostnamePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounts(value: js.Array[AnonMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkSettings(value: AnonBridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvConfPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolvConfPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestartCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: AnonDead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecIDs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecIDs")(js.undefined)
        ret
    }
  }
  
}

