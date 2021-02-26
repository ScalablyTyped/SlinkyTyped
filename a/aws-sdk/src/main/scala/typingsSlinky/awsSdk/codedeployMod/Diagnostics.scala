package typingsSlinky.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostics extends StObject {
  
  /**
    * The associated error code:   Success: The specified script ran.   ScriptMissing: The specified script was not found in the specified location.   ScriptNotExecutable: The specified script is not a recognized executable file type.   ScriptTimedOut: The specified script did not finish running in the specified time period.   ScriptFailed: The specified script failed to run as expected.   UnknownError: The specified script did not run for an unknown reason.  
    */
  var errorCode: js.UndefOr[LifecycleErrorCode] = js.native
  
  /**
    * The last portion of the diagnostic log. If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
    */
  var logTail: js.UndefOr[LogTail] = js.native
  
  /**
    * The message associated with the error.
    */
  var message: js.UndefOr[LifecycleMessage] = js.native
  
  /**
    * The name of the script.
    */
  var scriptName: js.UndefOr[ScriptName] = js.native
}
object Diagnostics {
  
  @scala.inline
  def apply(): Diagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diagnostics]
  }
  
  @scala.inline
  implicit class DiagnosticsMutableBuilder[Self <: Diagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: LifecycleErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setLogTail(value: LogTail): Self = StObject.set(x, "logTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTailUndefined: Self = StObject.set(x, "logTail", js.undefined)
    
    @scala.inline
    def setMessage(value: LifecycleMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setScriptName(value: ScriptName): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptNameUndefined: Self = StObject.set(x, "scriptName", js.undefined)
  }
}
