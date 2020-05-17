package typingsSlinky.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachStdin extends js.Object {
  var ArgsEscaped: Boolean = js.native
  var AttachStderr: Boolean = js.native
  var AttachStdin: Boolean = js.native
  var AttachStdout: Boolean = js.native
  var Cmd: js.Array[String] = js.native
  var Domainname: String = js.native
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.native
  var Env: js.Array[String] = js.native
  var ExposedPorts: StringDictionary[js.Object] = js.native
  var Hostname: String = js.native
  var Image: String = js.native
  var Labels: StringDictionary[String] = js.native
  var OnBuild: js.Array[_] = js.native
  var OpenStdin: Boolean = js.native
  var StdinOnce: Boolean = js.native
  var Tty: Boolean = js.native
  var User: String = js.native
  var Volumes: StringDictionary[js.Object] = js.native
  var WorkingDir: String = js.native
}

object AttachStdin {
  @scala.inline
  def apply(
    ArgsEscaped: Boolean,
    AttachStderr: Boolean,
    AttachStdin: Boolean,
    AttachStdout: Boolean,
    Cmd: js.Array[String],
    Domainname: String,
    Env: js.Array[String],
    ExposedPorts: StringDictionary[js.Object],
    Hostname: String,
    Image: String,
    Labels: StringDictionary[String],
    OnBuild: js.Array[_],
    OpenStdin: Boolean,
    StdinOnce: Boolean,
    Tty: Boolean,
    User: String,
    Volumes: StringDictionary[js.Object],
    WorkingDir: String
  ): AttachStdin = {
    val __obj = js.Dynamic.literal(ArgsEscaped = ArgsEscaped.asInstanceOf[js.Any], AttachStderr = AttachStderr.asInstanceOf[js.Any], AttachStdin = AttachStdin.asInstanceOf[js.Any], AttachStdout = AttachStdout.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Domainname = Domainname.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], ExposedPorts = ExposedPorts.asInstanceOf[js.Any], Hostname = Hostname.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], OnBuild = OnBuild.asInstanceOf[js.Any], OpenStdin = OpenStdin.asInstanceOf[js.Any], StdinOnce = StdinOnce.asInstanceOf[js.Any], Tty = Tty.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Volumes = Volumes.asInstanceOf[js.Any], WorkingDir = WorkingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachStdin]
  }
  @scala.inline
  implicit class AttachStdinOps[Self <: AttachStdin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgsEscaped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArgsEscaped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachStderr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachStdout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domainname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposedPorts(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposedPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBuild(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenStdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdinOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdinOnce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumes(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkingDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntrypoint(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entrypoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrypoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entrypoint")(js.undefined)
        ret
    }
  }
  
}

