package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDebuggerDebuggeesList extends StandardParameters {
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
    * When set to `true`, the result includes all debuggees. Otherwise, the
    * result includes only debuggees that are active.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  /**
    * Project number of a Google Cloud project whose debuggees to list.
    */
  var project: js.UndefOr[String] = js.native
}

object ParamsResourceDebuggerDebuggeesList {
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesList]
  }
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesListOps[Self <: ParamsResourceDebuggerDebuggeesList] (val x: Self) extends AnyVal {
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
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
  }
  
}

