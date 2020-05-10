package typingsSlinky.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. Conflicts with `predefinedMetricSpecification`.
    */
  var customizedMetricSpecification: js.UndefOr[PolicyTargetTrackingConfigurationCustomizedMetricSpecification] = js.native
  /**
    * Indicates whether scale in by the target tracking policy is disabled.
    */
  var disableScaleIn: js.UndefOr[Boolean] = js.native
  /**
    * A predefined metric. Conflicts with `customizedMetricSpecification`.
    */
  var predefinedMetricSpecification: js.UndefOr[PolicyTargetTrackingConfigurationPredefinedMetricSpecification] = js.native
  /**
    * The target value for the metric.
    */
  var targetValue: Double = js.native
}

object PolicyTargetTrackingConfiguration {
  @scala.inline
  def apply(targetValue: Double): PolicyTargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfiguration]
  }
  @scala.inline
  implicit class PolicyTargetTrackingConfigurationOps[Self <: PolicyTargetTrackingConfiguration] (val x: Self) extends AnyVal {
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
    def withCustomizedMetricSpecification(value: PolicyTargetTrackingConfigurationCustomizedMetricSpecification): Self = {
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
    def withPredefinedMetricSpecification(value: PolicyTargetTrackingConfigurationPredefinedMetricSpecification): Self = {
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
  }
  
}

