package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.complete
import typingsSlinky.jwplayer.jwplayerStrings.error
import typingsSlinky.jwplayer.jwplayerStrings.loading
import typingsSlinky.jwplayer.jwplayerStrings.stalled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferParam extends StObject {
  
  var newstate: String = js.native
  
  var oldstate: String = js.native
  
  var reason: loading | complete | stalled | error = js.native
}
object BufferParam {
  
  @scala.inline
  def apply(newstate: String, oldstate: String, reason: loading | complete | stalled | error): BufferParam = {
    val __obj = js.Dynamic.literal(newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferParam]
  }
  
  @scala.inline
  implicit class BufferParamMutableBuilder[Self <: BufferParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewstate(value: String): Self = StObject.set(x, "newstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldstate(value: String): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: loading | complete | stalled | error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
