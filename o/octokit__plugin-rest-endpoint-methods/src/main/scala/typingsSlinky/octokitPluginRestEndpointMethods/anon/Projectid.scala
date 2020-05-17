package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projectid extends js.Object {
  var name: Required = js.native
  var project_id: Required = js.native
}

object Projectid {
  @scala.inline
  def apply(name: Required, project_id: Required): Projectid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projectid]
  }
  @scala.inline
  implicit class ProjectidOps[Self <: Projectid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

