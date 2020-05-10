package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDismissalrestrictions extends js.Object {
  var branch: AnonRequired = js.native
  var dismiss_stale_reviews: AnonType = js.native
  var dismissal_restrictions: AnonType = js.native
  @JSName("dismissal_restrictions.teams")
  var dismissal_restrictionsDotteams: AnonType = js.native
  @JSName("dismissal_restrictions.users")
  var dismissal_restrictionsDotusers: AnonType = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var require_code_owner_reviews: AnonType = js.native
  var required_approving_review_count: AnonType = js.native
}

object AnonDismissalrestrictions {
  @scala.inline
  def apply(
    branch: AnonRequired,
    dismiss_stale_reviews: AnonType,
    dismissal_restrictions: AnonType,
    dismissal_restrictionsDotteams: AnonType,
    dismissal_restrictionsDotusers: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    require_code_owner_reviews: AnonType,
    required_approving_review_count: AnonType
  ): AnonDismissalrestrictions = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], dismiss_stale_reviews = dismiss_stale_reviews.asInstanceOf[js.Any], dismissal_restrictions = dismissal_restrictions.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], require_code_owner_reviews = require_code_owner_reviews.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any])
    __obj.updateDynamic("dismissal_restrictions.teams")(dismissal_restrictionsDotteams.asInstanceOf[js.Any])
    __obj.updateDynamic("dismissal_restrictions.users")(dismissal_restrictionsDotusers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDismissalrestrictions]
  }
  @scala.inline
  implicit class AnonDismissalrestrictionsOps[Self <: AnonDismissalrestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismiss_stale_reviews(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss_stale_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissal_restrictions(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissal_restrictionsDotteams(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions.teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissal_restrictionsDotusers(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions.users")(value.asInstanceOf[js.Any])
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
    def withRequire_code_owner_reviews(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_code_owner_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_approving_review_count(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_approving_review_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

