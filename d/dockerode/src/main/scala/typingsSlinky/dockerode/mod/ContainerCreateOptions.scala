package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dockerode.AnonEndpointsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerCreateOptions extends js.Object {
  var AttachStderr: js.UndefOr[Boolean] = js.native
  var AttachStdin: js.UndefOr[Boolean] = js.native
  var AttachStdout: js.UndefOr[Boolean] = js.native
  var Cmd: js.UndefOr[js.Array[String]] = js.native
  var Domainname: js.UndefOr[String] = js.native
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.native
  var Env: js.UndefOr[js.Array[String]] = js.native
  var ExposedPorts: js.UndefOr[StringDictionary[js.Object]] = js.native
  var HostConfig: js.UndefOr[typingsSlinky.dockerode.mod.HostConfig] = js.native
  var Hostname: js.UndefOr[String] = js.native
  var Image: js.UndefOr[String] = js.native
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  var MacAddress: js.UndefOr[Boolean] = js.native
  var NetworkDisabled: js.UndefOr[Boolean] = js.native
  var NetworkingConfig: js.UndefOr[AnonEndpointsConfig] = js.native
  var OpenStdin: js.UndefOr[Boolean] = js.native
  var StdinOnce: js.UndefOr[Boolean] = js.native
  var StopSignal: js.UndefOr[String] = js.native
  var StopTimeout: js.UndefOr[Double] = js.native
  var Tty: js.UndefOr[Boolean] = js.native
  var User: js.UndefOr[String] = js.native
  var Volumes: js.UndefOr[StringDictionary[js.Object]] = js.native
  var WorkingDir: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object ContainerCreateOptions {
  @scala.inline
  def apply(): ContainerCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerCreateOptions]
  }
  @scala.inline
  implicit class ContainerCreateOptionsOps[Self <: ContainerCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachStderr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachStderr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStderr")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStdin")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachStdout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachStdout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachStdout")(js.undefined)
        ret
    }
    @scala.inline
    def withCmd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cmd")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domainname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domainname")(js.undefined)
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
    @scala.inline
    def withEnv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Env")(js.undefined)
        ret
    }
    @scala.inline
    def withExposedPorts(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposedPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposedPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposedPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withHostConfig(value: HostConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMacAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkingConfig(value: AnonEndpointsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenStdin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenStdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenStdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStdinOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdinOnce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdinOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StdinOnce")(js.undefined)
        ret
    }
    @scala.inline
    def withStopSignal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopSignal")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tty")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
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
    @scala.inline
    def withVolumes(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volumes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingDir")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

