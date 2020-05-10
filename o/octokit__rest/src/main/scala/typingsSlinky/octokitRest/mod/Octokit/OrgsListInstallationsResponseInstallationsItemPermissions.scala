package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsListInstallationsResponseInstallationsItemPermissions extends js.Object {
  var deployments: String = js.native
  var metadata: String = js.native
  var pull_requests: String = js.native
  var statuses: String = js.native
}

object OrgsListInstallationsResponseInstallationsItemPermissions {
  @scala.inline
  def apply(deployments: String, metadata: String, pull_requests: String, statuses: String): OrgsListInstallationsResponseInstallationsItemPermissions = {
    val __obj = js.Dynamic.literal(deployments = deployments.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListInstallationsResponseInstallationsItemPermissions]
  }
  @scala.inline
  implicit class OrgsListInstallationsResponseInstallationsItemPermissionsOps[Self <: OrgsListInstallationsResponseInstallationsItemPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_requests(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

