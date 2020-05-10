package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.closed
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsCreateParams extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * List GitHub IDs for organization members who will become team maintainers.
    */
  var maintainers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the team.
    */
  var name: String = js.native
  var org: String = js.native
  /**
    * The ID of a team to set as the parent team.
    */
  var parent_team_id: js.UndefOr[Double] = js.native
  /**
    * The level of privacy this team should have. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * Default: `secret`
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    * Default for child team: `closed`
    */
  var privacy: js.UndefOr[secret | closed] = js.native
  /**
    * The full name (e.g., "organization-name/repository-name") of repositories to add the team to.
    */
  var repo_names: js.UndefOr[js.Array[String]] = js.native
}

object TeamsCreateParams {
  @scala.inline
  def apply(name: String, org: String): TeamsCreateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateParams]
  }
  @scala.inline
  implicit class TeamsCreateParamsOps[Self <: TeamsCreateParams] (val x: Self) extends AnyVal {
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
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
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
    def withMaintainers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainers")(js.undefined)
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
    @scala.inline
    def withRepo_names(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepo_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_names")(js.undefined)
        ret
    }
  }
  
}

