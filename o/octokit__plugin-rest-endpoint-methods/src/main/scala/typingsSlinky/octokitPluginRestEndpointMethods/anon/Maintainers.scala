package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maintainers extends js.Object {
  var description: Type = js.native
  var maintainers: Type = js.native
  var name: Required = js.native
  @JSName("org")
  var org_ : Required = js.native
  var parent_team_id: Type = js.native
  var permission: Enum = js.native
  var privacy: Enum = js.native
  var repo_names: Type = js.native
}

object Maintainers {
  @scala.inline
  def apply(
    description: Type,
    maintainers: Type,
    name: Required,
    org_ : Required,
    parent_team_id: Type,
    permission: Enum,
    privacy: Enum,
    repo_names: Type
  ): Maintainers = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repo_names = repo_names.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintainers]
  }
  @scala.inline
  implicit class MaintainersOps[Self <: Maintainers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainers(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_team_id(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermission(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacy(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo_names(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_names")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

