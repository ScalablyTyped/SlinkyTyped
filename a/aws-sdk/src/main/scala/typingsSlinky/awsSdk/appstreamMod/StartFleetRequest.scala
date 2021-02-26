package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartFleetRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var Name: String = js.native
}
object StartFleetRequest {
  
  @scala.inline
  def apply(Name: String): StartFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFleetRequest]
  }
  
  @scala.inline
  implicit class StartFleetRequestMutableBuilder[Self <: StartFleetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
