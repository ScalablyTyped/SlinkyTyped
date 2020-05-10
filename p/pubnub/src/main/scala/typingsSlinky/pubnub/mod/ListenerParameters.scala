package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// addListener
@js.native
trait ListenerParameters extends js.Object {
  var membership: js.UndefOr[js.Function1[/* membershipEvent */ MembershipEvent, Unit]] = js.native
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, Unit]] = js.native
  var messageAction: js.UndefOr[js.Function1[/* messageActionEvent */ MessageActionEvent, Unit]] = js.native
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, Unit]] = js.native
  var signal: js.UndefOr[js.Function1[/* signalEvent */ SignalEvent, Unit]] = js.native
  var space: js.UndefOr[js.Function1[/* spaceEvent */ SpaceEvent, Unit]] = js.native
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, Unit]] = js.native
  var user: js.UndefOr[js.Function1[/* userEvent */ UserEvent, Unit]] = js.native
}

object ListenerParameters {
  @scala.inline
  def apply(): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerParameters]
  }
  @scala.inline
  implicit class ListenerParametersOps[Self <: ListenerParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembership(value: /* membershipEvent */ MembershipEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membership")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membership")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: /* messageEvent */ MessageEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageAction(value: /* messageActionEvent */ MessageActionEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMessageAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAction")(js.undefined)
        ret
    }
    @scala.inline
    def withPresence(value: /* presenceEvent */ PresenceEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: /* signalEvent */ SignalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: /* spaceEvent */ SpaceEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: /* statusEvent */ StatusEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: /* userEvent */ UserEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

