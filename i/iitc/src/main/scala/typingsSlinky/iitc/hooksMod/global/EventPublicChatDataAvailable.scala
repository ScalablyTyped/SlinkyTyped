package typingsSlinky.iitc.hooksMod.global

import typingsSlinky.iitc.inteltypesMod.Intel.ChatLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPublicChatDataAvailable extends StObject {
  
  var processed: js.Any = js.native
  
  var raw: js.Any = js.native
  
  var result: js.Array[ChatLine] = js.native
}
object EventPublicChatDataAvailable {
  
  @scala.inline
  def apply(processed: js.Any, raw: js.Any, result: js.Array[ChatLine]): EventPublicChatDataAvailable = {
    val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPublicChatDataAvailable]
  }
  
  @scala.inline
  implicit class EventPublicChatDataAvailableMutableBuilder[Self <: EventPublicChatDataAvailable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessed(value: js.Any): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Array[ChatLine]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: ChatLine*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
