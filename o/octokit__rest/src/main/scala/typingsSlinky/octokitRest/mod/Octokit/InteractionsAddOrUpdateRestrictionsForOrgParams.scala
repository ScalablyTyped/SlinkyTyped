package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.collaborators_only
import typingsSlinky.octokitRest.octokitRestStrings.contributors_only
import typingsSlinky.octokitRest.octokitRestStrings.existing_users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsAddOrUpdateRestrictionsForOrgParams extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only
  @JSName("org")
  var org_ : String
}

object InteractionsAddOrUpdateRestrictionsForOrgParams {
  @scala.inline
  def apply(limit: existing_users | contributors_only | collaborators_only, org_ : String): InteractionsAddOrUpdateRestrictionsForOrgParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForOrgParams]
  }
}

