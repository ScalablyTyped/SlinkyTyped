package typingsSlinky.pulumiAws.containerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDefinition extends js.Object {
  var command: js.UndefOr[js.Array[String]] = js.native
  var cpu: js.UndefOr[Double] = js.native
  var dependsOn: js.UndefOr[js.Array[ContainerDependency]] = js.native
  var disableNetworking: js.UndefOr[Boolean] = js.native
  var dnsSearchDomains: js.UndefOr[js.Array[String]] = js.native
  var dnsServers: js.UndefOr[js.Array[String]] = js.native
  var dockerLabels: js.UndefOr[StringDictionary[String]] = js.native
  var dockerSecurityOptions: js.UndefOr[js.Array[String]] = js.native
  var entryPoint: js.UndefOr[js.Array[String]] = js.native
  var environment: js.UndefOr[js.Array[KeyValuePair]] = js.native
  var essential: js.UndefOr[Boolean] = js.native
  var extraHosts: js.UndefOr[js.Array[HostEntry]] = js.native
  var firelensConfiguration: js.UndefOr[FirelensConfiguration] = js.native
  var healthCheck: js.UndefOr[HealthCheck] = js.native
  var hostname: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var interactive: js.UndefOr[Boolean] = js.native
  var links: js.UndefOr[js.Array[String]] = js.native
  var linuxParameters: js.UndefOr[LinuxParameters] = js.native
  var logConfiguration: js.UndefOr[LogConfiguration] = js.native
  var memory: js.UndefOr[Double] = js.native
  var memoryReservation: js.UndefOr[Double] = js.native
  var mountPoints: js.UndefOr[js.Array[MountPoint]] = js.native
  var name: String = js.native
  var portMappings: js.UndefOr[js.Array[PortMapping]] = js.native
  var privileged: js.UndefOr[Boolean] = js.native
  var pseudoTerminal: js.UndefOr[Boolean] = js.native
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.native
  var repositoryCredentials: js.UndefOr[RepositoryCredentials] = js.native
  var resourceRequirements: js.UndefOr[js.Array[ResourceRequirements]] = js.native
  var secrets: js.UndefOr[js.Array[Secret]] = js.native
  var startTimeout: js.UndefOr[Double] = js.native
  var stopTimeout: js.UndefOr[Double] = js.native
  var systemControls: js.UndefOr[js.Array[SystemControl]] = js.native
  var ulimits: js.UndefOr[js.Array[Ulimit]] = js.native
  var user: js.UndefOr[String] = js.native
  var volumesFrom: js.UndefOr[js.Array[VolumeFrom]] = js.native
  var workingDirectory: js.UndefOr[String] = js.native
}

object ContainerDefinition {
  @scala.inline
  def apply(name: String): ContainerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDefinition]
  }
  @scala.inline
  implicit class ContainerDefinitionOps[Self <: ContainerDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withCpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(js.undefined)
        ret
    }
    @scala.inline
    def withDependsOn(value: js.Array[ContainerDependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependsOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsOn")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNetworking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNetworking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNetworking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNetworking")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsSearchDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSearchDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsSearchDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSearchDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsServers")(js.undefined)
        ret
    }
    @scala.inline
    def withDockerLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDockerSecurityOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerSecurityOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerSecurityOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerSecurityOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPoint(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: js.Array[KeyValuePair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withEssential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("essential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEssential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("essential")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHosts(value: js.Array[HostEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withFirelensConfiguration(value: FirelensConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firelensConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirelensConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firelensConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheck(value: HealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withLinuxParameters(value: LinuxParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linuxParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinuxParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linuxParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConfiguration(value: LogConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryReservation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryReservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryReservation")(js.undefined)
        ret
    }
    @scala.inline
    def withMountPoints(value: js.Array[MountPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withPortMappings(value: js.Array[PortMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivileged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privileged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivileged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privileged")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudoTerminal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoTerminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudoTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoTerminal")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonlyRootFilesystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonlyRootFilesystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonlyRootFilesystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonlyRootFilesystem")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryCredentials(value: RepositoryCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRequirements(value: js.Array[ResourceRequirements]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRequirements")(js.undefined)
        ret
    }
    @scala.inline
    def withSecrets(value: js.Array[Secret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecrets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemControls(value: js.Array[SystemControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemControls")(js.undefined)
        ret
    }
    @scala.inline
    def withUlimits(value: js.Array[Ulimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ulimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUlimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ulimits")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumesFrom(value: js.Array[VolumeFrom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumesFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDirectory")(js.undefined)
        ret
    }
  }
  
}

