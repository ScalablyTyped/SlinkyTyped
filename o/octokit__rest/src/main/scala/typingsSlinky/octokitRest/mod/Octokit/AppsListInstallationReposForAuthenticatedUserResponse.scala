package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListInstallationReposForAuthenticatedUserResponse extends js.Object {
  var repositories: js.Array[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItem] = js.native
  var total_count: Double = js.native
}

object AppsListInstallationReposForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    repositories: js.Array[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItem],
    total_count: Double
  ): AppsListInstallationReposForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationReposForAuthenticatedUserResponse]
  }
  @scala.inline
  implicit class AppsListInstallationReposForAuthenticatedUserResponseOps[Self <: AppsListInstallationReposForAuthenticatedUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepositories(value: js.Array[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

