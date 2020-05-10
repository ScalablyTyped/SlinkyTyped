package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelCallerId extends Event {
  /* Properties */
  var caller_presentation: Double = js.native
  var caller_presentation_txt: String = js.native
  var channel: Channel = js.native
}

object ChannelCallerId {
  @scala.inline
  def apply(
    application: String,
    caller_presentation: Double,
    caller_presentation_txt: String,
    channel: Channel,
    timestamp: js.Date,
    `type`: String
  ): ChannelCallerId = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], caller_presentation = caller_presentation.asInstanceOf[js.Any], caller_presentation_txt = caller_presentation_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCallerId]
  }
  @scala.inline
  implicit class ChannelCallerIdOps[Self <: ChannelCallerId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaller_presentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller_presentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaller_presentation_txt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller_presentation_txt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

