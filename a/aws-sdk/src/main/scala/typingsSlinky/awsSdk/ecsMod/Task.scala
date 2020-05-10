package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * The Elastic Network Adapter associated with the task if the task uses the awsvpc network mode.
    */
  var attachments: js.UndefOr[Attachments] = js.native
  /**
    * The attributes of the task
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * The availability zone of the task.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * The capacity provider associated with the task.
    */
  var capacityProviderName: js.UndefOr[String] = js.native
  /**
    * The ARN of the cluster that hosts the task.
    */
  var clusterArn: js.UndefOr[String] = js.native
  /**
    * The connectivity status of a task.
    */
  var connectivity: js.UndefOr[Connectivity] = js.native
  /**
    * The Unix timestamp for when the task last went into CONNECTED status.
    */
  var connectivityAt: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the container instances that host the task.
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The containers associated with the task.
    */
  var containers: js.UndefOr[Containers] = js.native
  /**
    * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer using CPU units, for example 1024. It can also be expressed as a string using vCPUs, for example 1 vCPU or 1 vcpu. String values are converted to an integer indicating the CPU units when the task definition is registered. If you are using the EC2 launch type, this field is optional. Supported values are between 128 CPU units (0.125 vCPUs) and 10240 CPU units (10 vCPUs). If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the memory parameter:   256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)   512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)   1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)   2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)   4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)  
    */
  var cpu: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task was created (the task entered the PENDING state).
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The desired status of the task. For more information, see Task Lifecycle.
    */
  var desiredStatus: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the task group associated with the task.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * The health status for the task, which is determined by the health of the essential containers in the task. If all essential containers in the task are reporting as HEALTHY, then the task status also reports as HEALTHY. If any essential containers in the task are reporting as UNHEALTHY or UNKNOWN, then the task status also reports as UNHEALTHY or UNKNOWN, accordingly.  The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in the container definition. Health check parameters that are specified in a container definition override any Docker health checks that exist in the container image. 
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.native
  /**
    * The Elastic Inference accelerator associated with the task.
    */
  var inferenceAccelerators: js.UndefOr[InferenceAccelerators] = js.native
  /**
    * The last known status of the task. For more information, see Task Lifecycle.
    */
  var lastStatus: js.UndefOr[String] = js.native
  /**
    * The launch type on which your task is running. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as an integer using MiB, for example 1024. It can also be expressed as a string using GB, for example 1GB or 1 GB. String values are converted to an integer indicating the MiB when the task definition is registered. If you are using the EC2 launch type, this field is optional. If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the cpu parameter:   512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)   1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)   2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available cpu values: 1024 (1 vCPU)   Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048 (2 vCPU)   Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096 (4 vCPU)  
    */
  var memory: js.UndefOr[String] = js.native
  /**
    * One or more container overrides.
    */
  var overrides: js.UndefOr[TaskOverride] = js.native
  /**
    * The platform version on which your task is running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[js.Date] = js.native
  /**
    * The Unix timestamp for when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[js.Date] = js.native
  /**
    * The Unix timestamp for when the task started (the task transitioned from the PENDING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[js.Date] = js.native
  /**
    * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the startedBy parameter contains the deployment ID of the service that starts it.
    */
  var startedBy: js.UndefOr[String] = js.native
  /**
    * The stop code indicating why a task was stopped. The stoppedReason may contain additional details.
    */
  var stopCode: js.UndefOr[TaskStopCode] = js.native
  /**
    * The Unix timestamp for when the task was stopped (the task transitioned from the RUNNING state to the STOPPED state).
    */
  var stoppedAt: js.UndefOr[js.Date] = js.native
  /**
    * The reason that the task was stopped.
    */
  var stoppedReason: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task stops (transitions from the RUNNING state to STOPPED).
    */
  var stoppingAt: js.UndefOr[js.Date] = js.native
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var taskArn: js.UndefOr[String] = js.native
  /**
    * The ARN of the task definition that creates the task.
    */
  var taskDefinitionArn: js.UndefOr[String] = js.native
  /**
    * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch Events, you can compare the version of a task reported by the Amazon ECS API actions with the version reported in CloudWatch Events for the task (inside the detail object) to verify that the version in your event stream is current.
    */
  var version: js.UndefOr[Long] = js.native
}

object Task {
  @scala.inline
  def apply(): Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: Attachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacityProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviderName")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectivity(value: Connectivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectivityAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivityAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectivityAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivityAt")(js.undefined)
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
    def withContainers(value: Containers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(js.undefined)
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
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStoppedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStoppedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStoppedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStoppedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
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
    def withInferenceAccelerators(value: InferenceAccelerators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceAccelerators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferenceAccelerators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferenceAccelerators")(js.undefined)
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
    def withLaunchType(value: LaunchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchType")(js.undefined)
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
    def withOverrides(value: TaskOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPullStartedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullStartedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullStartedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withPullStoppedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullStoppedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullStoppedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullStoppedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStopCode(value: TaskStopCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppedReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppedReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedReason")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppingAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppingAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppingAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppingAt")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
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
    def withTaskDefinitionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskDefinitionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinitionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

