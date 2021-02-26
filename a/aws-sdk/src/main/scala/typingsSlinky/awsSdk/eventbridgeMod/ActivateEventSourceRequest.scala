package typingsSlinky.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateEventSourceRequest extends StObject {
  
  /**
    * The name of the partner event source to activate.
    */
  var Name: EventSourceName = js.native
}
object ActivateEventSourceRequest {
  
  @scala.inline
  def apply(Name: EventSourceName): ActivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateEventSourceRequest]
  }
  
  @scala.inline
  implicit class ActivateEventSourceRequestMutableBuilder[Self <: ActivateEventSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
