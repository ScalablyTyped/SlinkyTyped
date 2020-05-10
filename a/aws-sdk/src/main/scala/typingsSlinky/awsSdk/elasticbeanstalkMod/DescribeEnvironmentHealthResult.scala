package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentHealthResult extends js.Object {
  /**
    * Application request metrics for the environment.
    */
  var ApplicationMetrics: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationMetrics] = js.native
  /**
    * Descriptions of the data that contributed to the environment's current health status.
    */
  var Causes: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Causes] = js.native
  /**
    * The health color of the environment.
    */
  var Color: js.UndefOr[String] = js.native
  /**
    * The environment's name.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The health status of the environment. For example, Ok.
    */
  var HealthStatus: js.UndefOr[String] = js.native
  /**
    * Summary health information for the instances in the environment.
    */
  var InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.native
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[js.Date] = js.native
  /**
    * The environment's operational status. Ready, Launching, Updating, Terminating, or Terminated.
    */
  var Status: js.UndefOr[EnvironmentHealth] = js.native
}

object DescribeEnvironmentHealthResult {
  @scala.inline
  def apply(): DescribeEnvironmentHealthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentHealthResult]
  }
  @scala.inline
  implicit class DescribeEnvironmentHealthResultOps[Self <: DescribeEnvironmentHealthResult] (val x: Self) extends AnyVal {
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
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
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
    def withInstancesHealth(value: InstanceHealthSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancesHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstancesHealth")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EnvironmentHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

