package typingsSlinky.ionic.definitionsMod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperAgentError extends Error {
  
  var response: typingsSlinky.superagent.mod.Response = js.native
}
object SuperAgentError {
  
  @scala.inline
  def apply(message: String, name: String, response: typingsSlinky.superagent.mod.Response): SuperAgentError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperAgentError]
  }
  
  @scala.inline
  implicit class SuperAgentErrorMutableBuilder[Self <: SuperAgentError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: typingsSlinky.superagent.mod.Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
