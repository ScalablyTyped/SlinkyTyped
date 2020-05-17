package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMax extends js.Object {
  var channelMax: Double = js.native
  var connection_timeout: Double = js.native
  var heartbeat: Double = js.native
}

object ChannelMax {
  @scala.inline
  def apply(channelMax: Double, connection_timeout: Double, heartbeat: Double): ChannelMax = {
    val __obj = js.Dynamic.literal(channelMax = channelMax.asInstanceOf[js.Any], connection_timeout = connection_timeout.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMax]
  }
  @scala.inline
  implicit class ChannelMaxOps[Self <: ChannelMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeartbeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

