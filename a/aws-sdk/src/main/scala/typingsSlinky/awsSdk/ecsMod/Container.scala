package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the container.
    */
  var containerArn: js.UndefOr[String] = js.native
  /**
    * The number of CPU units set for the container. The value will be 0 if no value was specified in the container definition when the task definition was registered.
    */
  var cpu: js.UndefOr[String] = js.native
  /**
    * The exit code returned from the container.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  /**
    * The IDs of each GPU assigned to the container.
    */
  var gpuIds: js.UndefOr[GpuIds] = js.native
  /**
    * The health status of the container. If health checks are not configured for this container in its task definition, then it reports the health status as UNKNOWN.
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.native
  /**
    * The image used for the container.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The container image manifest digest.  The imageDigest is only returned if the container is using an image hosted in Amazon ECR, otherwise it is omitted. 
    */
  var imageDigest: js.UndefOr[String] = js.native
  /**
    * The last known status of the container.
    */
  var lastStatus: js.UndefOr[String] = js.native
  /**
    * The hard limit (in MiB) of memory set for the container.
    */
  var memory: js.UndefOr[String] = js.native
  /**
    * The soft limit (in MiB) of memory set for the container.
    */
  var memoryReservation: js.UndefOr[String] = js.native
  /**
    * The name of the container.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The network bindings associated with the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  /**
    * The network interfaces associated with the container.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.native
  /**
    * A short (255 max characters) human-readable string to provide additional details about a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  /**
    * The ARN of the task.
    */
  var taskArn: js.UndefOr[String] = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCpu(value: String): Self = {
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
    def withExitCode(value: BoxedInteger): Self = {
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
    def withGpuIds(value: GpuIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGpuIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpuIds")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthStatus(value: HealthStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(js.undefined)
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
    def withImageDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: String): Self = {
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
    def withMemoryReservation(value: String): Self = {
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
    @scala.inline
    def withNetworkBindings(value: NetworkBindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: NetworkInterfaces): Self = {
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
    def withRuntimeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeId")(js.undefined)
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
  }
  
}

