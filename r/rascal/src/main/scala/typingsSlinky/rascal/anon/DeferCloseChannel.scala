package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferCloseChannel extends js.Object {
  var deferCloseChannel: Double = js.native
  var prefetch: Double = js.native
  var redeliveries: Counter = js.native
  var retry: Factor = js.native
  var vhost: String = js.native
}

object DeferCloseChannel {
  @scala.inline
  def apply(deferCloseChannel: Double, prefetch: Double, redeliveries: Counter, retry: Factor, vhost: String): DeferCloseChannel = {
    val __obj = js.Dynamic.literal(deferCloseChannel = deferCloseChannel.asInstanceOf[js.Any], prefetch = prefetch.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferCloseChannel]
  }
  @scala.inline
  implicit class DeferCloseChannelOps[Self <: DeferCloseChannel] (val x: Self) extends AnyVal {
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
    def withRedeliveries(value: Counter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: Factor): Self = {
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

