package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECSTaskSet extends js.Object {
  /**
    *  The number of tasks in a task set. During a deployment that uses the Amazon ECS compute type, CodeDeploy instructs Amazon ECS to create a new task set and uses this value to determine how many tasks to create. After the updated task set is created, CodeDeploy shifts traffic to the new task set. 
    */
  var desiredCount: js.UndefOr[ECSTaskSetCount] = js.native
  /**
    *  A unique ID of an ECSTaskSet. 
    */
  var identifer: js.UndefOr[ECSTaskSetIdentifier] = js.native
  /**
    *  The number of tasks in the task set that are in the PENDING status during an Amazon ECS deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time, or when it is restarted after being in the STOPPED state. 
    */
  var pendingCount: js.UndefOr[ECSTaskSetCount] = js.native
  /**
    *  The number of tasks in the task set that are in the RUNNING status during an Amazon ECS deployment. A task in the RUNNING state is running and ready for use. 
    */
  var runningCount: js.UndefOr[ECSTaskSetCount] = js.native
  /**
    *  The status of the task set. There are three valid task set statuses:     PRIMARY: Indicates the task set is serving production traffic.     ACTIVE: Indicates the task set is not serving production traffic.     DRAINING: Indicates the tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.   
    */
  var status: js.UndefOr[ECSTaskSetStatus] = js.native
  /**
    *  The target group associated with the task set. The target group is used by AWS CodeDeploy to manage traffic to a task set. 
    */
  var targetGroup: js.UndefOr[TargetGroupInfo] = js.native
  /**
    *  A label that identifies whether the ECS task set is an original target (BLUE) or a replacement target (GREEN). 
    */
  var taskSetLabel: js.UndefOr[TargetLabel] = js.native
  /**
    *  The percentage of traffic served by this task set. 
    */
  var trafficWeight: js.UndefOr[TrafficWeight] = js.native
}

object ECSTaskSet {
  @scala.inline
  def apply(): ECSTaskSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSTaskSet]
  }
  @scala.inline
  implicit class ECSTaskSetOps[Self <: ECSTaskSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredCount(value: ECSTaskSetCount): Self = {
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
    def withIdentifer(value: ECSTaskSetIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifer")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingCount(value: ECSTaskSetCount): Self = {
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
    def withRunningCount(value: ECSTaskSetCount): Self = {
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
    def withStatus(value: ECSTaskSetStatus): Self = {
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
    def withTargetGroup(value: TargetGroupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSetLabel(value: TargetLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSetLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSetLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSetLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficWeight(value: TrafficWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficWeight")(js.undefined)
        ret
    }
  }
  
}

