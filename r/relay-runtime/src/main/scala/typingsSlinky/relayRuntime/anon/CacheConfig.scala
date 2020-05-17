package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheConfig extends js.Object {
  var cacheConfig: js.UndefOr[typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.native
  var operation: OperationDescriptor = js.native
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
}

object CacheConfig {
  @scala.inline
  def apply(operation: OperationDescriptor): CacheConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheConfig]
  }
  @scala.inline
  implicit class CacheConfigOps[Self <: CacheConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: OperationDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheConfig(value: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheConfig")(null)
        ret
    }
    @scala.inline
    def withUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdaterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(null)
        ret
    }
  }
  
}

