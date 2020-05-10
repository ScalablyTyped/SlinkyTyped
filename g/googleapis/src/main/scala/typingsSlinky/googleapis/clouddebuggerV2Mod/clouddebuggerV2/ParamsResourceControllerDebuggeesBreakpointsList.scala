package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceControllerDebuggeesBreakpointsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Identifies the debuggee.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  /**
    * If set to `true` (recommended), returns `google.rpc.Code.OK` status and
    * sets the `wait_expired` response field to `true` when the server-selected
    * timeout has expired.  If set to `false` (deprecated), returns
    * `google.rpc.Code.ABORTED` status when the server-selected timeout has
    * expired.
    */
  var successOnTimeout: js.UndefOr[Boolean] = js.native
  /**
    * A token that, if specified, blocks the method call until the list of
    * active breakpoints has changed, or a server-selected timeout has expired.
    * The value should be set from the `next_wait_token` field in the last
    * response. The initial value should be set to `"init"`.
    */
  var waitToken: js.UndefOr[String] = js.native
}

object ParamsResourceControllerDebuggeesBreakpointsList {
  @scala.inline
  def apply(): ParamsResourceControllerDebuggeesBreakpointsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceControllerDebuggeesBreakpointsList]
  }
  @scala.inline
  implicit class ParamsResourceControllerDebuggeesBreakpointsListOps[Self <: ParamsResourceControllerDebuggeesBreakpointsList] (val x: Self) extends AnyVal {
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
    def withSuccessOnTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successOnTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessOnTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successOnTimeout")(js.undefined)
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

