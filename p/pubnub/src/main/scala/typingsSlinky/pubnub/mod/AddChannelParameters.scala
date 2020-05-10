package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddChannelParameters extends js.Object {
  var channelGroup: String = js.native
  var channels: js.Array[String] = js.native
}

object AddChannelParameters {
  @scala.inline
  def apply(channelGroup: String, channels: js.Array[String]): AddChannelParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddChannelParameters]
  }
  @scala.inline
  implicit class AddChannelParametersOps[Self <: AddChannelParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

