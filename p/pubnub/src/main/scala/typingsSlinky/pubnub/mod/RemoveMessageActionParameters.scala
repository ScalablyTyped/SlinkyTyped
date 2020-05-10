package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveMessageActionParameters extends js.Object {
  var actionTimetoken: String = js.native
  var channel: String = js.native
  var messageTimetoken: String = js.native
}

object RemoveMessageActionParameters {
  @scala.inline
  def apply(actionTimetoken: String, channel: String, messageTimetoken: String): RemoveMessageActionParameters = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMessageActionParameters]
  }
  @scala.inline
  implicit class RemoveMessageActionParametersOps[Self <: RemoveMessageActionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTimetoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTimetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageTimetoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTimetoken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

