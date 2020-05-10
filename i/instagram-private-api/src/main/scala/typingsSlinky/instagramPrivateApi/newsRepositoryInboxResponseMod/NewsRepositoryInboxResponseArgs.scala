package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseArgs extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.native
  var aymt_channel_id: js.UndefOr[String] = js.native
  var aymt_notif_id: js.UndefOr[String] = js.native
  var aymt_notif_type: js.UndefOr[String] = js.native
  var clicked: Boolean = js.native
  var comment_id: js.UndefOr[String] = js.native
  var comment_ids: js.UndefOr[js.Array[String]] = js.native
  var comment_notif_type: js.UndefOr[String] = js.native
  var destination: js.UndefOr[String] = js.native
  var hashtag_follow: js.UndefOr[NewsRepositoryInboxResponseHashtagFollow] = js.native
  var icon_url: js.UndefOr[String] = js.native
  var latest_reel_media: js.UndefOr[Double] = js.native
  var links: js.UndefOr[js.Array[NewsRepositoryInboxResponseLinksItem]] = js.native
  var media: js.UndefOr[js.Array[NewsRepositoryInboxResponseMediaItem]] = js.native
  var profile_id: js.UndefOr[Double] = js.native
  var profile_image: js.UndefOr[String] = js.native
  var profile_image_destination: js.UndefOr[String] = js.native
  var profile_name: js.UndefOr[String] = js.native
  var rich_text: js.UndefOr[String] = js.native
  var second_profile_id: js.UndefOr[Double] = js.native
  var second_profile_image: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var timestamp: String = js.native
  var tuuid: String = js.native
}

object NewsRepositoryInboxResponseArgs {
  @scala.inline
  def apply(clicked: Boolean, timestamp: String, tuuid: String): NewsRepositoryInboxResponseArgs = {
    val __obj = js.Dynamic.literal(clicked = clicked.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tuuid = tuuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseArgs]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseArgsOps[Self <: NewsRepositoryInboxResponseArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClicked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAymt_channel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymt_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAymt_channel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymt_channel_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAymt_notif_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymt_notif_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAymt_notif_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymt_notif_id")(js.undefined)
        ret
    }
    @scala.inline
    def withAymt_notif_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymt_notif_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAymt_notif_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aymt_notif_type")(js.undefined)
        ret
    }
    @scala.inline
    def withComment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(js.undefined)
        ret
    }
    @scala.inline
    def withComment_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withComment_notif_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_notif_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_notif_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_notif_type")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtag_follow(value: NewsRepositoryInboxResponseHashtagFollow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag_follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag_follow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag_follow")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon_url")(js.undefined)
        ret
    }
    @scala.inline
    def withLatest_reel_media(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_reel_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatest_reel_media: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_reel_media")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[NewsRepositoryInboxResponseLinksItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: js.Array[NewsRepositoryInboxResponseMediaItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_image_destination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image_destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_image_destination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_image_destination")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_name")(js.undefined)
        ret
    }
    @scala.inline
    def withRich_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rich_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRich_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rich_text")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond_profile_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond_profile_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond_profile_image(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond_profile_image: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second_profile_image")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

