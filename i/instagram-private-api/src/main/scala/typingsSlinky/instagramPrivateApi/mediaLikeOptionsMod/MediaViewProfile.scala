package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.media_view_profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaViewProfile extends BaseProfile {
  var module_name: media_view_profile = js.native
}

object MediaViewProfile {
  @scala.inline
  def apply(module_name: media_view_profile, user_id: String | Double, username: String): MediaViewProfile = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaViewProfile]
  }
  @scala.inline
  implicit class MediaViewProfileOps[Self <: MediaViewProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModule_name(value: media_view_profile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

