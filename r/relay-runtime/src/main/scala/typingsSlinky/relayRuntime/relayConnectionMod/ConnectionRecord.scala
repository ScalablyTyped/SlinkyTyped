package typingsSlinky.relayRuntime.relayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionRecord extends js.Object {
  var __id: ConnectionID = js.native
  var __typename: String = js.native
  var events: js.Array[ConnectionInternalEvent] = js.native
}

object ConnectionRecord {
  @scala.inline
  def apply(__id: ConnectionID, __typename: String, events: js.Array[ConnectionInternalEvent]): ConnectionRecord = {
    val __obj = js.Dynamic.literal(__id = __id.asInstanceOf[js.Any], __typename = __typename.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRecord]
  }
  @scala.inline
  implicit class ConnectionRecordOps[Self <: ConnectionRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__id(value: ConnectionID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__typename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__typename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[ConnectionInternalEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

