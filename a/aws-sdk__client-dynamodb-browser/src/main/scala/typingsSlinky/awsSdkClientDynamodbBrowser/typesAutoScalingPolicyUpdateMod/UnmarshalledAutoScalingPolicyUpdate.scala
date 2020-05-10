package typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyUpdateMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod.UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAutoScalingPolicyUpdate extends AutoScalingPolicyUpdate {
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  @JSName("TargetTrackingScalingPolicyConfiguration")
  var TargetTrackingScalingPolicyConfiguration_UnmarshalledAutoScalingPolicyUpdate: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = js.native
}

object UnmarshalledAutoScalingPolicyUpdate {
  @scala.inline
  def apply(
    TargetTrackingScalingPolicyConfiguration: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ): UnmarshalledAutoScalingPolicyUpdate = {
    val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAutoScalingPolicyUpdate]
  }
  @scala.inline
  implicit class UnmarshalledAutoScalingPolicyUpdateOps[Self <: UnmarshalledAutoScalingPolicyUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetTrackingScalingPolicyConfiguration(value: UnmarshalledAutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTrackingScalingPolicyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

