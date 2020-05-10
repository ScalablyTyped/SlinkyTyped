package typingsSlinky.instagramPrivateApi.liveAddToPostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveAddToPostResponse extends js.Object {
  var broadcasts: js.Array[LiveAddToPostBroadcast] = js.native
  var can_reply: Boolean = js.native
  var can_reshare: Boolean = js.native
  var last_seen_broadcast_ts: Double = js.native
  var pk: String = js.native
  var status: String = js.native
  var user: LiveAddToPostUser = js.native
}

object LiveAddToPostResponse {
  @scala.inline
  def apply(
    broadcasts: js.Array[LiveAddToPostBroadcast],
    can_reply: Boolean,
    can_reshare: Boolean,
    last_seen_broadcast_ts: Double,
    pk: String,
    status: String,
    user: LiveAddToPostUser
  ): LiveAddToPostResponse = {
    val __obj = js.Dynamic.literal(broadcasts = broadcasts.asInstanceOf[js.Any], can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], last_seen_broadcast_ts = last_seen_broadcast_ts.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveAddToPostResponse]
  }
  @scala.inline
  implicit class LiveAddToPostResponseOps[Self <: LiveAddToPostResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcasts(value: js.Array[LiveAddToPostBroadcast]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_reply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_reshare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_reshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_seen_broadcast_ts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_seen_broadcast_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: LiveAddToPostUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

