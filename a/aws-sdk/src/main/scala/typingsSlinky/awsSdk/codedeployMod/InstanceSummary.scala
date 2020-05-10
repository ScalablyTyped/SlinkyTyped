package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSummary extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    * The instance ID.
    */
  var instanceId: js.UndefOr[InstanceId] = js.native
  /**
    * Information about which environment an instance belongs to in a blue/green deployment.   BLUE: The instance is part of the original environment.   GREEN: The instance is part of the replacement environment.  
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * A timestamp that indicaties when the instance information was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * A list of lifecycle events for this instance.
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    * The deployment status for this instance:   Pending: The deployment is pending for this instance.   In Progress: The deployment is in progress for this instance.   Succeeded: The deployment has succeeded for this instance.   Failed: The deployment has failed for this instance.   Skipped: The deployment has been skipped for this instance.   Unknown: The deployment status is unknown for this instance.  
    */
  var status: js.UndefOr[InstanceStatus] = js.native
}

object InstanceSummary {
  @scala.inline
  def apply(): InstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSummary]
  }
  @scala.inline
  implicit class InstanceSummaryOps[Self <: InstanceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentId(value: DeploymentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleEvents(value: LifecycleEventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InstanceStatus): Self = {
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
  }
  
}

