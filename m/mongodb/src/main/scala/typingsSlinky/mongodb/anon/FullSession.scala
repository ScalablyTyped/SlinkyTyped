package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullSession extends StObject {
  
  var full: Boolean = js.native
  
  var session: ClientSession = js.native
}
object FullSession {
  
  @scala.inline
  def apply(full: Boolean, session: ClientSession): FullSession = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullSession]
  }
  
  @scala.inline
  implicit class FullSessionMutableBuilder[Self <: FullSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
