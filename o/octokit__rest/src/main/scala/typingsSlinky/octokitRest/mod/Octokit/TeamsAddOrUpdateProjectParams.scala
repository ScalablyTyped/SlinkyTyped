package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.admin
import typingsSlinky.octokitRest.octokitRestStrings.read
import typingsSlinky.octokitRest.octokitRestStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAddOrUpdateProjectParams extends js.Object {
  /**
    * The permission to grant to the team for this project. Can be one of:
    * \* `read` - team members can read, but not write to or administer this project.
    * \* `write` - team members can read and write, but not administer this project.
    * \* `admin` - team members can read, write and administer this project.
    * Default: the team's `permission` attribute will be used to determine what permission to grant the team on this project. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  var permission: js.UndefOr[read | write | admin] = js.native
  var project_id: Double = js.native
  var team_id: Double = js.native
}

object TeamsAddOrUpdateProjectParams {
  @scala.inline
  def apply(project_id: Double, team_id: Double): TeamsAddOrUpdateProjectParams = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAddOrUpdateProjectParams]
  }
  @scala.inline
  implicit class TeamsAddOrUpdateProjectParamsOps[Self <: TeamsAddOrUpdateProjectParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermission(value: read | write | admin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(js.undefined)
        ret
    }
  }
  
}

