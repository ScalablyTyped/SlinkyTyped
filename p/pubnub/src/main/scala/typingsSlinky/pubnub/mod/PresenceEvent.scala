package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.pubnubStrings.`state-change`
import typingsSlinky.pubnub.pubnubStrings.join
import typingsSlinky.pubnub.pubnubStrings.leave
import typingsSlinky.pubnub.pubnubStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresenceEvent extends js.Object {
  var action: join | leave | `state-change` | timeout = js.native
  /**
    * @deprecated
    */
  var actualChannel: String = js.native
  var channel: String = js.native
  var occupancy: Double = js.native
  var state: js.UndefOr[js.Any] = js.native
  /**
    * @deprecated
    */
  var subscribedChannel: String = js.native
  var subscription: String = js.native
  var timestamp: Double = js.native
  var timetoken: String = js.native
  var uuid: String = js.native
}

object PresenceEvent {
  @scala.inline
  def apply(
    action: join | leave | `state-change` | timeout,
    actualChannel: String,
    channel: String,
    occupancy: Double,
    subscribedChannel: String,
    subscription: String,
    timestamp: Double,
    timetoken: String,
    uuid: String
  ): PresenceEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actualChannel = actualChannel.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], subscribedChannel = subscribedChannel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceEvent]
  }
  @scala.inline
  implicit class PresenceEventOps[Self <: PresenceEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: join | leave | `state-change` | timeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccupancy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribedChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribedChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimetoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

