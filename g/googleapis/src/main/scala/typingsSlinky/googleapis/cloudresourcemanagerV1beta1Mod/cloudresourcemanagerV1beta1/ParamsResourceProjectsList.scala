package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * An expression for filtering the results of the request.  Filter rules are
    * case insensitive. The fields eligible for filtering are:  + `name` + `id`
    * + <code>labels.<em>key</em></code> where *key* is the name of a label
    * Some examples of using labels as filters:  |Filter|Description|
    * |------|-----------| |name:how*|The project's name starts with "how".|
    * |name:Howl|The project's name is `Howl` or `howl`.| |name:HOWL|Equivalent
    * to above.| |NAME:howl|Equivalent to above.| |labels.color:*|The project
    * has the label `color`.| |labels.color:red|The project's label `color` has
    * the value `red`.| |labels.color:red&nbsp;labels.size:big|The project's
    * label `color` has the value `red` and its label `size` has the value
    * `big`.  If you specify a filter that has both `parent.type` and
    * `parent.id`, then the `resourcemanager.projects.list` permission is
    * checked on the parent. If the user has this permission, all projects
    * under the parent will be returned after remaining filters have been
    * applied. If the user lacks this permission, then all projects for which
    * the user has the `resourcemanager.projects.get` permission will be
    * returned after remaining filters have been applied. If no filter is
    * specified, the call will return projects for which the user has
    * `resourcemanager.projects.get` permissions.  Optional.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The maximum number of Projects to return in the response. The server can
    * return fewer Projects than requested. If unspecified, server picks an
    * appropriate default.  Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to ListProjects that
    * indicates from where listing should continue.  Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsList {
  @scala.inline
  def apply(): ParamsResourceProjectsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsListOps[Self <: ParamsResourceProjectsList] (val x: Self) extends AnyVal {
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
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
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

