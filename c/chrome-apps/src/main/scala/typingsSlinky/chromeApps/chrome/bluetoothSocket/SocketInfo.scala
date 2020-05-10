package typingsSlinky.chromeApps.chrome.bluetoothSocket

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketInfo extends js.Object {
  /**
    * If the underlying socket is connected,
    * contains the Bluetooth address of the device it is connected to.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The size of the buffer used to receive data.
    * If no buffer size has been specified explictly,
    * the value is not provided.
    */
  var bufferSize: js.UndefOr[integer] = js.native
  /**
    * Flag indicating whether the socket is connected to a remote peer.
    */
  var connected: Boolean = js.native
  /**
    * Application-defined string associated with the socket.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether a connected socket
    * blocks its peer from sending more data, or
    * whether connection requests on a listening
    * socket are dispatched through the onAccept
    * event or queued up in the listen queue backlog.
    * See setPaused. The default value is 'false'.
    */
  var paused: Boolean = js.native
  /**
    * Flag indicating if the socket remains
    * open when the event page of the application
    * is unloaded (see SocketProperties.persistent).
    * The default value is 'false'.
    */
  var persistent: Boolean = js.native
  /**
    * The socket identifier.
    * */
  var socketId: integer = js.native
  /**
    * If the underlying socket is connected,
    * contains information about the service
    * UUID it is connected to, otherwise if
    * the underlying socket is listening,
    * contains information about the service
    * UUID it is listening on.
    */
  var uuid: js.UndefOr[String] = js.native
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
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
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
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

