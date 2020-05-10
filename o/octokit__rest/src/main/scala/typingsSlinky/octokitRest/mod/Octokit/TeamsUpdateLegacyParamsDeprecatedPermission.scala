package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.closed
import typingsSlinky.octokitRest.octokitRestStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsUpdateLegacyParamsDeprecatedPermission extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the team.
    */
  var name: String = js.native
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.native
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    * @deprecated "permission" parameter has been deprecated and will be removed in future
    */
  var permission: js.UndefOr[String] = js.native
  /**
    * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    */
  var privacy: js.UndefOr[secret | closed] = js.native
  var team_id: Double = js.native
}

object TeamsUpdateLegacyParamsDeprecatedPermission {
  @scala.inline
  def apply(name: String, team_id: Double): TeamsUpdateLegacyParamsDeprecatedPermission = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateLegacyParamsDeprecatedPermission]
  }
  @scala.inline
  implicit class TeamsUpdateLegacyParamsDeprecatedPermissionOps[Self <: TeamsUpdateLegacyParamsDeprecatedPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withParent_team_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_team_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent_team_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_team_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPermission(value: String): Self = {
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
    @scala.inline
    def withPrivacy(value: secret | closed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(js.undefined)
        ret
    }
  }
  
}

