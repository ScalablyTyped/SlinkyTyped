package typingsSlinky.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomdomain extends js.Object {
  var custom_domain: js.UndefOr[String] = js.native
  var enterprise: String = js.native
  var feed_elements: String = js.native
  var feed_items: String = js.native
  var feeds: String = js.native
  var groups: String = js.native
  var metadata: String = js.native
  var partner: String = js.native
  var profile: String = js.native
  var query: String = js.native
  var recent: String = js.native
  var rest: String = js.native
  var search: String = js.native
  var sobjects: String = js.native
  var tooling_rest: String = js.native
  var tooling_soap: String = js.native
  var users: String = js.native
}

object AnonCustomdomain {
  @scala.inline
  def apply(
    enterprise: String,
    feed_elements: String,
    feed_items: String,
    feeds: String,
    groups: String,
    metadata: String,
    partner: String,
    profile: String,
    query: String,
    recent: String,
    rest: String,
    search: String,
    sobjects: String,
    tooling_rest: String,
    tooling_soap: String,
    users: String
  ): AnonCustomdomain = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], feed_elements = feed_elements.asInstanceOf[js.Any], feed_items = feed_items.asInstanceOf[js.Any], feeds = feeds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], partner = partner.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any], tooling_rest = tooling_rest.asInstanceOf[js.Any], tooling_soap = tooling_soap.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomdomain]
  }
  @scala.inline
  implicit class AnonCustomdomainOps[Self <: AnonCustomdomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterprise(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeed_elements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeed_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeeds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSobjects(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sobjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooling_rest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooling_rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooling_soap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooling_soap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_domain")(js.undefined)
        ret
    }
  }
  
}

