package typingsSlinky.relayRuntime.relayModernQueryExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayRuntime.relayObservableMod.RelayObservable
import typingsSlinky.relayRuntime.relayObservableMod.Sink
import typingsSlinky.relayRuntime.relayResponseNormalizerMod.GetDataID
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationLoader
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationTracker
import typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticResponseConfig
import typingsSlinky.relayRuntime.relayStoreTypesMod.PublishQueue
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteConfig extends js.Object {
  
  def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
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
}
