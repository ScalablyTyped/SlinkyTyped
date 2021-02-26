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
trait ParamsResourceDebuggerDebuggeesBreakpointsSet extends StandardParameters {
  
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
    * ID of the debuggee where the breakpoint is to be set.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBreakpoint] = js.native
}
object ParamsResourceDebuggerDebuggeesBreakpointsSet {
  
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesBreakpointsSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsSet]
  }
  
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsSetMutableBuilder[Self <: ParamsResourceDebuggerDebuggeesBreakpointsSet] (val x: Self) extends AnyVal {
    
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
    def setRequestBody(value: SchemaBreakpoint): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
