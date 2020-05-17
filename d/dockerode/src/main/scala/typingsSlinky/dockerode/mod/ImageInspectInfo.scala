package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.ArgsEscaped
import typingsSlinky.dockerode.anon.AttachStdin
import typingsSlinky.dockerode.anon.BaseLayer
import typingsSlinky.dockerode.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInspectInfo extends js.Object {
  var Architecture: String = js.native
  var Author: String = js.native
  var Comment: String = js.native
  var Config: AttachStdin = js.native
  var Container: String = js.native
  var ContainerConfig: ArgsEscaped = js.native
  var Created: String = js.native
  var DockerVersion: String = js.native
  var GraphDriver: Data = js.native
  var Id: String = js.native
  var Os: String = js.native
  var Parent: String = js.native
  var RepoDigests: js.Array[String] = js.native
  var RepoTags: js.Array[String] = js.native
  var RootFS: BaseLayer = js.native
  var Size: Double = js.native
  var VirtualSize: Double = js.native
}

object ImageInspectInfo {
  @scala.inline
  def apply(
    Architecture: String,
    Author: String,
    Comment: String,
    Config: AttachStdin,
    Container: String,
    ContainerConfig: ArgsEscaped,
    Created: String,
    DockerVersion: String,
    GraphDriver: Data,
    Id: String,
    Os: String,
    Parent: String,
    RepoDigests: js.Array[String],
    RepoTags: js.Array[String],
    RootFS: BaseLayer,
    Size: Double,
    VirtualSize: Double
  ): ImageInspectInfo = {
    val __obj = js.Dynamic.literal(Architecture = Architecture.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Container = Container.asInstanceOf[js.Any], ContainerConfig = ContainerConfig.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], DockerVersion = DockerVersion.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepoDigests = RepoDigests.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any], RootFS = RootFS.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInspectInfo]
  }
  @scala.inline
  implicit class ImageInspectInfoOps[Self <: ImageInspectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: AttachStdin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerConfig(value: ArgsEscaped): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DockerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphDriver(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepoDigests(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepoDigests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepoTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepoTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFS(value: BaseLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootFS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VirtualSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

