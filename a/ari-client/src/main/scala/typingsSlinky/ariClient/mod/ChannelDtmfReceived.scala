package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDtmfReceived extends Event {
  var channel: Channel = js.native
  /* Properties */
  var digit: String = js.native
  var duration_ms: Double = js.native
}

object ChannelDtmfReceived {
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    digit: String,
    duration_ms: Double,
    timestamp: js.Date,
    `type`: String
  ): ChannelDtmfReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDtmfReceived]
  }
  @scala.inline
  implicit class ChannelDtmfReceivedOps[Self <: ChannelDtmfReceived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_ms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

