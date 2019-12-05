package typingsSlinky.relayDashRuntime.libNetworkRelayQueryResponseCacheMod

import typingsSlinky.relayDashRuntime.Anon_Size
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/network/RelayQueryResponseCache", JSImport.Default)
@js.native
class default protected () extends RelayQueryResponseCache {
  def this(config: Anon_Size) = this()
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def get(queryID: String, variables: Variables): GraphQLResponse | Null = js.native
  /* CompleteClass */
  override def set(queryID: String, variables: Variables, payload: GraphQLResponse): Unit = js.native
}

