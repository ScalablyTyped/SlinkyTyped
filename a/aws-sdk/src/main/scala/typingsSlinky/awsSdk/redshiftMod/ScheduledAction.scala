package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledAction extends js.Object {
  /**
    * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not trigger. 
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see Using Identity-Based Policies for Amazon Redshift in the Amazon Redshift Cluster Management Guide. 
    */
  var IamRole: js.UndefOr[String] = js.native
  /**
    * List of times when the scheduled action will run. 
    */
  var NextInvocations: js.UndefOr[ScheduledActionTimeList] = js.native
  /**
    * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be separated by at least one hour. Format of at expressions is "at(yyyy-mm-ddThh:mm:ss)". For example, "at(2016-03-04T17:27:00)". Format of cron expressions is "cron(Minutes Hours Day-of-month Month Day-of-week Year)". For example, "cron(0 10 ? * MON *)". For more information, see Cron Expressions in the Amazon CloudWatch Events User Guide.
    */
  var Schedule: js.UndefOr[String] = js.native
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the scheduled action. 
    */
  var ScheduledActionName: js.UndefOr[String] = js.native
  /**
    * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger. 
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the scheduled action. For example, DISABLED. 
    */
  var State: js.UndefOr[ScheduledActionState] = js.native
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters.  "{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}". 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.native
}

object ScheduledAction {
  @scala.inline
  def apply(): ScheduledAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledAction]
  }
  @scala.inline
  implicit class ScheduledActionOps[Self <: ScheduledAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(js.undefined)
        ret
    }
    @scala.inline
    def withNextInvocations(value: ScheduledActionTimeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextInvocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextInvocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextInvocations")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledActionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledActionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledActionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionName")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ScheduledActionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetAction(value: ScheduledActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAction")(js.undefined)
        ret
    }
  }
  
}

