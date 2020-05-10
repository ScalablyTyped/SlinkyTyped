package typingsSlinky.openstackWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  var general_token: String = js.native
  var glance: Glance = js.native
  var neutron: Neutron = js.native
  var nova: Nova = js.native
  var octavia: Octavia = js.native
  var project_token: String = js.native
}

object Project {
  @scala.inline
  def apply(
    general_token: String,
    glance: Glance,
    neutron: Neutron,
    nova: Nova,
    octavia: Octavia,
    project_token: String
  ): Project = {
    val __obj = js.Dynamic.literal(general_token = general_token.asInstanceOf[js.Any], glance = glance.asInstanceOf[js.Any], neutron = neutron.asInstanceOf[js.Any], nova = nova.asInstanceOf[js.Any], octavia = octavia.asInstanceOf[js.Any], project_token = project_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneral_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("general_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlance(value: Glance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeutron(value: Neutron): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNova(value: Nova): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nova")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOctavia(value: Octavia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("octavia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

