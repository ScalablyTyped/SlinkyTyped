package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceControllerDebuggeesBreakpointsUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Identifies the debuggee being debugged.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  
  /**
    * Breakpoint identifier, unique in the scope of the debuggee.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateActiveBreakpointRequest] = js.native
}
object ParamsResourceControllerDebuggeesBreakpointsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceControllerDebuggeesBreakpointsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceControllerDebuggeesBreakpointsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceControllerDebuggeesBreakpointsUpdateOps[Self <: ParamsResourceControllerDebuggeesBreakpointsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDebuggeeId(value: String): Self = this.set("debuggeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggeeId: Self = this.set("debuggeeId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaUpdateActiveBreakpointRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
}
