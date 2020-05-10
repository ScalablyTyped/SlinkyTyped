package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. You must specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.CustomizedMetricSpecification] = js.native
  /**
    * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from the Auto Scaling group. The default is false.
    */
  var DisableScaleIn: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.DisableScaleIn] = js.native
  /**
    * A predefined metric. You must specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.PredefinedMetricSpecification] = js.native
  /**
    * The target value for the metric.
    */
  var TargetValue: MetricScale = js.native
}

object TargetTrackingConfiguration {
  @scala.inline
  def apply(TargetValue: MetricScale): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
  @scala.inline
  implicit class TargetTrackingConfigurationOps[Self <: TargetTrackingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetValue(value: MetricScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomizedMetricSpecification(value: CustomizedMetricSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomizedMetricSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomizedMetricSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomizedMetricSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScaleIn(value: DisableScaleIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableScaleIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScaleIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableScaleIn")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedMetricSpecification(value: PredefinedMetricSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedMetricSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedMetricSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedMetricSpecification")(js.undefined)
        ret
    }
  }
  
}

