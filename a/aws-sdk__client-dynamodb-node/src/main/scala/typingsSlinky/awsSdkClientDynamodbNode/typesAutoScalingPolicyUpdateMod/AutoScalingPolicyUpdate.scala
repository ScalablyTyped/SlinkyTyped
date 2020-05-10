package typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingPolicyUpdateMod

import typingsSlinky.awsSdkClientDynamodbNode.typesAutoScalingTargetTrackingScalingPolicyConfigurationUpdateMod.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicyUpdate extends js.Object {
  /**
    * <p>The name of the scaling policy.</p>
    */
  var PolicyName: js.UndefOr[String] = js.native
  /**
    * <p>Represents a target tracking scaling policy configuration.</p>
    */
  var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = js.native
}

object AutoScalingPolicyUpdate {
  @scala.inline
  def apply(
    TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ): AutoScalingPolicyUpdate = {
    val __obj = js.Dynamic.literal(TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingPolicyUpdate]
  }
  @scala.inline
  implicit class AutoScalingPolicyUpdateOps[Self <: AutoScalingPolicyUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetTrackingScalingPolicyConfiguration(value: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTrackingScalingPolicyConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyName")(js.undefined)
        ret
    }
  }
  
}

