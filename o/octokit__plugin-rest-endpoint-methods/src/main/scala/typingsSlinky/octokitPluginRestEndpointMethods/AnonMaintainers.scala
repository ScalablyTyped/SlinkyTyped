package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaintainers extends js.Object {
  var description: AnonType = js.native
  var maintainers: AnonType = js.native
  var name: AnonRequired = js.native
  var org: AnonRequired = js.native
  var parent_team_id: AnonType = js.native
  var permission: AnonEnum = js.native
  var privacy: AnonEnum = js.native
  var repo_names: AnonType = js.native
}

object AnonMaintainers {
  @scala.inline
  def apply(
    description: AnonType,
    maintainers: AnonType,
    name: AnonRequired,
    org: AnonRequired,
    parent_team_id: AnonType,
    permission: AnonEnum,
    privacy: AnonEnum,
    repo_names: AnonType
  ): AnonMaintainers = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repo_names = repo_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaintainers]
  }
  @scala.inline
  implicit class AnonMaintainersOps[Self <: AnonMaintainers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainers(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_team_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermission(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacy(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo_names(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_names")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

