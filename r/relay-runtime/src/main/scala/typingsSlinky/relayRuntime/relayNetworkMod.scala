package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayNetworkTypesMod.FetchFunction
import typingsSlinky.relayRuntime.relayNetworkTypesMod.Network
import typingsSlinky.relayRuntime.relayNetworkTypesMod.SubscribeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayNetworkMod {
  
  object RelayNetwork {
    
    @JSImport("relay-runtime/lib/network/RelayNetwork", "RelayNetwork.create")
    @js.native
    def create(fetchFn: FetchFunction): Network = js.native
    @JSImport("relay-runtime/lib/network/RelayNetwork", "RelayNetwork.create")
    @js.native
    def create(fetchFn: FetchFunction, subscribeFn: SubscribeFunction): Network = js.native
  }
}
