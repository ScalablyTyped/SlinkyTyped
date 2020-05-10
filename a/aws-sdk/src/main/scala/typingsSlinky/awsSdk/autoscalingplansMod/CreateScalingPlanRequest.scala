package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScalingPlanRequest extends js.Object {
  /**
    * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
    */
  var ApplicationSource: typingsSlinky.awsSdk.autoscalingplansMod.ApplicationSource = js.native
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: typingsSlinky.awsSdk.autoscalingplansMod.ScalingInstructions = js.native
  /**
    * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
    */
  var ScalingPlanName: typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
}

object CreateScalingPlanRequest {
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName
  ): CreateScalingPlanRequest = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScalingPlanRequest]
  }
  @scala.inline
  implicit class CreateScalingPlanRequestOps[Self <: CreateScalingPlanRequest] (val x: Self) extends AnyVal {
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
  }
  
}

