package typingsSlinky.relayDashRuntime.libStoreRelayModernQueryExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.Sink
import typingsSlinky.relayDashRuntime.libStoreRelayResponseNormalizerMod.GetDataID
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationTracker
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticResponseConfig
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.PublishQueue
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteConfig extends js.Object {
  @JSName("getDataID")
  var getDataID_Original: GetDataID = js.native
  var operation: OperationDescriptor = js.native
  var operationLoader: OperationLoader = js.native
  var operationTracker: js.UndefOr[OperationTracker] = js.native
  var optimisticConfig: OptimisticResponseConfig = js.native
  var publishQueue: PublishQueue = js.native
  var scheduler: js.UndefOr[TaskScheduler] = js.native
  var sink: Sink[GraphQLResponse] = js.native
  var source: RelayObservable[GraphQLResponse] = js.native
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.native
  def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
}

