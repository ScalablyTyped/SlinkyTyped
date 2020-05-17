package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.anon.Features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var api_path: String = js.native
  var avatar: Avatar = js.native
  var current_user_metadata: Features = js.native
  var header_image_url: String = js.native
  var human_readable_role_for_display: String = js.native
  var id: Double = js.native
  var iq: Double = js.native
  var login: String = js.native
  var name: String = js.native
  var role_for_display: String = js.native
  var url: String = js.native
}

object User {
  @scala.inline
  def apply(
    api_path: String,
    avatar: Avatar,
    current_user_metadata: Features,
    header_image_url: String,
    human_readable_role_for_display: String,
    id: Double,
    iq: Double,
    login: String,
    name: String,
    role_for_display: String,
    url: String
  ): User = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], human_readable_role_for_display = human_readable_role_for_display.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iq = iq.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role_for_display = role_for_display.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatar(value: Avatar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_user_metadata(value: Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_user_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader_image_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_image_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHuman_readable_role_for_display(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("human_readable_role_for_display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole_for_display(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role_for_display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

