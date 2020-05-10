package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushChannelParameters extends js.Object {
  var channels: js.Array[String] = js.native
  var device: String = js.native
  var pushGateway: String = js.native
}

object PushChannelParameters {
  @scala.inline
  def apply(channels: js.Array[String], device: String, pushGateway: String): PushChannelParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], pushGateway = pushGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelParameters]
  }
  @scala.inline
  implicit class PushChannelParametersOps[Self <: PushChannelParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushGateway")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

