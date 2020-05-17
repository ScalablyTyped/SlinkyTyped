package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.closed
import typingsSlinky.octokitRest.octokitRestStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsUpdateInOrgParams extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the team.
    */
  var name: String = js.native
  @JSName("org")
  var org_ : String = js.native
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.native
  /**
    * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    */
  var privacy: js.UndefOr[secret | closed] = js.native
  var team_slug: String = js.native
}

object TeamsUpdateInOrgParams {
  @scala.inline
  def apply(name: String, org_ : String, team_slug: String): TeamsUpdateInOrgParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateInOrgParams]
  }
  @scala.inline
  implicit class TeamsUpdateInOrgParamsOps[Self <: TeamsUpdateInOrgParams] (val x: Self) extends AnyVal {
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
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
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

