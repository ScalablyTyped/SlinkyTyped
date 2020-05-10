package typingsSlinky.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvSearchResponseUser extends js.Object {
  var biography: js.UndefOr[String] = js.native
  var biography_with_entities: js.UndefOr[IgtvSearchResponseBiographyWithEntities] = js.native
  var external_lynx_url: js.UndefOr[String] = js.native
  var external_url: js.UndefOr[String] = js.native
  var friendship_status: js.UndefOr[IgtvSearchResponseFriendshipStatus] = js.native
  var full_name: js.UndefOr[String] = js.native
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  var has_biography_translation: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[Double] = js.native
  var is_private: js.UndefOr[Boolean] = js.native
  var is_verified: js.UndefOr[Boolean] = js.native
  var latest_reel_media: js.UndefOr[Double] = js.native
  var mutual_followers_count: js.UndefOr[Double] = js.native
  var pk: js.UndefOr[Double] = js.native
  var profile_pic_id: js.UndefOr[String] = js.native
  var profile_pic_url: js.UndefOr[String] = js.native
  var username: String = js.native
}

object IgtvSearchResponseUser {
  @scala.inline
  def apply(username: String): IgtvSearchResponseUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseUser]
  }
  @scala.inline
  implicit class IgtvSearchResponseUserOps[Self <: IgtvSearchResponseUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiography(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiography: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography")(js.undefined)
        ret
    }
    @scala.inline
    def withBiography_with_entities(value: IgtvSearchResponseBiographyWithEntities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography_with_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBiography_with_entities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography_with_entities")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_lynx_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_lynx_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_lynx_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_lynx_url")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_url")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendship_status(value: IgtvSearchResponseFriendshipStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendship_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendship_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendship_status")(js.undefined)
        ret
    }
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_anonymous_profile_picture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_anonymous_profile_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_anonymous_profile_picture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_anonymous_profile_picture")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_biography_translation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_biography_translation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_biography_translation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_biography_translation")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_private(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_private: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_verified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_verified")(js.undefined)
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
    def withMutual_followers_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutual_followers_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutual_followers_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutual_followers_count")(js.undefined)
        ret
    }
    @scala.inline
    def withPk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_pic_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_pic_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile_pic_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(js.undefined)
        ret
    }
  }
  
}

