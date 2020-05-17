package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectidRequired extends js.Object {
  var project_id: Required = js.native
}

object ProjectidRequired {
  @scala.inline
  def apply(project_id: Required): ProjectidRequired = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidRequired]
  }
  @scala.inline
  implicit class ProjectidRequiredOps[Self <: ProjectidRequired] (val x: Self) extends AnyVal {
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
  }
  
}

