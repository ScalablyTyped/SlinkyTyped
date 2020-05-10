package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDialplan extends Event {
  /* Properties */
  var channel: Channel = js.native
  var dialplan_app: String = js.native
  var dialplan_app_data: String = js.native
}

object ChannelDialplan {
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    dialplan_app: String,
    dialplan_app_data: String,
    timestamp: js.Date,
    `type`: String
  ): ChannelDialplan = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dialplan_app = dialplan_app.asInstanceOf[js.Any], dialplan_app_data = dialplan_app_data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDialplan]
  }
  @scala.inline
  implicit class ChannelDialplanOps[Self <: ChannelDialplan] (val x: Self) extends AnyVal {
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
    def withDialplan_app(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialplan_app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialplan_app_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialplan_app_data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

