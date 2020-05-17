package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.anon.Age
import typingsSlinky.matrixJsSdk.mod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var age: Double = js.native
  var content: js.UndefOr[EventContent] = js.native
  var event_id: String = js.native
  var origin_server_ts: js.UndefOr[Double] = js.native
  var redacts: js.UndefOr[String] = js.native
  var replaces_state: js.UndefOr[String] = js.native
  var room_id: String = js.native
  var sender: String = js.native
  var state_key: String = js.native
  var `type`: EventType = js.native
  var unsigned: Age = js.native
  var user_id: String = js.native
}

object Event {
  @scala.inline
  def apply(
    age: Double,
    event_id: String,
    room_id: String,
    sender: String,
    state_key: String,
    `type`: EventType,
    unsigned: Age,
    user_id: String
  ): Event = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoom_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsigned(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: EventContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin_server_ts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin_server_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin_server_ts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin_server_ts")(js.undefined)
        ret
    }
    @scala.inline
    def withRedacts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redacts")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaces_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaces_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaces_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaces_state")(js.undefined)
        ret
    }
  }
  
}

