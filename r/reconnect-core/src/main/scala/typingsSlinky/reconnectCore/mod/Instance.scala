package typingsSlinky.reconnectCore.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.reconnectCore.reconnectCoreStrings.backoff
import typingsSlinky.reconnectCore.reconnectCoreStrings.connect
import typingsSlinky.reconnectCore.reconnectCoreStrings.connection
import typingsSlinky.reconnectCore.reconnectCoreStrings.disconnect
import typingsSlinky.reconnectCore.reconnectCoreStrings.error
import typingsSlinky.reconnectCore.reconnectCoreStrings.fail
import typingsSlinky.reconnectCore.reconnectCoreStrings.reconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance[ArgType, ConnectionType] extends EventEmitter {
  
  def connect(opts: ArgType): this.type = js.native
  
  val connected: Boolean = js.native
  
  def disconnect(): this.type = js.native
  
  def listen(opts: ArgType): this.type = js.native
  
  @JSName("on")
  def on_backoff(
    event: backoff,
    cb: js.Function3[/* n */ Double, /* delay */ Double, /* err */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, cb: js.Function1[/* con */ ConnectionType, Unit]): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, cb: js.Function1[/* con */ ConnectionType, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_fail(event: fail, cb: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_reconnect(event: reconnect, cb: js.Function2[/* n */ Double, /* delay */ Double, Unit]): this.type = js.native
  
  var reconnect: Boolean = js.native
  
  def reset(): Unit = js.native
}
