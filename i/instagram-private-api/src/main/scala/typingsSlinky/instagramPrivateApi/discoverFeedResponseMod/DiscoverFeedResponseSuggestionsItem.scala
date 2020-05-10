package typingsSlinky.instagramPrivateApi.discoverFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverFeedResponseSuggestionsItem extends js.Object {
  var algorithm: String = js.native
  var caption: String = js.native
  var followed_by: Boolean = js.native
  var icon: String = js.native
  var is_new_suggestion: Boolean = js.native
  var large_urls: js.Array[_] = js.native
  var media_ids: js.Array[_] = js.native
  var media_infos: js.Array[_] = js.native
  var social_context: String = js.native
  var thumbnail_urls: js.Array[_] = js.native
  var user: DiscoverFeedResponseUser = js.native
  var uuid: String = js.native
  var value: Double = js.native
}

object DiscoverFeedResponseSuggestionsItem {
  @scala.inline
  def apply(
    algorithm: String,
    caption: String,
    followed_by: Boolean,
    icon: String,
    is_new_suggestion: Boolean,
    large_urls: js.Array[_],
    media_ids: js.Array[_],
    media_infos: js.Array[_],
    social_context: String,
    thumbnail_urls: js.Array[_],
    user: DiscoverFeedResponseUser,
    uuid: String,
    value: Double
  ): DiscoverFeedResponseSuggestionsItem = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], is_new_suggestion = is_new_suggestion.asInstanceOf[js.Any], large_urls = large_urls.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], media_infos = media_infos.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], thumbnail_urls = thumbnail_urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverFeedResponseSuggestionsItem]
  }
  @scala.inline
  implicit class DiscoverFeedResponseSuggestionsItemOps[Self <: DiscoverFeedResponseSuggestionsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowed_by(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followed_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_new_suggestion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_new_suggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLarge_urls(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_ids(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_infos(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_infos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocial_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_urls(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: DiscoverFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

