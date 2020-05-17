package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowdeletions extends js.Object {
  var allow_deletions: Type = js.native
  var allow_force_pushes: AllowNull = js.native
  var branch: Required = js.native
  var enforce_admins: AllowNullRequired = js.native
  var owner: Required = js.native
  var repo: Required = js.native
  var required_linear_history: Type = js.native
  var required_pull_request_reviews: AllowNullRequired = js.native
  @JSName("required_pull_request_reviews.dismiss_stale_reviews")
  var required_pull_request_reviewsDotdismiss_stale_reviews: Type = js.native
  @JSName("required_pull_request_reviews.dismissal_restrictions")
  var required_pull_request_reviewsDotdismissal_restrictions: Type = js.native
  @JSName("required_pull_request_reviews.dismissal_restrictions.teams")
  var required_pull_request_reviewsDotdismissal_restrictionsDotteams: Type = js.native
  @JSName("required_pull_request_reviews.dismissal_restrictions.users")
  var required_pull_request_reviewsDotdismissal_restrictionsDotusers: Type = js.native
  @JSName("required_pull_request_reviews.require_code_owner_reviews")
  var required_pull_request_reviewsDotrequire_code_owner_reviews: Type = js.native
  @JSName("required_pull_request_reviews.required_approving_review_count")
  var required_pull_request_reviewsDotrequired_approving_review_count: Type = js.native
  var required_status_checks: AllowNullRequired = js.native
  @JSName("required_status_checks.contexts")
  var required_status_checksDotcontexts: Required = js.native
  @JSName("required_status_checks.strict")
  var required_status_checksDotstrict: Required = js.native
  var restrictions: AllowNullRequired = js.native
  @JSName("restrictions.apps")
  var restrictionsDotapps: Type = js.native
  @JSName("restrictions.teams")
  var restrictionsDotteams: Required = js.native
  @JSName("restrictions.users")
  var restrictionsDotusers: Required = js.native
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
  @scala.inline
  implicit class AllowdeletionsOps[Self <: Allowdeletions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_deletions(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_force_pushes(value: AllowNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_force_pushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforce_admins(value: AllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_admins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_linear_history(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_linear_history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviews(value: AllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismiss_stale_reviews(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismiss_stale_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismissal_restrictions(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismissal_restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismissal_restrictionsDotteams(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismissal_restrictions.teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismissal_restrictionsDotusers(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismissal_restrictions.users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotrequire_code_owner_reviews(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.require_code_owner_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotrequired_approving_review_count(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.required_approving_review_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checks(value: AllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checksDotcontexts(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks.contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checksDotstrict(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks.strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: AllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictionsDotapps(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions.apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictionsDotteams(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions.teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictionsDotusers(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions.users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

