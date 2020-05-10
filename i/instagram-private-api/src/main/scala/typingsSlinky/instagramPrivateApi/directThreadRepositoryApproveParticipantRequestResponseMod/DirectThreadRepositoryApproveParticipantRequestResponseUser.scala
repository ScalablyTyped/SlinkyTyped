package typingsSlinky.instagramPrivateApi.directThreadRepositoryApproveParticipantRequestResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryApproveParticipantRequestResponseUser extends js.Object {
  var allowed_commenter_type: String = js.native
  var can_boost_post: Boolean = js.native
  var can_see_organic_insights: Boolean = js.native
  var full_name: String = js.native
  var has_anonymous_profile_picture: Boolean = js.native
  var is_private: Boolean = js.native
  var is_unpublished: Boolean = js.native
  var pk: Double = js.native
  var profile_pic_id: String = js.native
  var profile_pic_url: String = js.native
  var reel_auto_archive: String = js.native
  var show_insights_terms: Boolean = js.native
  var username: String = js.native
}

object DirectThreadRepositoryApproveParticipantRequestResponseUser {
  @scala.inline
  def apply(
    allowed_commenter_type: String,
    can_boost_post: Boolean,
    can_see_organic_insights: Boolean,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_unpublished: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    show_insights_terms: Boolean,
    username: String
  ): DirectThreadRepositoryApproveParticipantRequestResponseUser = {
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseUser]
  }
  @scala.inline
  implicit class DirectThreadRepositoryApproveParticipantRequestResponseUserOps[Self <: DirectThreadRepositoryApproveParticipantRequestResponseUser] (val x: Self) extends AnyVal {
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
    def withCan_boost_post(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_boost_post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_see_organic_insights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_see_organic_insights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_anonymous_profile_picture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_anonymous_profile_picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_private(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_unpublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_unpublished")(value.asInstanceOf[js.Any])
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
    def withShow_insights_terms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_insights_terms")(value.asInstanceOf[js.Any])
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

