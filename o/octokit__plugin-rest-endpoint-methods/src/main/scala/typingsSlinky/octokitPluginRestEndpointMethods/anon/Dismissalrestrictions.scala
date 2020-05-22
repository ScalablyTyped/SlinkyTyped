package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dismissalrestrictions extends js.Object {
  var branch: Required
  var dismiss_stale_reviews: Type
  var dismissal_restrictions: Type
  @JSName("dismissal_restrictions.teams")
  var dismissal_restrictionsDotteams: Type
  @JSName("dismissal_restrictions.users")
  var dismissal_restrictionsDotusers: Type
  var owner: Required
  var repo: Required
  var require_code_owner_reviews: Type
  var required_approving_review_count: Type
}

object Dismissalrestrictions {
  @scala.inline
  def apply(
    branch: Required,
    dismiss_stale_reviews: Type,
    dismissal_restrictions: Type,
    dismissal_restrictionsDotteams: Type,
    dismissal_restrictionsDotusers: Type,
    owner: Required,
    repo: Required,
    require_code_owner_reviews: Type,
    required_approving_review_count: Type
  ): Dismissalrestrictions = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], dismiss_stale_reviews = dismiss_stale_reviews.asInstanceOf[js.Any], dismissal_restrictions = dismissal_restrictions.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], require_code_owner_reviews = require_code_owner_reviews.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any])
    __obj.updateDynamic("dismissal_restrictions.teams")(dismissal_restrictionsDotteams.asInstanceOf[js.Any])
    __obj.updateDynamic("dismissal_restrictions.users")(dismissal_restrictionsDotusers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dismissalrestrictions]
  }
}

