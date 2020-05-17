package typingsSlinky.giphyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatarurl extends js.Object {
  var avatar_url: String = js.native
  var banner_url: String = js.native
  var display_name: String = js.native
  var profile_url: String = js.native
  var twitter: String = js.native
  var username: String = js.native
}

object Avatarurl {
  @scala.inline
  def apply(
    avatar_url: String,
    banner_url: String,
    display_name: String,
    profile_url: String,
    twitter: String,
    username: String
  ): Avatarurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], banner_url = banner_url.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], profile_url = profile_url.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatarurl]
  }
  @scala.inline
  implicit class AvatarurlOps[Self <: Avatarurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBanner_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwitter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twitter")(value.asInstanceOf[js.Any])
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

