package typingsSlinky.pulumiAws.inputMod.emr

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetLaunchSpecificationsSpotSpecification extends StObject {
  
  /**
    * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
    */
  var allocationStrategy: Input[String] = js.native
  
  /**
    * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
    */
  var blockDurationMinutes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
    */
  var timeoutAction: Input[String] = js.native
  
  /**
    * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
    */
  var timeoutDurationMinutes: Input[Double] = js.native
}
object InstanceFleetLaunchSpecificationsSpotSpecification {
  
  @scala.inline
  def apply(
    allocationStrategy: Input[String],
    timeoutAction: Input[String],
    timeoutDurationMinutes: Input[Double]
  ): InstanceFleetLaunchSpecificationsSpotSpecification = {
    val __obj = js.Dynamic.literal(allocationStrategy = allocationStrategy.asInstanceOf[js.Any], timeoutAction = timeoutAction.asInstanceOf[js.Any], timeoutDurationMinutes = timeoutDurationMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetLaunchSpecificationsSpotSpecification]
  }
  
  @scala.inline
  implicit class InstanceFleetLaunchSpecificationsSpotSpecificationMutableBuilder[Self <: InstanceFleetLaunchSpecificationsSpotSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: Input[String]): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDurationMinutes(value: Input[Double]): Self = StObject.set(x, "blockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDurationMinutesUndefined: Self = StObject.set(x, "blockDurationMinutes", js.undefined)
    
    @scala.inline
    def setTimeoutAction(value: Input[String]): Self = StObject.set(x, "timeoutAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutDurationMinutes(value: Input[Double]): Self = StObject.set(x, "timeoutDurationMinutes", value.asInstanceOf[js.Any])
  }
}
