package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dismissalrestrictions extends js.Object {
  var branch: Required = js.native
  var dismiss_stale_reviews: Type = js.native
  var dismissal_restrictions: Type = js.native
  @JSName("dismissal_restrictions.teams")
  var dismissal_restrictionsDotteams: Type = js.native
  @JSName("dismissal_restrictions.users")
  var dismissal_restrictionsDotusers: Type = js.native
  var owner: Required = js.native
  var repo: Required = js.native
  var require_code_owner_reviews: Type = js.native
  var required_approving_review_count: Type = js.native
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
  @scala.inline
  implicit class DismissalrestrictionsOps[Self <: Dismissalrestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranch(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismiss_stale_reviews(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss_stale_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissal_restrictions(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissal_restrictionsDotteams(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions.teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissal_restrictionsDotusers(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissal_restrictions.users")(value.asInstanceOf[js.Any])
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
    def withRequire_code_owner_reviews(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_code_owner_reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired_approving_review_count(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_approving_review_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

