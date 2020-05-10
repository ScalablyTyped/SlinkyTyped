package typingsSlinky.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomSubscription extends js.Object {
  var disableCursors: Boolean = js.native
  var hooks: js.UndefOr[RoomSubscriptionHooks] = js.native
  var messageLimit: Double = js.native
  var roomId: String = js.native
  def cancel(): js.Promise[Unit] = js.native
}

object RoomSubscription {
  @scala.inline
  def apply(cancel: () => js.Promise[Unit], disableCursors: Boolean, messageLimit: Double, roomId: String): RoomSubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), disableCursors = disableCursors.asInstanceOf[js.Any], messageLimit = messageLimit.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSubscription]
  }
  @scala.inline
  implicit class RoomSubscriptionOps[Self <: RoomSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableCursors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCursors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomId")(value.asInstanceOf[js.Any])
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
  }
  
}

