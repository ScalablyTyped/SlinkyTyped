package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowdeletions extends js.Object {
  var allow_deletions: AnonType = js.native
  var allow_force_pushes: AnonAllowNull = js.native
  var branch: AnonRequired = js.native
  var enforce_admins: AnonAllowNullRequired = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var required_linear_history: AnonType = js.native
  var required_pull_request_reviews: AnonAllowNullRequired = js.native
  @JSName("required_pull_request_reviews.dismiss_stale_reviews")
  var required_pull_request_reviewsDotdismiss_stale_reviews: AnonType = js.native
  @JSName("required_pull_request_reviews.dismissal_restrictions")
  var required_pull_request_reviewsDotdismissal_restrictions: AnonType = js.native
  @JSName("required_pull_request_reviews.dismissal_restrictions.teams")
  var required_pull_request_reviewsDotdismissal_restrictionsDotteams: AnonType = js.native
  @JSName("required_pull_request_reviews.dismissal_restrictions.users")
  var required_pull_request_reviewsDotdismissal_restrictionsDotusers: AnonType = js.native
  @JSName("required_pull_request_reviews.require_code_owner_reviews")
  var required_pull_request_reviewsDotrequire_code_owner_reviews: AnonType = js.native
  @JSName("required_pull_request_reviews.required_approving_review_count")
  var required_pull_request_reviewsDotrequired_approving_review_count: AnonType = js.native
  var required_status_checks: AnonAllowNullRequired = js.native
  @JSName("required_status_checks.contexts")
  var required_status_checksDotcontexts: AnonRequired = js.native
  @JSName("required_status_checks.strict")
  var required_status_checksDotstrict: AnonRequired = js.native
  var restrictions: AnonAllowNullRequired = js.native
  @JSName("restrictions.apps")
  var restrictionsDotapps: AnonType = js.native
  @JSName("restrictions.teams")
  var restrictionsDotteams: AnonRequired = js.native
  @JSName("restrictions.users")
  var restrictionsDotusers: AnonRequired = js.native
}

object AnonAllowdeletions {
  @scala.inline
  def apply(
    allow_deletions: AnonType,
    allow_force_pushes: AnonAllowNull,
    branch: AnonRequired,
    enforce_admins: AnonAllowNullRequired,
    owner: AnonRequired,
    repo: AnonRequired,
    required_linear_history: AnonType,
    required_pull_request_reviews: AnonAllowNullRequired,
    required_pull_request_reviewsDotdismiss_stale_reviews: AnonType,
    required_pull_request_reviewsDotdismissal_restrictions: AnonType,
    required_pull_request_reviewsDotdismissal_restrictionsDotteams: AnonType,
    required_pull_request_reviewsDotdismissal_restrictionsDotusers: AnonType,
    required_pull_request_reviewsDotrequire_code_owner_reviews: AnonType,
    required_pull_request_reviewsDotrequired_approving_review_count: AnonType,
    required_status_checks: AnonAllowNullRequired,
    required_status_checksDotcontexts: AnonRequired,
    required_status_checksDotstrict: AnonRequired,
    restrictions: AnonAllowNullRequired,
    restrictionsDotapps: AnonType,
    restrictionsDotteams: AnonRequired,
    restrictionsDotusers: AnonRequired
  ): AnonAllowdeletions = {
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
    __obj.asInstanceOf[AnonAllowdeletions]
  }
  @scala.inline
  implicit class AnonAllowdeletionsOps[Self <: AnonAllowdeletions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_deletions(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_force_pushes(value: AnonAllowNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_force_pushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforce_admins(value: AnonAllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforce_admins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_linear_history(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_linear_history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviews(value: AnonAllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismiss_stale_reviews(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismiss_stale_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismissal_restrictions(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismissal_restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismissal_restrictionsDotteams(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismissal_restrictions.teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotdismissal_restrictionsDotusers(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.dismissal_restrictions.users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotrequire_code_owner_reviews(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.require_code_owner_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_pull_request_reviewsDotrequired_approving_review_count(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_pull_request_reviews.required_approving_review_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checks(value: AnonAllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checksDotcontexts(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks.contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_status_checksDotstrict(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_status_checks.strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: AnonAllowNullRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictionsDotapps(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions.apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictionsDotteams(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions.teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictionsDotusers(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions.users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

