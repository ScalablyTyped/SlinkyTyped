package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends StObject {
  
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
    * The scheduling strategy to use for the service. For more information, see Services. There are two service scheduler strategies available:    REPLICA-The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions.    DAEMON-The daemon scheduling strategy deploys exactly one task on each active container instance that meets all of the task placement constraints that you specify in your cluster. The service scheduler also evaluates the task placement constraints for running tasks and will stop tasks that do not meet the placement constraints.  Fargate tasks do not support the DAEMON scheduling strategy.   
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
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setDeploymentConfiguration(value: DeploymentConfiguration): Self = StObject.set(x, "deploymentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigurationUndefined: Self = StObject.set(x, "deploymentConfiguration", js.undefined)
    
    @scala.inline
    def setDeploymentController(value: DeploymentController): Self = StObject.set(x, "deploymentController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentControllerUndefined: Self = StObject.set(x, "deploymentController", js.undefined)
    
    @scala.inline
    def setDeployments(value: Deployments): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: Deployment*): Self = StObject.set(x, "deployments", js.Array(value :_*))
    
    @scala.inline
    def setDesiredCount(value: Integer): Self = StObject.set(x, "desiredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCountUndefined: Self = StObject.set(x, "desiredCount", js.undefined)
    
    @scala.inline
    def setEnableECSManagedTags(value: Boolean): Self = StObject.set(x, "enableECSManagedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableECSManagedTagsUndefined: Self = StObject.set(x, "enableECSManagedTags", js.undefined)
    
    @scala.inline
    def setEvents(value: ServiceEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: ServiceEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setHealthCheckGracePeriodSeconds(value: BoxedInteger): Self = StObject.set(x, "healthCheckGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckGracePeriodSecondsUndefined: Self = StObject.set(x, "healthCheckGracePeriodSeconds", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
    
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    @scala.inline
    def setPendingCount(value: Integer): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    @scala.inline
    def setPlacementConstraints(value: PlacementConstraints): Self = StObject.set(x, "placementConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementConstraintsUndefined: Self = StObject.set(x, "placementConstraints", js.undefined)
    
    @scala.inline
    def setPlacementConstraintsVarargs(value: PlacementConstraint*): Self = StObject.set(x, "placementConstraints", js.Array(value :_*))
    
    @scala.inline
    def setPlacementStrategy(value: PlacementStrategies): Self = StObject.set(x, "placementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategyUndefined: Self = StObject.set(x, "placementStrategy", js.undefined)
    
    @scala.inline
    def setPlacementStrategyVarargs(value: PlacementStrategy*): Self = StObject.set(x, "placementStrategy", js.Array(value :_*))
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setPropagateTags(value: PropagateTags): Self = StObject.set(x, "propagateTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagateTagsUndefined: Self = StObject.set(x, "propagateTags", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setRunningCount(value: Integer): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    @scala.inline
    def setSchedulingStrategy(value: SchedulingStrategy): Self = StObject.set(x, "schedulingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingStrategyUndefined: Self = StObject.set(x, "schedulingStrategy", js.undefined)
    
    @scala.inline
    def setServiceArn(value: String): Self = StObject.set(x, "serviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceArnUndefined: Self = StObject.set(x, "serviceArn", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setServiceRegistries(value: ServiceRegistries): Self = StObject.set(x, "serviceRegistries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRegistriesUndefined: Self = StObject.set(x, "serviceRegistries", js.undefined)
    
    @scala.inline
    def setServiceRegistriesVarargs(value: ServiceRegistry*): Self = StObject.set(x, "serviceRegistries", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
    
    @scala.inline
    def setTaskSets(value: TaskSets): Self = StObject.set(x, "taskSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetsUndefined: Self = StObject.set(x, "taskSets", js.undefined)
    
    @scala.inline
    def setTaskSetsVarargs(value: TaskSet*): Self = StObject.set(x, "taskSets", js.Array(value :_*))
  }
}
