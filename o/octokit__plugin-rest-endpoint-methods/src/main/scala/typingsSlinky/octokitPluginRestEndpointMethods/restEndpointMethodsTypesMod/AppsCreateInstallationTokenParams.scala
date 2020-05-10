package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCreateInstallationTokenParams extends js.Object {
  var installation_id: Double = js.native
  /**
    * The permissions granted to the access token. The permissions object includes the permission names and their access type. For a complete list of permissions and allowable values, see "[GitHub App permissions](https://developer.github.com/apps/building-github-apps/creating-github-apps-using-url-parameters/#github-app-permissions)."
    */
  var permissions: js.UndefOr[AppsCreateInstallationTokenParamsPermissions] = js.native
  /**
    * The `id`s of the repositories that the installation token can access. Providing repository `id`s restricts the access of an installation token to specific repositories. You can use the "[List repositories](https://developer.github.com/v3/apps/installations/#list-repositories)" endpoint to get the `id` of all repositories that an installation can access. For example, you can select specific repositories when creating an installation token to restrict the number of repositories that can be cloned using the token.
    */
  var repository_ids: js.UndefOr[js.Array[Double]] = js.native
}

object AppsCreateInstallationTokenParams {
  @scala.inline
  def apply(installation_id: Double): AppsCreateInstallationTokenParams = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationTokenParams]
  }
  @scala.inline
  implicit class AppsCreateInstallationTokenParamsOps[Self <: AppsCreateInstallationTokenParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallation_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installation_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: AppsCreateInstallationTokenParamsPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_ids")(js.undefined)
        ret
    }
  }
  
}

