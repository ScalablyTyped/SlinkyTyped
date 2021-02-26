package typingsSlinky.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionId extends StObject {
  
  var sessionId: js.UndefOr[String] = js.native
}
object SessionId {
  
  @scala.inline
  def apply(): SessionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionId]
  }
  
  @scala.inline
  implicit class SessionIdMutableBuilder[Self <: SessionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
