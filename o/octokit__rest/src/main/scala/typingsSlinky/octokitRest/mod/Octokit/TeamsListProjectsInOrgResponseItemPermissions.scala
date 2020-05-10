package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsListProjectsInOrgResponseItemPermissions extends js.Object {
  var admin: Boolean = js.native
  var read: Boolean = js.native
  var write: Boolean = js.native
}

object TeamsListProjectsInOrgResponseItemPermissions {
  @scala.inline
  def apply(admin: Boolean, read: Boolean, write: Boolean): TeamsListProjectsInOrgResponseItemPermissions = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListProjectsInOrgResponseItemPermissions]
  }
  @scala.inline
  implicit class TeamsListProjectsInOrgResponseItemPermissionsOps[Self <: TeamsListProjectsInOrgResponseItemPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

