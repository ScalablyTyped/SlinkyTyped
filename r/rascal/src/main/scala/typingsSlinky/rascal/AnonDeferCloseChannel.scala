package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeferCloseChannel extends js.Object {
  var deferCloseChannel: Double = js.native
  var prefetch: Double = js.native
  var redeliveries: AnonCounter = js.native
  var retry: AnonFactor = js.native
  var vhost: String = js.native
}

object AnonDeferCloseChannel {
  @scala.inline
  def apply(
    deferCloseChannel: Double,
    prefetch: Double,
    redeliveries: AnonCounter,
    retry: AnonFactor,
    vhost: String
  ): AnonDeferCloseChannel = {
    val __obj = js.Dynamic.literal(deferCloseChannel = deferCloseChannel.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeferCloseChannel]
  }
  @scala.inline
  implicit class AnonDeferCloseChannelOps[Self <: AnonDeferCloseChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferCloseChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferCloseChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefetch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedeliveries(value: AnonCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: AnonFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVhost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

