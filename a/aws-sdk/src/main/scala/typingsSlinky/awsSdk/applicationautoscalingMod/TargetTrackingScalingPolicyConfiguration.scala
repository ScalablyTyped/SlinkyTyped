package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTrackingScalingPolicyConfiguration extends js.Object {
  
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.CustomizedMetricSpecification] = js.native
  
  /**
    * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy won't remove capacity from the scalable target. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable target. The default value is false.
    */
  var DisableScaleIn: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.DisableScaleIn] = js.native
  
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.PredefinedMetricSpecification] = js.native
  
  /**
    * The amount of time, in seconds, after a scale-in activity completes before another scale-in activity can start. With the scale-in cooldown period, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the scale-in cooldown period, Application Auto Scaling scales out the target immediately. In this case, the scale-in cooldown period stops and doesn't complete. Application Auto Scaling provides a default value of 300 for the following scalable targets:   ECS services   Spot Fleet requests   EMR clusters   AppStream 2.0 fleets   Aurora DB clusters   Amazon SageMaker endpoint variants   Custom resources   For all other scalable targets, the default value is 0:   DynamoDB tables   DynamoDB global secondary indexes   Amazon Comprehend document classification endpoints   Lambda provisioned concurrency   Amazon Keyspaces tables  
    */
  var ScaleInCooldown: js.UndefOr[Cooldown] = js.native
  
  /**
    * The amount of time, in seconds, to wait for a previous scale-out activity to take effect. With the scale-out cooldown period, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a target tracking scaling policy, it starts to calculate the cooldown time. While the scale-out cooldown period is in effect, the capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. Application Auto Scaling provides a default value of 300 for the following scalable targets:   ECS services   Spot Fleet requests   EMR clusters   AppStream 2.0 fleets   Aurora DB clusters   Amazon SageMaker endpoint variants   Custom resources   For all other scalable targets, the default value is 0:   DynamoDB tables   DynamoDB global secondary indexes   Amazon Comprehend document classification endpoints   Lambda provisioned concurrency   Amazon Keyspaces tables  
    */
  var ScaleOutCooldown: js.UndefOr[Cooldown] = js.native
  
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
    */
  var TargetValue: MetricScale = js.native
}
object TargetTrackingScalingPolicyConfiguration {
  
  @scala.inline
  def apply(TargetValue: MetricScale): TargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingScalingPolicyConfiguration]
  }
  
  @scala.inline
  implicit class TargetTrackingScalingPolicyConfigurationOps[Self <: TargetTrackingScalingPolicyConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetValue(value: MetricScale): Self = this.set("TargetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedMetricSpecification(value: CustomizedMetricSpecification): Self = this.set("CustomizedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomizedMetricSpecification: Self = this.set("CustomizedMetricSpecification", js.undefined)
    
    @scala.inline
    def setDisableScaleIn(value: DisableScaleIn): Self = this.set("DisableScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScaleIn: Self = this.set("DisableScaleIn", js.undefined)
    
    @scala.inline
    def setPredefinedMetricSpecification(value: PredefinedMetricSpecification): Self = this.set("PredefinedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedMetricSpecification: Self = this.set("PredefinedMetricSpecification", js.undefined)
    
    @scala.inline
    def setScaleInCooldown(value: Cooldown): Self = this.set("ScaleInCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleInCooldown: Self = this.set("ScaleInCooldown", js.undefined)
    
    @scala.inline
    def setScaleOutCooldown(value: Cooldown): Self = this.set("ScaleOutCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleOutCooldown: Self = this.set("ScaleOutCooldown", js.undefined)
  }
}
