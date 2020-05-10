package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPlan extends js.Object {
  /**
    * The application source.
    */
  var ApplicationSource: typingsSlinky.awsSdk.autoscalingplansMod.ApplicationSource = js.native
  /**
    * The Unix time stamp when the scaling plan was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: typingsSlinky.awsSdk.autoscalingplansMod.ScalingInstructions = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
  /**
    * The status of the scaling plan.    Active - The scaling plan is active.    ActiveWithProblems - The scaling plan is active, but the scaling configuration for one or more resources could not be applied.    CreationInProgress - The scaling plan is being created.    CreationFailed - The scaling plan could not be created.    DeletionInProgress - The scaling plan is being deleted.    DeletionFailed - The scaling plan could not be deleted.    UpdateInProgress - The scaling plan is being updated.    UpdateFailed - The scaling plan could not be updated.  
    */
  var StatusCode: ScalingPlanStatusCode = js.native
  /**
    * A simple message about the current status of the scaling plan.
    */
  var StatusMessage: js.UndefOr[XmlString] = js.native
  /**
    * The Unix time stamp when the scaling plan entered the current status.
    */
  var StatusStartTime: js.UndefOr[js.Date] = js.native
}

object ScalingPlan {
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    StatusCode: ScalingPlanStatusCode
  ): ScalingPlan = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlan]
  }
  @scala.inline
  implicit class ScalingPlanOps[Self <: ScalingPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationSource(value: ApplicationSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingInstructions(value: ScalingInstructions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingPlanName(value: ScalingPlanName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingPlanVersion(value: ScalingPlanVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: ScalingPlanStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusStartTime")(js.undefined)
        ret
    }
  }
  
}

