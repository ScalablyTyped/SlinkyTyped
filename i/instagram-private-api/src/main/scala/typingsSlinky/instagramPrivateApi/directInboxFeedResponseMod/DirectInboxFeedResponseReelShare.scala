package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponseReelShare extends js.Object {
  var is_reel_persisted: Boolean = js.native
  var media: DirectInboxFeedResponseMedia = js.native
  var reel_owner_id: Double = js.native
  var reel_type: String = js.native
  var text: String = js.native
  var `type`: String = js.native
}

object DirectInboxFeedResponseReelShare {
  @scala.inline
  def apply(
    is_reel_persisted: Boolean,
    media: DirectInboxFeedResponseMedia,
    reel_owner_id: Double,
    reel_type: String,
    text: String,
    `type`: String
  ): DirectInboxFeedResponseReelShare = {
    val __obj = js.Dynamic.literal(is_reel_persisted = is_reel_persisted.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], reel_owner_id = reel_owner_id.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseReelShare]
  }
  @scala.inline
  implicit class DirectInboxFeedResponseReelShareOps[Self <: DirectInboxFeedResponseReelShare] (val x: Self) extends AnyVal {
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
    def withMedia(value: DirectInboxFeedResponseMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel_owner_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_owner_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReel_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reel_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

