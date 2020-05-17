package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.anon.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Artist =========================================================================================
@js.native
trait Artist extends js.Object {
  var alternate_names: js.Array[_] = js.native
  var api_path: String = js.native
  var current_user_metadata: Permissions = js.native
  var description: Description = js.native
  var description_annotation: DescriptionAnnotation = js.native
  var facebook_name: String = js.native
  var followers_count: Double = js.native
  var header_image_url: String = js.native
  var id: Double = js.native
  var image_url: String = js.native
  var instagram_name: String = js.native
  var is_meme_verified: Boolean = js.native
  var is_verified: Boolean = js.native
  var name: String = js.native
  var translation_artist: Boolean = js.native
  var twitter_name: String = js.native
  var url: String = js.native
  var user: js.UndefOr[js.Any] = js.native
}

object Artist {
  @scala.inline
  def apply(
    alternate_names: js.Array[_],
    api_path: String,
    current_user_metadata: Permissions,
    description: Description,
    description_annotation: DescriptionAnnotation,
    facebook_name: String,
    followers_count: Double,
    header_image_url: String,
    id: Double,
    image_url: String,
    instagram_name: String,
    is_meme_verified: Boolean,
    is_verified: Boolean,
    name: String,
    translation_artist: Boolean,
    twitter_name: String,
    url: String
  ): Artist = {
    val __obj = js.Dynamic.literal(alternate_names = alternate_names.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], facebook_name = facebook_name.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], instagram_name = instagram_name.asInstanceOf[js.Any], is_meme_verified = is_meme_verified.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], translation_artist = translation_artist.asInstanceOf[js.Any], twitter_name = twitter_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artist]
  }
  @scala.inline
  implicit class ArtistOps[Self <: Artist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate_names(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApi_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_metadata(value: Permissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription_annotation(value: DescriptionAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description_annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacebook_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_meme_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_meme_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslation_artist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation_artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwitter_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

