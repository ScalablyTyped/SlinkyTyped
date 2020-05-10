package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * The capacity provider strategy associated with the service.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The Amazon Resource Name (ARN) of the cluster that hosts the service.
    */
  var clusterArn: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the service was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The principal that created the service.
    */
  var createdBy: js.UndefOr[String] = js.native
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.native
  /**
    * The deployment controller type the service is using. When using the DescribeServices API, this field is omitted if the service is using the ECS deployment controller type.
    */
  var deploymentController: js.UndefOr[DeploymentController] = js.native
  /**
    * The current state of deployments for the service.
    */
  var deployments: js.UndefOr[Deployments] = js.native
  /**
    * The desired number of instantiations of the task definition to keep running on the service. This value is specified when the service is created with CreateService, and it can be modified with UpdateService.
    */
  var desiredCount: js.UndefOr[Integer] = js.native
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks in the service. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.native
  /**
    * The event stream for your service. A maximum of 100 of the latest events are displayed.
    */
  var events: js.UndefOr[ServiceEvents] = js.native
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first started.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.native
  /**
    * The launch type on which your service is running. If no value is specified, it will default to EC2. Valid values include EC2 and FARGATE. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as it appears in a container definition), and the container port to access from the load balancer.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.native
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  /**
    * The placement constraints for the tasks in the service.
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.native
  /**
    * The placement strategy that determines how tasks for the service are placed.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.native
  /**
    * The platform version on which to run your service. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the task. If no value is specified, the tags are not propagated.
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.native
  /**
    * The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register container instances with an Elastic Load Balancing load balancer.
    */
  var roleArn: js.UndefOr[String] = js.native
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  /**
    * The scheduling strategy to use for the service. For more information, see Services. There are two service scheduler strategies available:    REPLICA-The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions.    DAEMON-The daemon scheduling strategy deploys exactly one task on each container instance in your cluster. When you are using this strategy, do not specify a desired number of tasks or any task placement strategies.  Fargate tasks do not support the DAEMON scheduling strategy.   
    */
  var schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.native
  /**
    * The ARN that identifies the service. The ARN contains the arn:aws:ecs namespace, followed by the Region of the service, the AWS account ID of the service owner, the service namespace, and then the service name. For example, arn:aws:ecs:region:012345678910:service/my-service.
    */
  var serviceArn: js.UndefOr[String] = js.native
  /**
    * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple clusters within a Region or across multiple Regions.
    */
  var serviceName: js.UndefOr[String] = js.native
  /**
    * The details of the service discovery registries to assign to this service. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.native
  /**
    * The status of the service. The valid values are ACTIVE, DRAINING, or INACTIVE.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The task definition to use for tasks in the service. This value is specified when the service is created with CreateService, and it can be modified with UpdateService.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  /**
    * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an EXTERNAL deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
    */
  var taskSets: js.UndefOr[TaskSets] = js.native
}

object Service {
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
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
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentConfiguration(value: DeploymentConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentController(value: DeploymentController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentController")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployments(value: Deployments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployments")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableECSManagedTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableECSManagedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableECSManagedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableECSManagedTags")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: ServiceEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckGracePeriodSeconds(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckGracePeriodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckGracePeriodSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckGracePeriodSeconds")(js.undefined)
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
    def withPlacementConstraints(value: PlacementConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementStrategy(value: PlacementStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementStrategy")(js.undefined)
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
    def withPropagateTags(value: PropagateTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagateTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
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
    def withSchedulingStrategy(value: SchedulingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedulingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulingStrategy")(js.undefined)
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
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
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
    def withTaskSets(value: TaskSets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSets")(js.undefined)
        ret
    }
  }
  
}

