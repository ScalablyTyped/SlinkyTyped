package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceRequest extends js.Object {
  /**
    * The capacity provider strategy to update the service to use. If the service is using the default capacity provider strategy for the cluster, the service can be updated to use one or more capacity providers. However, when a service is using a non-default capacity provider strategy, the service cannot be updated to use the cluster's default capacity provider strategy. 
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your service is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.native
  /**
    * The number of instantiations of the task to place and keep running in your service.
    */
  var desiredCount: js.UndefOr[BoxedInteger] = js.native
  /**
    * Whether to force a new deployment of the service. Deployments are not forced by default. You can use this option to trigger a new deployment with no service definition changes. For example, you can update a service's tasks to use a newer Docker image with the same image/tag combination (my_image:latest) or to roll Fargate tasks onto a newer platform version.
    */
  var forceNewDeployment: js.UndefOr[Boolean] = js.native
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load Balancing target health checks after a task has first started. This is only valid if your service is configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the Amazon ECS service scheduler ignores the Elastic Load Balancing health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.native
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * An array of task placement constraint objects to update the service to use. If no value is specified, the existing placement constraints for the service will remain unchanged. If this value is specified, it will override any existing placement constraints defined for the service. To remove all existing placement constraints, specify an empty array. You can specify a maximum of 10 constraints per task (this limit includes constraints in the task definition and those specified at runtime).
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.native
  /**
    * The task placement strategy objects to update the service to use. If no value is specified, the existing placement strategy for the service will remain unchanged. If this value is specified, it will override the existing placement strategy defined for the service. To remove an existing placement strategy, specify an empty object. You can specify a maximum of five strategy rules per service.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.native
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If a platform version is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The name of the service to update.
    */
  var service: String = js.native
  /**
    * The family and revision (family:revision) or full ARN of the task definition to run in your service. If a revision is not specified, the latest ACTIVE revision is used. If you modify the task definition with UpdateService, Amazon ECS spawns a task with the new version of the task definition and then stops an old task after the new version is running.
    */
  var taskDefinition: js.UndefOr[String] = js.native
}

object UpdateServiceRequest {
  @scala.inline
  def apply(service: String): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  @scala.inline
  implicit class UpdateServiceRequestOps[Self <: UpdateServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCluster(value: String): Self = {
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
    def withDesiredCount(value: BoxedInteger): Self = {
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
    def withForceNewDeployment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNewDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceNewDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceNewDeployment")(js.undefined)
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
  }
  
}

