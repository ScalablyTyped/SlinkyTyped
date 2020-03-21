package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayStoreTypesMod.FragmentMap
import typingsSlinky.relayRuntime.relayStoreTypesMod.FragmentSpecResolver
import typingsSlinky.relayRuntime.relayStoreTypesMod.Props
import typingsSlinky.relayRuntime.relayStoreTypesMod.RelayContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/createFragmentSpecResolver", JSImport.Namespace)
@js.native
object createFragmentSpecResolverMod extends js.Object {
  def createFragmentSpecResolver(context: RelayContext, containerName: String, fragments: FragmentMap, props: Props): FragmentSpecResolver = js.native
  def createFragmentSpecResolver(
    context: RelayContext,
    containerName: String,
    fragments: FragmentMap,
    props: Props,
    callback: js.Function0[Unit]
  ): FragmentSpecResolver = js.native
}

