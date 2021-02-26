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
trait ParamsResourceDebuggerDebuggeesBreakpointsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ID of the breakpoint to get.
    */
  var breakpointId: js.UndefOr[String] = js.native
  
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  
  /**
    * ID of the debuggee whose breakpoint to get.
    */
  var debuggeeId: js.UndefOr[String] = js.native
}
object ParamsResourceDebuggerDebuggeesBreakpointsGet {
  
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesBreakpointsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsGetMutableBuilder[Self <: ParamsResourceDebuggerDebuggeesBreakpointsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBreakpointId(value: String): Self = StObject.set(x, "breakpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointIdUndefined: Self = StObject.set(x, "breakpointId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    @scala.inline
    def setDebuggeeId(value: String): Self = StObject.set(x, "debuggeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggeeIdUndefined: Self = StObject.set(x, "debuggeeId", js.undefined)
  }
}
