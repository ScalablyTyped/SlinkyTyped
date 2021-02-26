package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PauseOnAsyncCallRequest extends StObject {
  
  /**
    * Debugger will pause when async call with given stack trace is started.
    */
  var parentStackTraceId: StackTraceId = js.native
}
object PauseOnAsyncCallRequest {
  
  @scala.inline
  def apply(parentStackTraceId: StackTraceId): PauseOnAsyncCallRequest = {
    val __obj = js.Dynamic.literal(parentStackTraceId = parentStackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseOnAsyncCallRequest]
  }
  
  @scala.inline
  implicit class PauseOnAsyncCallRequestMutableBuilder[Self <: PauseOnAsyncCallRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentStackTraceId(value: StackTraceId): Self = StObject.set(x, "parentStackTraceId", value.asInstanceOf[js.Any])
  }
}
