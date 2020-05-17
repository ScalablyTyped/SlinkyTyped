package typingsSlinky.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiVersion extends js.Object {
  var ApiVersion: String = js.native
  var Arch: String = js.native
  var BuildTime: js.Date = js.native
  var Experimental: String = js.native
  var GitCommit: String = js.native
  var GoVersion: String = js.native
  var KernelVersion: String = js.native
  var Os: String = js.native
}

object ApiVersion {
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: js.Date,
    Experimental: String,
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    Os: String
  ): ApiVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Experimental = Experimental.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
  @scala.inline
  implicit class ApiVersionOps[Self <: ApiVersion] (val x: Self) extends AnyVal {
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
    def withExperimental(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Experimental")(value.asInstanceOf[js.Any])
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
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Os")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

