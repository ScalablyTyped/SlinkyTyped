package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentMap
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentSpecResolver
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Props
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.RelayContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createFragmentSpecResolver")
@js.native
object createFragmentSpecResolver extends js.Object {
  def apply(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  def apply(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
}

