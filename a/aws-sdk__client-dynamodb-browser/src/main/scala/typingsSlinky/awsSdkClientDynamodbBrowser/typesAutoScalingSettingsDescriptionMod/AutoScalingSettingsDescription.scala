package typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesAutoScalingPolicyDescriptionMod.AutoScalingPolicyDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingSettingsDescription extends js.Object {
  /**
    * <p>Disabled autoscaling for this global table or global secondary index.</p>
    */
  var AutoScalingDisabled: js.UndefOr[Boolean] = js.native
  /**
    * <p>Role ARN used for configuring autoScaling policy.</p>
    */
  var AutoScalingRoleArn: js.UndefOr[String] = js.native
  /**
    * <p>The maximum capacity units that a global table or global secondary index should be scaled up to.</p>
    */
  var MaximumUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The minimum capacity units that a global table or global secondary index should be scaled down to.</p>
    */
  var MinimumUnits: js.UndefOr[Double] = js.native
  /**
    * <p>Information about the scaling policies.</p>
    */
  var ScalingPolicies: js.UndefOr[
    js.Array[AutoScalingPolicyDescription] | js.Iterable[AutoScalingPolicyDescription]
  ] = js.native
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
    def withAutoScalingDisabled(value: Boolean): Self = {
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
    def withMaximumUnits(value: Double): Self = {
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
    def withMinimumUnits(value: Double): Self = {
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
    def withScalingPoliciesIterable(value: js.Iterable[AutoScalingPolicyDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalingPolicies(value: js.Array[AutoScalingPolicyDescription] | js.Iterable[AutoScalingPolicyDescription]): Self = {
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

