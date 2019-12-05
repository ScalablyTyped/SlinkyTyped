package typingsSlinky.proxyDashLists.proxyDashListsMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.proxyDashLists.proxyDashListsStrings.data
import typingsSlinky.proxyDashLists.proxyDashListsStrings.end
import typingsSlinky.proxyDashLists.proxyDashListsStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-lists", "GetProxiesEventEmitter")
@js.native
class GetProxiesEventEmitter () extends EventEmitter {
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* proxies */ js.Array[Proxy], Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
}

