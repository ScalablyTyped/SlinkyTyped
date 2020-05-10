package typingsSlinky.pulumiAws.scheduledActionMod

import typingsSlinky.pulumiAws.inputMod.appautoscaling.ScheduledActionScalableTargetAction
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the scheduled action.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The date and time for the scheduled action to end. Specify the following format: 2006-01-02T15:04:05Z
    */
  val endTime: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the scheduled action.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
  /**
    * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
    */
  val scalableDimension: js.UndefOr[Input[String]] = js.native
  /**
    * The new minimum and maximum capacity. You can set both values or just one. See below
    */
  val scalableTargetAction: js.UndefOr[Input[ScheduledActionScalableTargetAction]] = js.native
  /**
    * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). In UTC. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
    */
  val schedule: js.UndefOr[Input[String]] = js.native
  /**
    * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
    */
  val serviceNamespace: js.UndefOr[Input[String]] = js.native
  /**
    * The date and time for the scheduled action to start. Specify the following format: 2006-01-02T15:04:05Z
    */
  val startTime: js.UndefOr[Input[String]] = js.native
}

object ScheduledActionState {
  @scala.inline
  def apply(): ScheduledActionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionState]
  }
  @scala.inline
  implicit class ScheduledActionStateOps[Self <: ScheduledActionState] (val x: Self) extends AnyVal {
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
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withScalableDimension(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalableDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalableDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalableDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withScalableTargetAction(value: Input[ScheduledActionScalableTargetAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalableTargetAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalableTargetAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalableTargetAction")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceNamespace")(js.undefined)
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

