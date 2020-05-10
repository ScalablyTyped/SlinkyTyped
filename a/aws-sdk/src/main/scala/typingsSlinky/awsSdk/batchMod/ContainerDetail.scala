package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDetail extends js.Object {
  /**
    * The command that is passed to the container.
    */
  var command: js.UndefOr[StringList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the container instance on which the container is running.
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The environment variables to pass to a container.  Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The exit code to return upon completion.
    */
  var exitCode: js.UndefOr[Integer] = js.native
  /**
    * The image used to start the container.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The instance type of the underlying host infrastructure of a multi-node parallel job.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) associated with the job upon execution.
    */
  var jobRoleArn: js.UndefOr[String] = js.native
  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.native
  /**
    * The name of the CloudWatch Logs log stream associated with the container. The log group for AWS Batch jobs is /aws/batch/job. Each container attempt receives a log stream name when they reach the RUNNING status.
    */
  var logStreamName: js.UndefOr[String] = js.native
  /**
    * The number of MiB of memory reserved for the job.
    */
  var memory: js.UndefOr[Integer] = js.native
  /**
    * The mount points for data volumes in your container.
    */
  var mountPoints: js.UndefOr[MountPoints] = js.native
  /**
    * The network interfaces associated with the job.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.native
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user).
    */
  var privileged: js.UndefOr[Boolean] = js.native
  /**
    * When this parameter is true, the container is given read-only access to its root file system.
    */
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.native
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon ECS task that is associated with the container job. Each container attempt receives a task ARN when they reach the STARTING status.
    */
  var taskArn: js.UndefOr[String] = js.native
  /**
    * A list of ulimit values to set in the container.
    */
  var ulimits: js.UndefOr[Ulimits] = js.native
  /**
    * The user name to use inside the container.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * The number of VCPUs allocated for the job.
    */
  var vcpus: js.UndefOr[Integer] = js.native
  /**
    * A list of volumes associated with the job.
    */
  var volumes: js.UndefOr[Volumes] = js.native
}

object ContainerDetail {
  @scala.inline
  def apply(): ContainerDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDetail]
  }
  @scala.inline
  implicit class ContainerDetailOps[Self <: ContainerDetail] (val x: Self) extends AnyVal {
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
    def withContainerInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstanceArn")(js.undefined)
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
    def withExitCode(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(js.undefined)
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
    def withLogStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(js.undefined)
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
    def withNetworkInterfaces(value: NetworkInterfaceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(js.undefined)
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
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
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
    def withTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskArn")(js.undefined)
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

