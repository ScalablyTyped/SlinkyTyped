package typingsSlinky.relayDashRuntime

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.RelayNetworkLoggerTransaction
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.FetchFunction
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.SubscribeFunction
import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/createRelayNetworkLogger", JSImport.Namespace)
@js.native
object libNetworkCreateRelayNetworkLoggerMod extends js.Object {
  @js.native
  trait NetworkLogger extends js.Object {
    def wrapFetch(fetch: FetchFunction): FetchFunction = js.native
    def wrapFetch(fetch: FetchFunction, graphiQLPrinter: GraphiQLPrinter): FetchFunction = js.native
    def wrapSubscribe(subscribe: SubscribeFunction): SubscribeFunction = js.native
    def wrapSubscribe(subscribe: SubscribeFunction, graphiQLPrinter: GraphiQLPrinter): SubscribeFunction = js.native
  }
  
  def createRelayNetworkLogger(
    LoggerTransaction: Instantiable1[/* config */ LoggerTransactionConfig, RelayNetworkLoggerTransaction]
  ): NetworkLogger = js.native
  type GraphiQLPrinter = js.Function2[/* request */ RequestParameters, /* variables */ Variables, String]
}

