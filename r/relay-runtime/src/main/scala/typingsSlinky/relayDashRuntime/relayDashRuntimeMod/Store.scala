package typingsSlinky.relayDashRuntime.relayDashRuntimeMod

import typingsSlinky.relayDashRuntime.libStoreRelayModernStoreMod.RelayModernStore
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Store")
@js.native
class Store protected () extends RelayModernStore {
  def this(source: MutableRecordSource) = this()
  def this(source: MutableRecordSource, gcScheduler: Scheduler) = this()
  def this(source: MutableRecordSource, gcScheduler: Scheduler, operationLoader: OperationLoader) = this()
}

