package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsGroupsList extends StandardParameters {
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups that are ancestors of the specified group. The groups are
    * returned in order, starting with the immediate parent and ending with the
    * most distant ancestor. If the specified group has no immediate parent,
    * the results are empty.
    */
  var ancestorsOfGroup: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups whose parentName field contains the group name. If no
    * groups have this parent, the results are empty.
    */
  var childrenOfGroup: js.UndefOr[String] = js.native
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns the descendants of the specified group. This is a superset of the
    * results returned by the childrenOfGroup filter, and includes
    * children-of-children, and so forth.
    */
  var descendantsOfGroup: js.UndefOr[String] = js.native
  /**
    * The project whose groups are to be listed. The format is
    * "projects/{project_id_or_number}".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A positive number that is the maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsGroupsList {
  @scala.inline
  def apply(): ParamsResourceProjectsGroupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsGroupsListOps[Self <: ParamsResourceProjectsGroupsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncestorsOfGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorsOfGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestorsOfGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorsOfGroup")(js.undefined)
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
    def withChildrenOfGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenOfGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenOfGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenOfGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDescendantsOfGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descendantsOfGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescendantsOfGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descendantsOfGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
  }
  
}

