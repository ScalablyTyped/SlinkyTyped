package typingsSlinky.instagramPrivateApi.discoverRepositoryChainingResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverRepositoryChainingResponseUsersItem extends js.Object {
  var chaining_info: DiscoverRepositoryChainingResponseChainingInfo = js.native
  var full_name: String = js.native
  var is_private: Boolean = js.native
  var is_verified: Boolean = js.native
  var pk: Double = js.native
  var profile_chaining_secondary_label: String = js.native
  var profile_pic_id: js.UndefOr[String] = js.native
  var profile_pic_url: String = js.native
  var social_context: String = js.native
  var username: String = js.native
}

object DiscoverRepositoryChainingResponseUsersItem {
  @scala.inline
  def apply(
    chaining_info: DiscoverRepositoryChainingResponseChainingInfo,
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_chaining_secondary_label: String,
    profile_pic_url: String,
    social_context: String,
    username: String
  ): DiscoverRepositoryChainingResponseUsersItem = {
    val __obj = js.Dynamic.literal(chaining_info = chaining_info.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_chaining_secondary_label = profile_chaining_secondary_label.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverRepositoryChainingResponseUsersItem]
  }
  @scala.inline
  implicit class DiscoverRepositoryChainingResponseUsersItemOps[Self <: DiscoverRepositoryChainingResponseUsersItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChaining_info(value: DiscoverRepositoryChainingResponseChainingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chaining_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
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
    def withPk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_chaining_secondary_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_chaining_secondary_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocial_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("social_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
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
  }
  
}

