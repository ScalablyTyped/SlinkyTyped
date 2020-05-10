package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProperties extends js.Object {
  /**
    * The command that is passed to the container. This parameter maps to Cmd in the Create a container section of the Docker Remote API and the COMMAND parameter to docker run. For more information, see https://docs.docker.com/engine/reference/builder/#cmd.
    */
  var command: js.UndefOr[StringList] = js.native
  /**
    * The environment variables to pass to a container. This parameter maps to Env in the Create a container section of the Docker Remote API and the --env option to docker run.  We do not recommend using plaintext environment variables for sensitive information, such as credential data.   Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker Hub registry are available by default. Other repositories are specified with  repository-url/image:tag . Up to 255 letters (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter maps to Image in the Create a container section of the Docker Remote API and the IMAGE parameter of docker run.   Images in Amazon ECR repositories use the full registry and repository URI (for example, 012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;).   Images in official repositories on Docker Hub use a single name (for example, ubuntu or mongo).   Images in other repositories on Docker Hub are qualified with an organization name (for example, amazon/amazon-ecs-agent).   Images in other online repositories are qualified further by a domain name (for example, quay.io/assemblyline/ubuntu).  
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job must use the same instance type. This parameter is not valid for single-node container jobs.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
    */
  var jobRoleArn: js.UndefOr[String] = js.native
  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.native
  /**
    * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed. This parameter maps to Memory in the Create a container section of the Docker Remote API and the --memory option to docker run. You must specify at least 4 MiB of memory for a job.  If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a particular instance type, see Memory Management in the AWS Batch User Guide. 
    */
  var memory: js.UndefOr[Integer] = js.native
  /**
    * The mount points for data volumes in your container. This parameter maps to Volumes in the Create a container section of the Docker Remote API and the --volume option to docker run.
    */
  var mountPoints: js.UndefOr[MountPoints] = js.native
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user). This parameter maps to Privileged in the Create a container section of the Docker Remote API and the --privileged option to docker run.
    */
  var privileged: js.UndefOr[Boolean] = js.native
  /**
    * When this parameter is true, the container is given read-only access to its root file system. This parameter maps to ReadonlyRootfs in the Create a container section of the Docker Remote API and the --read-only option to docker run.
    */
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.native
  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
  /**
    * A list of ulimits to set in the container. This parameter maps to Ulimits in the Create a container section of the Docker Remote API and the --ulimit option to docker run.
    */
  var ulimits: js.UndefOr[Ulimits] = js.native
  /**
    * The user name to use inside the container. This parameter maps to User in the Create a container section of the Docker Remote API and the --user option to docker run.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * The number of vCPUs reserved for the container. This parameter maps to CpuShares in the Create a container section of the Docker Remote API and the --cpu-shares option to docker run. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
    */
  var vcpus: js.UndefOr[Integer] = js.native
  /**
    * A list of data volumes used in a job.
    */
  var volumes: js.UndefOr[Volumes] = js.native
}

object ContainerProperties {
  @scala.inline
  def apply(): ContainerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProperties]
  }
  @scala.inline
  implicit class ContainerPropertiesOps[Self <: ContainerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: StringList): Self = {
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
    def withEnvironment(value: EnvironmentVariables): Self = {
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
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withJobRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobRoleArn")(js.undefined)
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
    def withMemory(value: Integer): Self = {
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
    def withMountPoints(value: MountPoints): Self = {
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
    def withResourceRequirements(value: ResourceRequirements): Self = {
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
    def withUlimits(value: Ulimits): Self = {
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
    def withVcpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcpus")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: Volumes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

