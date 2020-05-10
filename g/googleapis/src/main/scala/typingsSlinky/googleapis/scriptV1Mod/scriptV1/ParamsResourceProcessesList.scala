package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProcessesList extends StandardParameters {
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
    * Optional field used to limit returned processes to those originating from
    * projects with a specific deployment ID.
    */
  @JSName("userProcessFilter.deploymentId")
  var userProcessFilterDotdeploymentId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that completed
    * on or before the given timestamp.
    */
  @JSName("userProcessFilter.endTime")
  var userProcessFilterDotendTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * a script function with the given function name.
    */
  @JSName("userProcessFilter.functionName")
  var userProcessFilterDotfunctionName: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with project names containing a specific string.
    */
  @JSName("userProcessFilter.projectName")
  var userProcessFilterDotprojectName: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those originating from
    * projects with a specific script ID.
    */
  @JSName("userProcessFilter.scriptId")
  var userProcessFilterDotscriptId: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those that were
    * started on or after the given timestamp.
    */
  @JSName("userProcessFilter.startTime")
  var userProcessFilterDotstartTime: js.UndefOr[String] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process statuses.
    */
  @JSName("userProcessFilter.statuses")
  var userProcessFilterDotstatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified process types.
    */
  @JSName("userProcessFilter.types")
  var userProcessFilterDottypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional field used to limit returned processes to those having one of
    * the specified user access levels.
    */
  @JSName("userProcessFilter.userAccessLevels")
  var userProcessFilterDotuserAccessLevels: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceProcessesList {
  @scala.inline
  def apply(): ParamsResourceProcessesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProcessesList]
  }
  @scala.inline
  implicit class ParamsResourceProcessesListOps[Self <: ParamsResourceProcessesList] (val x: Self) extends AnyVal {
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
    def withUserProcessFilterDotdeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotdeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.deploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDotendTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotendTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDotfunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotfunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDotprojectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotprojectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.projectName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDotscriptId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.scriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotscriptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.scriptId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDotstartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotstartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDotstatuses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotstatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.statuses")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDottypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDottypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.types")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProcessFilterDotuserAccessLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.userAccessLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProcessFilterDotuserAccessLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProcessFilter.userAccessLevels")(js.undefined)
        ret
    }
  }
  
}

