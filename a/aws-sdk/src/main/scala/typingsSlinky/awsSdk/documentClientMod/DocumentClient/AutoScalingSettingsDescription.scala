package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingSettingsDescription extends js.Object {
  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.native
  /**
    * Role ARN used for configuring the auto scaling policy.
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.native
  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[AutoScalingPolicyDescriptionList] = js.native
}

object AutoScalingSettingsDescription {
  @scala.inline
  def apply(): AutoScalingSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingSettingsDescription]
  }
  @scala.inline
  implicit class AutoScalingSettingsDescriptionOps[Self <: AutoScalingSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScalingDisabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumUnits(value: PositiveLongObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingPolicies(value: AutoScalingPolicyDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicies")(js.undefined)
        ret
    }
  }
  
}

