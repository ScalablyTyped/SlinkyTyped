package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDestroyed extends Event {
  /* Properties */
  var cause: Double = js.native
  var cause_txt: String = js.native
  var channel: Channel = js.native
}

object ChannelDestroyed {
  @scala.inline
  def apply(
    application: String,
    cause: Double,
    cause_txt: String,
    channel: Channel,
    timestamp: js.Date,
    `type`: String
  ): ChannelDestroyed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], cause_txt = cause_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDestroyed]
  }
  @scala.inline
  implicit class ChannelDestroyedOps[Self <: ChannelDestroyed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCause(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCause_txt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause_txt")(value.asInstanceOf[js.Any])
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

