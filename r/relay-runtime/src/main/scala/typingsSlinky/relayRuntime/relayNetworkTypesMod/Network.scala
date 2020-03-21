package typingsSlinky.relayRuntime.relayNetworkTypesMod

import typingsSlinky.relayRuntime.relayConcreteNodeMod.RequestParameters
import typingsSlinky.relayRuntime.relayObservableMod.RelayObservable
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
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

