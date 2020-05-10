package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScalingPlanRequest extends js.Object {
  /**
    * A CloudFormation stack or set of tags.
    */
  var ApplicationSource: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ApplicationSource] = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ScalingInstructions] = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}

object UpdateScalingPlanRequest {
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): UpdateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingPlanRequest]
  }
  @scala.inline
  implicit class UpdateScalingPlanRequestOps[Self <: UpdateScalingPlanRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withApplicationSource(value: ApplicationSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSource")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingInstructions(value: ScalingInstructions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingInstructions")(js.undefined)
        ret
    }
  }
  
}

