package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsListOps[Self <: ParamsResourceDebuggerDebuggeesBreakpointsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionDotvalue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action.value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionDotvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action.value")(js.undefined)
        ret
    }
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
    @scala.inline
    def withIncludeAllUsers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAllUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAllUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInactive")(js.undefined)
        ret
    }
    @scala.inline
    def withStripResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripResults")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitToken")(js.undefined)
        ret
    }
  }
  
}

