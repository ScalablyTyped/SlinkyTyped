package typingsSlinky.reactBigCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messages extends StObject {
  
  var messages: typingsSlinky.reactBigCalendar.mod.Messages = js.native
}
object Messages {
  
  @scala.inline
  def apply(messages: typingsSlinky.reactBigCalendar.mod.Messages): Messages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  @scala.inline
  implicit class MessagesMutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: typingsSlinky.reactBigCalendar.mod.Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
