package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ExecuteResponse extends StObject {
  
  /** True if the result was served from cache, false if it was executed. */
  var cachedResult: js.UndefOr[Boolean] = js.native
  
  /** Freeform informational message with details on the execution of the action that may be displayed to the user upon failure or when requested explicitly. */
  var message: js.UndefOr[String] = js.native
  
  /** The result of the action. */
  var result: js.UndefOr[BuildBazelRemoteExecutionV2ActionResult] = js.native
  
  /**
    * An optional list of additional log outputs the server wishes to provide. A server can use this to return execution-specific logs however it wishes. This is intended primarily to
    * make it easier for users to debug issues that may be outside of the actual job execution, such as by identifying the worker executing the action or by providing logs from the
    * worker's setup phase. The keys SHOULD be human readable so that a client can display them to a user.
    */
  var serverLogs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.remotebuildexecution.gapi.client.remotebuildexecution.BuildBazelRemoteExecutionV2LogFile}
    */ typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.BuildBazelRemoteExecutionV2ExecuteResponse with TopLevel[js.Any]
  ] = js.native
  
  /**
    * If the status has a code other than `OK`, it indicates that the action did not finish execution. For example, if the operation times out during execution, the status will have a
    * `DEADLINE_EXCEEDED` code. Servers MUST use this field for errors in execution, rather than the error field on the `Operation` object. If the status code is other than `OK`, then the
    * result MUST NOT be cached. For an error status, the `result` field is optional; the server may populate the output-, stdout-, and stderr-related fields if it has any information
    * available, such as the stdout and stderr of a timed-out action.
    */
  var status: js.UndefOr[GoogleRpcStatus] = js.native
}
object BuildBazelRemoteExecutionV2ExecuteResponse {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ExecuteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecuteResponse]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ExecuteResponseMutableBuilder[Self <: BuildBazelRemoteExecutionV2ExecuteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachedResult(value: Boolean): Self = StObject.set(x, "cachedResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedResultUndefined: Self = StObject.set(x, "cachedResult", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setResult(value: BuildBazelRemoteExecutionV2ActionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setServerLogs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.remotebuildexecution.gapi.client.remotebuildexecution.BuildBazelRemoteExecutionV2LogFile}
      */ typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.BuildBazelRemoteExecutionV2ExecuteResponse with TopLevel[js.Any]
    ): Self = StObject.set(x, "serverLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerLogsUndefined: Self = StObject.set(x, "serverLogs", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
