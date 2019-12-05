package typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod

import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  @JSName("execute")
  var execute_Original: ExecuteFunction = js.native
  def execute(request: RequestParameters, variables: Variables, cacheConfig: CacheConfig): RelayObservable[GraphQLResponse] = js.native
  def execute(
    request: RequestParameters,
    variables: Variables,
    cacheConfig: CacheConfig,
    uploadables: UploadableMap
  ): RelayObservable[GraphQLResponse] = js.native
}

