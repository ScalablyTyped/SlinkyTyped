package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionClientSession extends StObject {
  
  var session: ClientSession = js.native
}
object SessionClientSession {
  
  @scala.inline
  def apply(session: ClientSession): SessionClientSession = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionClientSession]
  }
  
  @scala.inline
  implicit class SessionClientSessionMutableBuilder[Self <: SessionClientSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
