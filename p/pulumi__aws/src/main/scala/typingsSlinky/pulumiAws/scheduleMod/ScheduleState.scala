package typingsSlinky.pulumiAws.scheduleMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleState extends js.Object {
  /**
    * The ARN assigned by AWS to the autoscaling schedule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val autoscalingGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
    */
  val desiredCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val endTime: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the maximum size at the scheduled time.
    */
  val maxSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the minimum size at the scheduled time.
    */
  val minSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
    */
  val recurrence: js.UndefOr[Input[String]] = js.native
  /**
    * The name of this scaling action.
    */
  val scheduledActionName: js.UndefOr[Input[String]] = js.native
  /**
    * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val startTime: js.UndefOr[Input[String]] = js.native
}

object ScheduleState {
  @scala.inline
  def apply(): ScheduleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleState]
  }
  @scala.inline
  implicit class ScheduleStateOps[Self <: ScheduleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoscalingGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrence(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledActionName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledActionName")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

