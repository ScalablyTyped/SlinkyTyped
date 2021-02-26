package typingsSlinky.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTrackingConfiguration extends StObject {
  
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
  implicit class TargetTrackingConfigurationMutableBuilder[Self <: TargetTrackingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomizedMetricSpecification(value: CustomizedMetricSpecification): Self = StObject.set(x, "CustomizedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedMetricSpecificationUndefined: Self = StObject.set(x, "CustomizedMetricSpecification", js.undefined)
    
    @scala.inline
    def setDisableScaleIn(value: DisableScaleIn): Self = StObject.set(x, "DisableScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScaleInUndefined: Self = StObject.set(x, "DisableScaleIn", js.undefined)
    
    @scala.inline
    def setPredefinedMetricSpecification(value: PredefinedMetricSpecification): Self = StObject.set(x, "PredefinedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedMetricSpecificationUndefined: Self = StObject.set(x, "PredefinedMetricSpecification", js.undefined)
    
    @scala.inline
    def setTargetValue(value: MetricScale): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
