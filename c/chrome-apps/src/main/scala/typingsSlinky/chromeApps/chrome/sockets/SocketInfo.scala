package typingsSlinky.chromeApps.chrome.sockets

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketInfo extends js.Object {
  /** The size of the buffer used to receive data. If no buffer size has been specified explictly, the value is not provided. */
  var bufferSize: js.UndefOr[integer] = js.native
  /** Flag indicating whether the socket is connected to a remote peer. */
  var connected: Boolean = js.native
  /** If the underlying socket is connected, contains its local IPv4/6 address. */
  var localAddress: js.UndefOr[String] = js.native
  /** If the underlying socket is connected, contains its local port. */
  var localPort: js.UndefOr[integer] = js.native
  /** Application-defined string associated with the socket. */
  var name: js.UndefOr[String] = js.native
  /** Flag indicating whether a connected socket blocks its peer from sending more data (see setPaused). */
  var paused: Boolean = js.native
  /** If the underlying socket is connected, contains the peer/ IPv4/6 address. */
  var peerAddress: js.UndefOr[String] = js.native
  /** If the underlying socket is connected, contains the peer port. */
  var peerPort: js.UndefOr[integer] = js.native
  /** Flag indicating whether the socket is left open when the application is suspended (see SocketProperties.persistent). */
  var persistent: Boolean = js.native
  /** The socket identifier. */
  var socketId: integer = js.native
}

object SocketInfo {
  @scala.inline
  def apply(connected: Boolean, paused: Boolean, persistent: Boolean, socketId: integer): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketInfo]
  }
  @scala.inline
  implicit class SocketInfoOps[Self <: SocketInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocketId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferSize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPort(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localPort")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerPort(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerPort")(js.undefined)
        ret
    }
  }
  
}

