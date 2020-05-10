package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCreateInstallationTokenResponse extends js.Object {
  var expires_at: String = js.native
  var permissions: AppsCreateInstallationTokenResponsePermissions = js.native
  var repositories: js.Array[AppsCreateInstallationTokenResponseRepositoriesItem] = js.native
  var token: String = js.native
}

object AppsCreateInstallationTokenResponse {
  @scala.inline
  def apply(
    expires_at: String,
    permissions: AppsCreateInstallationTokenResponsePermissions,
    repositories: js.Array[AppsCreateInstallationTokenResponseRepositoriesItem],
    token: String
  ): AppsCreateInstallationTokenResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationTokenResponse]
  }
  @scala.inline
  implicit class AppsCreateInstallationTokenResponseOps[Self <: AppsCreateInstallationTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: AppsCreateInstallationTokenResponsePermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositories(value: js.Array[AppsCreateInstallationTokenResponseRepositoriesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

