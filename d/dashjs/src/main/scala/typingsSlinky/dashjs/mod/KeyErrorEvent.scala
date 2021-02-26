package typingsSlinky.dashjs.mod

import typingsSlinky.dashjs.dashjsStrings.public_keyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyErrorEvent extends Event {
  
  var data: KeyError = js.native
  
  @JSName("type")
  var type_KeyErrorEvent: public_keyError = js.native
}
object KeyErrorEvent {
  
  @scala.inline
  def apply(data: KeyError, `type`: public_keyError): KeyErrorEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyErrorEvent]
  }
  
  @scala.inline
  implicit class KeyErrorEventMutableBuilder[Self <: KeyErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: KeyError): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_keyError): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
