package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Network")
@js.native
object Network extends js.Object {
  def create(fetchFn: FetchFunction): typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network = js.native
  def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network = js.native
}

