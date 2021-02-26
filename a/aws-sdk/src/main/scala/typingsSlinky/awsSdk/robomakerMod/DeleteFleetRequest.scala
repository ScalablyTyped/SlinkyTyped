package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFleetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn = js.native
}
object DeleteFleetRequest {
  
  @scala.inline
  def apply(fleet: Arn): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetRequest]
  }
  
  @scala.inline
  implicit class DeleteFleetRequestMutableBuilder[Self <: DeleteFleetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
  }
}
