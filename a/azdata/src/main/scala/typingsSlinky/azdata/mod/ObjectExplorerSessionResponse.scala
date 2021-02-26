package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExplorerSessionResponse extends StObject {
  
  var sessionId: String = js.native
}
object ObjectExplorerSessionResponse {
  
  @scala.inline
  def apply(sessionId: String): ObjectExplorerSessionResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerSessionResponse]
  }
  
  @scala.inline
  implicit class ObjectExplorerSessionResponseMutableBuilder[Self <: ObjectExplorerSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
