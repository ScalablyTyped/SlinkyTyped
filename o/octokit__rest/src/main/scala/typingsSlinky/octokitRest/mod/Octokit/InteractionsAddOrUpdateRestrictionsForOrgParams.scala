package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.collaborators_only
import typingsSlinky.octokitRest.octokitRestStrings.contributors_only
import typingsSlinky.octokitRest.octokitRestStrings.existing_users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionsAddOrUpdateRestrictionsForOrgParams extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only = js.native
  @JSName("org")
  var org_ : String = js.native
}

object InteractionsAddOrUpdateRestrictionsForOrgParams {
  @scala.inline
  def apply(limit: existing_users | contributors_only | collaborators_only, org_ : String): InteractionsAddOrUpdateRestrictionsForOrgParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForOrgParams]
  }
  @scala.inline
  implicit class InteractionsAddOrUpdateRestrictionsForOrgParamsOps[Self <: InteractionsAddOrUpdateRestrictionsForOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: existing_users | contributors_only | collaborators_only): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

