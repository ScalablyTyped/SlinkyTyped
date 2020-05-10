package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskSet extends js.Object {
  /**
    * The capacity provider strategy associated with the task set.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The Amazon Resource Name (ARN) of the cluster that the service that hosts the task set exists in.
    */
  var clusterArn: js.UndefOr[String] = js.native
  /**
    * The computed desired count for the task set. This is calculated by multiplying the service's desiredCount by the task set's scale percentage. The result is always rounded up. For example, if the computed desired count is 1.2, it rounds up to 2 tasks.
    */
  var computedDesiredCount: js.UndefOr[Integer] = js.native
  /**
    * The Unix timestamp for when the task set was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The external ID associated with the task set. If a task set is created by an AWS CodeDeploy deployment, the externalId parameter contains the AWS CodeDeploy deployment ID. If a task set is created for an external deployment and is associated with a service discovery registry, the externalId parameter contains the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute.
    */
  var externalId: js.UndefOr[String] = js.native
  /**
    * The ID of the task set.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The launch type the tasks in the task set are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * Details on a load balancer that is used with a task set.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.native
  /**
    * The network configuration for the task set.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * The number of tasks in the task set that are in the PENDING status during a deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time or when it is restarted after being in the STOPPED state.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  /**
    * The platform version on which the tasks in the task set are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The number of tasks in the task set that are in the RUNNING status during a deployment. A task in the RUNNING state is running and ready for use.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  /**
    * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
    */
  var scale: js.UndefOr[Scale] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service the task set exists in.
    */
  var serviceArn: js.UndefOr[String] = js.native
  /**
    * The details of the service discovery registries to assign to this task set. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.native
  /**
    * The stability status, which indicates whether the task set has reached a steady state. If the following conditions are met, the task set will be in STEADY_STATE:   The task runningCount is equal to the computedDesiredCount.   The pendingCount is 0.   There are no tasks running on container instances in the DRAINING status.   All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.   If any of those conditions are not met, the stability status returns STABILIZING.
    */
  var stabilityStatus: js.UndefOr[StabilityStatus] = js.native
  /**
    * The Unix timestamp for when the task set stability status was retrieved.
    */
  var stabilityStatusAt: js.UndefOr[js.Date] = js.native
  /**
    * The tag specified when a task set is started. If the task set is created by an AWS CodeDeploy deployment, the startedBy parameter is CODE_DEPLOY. For a task set created for an external deployment, the startedBy field isn't used.
    */
  var startedBy: js.UndefOr[String] = js.native
  /**
    * The status of the task set. The following describes each state:  PRIMARY  The task set is serving production traffic.  ACTIVE  The task set is not serving production traffic.  DRAINING  The tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.  
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The metadata that you apply to the task set to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The task definition the task set is using.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task set.
    */
  var taskSetArn: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task set was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.native
}

object TaskSet {
  @scala.inline
  def apply(): TaskSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskSet]
  }
  @scala.inline
  implicit class TaskSetOps[Self <: TaskSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityProviderStrategy(value: CapacityProviderStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviderStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityProviderStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviderStrategy")(js.undefined)
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
    def withComputedDesiredCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedDesiredCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputedDesiredCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computedDesiredCount")(js.undefined)
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
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withLoadBalancers(value: LoadBalancers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancers")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConfiguration(value: NetworkConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingCount")(js.undefined)
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
    def withRunningCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningCount")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRegistries(value: ServiceRegistries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRegistries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRegistries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRegistries")(js.undefined)
        ret
    }
    @scala.inline
    def withStabilityStatus(value: StabilityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilityStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStabilityStatusAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilityStatusAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStabilityStatusAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilityStatusAt")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    def withTaskDefinition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSetArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(js.undefined)
        ret
    }
  }
  
}

