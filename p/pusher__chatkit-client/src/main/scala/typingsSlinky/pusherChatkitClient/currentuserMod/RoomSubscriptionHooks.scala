package typingsSlinky.pusherChatkitClient.currentuserMod

import typingsSlinky.pusherChatkitClient.hooksMod.ReadCursorHook
import typingsSlinky.pusherChatkitClient.hooksMod.UserHook
import typingsSlinky.pusherChatkitClient.hooksMod.UserPresenceHook
import typingsSlinky.pusherChatkitClient.hooksMod.UserPresenceState
import typingsSlinky.pusherChatkitClient.messageMod.PusherMessage
import typingsSlinky.pusherChatkitClient.roomMod.PusherReadCursor
import typingsSlinky.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomSubscriptionHooks extends js.Object {
  var onMessage: js.UndefOr[js.Function1[/* message */ PusherMessage, Unit]] = js.native
  var onMessageDeleted: js.UndefOr[js.Function1[/* messageId */ Double, Unit]] = js.native
  var onNewReadCursor: js.UndefOr[ReadCursorHook] = js.native
  var onPresenceChanged: js.UndefOr[UserPresenceHook] = js.native
  var onUserJoined: js.UndefOr[UserHook] = js.native
  var onUserLeft: js.UndefOr[UserHook] = js.native
  var onUserStartedTyping: js.UndefOr[UserHook] = js.native
  var onUserStoppedTyping: js.UndefOr[UserHook] = js.native
}

object RoomSubscriptionHooks {
  @scala.inline
  def apply(): RoomSubscriptionHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomSubscriptionHooks]
  }
  @scala.inline
  implicit class RoomSubscriptionHooksOps[Self <: RoomSubscriptionHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnMessage(value: /* message */ PusherMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessageDeleted(value: /* messageId */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessageDeleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessageDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessageDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewReadCursor(value: /* cursor */ PusherReadCursor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewReadCursor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewReadCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewReadCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPresenceChanged(value: (/* state */ UserPresenceState, /* user */ PusherUser) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPresenceChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPresenceChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPresenceChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserJoined(value: /* room */ PusherUser => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserJoined")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserJoined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserJoined")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserLeft(value: /* room */ PusherUser => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserStartedTyping(value: /* room */ PusherUser => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserStartedTyping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserStartedTyping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserStartedTyping")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserStoppedTyping(value: /* room */ PusherUser => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserStoppedTyping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserStoppedTyping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserStoppedTyping")(js.undefined)
        ret
    }
  }
  
}

