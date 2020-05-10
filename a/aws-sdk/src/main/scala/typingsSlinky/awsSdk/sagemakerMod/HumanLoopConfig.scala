package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human task user interface.
    */
  var HumanTaskUiArn: typingsSlinky.awsSdk.sagemakerMod.HumanTaskUiArn = js.native
  var PublicWorkforceTaskPrice: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.PublicWorkforceTaskPrice] = js.native
  /**
    * The length of time that a task remains available for labeling by human workers.
    */
  var TaskAvailabilityLifetimeInSeconds: js.UndefOr[FlowDefinitionTaskAvailabilityLifetimeInSeconds] = js.native
  /**
    * The number of distinct workers who will perform the same task on each object. For example, if TaskCount is set to 3 for an image classification labeling job, three workers will classify each input image. Increasing TaskCount can improve label accuracy.
    */
  var TaskCount: FlowDefinitionTaskCount = js.native
  /**
    * A description for the human worker task.
    */
  var TaskDescription: FlowDefinitionTaskDescription = js.native
  /**
    * Keywords used to describe the task so that workers can discover the task.
    */
  var TaskKeywords: js.UndefOr[FlowDefinitionTaskKeywords] = js.native
  /**
    * The amount of time that a worker has to complete a task.
    */
  var TaskTimeLimitInSeconds: js.UndefOr[FlowDefinitionTaskTimeLimitInSeconds] = js.native
  /**
    * A title for the human worker task.
    */
  var TaskTitle: FlowDefinitionTaskTitle = js.native
  /**
    * Amazon Resource Name (ARN) of a team of workers.
    */
  var WorkteamArn: typingsSlinky.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object HumanLoopConfig {
  @scala.inline
  def apply(
    HumanTaskUiArn: HumanTaskUiArn,
    TaskCount: FlowDefinitionTaskCount,
    TaskDescription: FlowDefinitionTaskDescription,
    TaskTitle: FlowDefinitionTaskTitle,
    WorkteamArn: WorkteamArn
  ): HumanLoopConfig = {
    val __obj = js.Dynamic.literal(HumanTaskUiArn = HumanTaskUiArn.asInstanceOf[js.Any], TaskCount = TaskCount.asInstanceOf[js.Any], TaskDescription = TaskDescription.asInstanceOf[js.Any], TaskTitle = TaskTitle.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopConfig]
  }
  @scala.inline
  implicit class HumanLoopConfigOps[Self <: HumanLoopConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanTaskUiArn(value: HumanTaskUiArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanTaskUiArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskCount(value: FlowDefinitionTaskCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskDescription(value: FlowDefinitionTaskDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskTitle(value: FlowDefinitionTaskTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkteamArn(value: WorkteamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicWorkforceTaskPrice(value: PublicWorkforceTaskPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicWorkforceTaskPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicWorkforceTaskPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicWorkforceTaskPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskAvailabilityLifetimeInSeconds(value: FlowDefinitionTaskAvailabilityLifetimeInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskAvailabilityLifetimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskAvailabilityLifetimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskAvailabilityLifetimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskKeywords(value: FlowDefinitionTaskKeywords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskKeywords")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskTimeLimitInSeconds(value: FlowDefinitionTaskTimeLimitInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskTimeLimitInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskTimeLimitInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskTimeLimitInSeconds")(js.undefined)
        ret
    }
  }
  
}

