package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.UniqueDebuggerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableResponse extends StObject {
  
  /**
    * Unique identifier of the debugger.
    */
  var debuggerId: UniqueDebuggerId = js.native
}
object EnableResponse {
  
  @scala.inline
  def apply(debuggerId: UniqueDebuggerId): EnableResponse = {
    val __obj = js.Dynamic.literal(debuggerId = debuggerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableResponse]
  }
  
  @scala.inline
  implicit class EnableResponseMutableBuilder[Self <: EnableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggerId(value: UniqueDebuggerId): Self = StObject.set(x, "debuggerId", value.asInstanceOf[js.Any])
  }
}
