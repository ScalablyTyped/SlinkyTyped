package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeRequest extends StObject {
  
  /**
    * Set to true to terminate execution upon resuming execution. In contrast
    * to Runtime.terminateExecution, this will allows to execute further
    * JavaScript (i.e. via evaluation) until execution of the paused code
    * is actually resumed, at which point termination is triggered.
    * If execution is currently not paused, this parameter has no effect.
    */
  var terminateOnResume: js.UndefOr[Boolean] = js.native
}
object ResumeRequest {
  
  @scala.inline
  def apply(): ResumeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeRequest]
  }
  
  @scala.inline
  implicit class ResumeRequestMutableBuilder[Self <: ResumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerminateOnResume(value: Boolean): Self = StObject.set(x, "terminateOnResume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateOnResumeUndefined: Self = StObject.set(x, "terminateOnResume", js.undefined)
  }
}
