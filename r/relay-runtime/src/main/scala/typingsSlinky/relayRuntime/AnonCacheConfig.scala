package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var operation: OperationDescriptor
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}

object AnonCacheConfig {
  @scala.inline
  def apply(
    operation: OperationDescriptor,
    cacheConfig: CacheConfig = null,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null
  ): AnonCacheConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[AnonCacheConfig]
  }
}

