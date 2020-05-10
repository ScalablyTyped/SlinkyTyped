package typingsSlinky.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomSubcriptionParams extends js.Object {
  var disableCursors: js.UndefOr[Boolean] = js.native
  var hooks: js.UndefOr[RoomSubscriptionHooks] = js.native
  var messageLimit: js.UndefOr[Double] = js.native
  var roomId: String = js.native
}

object RoomSubcriptionParams {
  @scala.inline
  def apply(roomId: String): RoomSubcriptionParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSubcriptionParams]
  }
  @scala.inline
  implicit class RoomSubcriptionParamsOps[Self <: RoomSubcriptionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableCursors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCursors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCursors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCursors")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: RoomSubscriptionHooks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageLimit")(js.undefined)
        ret
    }
  }
  
}

