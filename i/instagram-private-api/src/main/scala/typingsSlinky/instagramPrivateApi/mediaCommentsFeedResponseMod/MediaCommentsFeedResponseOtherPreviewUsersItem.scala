package typingsSlinky.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaCommentsFeedResponseOtherPreviewUsersItem extends js.Object {
  var id: Double = js.native
  var profile_pic_url: String = js.native
}

object MediaCommentsFeedResponseOtherPreviewUsersItem {
  @scala.inline
  def apply(id: Double, profile_pic_url: String): MediaCommentsFeedResponseOtherPreviewUsersItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponseOtherPreviewUsersItem]
  }
  @scala.inline
  implicit class MediaCommentsFeedResponseOtherPreviewUsersItemOps[Self <: MediaCommentsFeedResponseOtherPreviewUsersItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

