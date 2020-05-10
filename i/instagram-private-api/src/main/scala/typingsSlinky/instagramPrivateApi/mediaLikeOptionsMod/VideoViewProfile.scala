package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.video_view_profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoViewProfile extends BaseProfile {
  var module_name: video_view_profile = js.native
}

object VideoViewProfile {
  @scala.inline
  def apply(module_name: video_view_profile, user_id: String | Double, username: String): VideoViewProfile = {
    val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoViewProfile]
  }
  @scala.inline
  implicit class VideoViewProfileOps[Self <: VideoViewProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModule_name(value: video_view_profile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

