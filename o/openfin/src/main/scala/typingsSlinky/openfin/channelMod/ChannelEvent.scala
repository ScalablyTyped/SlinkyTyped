package typingsSlinky.openfin.channelMod

import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import typingsSlinky.openfin.openfinStrings.channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelEvent[Type] extends ApplicationEvent[channel, Type] {
  var channelId: String = js.native
  var channelName: String = js.native
  var name: js.UndefOr[String] = js.native
}

object ChannelEvent {
  @scala.inline
  def apply[Type](channelId: String, channelName: String, topic: channel, `type`: Type, uuid: String): ChannelEvent[Type] = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelName = channelName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEvent[Type]]
  }
  @scala.inline
  implicit class ChannelEventOps[Self[`type`] <: ChannelEvent[`type`], Type] (val x: Self[Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Type] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Type] with Other]
    @scala.inline
    def withChannelId(value: String): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelName(value: String): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

