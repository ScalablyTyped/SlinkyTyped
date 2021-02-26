package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteScalingPolicyInput extends StObject {
  
  /**
    * A unique identifier for a fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: NonZeroAndMaxString = js.native
}
object DeleteScalingPolicyInput {
  
  @scala.inline
  def apply(FleetId: FleetIdOrArn, Name: NonZeroAndMaxString): DeleteScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScalingPolicyInput]
  }
  
  @scala.inline
  implicit class DeleteScalingPolicyInputMutableBuilder[Self <: DeleteScalingPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
