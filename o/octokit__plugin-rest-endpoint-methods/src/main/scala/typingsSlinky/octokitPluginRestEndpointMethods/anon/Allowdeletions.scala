package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allowdeletions extends js.Object {
  var allow_deletions: Type
  var allow_force_pushes: AllowNull
  var branch: Required
  var enforce_admins: AllowNullRequired
  var owner: Required
  var repo: Required
  var required_linear_history: Type
  var required_pull_request_reviews: AllowNullRequired
  @JSName("required_pull_request_reviews.dismiss_stale_reviews")
  var required_pull_request_reviewsDotdismiss_stale_reviews: Type
  @JSName("required_pull_request_reviews.dismissal_restrictions")
  var required_pull_request_reviewsDotdismissal_restrictions: Type
  @JSName("required_pull_request_reviews.dismissal_restrictions.teams")
  var required_pull_request_reviewsDotdismissal_restrictionsDotteams: Type
  @JSName("required_pull_request_reviews.dismissal_restrictions.users")
  var required_pull_request_reviewsDotdismissal_restrictionsDotusers: Type
  @JSName("required_pull_request_reviews.require_code_owner_reviews")
  var required_pull_request_reviewsDotrequire_code_owner_reviews: Type
  @JSName("required_pull_request_reviews.required_approving_review_count")
  var required_pull_request_reviewsDotrequired_approving_review_count: Type
  var required_status_checks: AllowNullRequired
  @JSName("required_status_checks.contexts")
  var required_status_checksDotcontexts: Required
  @JSName("required_status_checks.strict")
  var required_status_checksDotstrict: Required
  var restrictions: AllowNullRequired
  @JSName("restrictions.apps")
  var restrictionsDotapps: Type
  @JSName("restrictions.teams")
  var restrictionsDotteams: Required
  @JSName("restrictions.users")
  var restrictionsDotusers: Required
}

object Allowdeletions {
  @scala.inline
  def apply(
    allow_deletions: Type,
    allow_force_pushes: AllowNull,
    branch: Required,
    enforce_admins: AllowNullRequired,
    owner: Required,
    repo: Required,
    required_linear_history: Type,
    required_pull_request_reviews: AllowNullRequired,
    required_pull_request_reviewsDotdismiss_stale_reviews: Type,
    required_pull_request_reviewsDotdismissal_restrictions: Type,
    required_pull_request_reviewsDotdismissal_restrictionsDotteams: Type,
    required_pull_request_reviewsDotdismissal_restrictionsDotusers: Type,
    required_pull_request_reviewsDotrequire_code_owner_reviews: Type,
    required_pull_request_reviewsDotrequired_approving_review_count: Type,
    required_status_checks: AllowNullRequired,
    required_status_checksDotcontexts: Required,
    required_status_checksDotstrict: Required,
    restrictions: AllowNullRequired,
    restrictionsDotapps: Type,
    restrictionsDotteams: Required,
    restrictionsDotusers: Required
  ): Allowdeletions = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismiss_stale_reviews")(required_pull_request_reviewsDotdismiss_stale_reviews.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions")(required_pull_request_reviewsDotdismissal_restrictions.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions.teams")(required_pull_request_reviewsDotdismissal_restrictionsDotteams.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions.users")(required_pull_request_reviewsDotdismissal_restrictionsDotusers.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.require_code_owner_reviews")(required_pull_request_reviewsDotrequire_code_owner_reviews.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.required_approving_review_count")(required_pull_request_reviewsDotrequired_approving_review_count.asInstanceOf[js.Any])
    __obj.updateDynamic("required_status_checks.contexts")(required_status_checksDotcontexts.asInstanceOf[js.Any])
    __obj.updateDynamic("required_status_checks.strict")(required_status_checksDotstrict.asInstanceOf[js.Any])
    __obj.updateDynamic("restrictions.apps")(restrictionsDotapps.asInstanceOf[js.Any])
    __obj.updateDynamic("restrictions.teams")(restrictionsDotteams.asInstanceOf[js.Any])
    __obj.updateDynamic("restrictions.users")(restrictionsDotusers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowdeletions]
  }
}

