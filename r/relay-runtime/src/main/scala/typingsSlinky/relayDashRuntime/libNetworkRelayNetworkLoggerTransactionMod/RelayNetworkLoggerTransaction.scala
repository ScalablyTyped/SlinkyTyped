package typingsSlinky.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod

import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/RelayNetworkLoggerTransaction", "RelayNetworkLoggerTransaction")
@js.native
class RelayNetworkLoggerTransaction protected () extends js.Object {
  def this(config: LoggerTransactionConfig) = this()
  def addLog(label: String, values: js.Any*): Unit = js.native
  def commitLogs(error: js.Error, payload: GraphQLResponse): Unit = js.native
  def commitLogs(error: js.Error, payload: GraphQLResponse, status: String): Unit = js.native
  def flushLogs(error: js.Error, payload: GraphQLResponse): Unit = js.native
  def flushLogs(error: js.Error, payload: GraphQLResponse, status: String): Unit = js.native
  def getCacheConfig(): CacheConfig = js.native
  def getIdentifier(): String = js.native
  def getLogsToPrint(): js.Array[RelayNetworkLog] = js.native
  def getRequest(): RequestParameters = js.native
  def getUploadables(): UploadableMap = js.native
  def getVariables(): Variables = js.native
  def markCommitted(): Unit = js.native
  def timerEnd(): Unit = js.native
  def timerStart(): Unit = js.native
}

