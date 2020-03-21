package typingsSlinky.relayRuntime.mod

import typingsSlinky.relayRuntime.relayStoreTypesMod.FragmentMap
import typingsSlinky.relayRuntime.relayStoreTypesMod.FragmentSpecResolver
import typingsSlinky.relayRuntime.relayStoreTypesMod.Props
import typingsSlinky.relayRuntime.relayStoreTypesMod.RelayContext
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

