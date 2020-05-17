package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dockerode.anon.Destination
import typingsSlinky.dockerode.anon.NetworkMode
import typingsSlinky.dockerode.anon.Networks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerInfo extends js.Object {
  var Command: String = js.native
  var Created: Double = js.native
  var HostConfig: NetworkMode = js.native
  var Id: String = js.native
  var Image: String = js.native
  var ImageID: String = js.native
  var Labels: StringDictionary[String] = js.native
  var Mounts: js.Array[Destination] = js.native
  var Names: js.Array[String] = js.native
  var NetworkSettings: Networks = js.native
  var Ports: js.Array[Port] = js.native
  var State: String = js.native
  var Status: String = js.native
}

object ContainerInfo {
  @scala.inline
  def apply(
    Command: String,
    Created: Double,
    HostConfig: NetworkMode,
    Id: String,
    Image: String,
    ImageID: String,
    Labels: StringDictionary[String],
    Mounts: js.Array[Destination],
    Names: js.Array[String],
    NetworkSettings: Networks,
    Ports: js.Array[Port],
    State: String,
    Status: String
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], HostConfig = HostConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], ImageID = ImageID.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any], NetworkSettings = NetworkSettings.asInstanceOf[js.Any], Ports = Ports.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInfo]
  }
  @scala.inline
  implicit class ContainerInfoOps[Self <: ContainerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostConfig(value: NetworkMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostConfig")(value.asInstanceOf[js.Any])
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
    def withImageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounts(value: js.Array[Destination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkSettings(value: Networks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[Port]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

