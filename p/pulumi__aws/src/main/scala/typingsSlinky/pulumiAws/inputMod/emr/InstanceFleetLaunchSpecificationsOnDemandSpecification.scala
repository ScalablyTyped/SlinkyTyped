package typingsSlinky.pulumiAws.inputMod.emr

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetLaunchSpecificationsOnDemandSpecification extends StObject {
  
  /**
    * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
    */
  var allocationStrategy: Input[String] = js.native
}
object InstanceFleetLaunchSpecificationsOnDemandSpecification {
  
  @scala.inline
  def apply(allocationStrategy: Input[String]): InstanceFleetLaunchSpecificationsOnDemandSpecification = {
    val __obj = js.Dynamic.literal(allocationStrategy = allocationStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetLaunchSpecificationsOnDemandSpecification]
  }
  
  @scala.inline
  implicit class InstanceFleetLaunchSpecificationsOnDemandSpecificationMutableBuilder[Self <: InstanceFleetLaunchSpecificationsOnDemandSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationStrategy(value: Input[String]): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
  }
}
