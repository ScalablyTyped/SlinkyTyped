package typingsSlinky.instagramPrivateApi.liveAddToPostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveAddToPostBroadcast extends js.Object {
  var broadcast_message: String = js.native
  var broadcast_owner: LiveAddToPostBroadcastOwner = js.native
  var broadcast_status: String = js.native
  var hide_from_feed_unit: Boolean = js.native
  var id: String = js.native
  var media_id: String = js.native
  var organic_tracking_token: String = js.native
  var published_time: Double = js.native
}

object LiveAddToPostBroadcast {
  @scala.inline
  def apply(
    broadcast_message: String,
    broadcast_owner: LiveAddToPostBroadcastOwner,
    broadcast_status: String,
    hide_from_feed_unit: Boolean,
    id: String,
    media_id: String,
    organic_tracking_token: String,
    published_time: Double
  ): LiveAddToPostBroadcast = {
    val __obj = js.Dynamic.literal(broadcast_message = broadcast_message.asInstanceOf[js.Any], broadcast_owner = broadcast_owner.asInstanceOf[js.Any], broadcast_status = broadcast_status.asInstanceOf[js.Any], hide_from_feed_unit = hide_from_feed_unit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], published_time = published_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveAddToPostBroadcast]
  }
  @scala.inline
  implicit class LiveAddToPostBroadcastOps[Self <: LiveAddToPostBroadcast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcast_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcast_owner(value: LiveAddToPostBroadcastOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBroadcast_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide_from_feed_unit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_from_feed_unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganic_tracking_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic_tracking_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublished_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

