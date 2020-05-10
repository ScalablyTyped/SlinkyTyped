package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListInstallationsForAuthenticatedUserResponse extends js.Object {
  var installations: js.Array[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem] = js.native
  var total_count: Double = js.native
}

object AppsListInstallationsForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    installations: js.Array[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem],
    total_count: Double
  ): AppsListInstallationsForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponse]
  }
  @scala.inline
  implicit class AppsListInstallationsForAuthenticatedUserResponseOps[Self <: AppsListInstallationsForAuthenticatedUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallations(value: js.Array[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installations")(value.asInstanceOf[js.Any])
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

