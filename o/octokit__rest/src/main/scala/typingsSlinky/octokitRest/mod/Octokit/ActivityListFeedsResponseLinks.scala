package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityListFeedsResponseLinks extends js.Object {
  var current_user: ActivityListFeedsResponseLinksCurrentUser = js.native
  var current_user_actor: ActivityListFeedsResponseLinksCurrentUserActor = js.native
  var current_user_organization: ActivityListFeedsResponseLinksCurrentUserOrganization = js.native
  var current_user_organizations: js.Array[ActivityListFeedsResponseLinksCurrentUserOrganizationsItem] = js.native
  var current_user_public: ActivityListFeedsResponseLinksCurrentUserPublic = js.native
  var security_advisories: ActivityListFeedsResponseLinksSecurityAdvisories = js.native
  var timeline: ActivityListFeedsResponseLinksTimeline = js.native
  var user: ActivityListFeedsResponseLinksUser = js.native
}

object ActivityListFeedsResponseLinks {
  @scala.inline
  def apply(
    current_user: ActivityListFeedsResponseLinksCurrentUser,
    current_user_actor: ActivityListFeedsResponseLinksCurrentUserActor,
    current_user_organization: ActivityListFeedsResponseLinksCurrentUserOrganization,
    current_user_organizations: js.Array[ActivityListFeedsResponseLinksCurrentUserOrganizationsItem],
    current_user_public: ActivityListFeedsResponseLinksCurrentUserPublic,
    security_advisories: ActivityListFeedsResponseLinksSecurityAdvisories,
    timeline: ActivityListFeedsResponseLinksTimeline,
    user: ActivityListFeedsResponseLinksUser
  ): ActivityListFeedsResponseLinks = {
    val __obj = js.Dynamic.literal(current_user = current_user.asInstanceOf[js.Any], current_user_actor = current_user_actor.asInstanceOf[js.Any], current_user_organization = current_user_organization.asInstanceOf[js.Any], current_user_organizations = current_user_organizations.asInstanceOf[js.Any], current_user_public = current_user_public.asInstanceOf[js.Any], security_advisories = security_advisories.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListFeedsResponseLinks]
  }
  @scala.inline
  implicit class ActivityListFeedsResponseLinksOps[Self <: ActivityListFeedsResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent_user(value: ActivityListFeedsResponseLinksCurrentUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_actor(value: ActivityListFeedsResponseLinksCurrentUserActor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_organization(value: ActivityListFeedsResponseLinksCurrentUserOrganization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_organizations(value: js.Array[ActivityListFeedsResponseLinksCurrentUserOrganizationsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_organizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_public(value: ActivityListFeedsResponseLinksCurrentUserPublic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity_advisories(value: ActivityListFeedsResponseLinksSecurityAdvisories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security_advisories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: ActivityListFeedsResponseLinksTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ActivityListFeedsResponseLinksUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

