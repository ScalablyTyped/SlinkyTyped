package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsDeleteParams extends js.Object {
  var project_id: Double = js.native
}

object ProjectsDeleteParams {
  @scala.inline
  def apply(project_id: Double): ProjectsDeleteParams = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDeleteParams]
  }
  @scala.inline
  implicit class ProjectsDeleteParamsOps[Self <: ProjectsDeleteParams] (val x: Self) extends AnyVal {
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
  }
  
}

