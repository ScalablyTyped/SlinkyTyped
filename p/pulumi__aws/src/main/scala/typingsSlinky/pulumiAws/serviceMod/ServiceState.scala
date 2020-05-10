package typingsSlinky.pulumiAws.serviceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ecs.ServiceCapacityProviderStrategy
import typingsSlinky.pulumiAws.inputMod.ecs.ServiceDeploymentController
import typingsSlinky.pulumiAws.inputMod.ecs.ServiceLoadBalancer
import typingsSlinky.pulumiAws.inputMod.ecs.ServiceNetworkConfiguration
import typingsSlinky.pulumiAws.inputMod.ecs.ServiceOrderedPlacementStrategy
import typingsSlinky.pulumiAws.inputMod.ecs.ServicePlacementConstraint
import typingsSlinky.pulumiAws.inputMod.ecs.ServiceServiceRegistries
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceState extends js.Object {
  /**
    * The capacity provider strategy to use for the service. Can be one or more.  Defined below.
    */
  val capacityProviderStrategies: js.UndefOr[Input[js.Array[Input[ServiceCapacityProviderStrategy]]]] = js.native
  /**
    * ARN of an ECS cluster
    */
  val cluster: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing deployment controller configuration. Defined below.
    */
  val deploymentController: js.UndefOr[Input[ServiceDeploymentController]] = js.native
  /**
    * The upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
    */
  val deploymentMaximumPercent: js.UndefOr[Input[Double]] = js.native
  /**
    * The lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
    */
  val deploymentMinimumHealthyPercent: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
    */
  val desiredCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
    */
  val enableEcsManagedTags: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
    */
  val healthCheckGracePeriodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
    */
  val iamRole: js.UndefOr[Input[String]] = js.native
  /**
    * The launch type on which to run your service. The valid values are `EC2` and `FARGATE`. Defaults to `EC2`.
    */
  val launchType: js.UndefOr[Input[String]] = js.native
  /**
    * A load balancer block. Load balancers documented below.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[ServiceLoadBalancer]]]] = js.native
  /**
    * The name of the service (up to 255 letters, numbers, hyphens, and underscores)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes.
    */
  val networkConfiguration: js.UndefOr[Input[ServiceNetworkConfiguration]] = js.native
  /**
    * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. The maximum number of `orderedPlacementStrategy` blocks is `5`. Defined below.
    */
  val orderedPlacementStrategies: js.UndefOr[Input[js.Array[Input[ServiceOrderedPlacementStrategy]]]] = js.native
  /**
    * rules that are taken into consideration during task placement. Maximum number of
    * `placementConstraints` is `10`. Defined below.
    */
  val placementConstraints: js.UndefOr[Input[js.Array[Input[ServicePlacementConstraint]]]] = js.native
  /**
    * The platform version on which to run your service. Only applicable for `launchType` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
    */
  val platformVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
    */
  val propagateTags: js.UndefOr[Input[String]] = js.native
  /**
    * The scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Fargate tasks do not support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html).
    */
  val schedulingStrategy: js.UndefOr[Input[String]] = js.native
  /**
    * The service discovery registries for the service. The maximum number of `serviceRegistries` blocks is `1`.
    */
  val serviceRegistries: js.UndefOr[Input[ServiceServiceRegistries]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
    */
  val taskDefinition: js.UndefOr[Input[String]] = js.native
  /**
    * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
    */
  val waitForSteadyState: js.UndefOr[Input[Boolean]] = js.native
}

object ServiceState {
  @scala.inline
  def apply(): ServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceState]
  }
  @scala.inline
  implicit class ServiceStateOps[Self <: ServiceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityProviderStrategies(value: Input[js.Array[Input[ServiceCapacityProviderStrategy]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviderStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityProviderStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviderStrategies")(js.undefined)
        ret
    }
    @scala.inline
    def withCluster(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentController(value: Input[ServiceDeploymentController]): Self = {
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
    def withDeploymentMaximumPercent(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentMaximumPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentMaximumPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentMaximumPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentMinimumHealthyPercent(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentMinimumHealthyPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentMinimumHealthyPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentMinimumHealthyPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredCount(value: Input[Double]): Self = {
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
    def withEnableEcsManagedTags(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEcsManagedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEcsManagedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEcsManagedTags")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckGracePeriodSeconds(value: Input[Double]): Self = {
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
    def withIamRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRole")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchType(value: Input[String]): Self = {
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
    def withLoadBalancers(value: Input[js.Array[Input[ServiceLoadBalancer]]]): Self = {
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
    def withName(value: Input[String]): Self = {
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
    def withNetworkConfiguration(value: Input[ServiceNetworkConfiguration]): Self = {
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
    def withOrderedPlacementStrategies(value: Input[js.Array[Input[ServiceOrderedPlacementStrategy]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedPlacementStrategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderedPlacementStrategies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderedPlacementStrategies")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementConstraints(value: Input[js.Array[Input[ServicePlacementConstraint]]]): Self = {
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
    def withPlatformVersion(value: Input[String]): Self = {
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
    def withPropagateTags(value: Input[String]): Self = {
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
    def withSchedulingStrategy(value: Input[String]): Self = {
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
    def withServiceRegistries(value: Input[ServiceServiceRegistries]): Self = {
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withTaskDefinition(value: Input[String]): Self = {
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
    def withWaitForSteadyState(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSteadyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSteadyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSteadyState")(js.undefined)
        ret
    }
  }
  
}

