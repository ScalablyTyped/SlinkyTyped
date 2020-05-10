package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityListFeedsResponse extends js.Object {
  var _links: ActivityListFeedsResponseLinks = js.native
  var current_user_actor_url: String = js.native
  var current_user_organization_url: String = js.native
  var current_user_organization_urls: js.Array[String] = js.native
  var current_user_public_url: String = js.native
  var current_user_url: String = js.native
  var security_advisories_url: String = js.native
  var timeline_url: String = js.native
  var user_url: String = js.native
}

object ActivityListFeedsResponse {
  @scala.inline
  def apply(
    _links: ActivityListFeedsResponseLinks,
    current_user_actor_url: String,
    current_user_organization_url: String,
    current_user_organization_urls: js.Array[String],
    current_user_public_url: String,
    current_user_url: String,
    security_advisories_url: String,
    timeline_url: String,
    user_url: String
  ): ActivityListFeedsResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], current_user_actor_url = current_user_actor_url.asInstanceOf[js.Any], current_user_organization_url = current_user_organization_url.asInstanceOf[js.Any], current_user_organization_urls = current_user_organization_urls.asInstanceOf[js.Any], current_user_public_url = current_user_public_url.asInstanceOf[js.Any], current_user_url = current_user_url.asInstanceOf[js.Any], security_advisories_url = security_advisories_url.asInstanceOf[js.Any], timeline_url = timeline_url.asInstanceOf[js.Any], user_url = user_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListFeedsResponse]
  }
  @scala.inline
  implicit class ActivityListFeedsResponseOps[Self <: ActivityListFeedsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: ActivityListFeedsResponseLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_actor_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_actor_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_organization_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_organization_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_organization_urls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_organization_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_public_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_public_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity_advisories_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security_advisories_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

