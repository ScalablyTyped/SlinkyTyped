package typingsSlinky.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var details: MessageDetails = js.native
  
  var occurredOn: js.Date = js.native
}
object Message {
  
  @scala.inline
  def apply(details: MessageDetails, occurredOn: js.Date): Message = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: MessageDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurredOn(value: js.Date): Self = StObject.set(x, "occurredOn", value.asInstanceOf[js.Any])
  }
}
