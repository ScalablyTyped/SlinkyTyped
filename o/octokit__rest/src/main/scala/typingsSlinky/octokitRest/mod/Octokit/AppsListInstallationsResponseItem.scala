package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListInstallationsResponseItem extends js.Object {
  var access_tokens_url: String = js.native
  var account: AppsListInstallationsResponseItemAccount = js.native
  var app_id: Double = js.native
  var events: js.Array[String] = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var permissions: AppsListInstallationsResponseItemPermissions = js.native
  var repositories_url: String = js.native
  var repository_selection: String = js.native
  var single_file_name: String = js.native
  var target_id: Double = js.native
  var target_type: String = js.native
}

object AppsListInstallationsResponseItem {
  @scala.inline
  def apply(
    access_tokens_url: String,
    account: AppsListInstallationsResponseItemAccount,
    app_id: Double,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: AppsListInstallationsResponseItemPermissions,
    repositories_url: String,
    repository_selection: String,
    single_file_name: String,
    target_id: Double,
    target_type: String
  ): AppsListInstallationsResponseItem = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], single_file_name = single_file_name.asInstanceOf[js.Any], target_id = target_id.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationsResponseItem]
  }
  @scala.inline
  implicit class AppsListInstallationsResponseItemOps[Self <: AppsListInstallationsResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_tokens_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_tokens_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount(value: AppsListInstallationsResponseItemAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: AppsListInstallationsResponseItemPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositories_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository_selection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingle_file_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single_file_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

