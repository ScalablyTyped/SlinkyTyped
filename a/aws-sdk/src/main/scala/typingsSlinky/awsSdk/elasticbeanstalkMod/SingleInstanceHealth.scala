package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleInstanceHealth extends js.Object {
  /**
    * Request metrics from your application.
    */
  var ApplicationMetrics: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationMetrics] = js.native
  /**
    * The availability zone in which the instance runs.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Represents the causes, which provide more information about the current health status.
    */
  var Causes: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Causes] = js.native
  /**
    * Represents the color indicator that gives you information about the health of the EC2 instance. For more information, see Health Colors and Statuses.
    */
  var Color: js.UndefOr[String] = js.native
  /**
    * Information about the most recent deployment to an instance.
    */
  var Deployment: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Deployment] = js.native
  /**
    * Returns the health status of the specified instance. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[String] = js.native
  /**
    * The ID of the Amazon EC2 instance.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.InstanceId] = js.native
  /**
    * The instance's type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The time at which the EC2 instance was launched.
    */
  var LaunchedAt: js.UndefOr[js.Date] = js.native
  /**
    * Operating system metrics from the instance.
    */
  var System: js.UndefOr[SystemStatus] = js.native
}

object SingleInstanceHealth {
  @scala.inline
  def apply(): SingleInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleInstanceHealth]
  }
  @scala.inline
  implicit class SingleInstanceHealthOps[Self <: SingleInstanceHealth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationMetrics(value: ApplicationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withCauses(value: Causes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Causes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Causes")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployment(value: Deployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deployment")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: SystemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(js.undefined)
        ret
    }
  }
  
}

