package typingsSlinky.engineDotIoDashClient.engineDotIoDashClientMod

import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.arraybuffer
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.blob
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.close
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.drain
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.error
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.flush
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.message
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.open
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.ping
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.pong
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.upgrade
import typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.upgradeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io-client", "Socket")
@js.native
class Socket () extends js.Object {
  var binaryType: js.UndefOr[arraybuffer | blob] = js.native
  var protocol: js.UndefOr[Double] = js.native
  /**
  		 * Disconnects the client.
  		 */
  def close(): this.type = js.native
  /*
  		 * Fired upon disconnection. In compliance with the WebSocket API spec, this event may be fired even if the open event does not occur (i.e. due to connection error or close()).
  		 */
  @JSName("on")
  def on_close(ev: close, cb: js.Function2[/* mes */ String, /* detail */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("on")
  def on_drain(ev: drain, cb: js.Function0[Unit]): this.type = js.native
  /*
  		 * Fired when an error occurs.
  		 */
  @JSName("on")
  def on_error(ev: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_flush(ev: flush, cb: js.Function0[Unit]): this.type = js.native
  /*
  		 * Fired when data is received from the server.
  		 */
  @JSName("on")
  def on_message(ev: message, cb: js.Function1[/* data */ String | scala.scalajs.js.typedarray.ArrayBuffer, Unit]): this.type = js.native
  /*
  		 * open: Fired upon successful connection.
  		 * flush: Fired upon completing a buffer flush
  		 * drain: Fired after drain event of transport if writeBuffer is empty
  		 * ping: Fired upon flushing a ping packet (ie: actual packet write out)
  		 * pong: Fired upon receiving a pong packet.
  		 */
  @JSName("on")
  def on_open(ev: open, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ping(ev: ping, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pong(ev: pong, cb: js.Function0[Unit]): this.type = js.native
  /*
  		 * Fired upon upgrade success, after the new transport is set
  		 */
  @JSName("on")
  def on_upgrade(ev: upgrade, cb: js.Function1[/* transport */ js.Any, Unit]): this.type = js.native
  /*
  		 * Fired if an error occurs with a transport we're trying to upgrade to.
  		 */
  @JSName("on")
  def on_upgradeError(ev: upgradeError, cb: js.Function1[/* err */ UpgradeError, Unit]): this.type = js.native
  /**
  		 * Sends a message to the server
  		 */
  def send(message: Message): this.type = js.native
  def send(message: Message, opts: MessageOptions): this.type = js.native
  def send(message: Message, opts: MessageOptions, cb: js.Function0[Unit]): this.type = js.native
}

