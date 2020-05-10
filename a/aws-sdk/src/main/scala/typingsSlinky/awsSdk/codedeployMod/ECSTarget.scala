package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECSTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The date and time when the target Amazon ECS application was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    *  The lifecycle events of the deployment to this target Amazon ECS application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    *  The status an Amazon ECS deployment's target ECS application. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  /**
    *  The ARN of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
  /**
    *  The unique ID of a deployment target that has a type of ecsTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
  /**
    *  The ECSTaskSet objects associated with the ECS target. 
    */
  var taskSetsInfo: js.UndefOr[ECSTaskSetList] = js.native
}

object ECSTarget {
  @scala.inline
  def apply(): ECSTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSTarget]
  }
  @scala.inline
  implicit class ECSTargetOps[Self <: ECSTarget] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTaskSetsInfo(value: ECSTaskSetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSetsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSetsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSetsInfo")(js.undefined)
        ret
    }
  }
  
}

