package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var message: typingsSlinky.openpgp.mod.message.Message = js.native
}
object Message {
  
  @scala.inline
  def apply(message: typingsSlinky.openpgp.mod.message.Message): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: typingsSlinky.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
