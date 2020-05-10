package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProcessesListscriptprocesses extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of returned processes per page of results. Defaults
    * to 50.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The token for continuing a previous list request on the next page. This
    * should be set to the value of `nextPageToken` from a previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The script ID of the project whose processes are listed.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific deployment ID.
    */
  @JSName("scriptProcessFilter.deploymentId")
  var scriptProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that completed
    * on or before the given timestamp.
    */
  @JSName("scriptProcessFilter.endTime")
  var scriptProcessFilterDotendTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * a script function with the given function name.
    */
  @JSName("scriptProcessFilter.functionName")
  var scriptProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that were
    * started on or after the given timestamp.
    */
  @JSName("scriptProcessFilter.startTime")
  var scriptProcessFilterDotstartTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process statuses.
    */
  @JSName("scriptProcessFilter.statuses")
  var scriptProcessFilterDotstatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process types.
    */
  @JSName("scriptProcessFilter.types")
  var scriptProcessFilterDottypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified user access levels.
    */
  @JSName("scriptProcessFilter.userAccessLevels")
  var scriptProcessFilterDotuserAccessLevels: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceProcessesListscriptprocesses {
  @scala.inline
  def apply(): ParamsResourceProcessesListscriptprocesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProcessesListscriptprocesses]
  }
  @scala.inline
  implicit class ParamsResourceProcessesListscriptprocessesOps[Self <: ParamsResourceProcessesListscriptprocesses] (val x: Self) extends AnyVal {
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
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptProcessFilterDotdeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptProcessFilterDotdeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.deploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptProcessFilterDotendTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptProcessFilterDotendTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptProcessFilterDotfunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptProcessFilterDotfunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptProcessFilterDotstartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptProcessFilterDotstartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptProcessFilterDotstatuses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptProcessFilterDotstatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.statuses")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptProcessFilterDottypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptProcessFilterDottypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.types")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptProcessFilterDotuserAccessLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.userAccessLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptProcessFilterDotuserAccessLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptProcessFilter.userAccessLevels")(js.undefined)
        ret
    }
  }
  
}

