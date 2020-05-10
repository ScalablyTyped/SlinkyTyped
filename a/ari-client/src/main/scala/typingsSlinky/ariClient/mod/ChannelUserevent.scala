package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelUserevent extends Event {
  var bridge: js.UndefOr[Bridge] = js.native
  var channel: js.UndefOr[Channel] = js.native
  var endpoint: js.UndefOr[Endpoint] = js.native
  /* Properties */
  var eventname: String = js.native
  var userevent: IndexableObject = js.native
}

object ChannelUserevent {
  @scala.inline
  def apply(
    application: String,
    eventname: String,
    timestamp: js.Date,
    `type`: String,
    userevent: IndexableObject
  ): ChannelUserevent = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], eventname = eventname.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userevent = userevent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUserevent]
  }
  @scala.inline
  implicit class ChannelUsereventOps[Self <: ChannelUserevent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserevent(value: IndexableObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userevent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBridge(value: Bridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBridge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridge")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
  }
  
}

