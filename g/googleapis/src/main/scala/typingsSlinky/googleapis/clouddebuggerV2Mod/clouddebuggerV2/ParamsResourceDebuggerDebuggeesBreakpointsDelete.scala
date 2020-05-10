package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDebuggerDebuggeesBreakpointsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the breakpoint to delete.
    */
  var breakpointId: js.UndefOr[String] = js.native
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  /**
    * ID of the debuggee whose breakpoint to delete.
    */
  var debuggeeId: js.UndefOr[String] = js.native
}

object ParamsResourceDebuggerDebuggeesBreakpointsDelete {
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesBreakpointsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsDelete]
  }
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsDeleteOps[Self <: ParamsResourceDebuggerDebuggeesBreakpointsDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggeeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggeeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggeeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggeeId")(js.undefined)
        ret
    }
  }
  
}

