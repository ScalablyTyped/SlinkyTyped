package typingsSlinky.anyproxy.anyproxyMod

import typingsSlinky.anyproxy.anyproxyStrings.error
import typingsSlinky.anyproxy.anyproxyStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anyproxy", "ProxyServer")
@js.native
class ProxyServer () extends ProxyCore {
  def this(config: ProxyOptions) = this()
  /** Emit when error happened inside proxy server */
  @JSName("on")
  def on_error(eventName: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  /** Emit when proxy server is ready */
  @JSName("on")
  def on_ready(eventName: ready, listener: js.Function0[Unit]): this.type = js.native
}

