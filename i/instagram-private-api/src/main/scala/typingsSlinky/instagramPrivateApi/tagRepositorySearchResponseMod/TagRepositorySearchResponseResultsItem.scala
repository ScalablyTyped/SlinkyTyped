package typingsSlinky.instagramPrivateApi.tagRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagRepositorySearchResponseResultsItem extends js.Object {
  var allow_following: Null = js.native
  var allow_muting_story: Null = js.native
  var debug_info: Null = js.native
  var follow_button_text: Null = js.native
  var follow_status: Null = js.native
  var following: Null = js.native
  var id: String = js.native
  var media_count: Double = js.native
  var name: String = js.native
  var non_violating: Null = js.native
  var profile_pic_url: String = js.native
  var related_tags: Null = js.native
  var search_result_subtitle: String = js.native
  var show_follow_drop_down: Null = js.native
  var social_context: Null = js.native
  var social_context_profile_links: Null = js.native
  var subtitle: Null = js.native
}

object TagRepositorySearchResponseResultsItem {
  @scala.inline
  def apply(
    allow_following: Null,
    allow_muting_story: Null,
    debug_info: Null,
    follow_button_text: Null,
    follow_status: Null,
    following: Null,
    id: String,
    media_count: Double,
    name: String,
    non_violating: Null,
    profile_pic_url: String,
    related_tags: Null,
    search_result_subtitle: String,
    show_follow_drop_down: Null,
    social_context: Null,
    social_context_profile_links: Null,
    subtitle: Null
  ): TagRepositorySearchResponseResultsItem = {
    val __obj = js.Dynamic.literal(allow_following = allow_following.asInstanceOf[js.Any], allow_muting_story = allow_muting_story.asInstanceOf[js.Any], debug_info = debug_info.asInstanceOf[js.Any], follow_button_text = follow_button_text.asInstanceOf[js.Any], follow_status = follow_status.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], non_violating = non_violating.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], related_tags = related_tags.asInstanceOf[js.Any], search_result_subtitle = search_result_subtitle.asInstanceOf[js.Any], show_follow_drop_down = show_follow_drop_down.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], social_context_profile_links = social_context_profile_links.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRepositorySearchResponseResultsItem]
  }
  @scala.inline
  implicit class TagRepositorySearchResponseResultsItemOps[Self <: TagRepositorySearchResponseResultsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_following(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_following")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_muting_story(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_muting_story")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug_info(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollow_button_text(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_button_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollow_status(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNon_violating(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("non_violating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelated_tags(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch_result_subtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_result_subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow_follow_drop_down(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_follow_drop_down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocial_context(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocial_context_profile_links(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_context_profile_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

