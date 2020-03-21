package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayNetworkTypesMod.FetchFunction
import typingsSlinky.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Network")
@js.native
object Network extends js.Object {
  def create(fetchFn: FetchFunction): typingsSlinky.relayRuntime.relayNetworkTypesMod.Network = js.native
  def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): typingsSlinky.relayRuntime.relayNetworkTypesMod.Network = js.native
}

