package typingsSlinky.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification extends js.Object {
  
  /**
    * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
    */
  var allocationStrategy: String = js.native
  
  /**
    * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
    */
  var blockDurationMinutes: js.UndefOr[Double] = js.native
  
  /**
    * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
    */
  var timeoutAction: String = js.native
  
  /**
    * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
    */
  var timeoutDurationMinutes: Double = js.native
}
object ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification {
  
  @scala.inline
  def apply(allocationStrategy: String, timeoutAction: String, timeoutDurationMinutes: Double): ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification = {
    val __obj = js.Dynamic.literal(allocationStrategy = allocationStrategy.asInstanceOf[js.Any], timeoutAction = timeoutAction.asInstanceOf[js.Any], timeoutDurationMinutes = timeoutDurationMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationOps[Self <: ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification] (val x: Self) extends AnyVal {
    
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
    def setAllocationStrategy(value: String): Self = this.set("allocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutAction(value: String): Self = this.set("timeoutAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutDurationMinutes(value: Double): Self = this.set("timeoutDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDurationMinutes(value: Double): Self = this.set("blockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("blockDurationMinutes", js.undefined)
  }
}
