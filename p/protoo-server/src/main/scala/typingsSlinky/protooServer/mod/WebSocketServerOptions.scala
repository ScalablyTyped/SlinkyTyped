package typingsSlinky.protooServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<websocket.websocket.IServerConfig, std.Exclude<keyof websocket.websocket.IServerConfig, 'httpServer'>> */
@js.native
trait WebSocketServerOptions extends js.Object {
  var assembleFragments: js.UndefOr[Boolean] = js.native
  var autoAcceptConnections: js.UndefOr[Boolean] = js.native
  var closeTimeout: js.UndefOr[Double] = js.native
  var disableNagleAlgorithm: js.UndefOr[Boolean] = js.native
  var dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.native
  var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.native
  var fragmentationThreshold: js.UndefOr[Double] = js.native
  var ignoreXForwardedFor: js.UndefOr[Boolean] = js.native
  var keepalive: js.UndefOr[Boolean] = js.native
  var keepaliveGracePeriod: js.UndefOr[Double] = js.native
  var keepaliveInterval: js.UndefOr[Double] = js.native
  var maxReceivedFrameSize: js.UndefOr[Double] = js.native
  var maxReceivedMessageSize: js.UndefOr[Double] = js.native
  var useNativeKeepalive: js.UndefOr[Boolean] = js.native
}

object WebSocketServerOptions {
  @scala.inline
  def apply(): WebSocketServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSocketServerOptions]
  }
  @scala.inline
  implicit class WebSocketServerOptionsOps[Self <: WebSocketServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssembleFragments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assembleFragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssembleFragments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assembleFragments")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAcceptConnections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAcceptConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNagleAlgorithm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNagleAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNagleAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNagleAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withDropConnectionOnKeepaliveTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropConnectionOnKeepaliveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropConnectionOnKeepaliveTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropConnectionOnKeepaliveTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentOutgoingMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentOutgoingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentOutgoingMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentOutgoingMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreXForwardedFor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreXForwardedFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreXForwardedFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreXForwardedFor")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepalive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepaliveGracePeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveGracePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepaliveGracePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveGracePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepaliveInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepaliveInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepaliveInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReceivedFrameSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedFrameSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReceivedFrameSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedFrameSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReceivedMessageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedMessageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReceivedMessageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReceivedMessageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeKeepalive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeKeepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeKeepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeKeepalive")(js.undefined)
        ret
    }
  }
  
}

