package typingsSlinky.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingInstanceDetails extends StObject {
  
  /**
    * The name of the Auto Scaling group for the instance.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: XmlStringMaxLen255 = js.native
  
  /**
    * The last reported health status of this instance. "Healthy" means that the instance is healthy and should remain in service. "Unhealthy" means that the instance is unhealthy and Amazon EC2 Auto Scaling should terminate and replace it.
    */
  var HealthStatus: XmlStringMaxLen32 = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19 = js.native
  
  /**
    * The instance type of the EC2 instance.
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The launch configuration used to launch the instance. This value is not available if you attached the instance to the Auto Scaling group.
    */
  var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The launch template for the instance.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  
  /**
    * The lifecycle state for the instance.
    */
  var LifecycleState: XmlStringMaxLen32 = js.native
  
  /**
    * Indicates whether the instance is protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var ProtectedFromScaleIn: InstanceProtected = js.native
  
  /**
    * The number of capacity units contributed by the instance based on its instance type. Valid Range: Minimum value of 1. Maximum value of 999.
    */
  var WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.native
}
object AutoScalingInstanceDetails {
  
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    AvailabilityZone: XmlStringMaxLen255,
    HealthStatus: XmlStringMaxLen32,
    InstanceId: XmlStringMaxLen19,
    LifecycleState: XmlStringMaxLen32,
    ProtectedFromScaleIn: InstanceProtected
  ): AutoScalingInstanceDetails = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], HealthStatus = HealthStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], LifecycleState = LifecycleState.asInstanceOf[js.Any], ProtectedFromScaleIn = ProtectedFromScaleIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingInstanceDetails]
  }
  
  @scala.inline
  implicit class AutoScalingInstanceDetailsMutableBuilder[Self <: AutoScalingInstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: XmlStringMaxLen255): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatus(value: XmlStringMaxLen32): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: XmlStringMaxLen255): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    @scala.inline
    def setLifecycleState(value: XmlStringMaxLen32): Self = StObject.set(x, "LifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedFromScaleIn(value: InstanceProtected): Self = StObject.set(x, "ProtectedFromScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacity(value: XmlStringMaxLen32): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
