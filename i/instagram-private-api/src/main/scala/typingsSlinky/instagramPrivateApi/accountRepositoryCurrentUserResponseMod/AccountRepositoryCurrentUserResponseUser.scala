package typingsSlinky.instagramPrivateApi.accountRepositoryCurrentUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryCurrentUserResponseUser extends js.Object {
  var allowed_commenter_type: String = js.native
  var biography: String = js.native
  var biography_with_entities: AccountRepositoryCurrentUserResponseBiographyWithEntities = js.native
  var birthday: Null = js.native
  var can_link_entities_in_bio: Boolean = js.native
  var country_code: Double = js.native
  var email: String = js.native
  var external_url: String = js.native
  var full_name: String = js.native
  var gender: Double = js.native
  var has_anonymous_profile_picture: Boolean = js.native
  var has_biography_translation: Boolean = js.native
  var hd_profile_pic_url_info: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo = js.native
  var hd_profile_pic_versions: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem] = js.native
  var is_private: Boolean = js.native
  var is_verified: Boolean = js.native
  var national_number: Double = js.native
  var phone_number: String = js.native
  var pk: Double = js.native
  var profile_pic_id: String = js.native
  var profile_pic_url: String = js.native
  var reel_auto_archive: String = js.native
  var show_conversion_edit_entry: Boolean = js.native
  var username: String = js.native
}

object AccountRepositoryCurrentUserResponseUser {
  @scala.inline
  def apply(
    allowed_commenter_type: String,
    biography: String,
    biography_with_entities: AccountRepositoryCurrentUserResponseBiographyWithEntities,
    birthday: Null,
    can_link_entities_in_bio: Boolean,
    country_code: Double,
    email: String,
    external_url: String,
    full_name: String,
    gender: Double,
    has_anonymous_profile_picture: Boolean,
    has_biography_translation: Boolean,
    hd_profile_pic_url_info: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo,
    hd_profile_pic_versions: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem],
    is_private: Boolean,
    is_verified: Boolean,
    national_number: Double,
    phone_number: String,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    show_conversion_edit_entry: Boolean,
    username: String
  ): AccountRepositoryCurrentUserResponseUser = {
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], can_link_entities_in_bio = can_link_entities_in_bio.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], hd_profile_pic_url_info = hd_profile_pic_url_info.asInstanceOf[js.Any], hd_profile_pic_versions = hd_profile_pic_versions.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_conversion_edit_entry = show_conversion_edit_entry.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryCurrentUserResponseUser]
  }
  @scala.inline
  implicit class AccountRepositoryCurrentUserResponseUserOps[Self <: AccountRepositoryCurrentUserResponseUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed_commenter_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_commenter_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiography(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBiography_with_entities(value: AccountRepositoryCurrentUserResponseBiographyWithEntities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("biography_with_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthday(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_link_entities_in_bio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_link_entities_in_bio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_anonymous_profile_picture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_anonymous_profile_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_biography_translation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_biography_translation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHd_profile_pic_url_info(value: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd_profile_pic_url_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHd_profile_pic_versions(value: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd_profile_pic_versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_private(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNational_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("national_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel_auto_archive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_auto_archive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow_conversion_edit_entry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_conversion_edit_entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

