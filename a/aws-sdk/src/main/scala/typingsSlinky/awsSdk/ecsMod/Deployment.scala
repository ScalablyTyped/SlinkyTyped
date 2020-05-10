package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * The capacity provider strategy that the deployment is using.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The Unix timestamp for when the service deployment was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The most recent desired count of tasks that was specified for the service to deploy or maintain.
    */
  var desiredCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the deployment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The launch type the tasks in the service are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  /**
    * The number of tasks in the deployment that are in the PENDING status.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  /**
    * The platform version on which your tasks in the service are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The number of tasks in the deployment that are in the RUNNING status.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  /**
    * The status of the deployment. The following describes each state:  PRIMARY  The most recent deployment of a service.  ACTIVE  A service deployment that still has running tasks, but are in the process of being replaced with a new PRIMARY deployment.  INACTIVE  A deployment that has been completely replaced.  
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The most recent task definition that was specified for the tasks in the service to use.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the service deployment was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.native
}

object Deployment {
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
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

