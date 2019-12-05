package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.relayDashRuntime.libNetworkCreateRelayNetworkLoggerMod.NetworkLogger
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createRelayNetworkLogger")
@js.native
object createRelayNetworkLogger extends js.Object {
  def apply(
    LoggerTransaction: Instantiable1[
      /* config */ LoggerTransactionConfig, 
      typingsSlinky.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.RelayNetworkLoggerTransaction
    ]
  ): NetworkLogger = js.native
}

