package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  A label that identifies whether the instance is an original target (BLUE) or a replacement target (GREEN). 
    */
  var instanceLabel: js.UndefOr[TargetLabel] = js.native
  /**
    *  The date and time when the target instance was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    *  The lifecycle events of the deployment to this target instance. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    *  The status an EC2/On-premises deployment's target instance. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  /**
    *  The ARN of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
  /**
    *  The unique ID of a deployment target that has a type of instanceTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
}

object InstanceTarget {
  @scala.inline
  def apply(): InstanceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTarget]
  }
  @scala.inline
  implicit class InstanceTargetOps[Self <: InstanceTarget] (val x: Self) extends AnyVal {
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
    def withInstanceLabel(value: TargetLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceLabel")(js.undefined)
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
    def withStatus(value: TargetStatus): Self = {
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
    def withTargetArn(value: TargetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetId(value: TargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(js.undefined)
        ret
    }
  }
  
}

