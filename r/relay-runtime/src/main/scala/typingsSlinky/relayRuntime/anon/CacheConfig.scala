package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.undefined
  var operation: OperationDescriptor
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}

object CacheConfig {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    cacheConfig: js.UndefOr[Null | typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.undefined,
    updater: js.UndefOr[Null | ((/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit)] = js.undefined
  ): CacheConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheConfig)) __obj.updateDynamic("cacheConfig")(cacheConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(updater)) __obj.updateDynamic("updater")(if (updater != null) js.Any.fromFunction2(updater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit]) else null)
    __obj.asInstanceOf[CacheConfig]
  }
}

