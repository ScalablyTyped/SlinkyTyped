package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.AnonDetails
import typingsSlinky.dockerode.AnonNameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockerVersion extends js.Object {
  var ApiVersion: String = js.native
  var Arch: String = js.native
  var BuildTime: js.Date = js.native
  var Components: js.Array[AnonDetails] = js.native
  var GitCommit: String = js.native
  var GoVersion: String = js.native
  var KernelVersion: String = js.native
  var MinAPIVersion: String = js.native
  var Os: String = js.native
  var Platform: AnonNameString = js.native
  var Version: String = js.native
}

object DockerVersion {
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: js.Date,
    Components: js.Array[AnonDetails],
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    MinAPIVersion: String,
    Os: String,
    Platform: AnonNameString,
    Version: String
  ): DockerVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Components = Components.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], MinAPIVersion = MinAPIVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerVersion]
  }
  @scala.inline
  implicit class DockerVersionOps[Self <: DockerVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: js.Array[AnonDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GitCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinAPIVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinAPIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: AnonNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

