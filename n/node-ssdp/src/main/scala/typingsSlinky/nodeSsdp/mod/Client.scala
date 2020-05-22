package typingsSlinky.nodeSsdp.mod

import typingsSlinky.node.dgramMod.RemoteInfo
import typingsSlinky.nodeSsdp.nodeSsdpStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ssdp", "Client")
@js.native
class Client () extends Base {
  def this(opts: ClientOptions) = this()
  @JSName("emit")
  def emit_response(event: response, headers: SsdpHeaders, statusCode: Double, rinfo: RemoteInfo): Boolean = js.native
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function3[/* headers */ SsdpHeaders, /* statusCode */ Double, /* rinfo */ RemoteInfo, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: response,
    listener: js.Function3[/* headers */ SsdpHeaders, /* statusCode */ Double, /* rinfo */ RemoteInfo, Unit]
  ): this.type = js.native
  def search(serviceType: String): Unit | js.Promise[Unit] = js.native
  /**
    * Start the listener for multicast notifications from SSDP devices
    * @param cb callback to socket.bind
    * @returns promise when socket.bind is ready
    */
  def start(): js.Promise[Unit] = js.native
  def start(cb: js.Function1[/* error */ js.Error, Unit]): js.Promise[Unit] = js.native
  /**
    * Close UDP socket.
    */
  def stop(): Unit = js.native
}

