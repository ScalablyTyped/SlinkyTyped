package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceDefinition extends StObject {
  
  /**
    * An EC2 instance type designation.
    */
  var InstanceType: GameServerGroupInstanceType = js.native
  
  /**
    * Instance weighting that indicates how much this instance type contributes to the total capacity of a game server group. Instance weights are used by GameLift FleetIQ to calculate the instance type's cost per unit hour and better identify the most cost-effective options. For detailed information on weighting instance capacity, see Instance Weighting in the Amazon EC2 Auto Scaling User Guide. Default value is "1".
    */
  var WeightedCapacity: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.WeightedCapacity] = js.native
}
object InstanceDefinition {
  
  @scala.inline
  def apply(InstanceType: GameServerGroupInstanceType): InstanceDefinition = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceDefinition]
  }
  
  @scala.inline
  implicit class InstanceDefinitionMutableBuilder[Self <: InstanceDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: GameServerGroupInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacity(value: WeightedCapacity): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
