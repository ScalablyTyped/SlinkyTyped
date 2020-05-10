package typingsSlinky.instagramPrivateApi.directThreadRepositoryApproveParticipantRequestResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryApproveParticipantRequestResponseStoryShare extends js.Object {
  var is_reel_persisted: Boolean = js.native
  var media: DirectThreadRepositoryApproveParticipantRequestResponseMedia = js.native
  var reel_id: Double = js.native
  var reel_type: String = js.native
  var story_share_type: String = js.native
  var text: Null = js.native
}

object DirectThreadRepositoryApproveParticipantRequestResponseStoryShare {
  @scala.inline
  def apply(
    is_reel_persisted: Boolean,
    media: DirectThreadRepositoryApproveParticipantRequestResponseMedia,
    reel_id: Double,
    reel_type: String,
    story_share_type: String,
    text: Null
  ): DirectThreadRepositoryApproveParticipantRequestResponseStoryShare = {
    val __obj = js.Dynamic.literal(is_reel_persisted = is_reel_persisted.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], reel_id = reel_id.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], story_share_type = story_share_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseStoryShare]
  }
  @scala.inline
  implicit class DirectThreadRepositoryApproveParticipantRequestResponseStoryShareOps[Self <: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_reel_persisted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_reel_persisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: DirectThreadRepositoryApproveParticipantRequestResponseMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory_share_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_share_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

