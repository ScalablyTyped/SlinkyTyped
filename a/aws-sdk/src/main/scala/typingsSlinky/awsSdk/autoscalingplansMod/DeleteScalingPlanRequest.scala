package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScalingPlanRequest extends js.Object {
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}

object DeleteScalingPlanRequest {
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): DeleteScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScalingPlanRequest]
  }
  @scala.inline
  implicit class DeleteScalingPlanRequestOps[Self <: DeleteScalingPlanRequest] (val x: Self) extends AnyVal {
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
  }
  
}

