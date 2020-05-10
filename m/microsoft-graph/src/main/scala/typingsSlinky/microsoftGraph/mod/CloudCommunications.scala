package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudCommunications extends Entity {
  var calls: js.UndefOr[js.Array[Call]] = js.native
  var onlineMeetings: js.UndefOr[js.Array[OnlineMeeting]] = js.native
}

object CloudCommunications {
  @scala.inline
  def apply(): CloudCommunications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudCommunications]
  }
  @scala.inline
  implicit class CloudCommunicationsOps[Self <: CloudCommunications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalls(value: js.Array[Call]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlineMeetings(value: js.Array[OnlineMeeting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineMeetings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlineMeetings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineMeetings")(js.undefined)
        ret
    }
  }
  
}

