package typingsSlinky.relayDashTestDashUtils.libRelayModernMockEnvironmentMod

import typingsSlinky.relayDashRuntime.Anon_CacheConfig
import typingsSlinky.relayDashRuntime.Anon_Key
import typingsSlinky.relayDashRuntime.Anon_Operation
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod.LoggerTransactionConfig
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network
import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typingsSlinky.relayDashRuntime.libNetworkRelayObservableMod.RelayObservable
import typingsSlinky.relayDashRuntime.libStoreRelayOperationTrackerMod.RelayOperationTracker
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Logger
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticResponseConfig
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticUpdate
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Snapshot
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.Store
import typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod.StoreUpdater
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayMockEnvironment
  extends MockEnvironment
     with Environment {
  var configName: js.UndefOr[String | Null] = js.undefined
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): Unit
  def revertUpdate(update: OptimisticUpdate): Unit
}

object RelayMockEnvironment {
  @scala.inline
  def apply(
    applyMutation: OptimisticResponseConfig => Disposable,
    applyUpdate: OptimisticUpdateFunction => Disposable,
    check: NormalizationSelector => Boolean,
    commitPayload: (OperationDescriptor, PayloadData) => Unit,
    commitUpdate: StoreUpdater => Unit,
    execute: Anon_CacheConfig => RelayObservable[GraphQLResponse],
    executeMutation: Anon_Key => RelayObservable[GraphQLResponse],
    executeWithSource: Anon_Operation => RelayObservable[GraphQLResponse],
    getLogger: LoggerTransactionConfig => js.UndefOr[Logger | Null],
    getNetwork: () => Network,
    getOperationTracker: () => RelayOperationTracker,
    getStore: () => Store,
    lookup: SingularReaderSelector => Snapshot,
    mock: MockFunctions,
    mockClear: () => Unit,
    replaceUpdate: (OptimisticUpdate, OptimisticUpdate) => Unit,
    retain: NormalizationSelector => Disposable,
    revertUpdate: OptimisticUpdate => Unit,
    subscribe: (Snapshot, js.Function1[/* snapshot */ Snapshot, Unit]) => Disposable,
    configName: String = null
  ): RelayMockEnvironment = {
    val __obj = js.Dynamic.literal(applyMutation = js.Any.fromFunction1(applyMutation), applyUpdate = js.Any.fromFunction1(applyUpdate), check = js.Any.fromFunction1(check), commitPayload = js.Any.fromFunction2(commitPayload), commitUpdate = js.Any.fromFunction1(commitUpdate), execute = js.Any.fromFunction1(execute), executeMutation = js.Any.fromFunction1(executeMutation), executeWithSource = js.Any.fromFunction1(executeWithSource), getLogger = js.Any.fromFunction1(getLogger), getNetwork = js.Any.fromFunction0(getNetwork), getOperationTracker = js.Any.fromFunction0(getOperationTracker), getStore = js.Any.fromFunction0(getStore), lookup = js.Any.fromFunction1(lookup), mock = mock.asInstanceOf[js.Any], mockClear = js.Any.fromFunction0(mockClear), replaceUpdate = js.Any.fromFunction2(replaceUpdate), retain = js.Any.fromFunction1(retain), revertUpdate = js.Any.fromFunction1(revertUpdate), subscribe = js.Any.fromFunction2(subscribe))
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayMockEnvironment]
  }
}

