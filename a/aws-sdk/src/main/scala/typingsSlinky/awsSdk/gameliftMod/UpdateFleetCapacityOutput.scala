package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetCapacityOutput extends StObject {
  
  /**
    * A unique identifier for a fleet that was updated.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
}
object UpdateFleetCapacityOutput {
  
  @scala.inline
  def apply(): UpdateFleetCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetCapacityOutput]
  }
  
  @scala.inline
  implicit class UpdateFleetCapacityOutputMutableBuilder[Self <: UpdateFleetCapacityOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
