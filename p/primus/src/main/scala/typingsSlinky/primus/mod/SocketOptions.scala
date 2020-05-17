package typingsSlinky.primus.mod

import typingsSlinky.primus.anon.Factor
import typingsSlinky.primus.primusStrings.disconnect
import typingsSlinky.primus.primusStrings.online
import typingsSlinky.primus.primusStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  var manual: js.UndefOr[Boolean] = js.native
  var network: js.UndefOr[Boolean] = js.native
  var pingTimeout: js.UndefOr[Double] = js.native
  var queueSize: js.UndefOr[Double] = js.native
  // https://github.com/unshiftio/recovery
  var reconnect: js.UndefOr[Factor] = js.native
  var strategy: js.UndefOr[String | (js.Array[disconnect | online | timeout])] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var transport: js.UndefOr[js.Object] = js.native
  var websockets: js.UndefOr[Boolean] = js.native
}

object SocketOptions {
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withPingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnect(value: Factor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: String | (js.Array[disconnect | online | timeout])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsockets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websockets")(js.undefined)
        ret
    }
  }
  
}

