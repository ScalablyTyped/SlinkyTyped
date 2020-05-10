package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsAddRepoToInstallationParams extends js.Object {
  var installation_id: Double = js.native
  var repository_id: Double = js.native
}

object AppsAddRepoToInstallationParams {
  @scala.inline
  def apply(installation_id: Double, repository_id: Double): AppsAddRepoToInstallationParams = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsAddRepoToInstallationParams]
  }
  @scala.inline
  implicit class AppsAddRepoToInstallationParamsOps[Self <: AppsAddRepoToInstallationParams] (val x: Self) extends AnyVal {
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
    def withRepository_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

