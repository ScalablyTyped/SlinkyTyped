package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectidUsername extends js.Object {
  var project_id: Required = js.native
  var username: Required = js.native
}

object ProjectidUsername {
  @scala.inline
  def apply(project_id: Required, username: Required): ProjectidUsername = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidUsername]
  }
  @scala.inline
  implicit class ProjectidUsernameOps[Self <: ProjectidUsername] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

