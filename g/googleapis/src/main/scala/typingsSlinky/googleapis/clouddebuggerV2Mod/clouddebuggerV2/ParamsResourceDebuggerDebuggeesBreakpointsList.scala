package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDebuggerDebuggeesBreakpointsList extends StandardParameters {
  
  /**
    * Only breakpoints with the specified action will pass the filter.
    */
  @JSName("action.value")
  var actionDotvalue: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  
  /**
    * ID of the debuggee whose breakpoints to list.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  
  /**
    * When set to `true`, the response includes the list of breakpoints set by
    * any user. Otherwise, it includes only breakpoints set by the caller.
    */
  var includeAllUsers: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to `true`, the response includes active and inactive
    * breakpoints. Otherwise, it includes only active breakpoints.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  
  /**
    * This field is deprecated. The following fields are always stripped out of
    * the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
    */
  var stripResults: js.UndefOr[Boolean] = js.native
  
  /**
    * A wait token that, if specified, blocks the call until the breakpoints
    * list has changed, or a server selected timeout has expired.  The value
    * should be set from the last response. The error code
    * `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which should
    * be called again with the same `wait_token`.
    */
  var waitToken: js.UndefOr[String] = js.native
}
object ParamsResourceDebuggerDebuggeesBreakpointsList {
  
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesBreakpointsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsList]
  }
  
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsListMutableBuilder[Self <: ParamsResourceDebuggerDebuggeesBreakpointsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDotvalue(value: String): Self = StObject.set(x, "action.value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDotvalueUndefined: Self = StObject.set(x, "action.value", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    @scala.inline
    def setDebuggeeId(value: String): Self = StObject.set(x, "debuggeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggeeIdUndefined: Self = StObject.set(x, "debuggeeId", js.undefined)
    
    @scala.inline
    def setIncludeAllUsers(value: Boolean): Self = StObject.set(x, "includeAllUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAllUsersUndefined: Self = StObject.set(x, "includeAllUsers", js.undefined)
    
    @scala.inline
    def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
    
    @scala.inline
    def setStripResults(value: Boolean): Self = StObject.set(x, "stripResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripResultsUndefined: Self = StObject.set(x, "stripResults", js.undefined)
    
    @scala.inline
    def setWaitToken(value: String): Self = StObject.set(x, "waitToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitTokenUndefined: Self = StObject.set(x, "waitToken", js.undefined)
  }
}
