package typingsSlinky.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutePolicyType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The breach threshold for the alarm. Required if the policy type is StepScaling and not supported otherwise.
    */
  var BreachThreshold: js.UndefOr[MetricScale] = js.native
  
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before executing the policy. Valid only if the policy type is SimpleScaling. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var HonorCooldown: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.HonorCooldown] = js.native
  
  /**
    * The metric value to compare to BreachThreshold. This enables you to execute a policy of type StepScaling and determine which step adjustment to use. For example, if the breach threshold is 50 and you want to use a step adjustment with a lower bound of 0 and an upper bound of 10, you can set the metric value to 59. If you specify a metric value that doesn't correspond to a step adjustment for the policy, the call returns an error. Required if the policy type is StepScaling and not supported otherwise.
    */
  var MetricValue: js.UndefOr[MetricScale] = js.native
  
  /**
    * The name or ARN of the policy.
    */
  var PolicyName: ResourceName = js.native
}
object ExecutePolicyType {
  
  @scala.inline
  def apply(PolicyName: ResourceName): ExecutePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutePolicyType]
  }
  
  @scala.inline
  implicit class ExecutePolicyTypeMutableBuilder[Self <: ExecutePolicyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setBreachThreshold(value: MetricScale): Self = StObject.set(x, "BreachThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreachThresholdUndefined: Self = StObject.set(x, "BreachThreshold", js.undefined)
    
    @scala.inline
    def setHonorCooldown(value: HonorCooldown): Self = StObject.set(x, "HonorCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorCooldownUndefined: Self = StObject.set(x, "HonorCooldown", js.undefined)
    
    @scala.inline
    def setMetricValue(value: MetricScale): Self = StObject.set(x, "MetricValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricValueUndefined: Self = StObject.set(x, "MetricValue", js.undefined)
    
    @scala.inline
    def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
