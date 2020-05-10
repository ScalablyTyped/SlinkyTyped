package typingsSlinky.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfiguration extends js.Object {
  var customizedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] = js.native
  var disableScaleIn: js.UndefOr[Boolean] = js.native
  var predefinedMetricSpecification: js.UndefOr[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] = js.native
  var scaleInCooldown: js.UndefOr[Double] = js.native
  var scaleOutCooldown: js.UndefOr[Double] = js.native
  var targetValue: Double = js.native
}

object PolicyTargetTrackingScalingPolicyConfiguration {
  @scala.inline
  def apply(targetValue: Double): PolicyTargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfiguration]
  }
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationOps[Self <: PolicyTargetTrackingScalingPolicyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomizedMetricSpecification(value: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizedMetricSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomizedMetricSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizedMetricSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScaleIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScaleIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScaleIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScaleIn")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedMetricSpecification(value: PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedMetricSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedMetricSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedMetricSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleInCooldown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleInCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleInCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleInCooldown")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleOutCooldown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOutCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleOutCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOutCooldown")(js.undefined)
        ret
    }
  }
  
}

