package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayNetworkTypesMod.UploadableMap
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOperation extends js.Object {
  var operation: OperationDescriptor = js.native
  var optimisticResponse: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  var uploadables: js.UndefOr[UploadableMap | Null] = js.native
}

object AnonOperation {
  @scala.inline
  def apply(operation: OperationDescriptor): AnonOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOperation]
  }
  @scala.inline
  implicit class AnonOperationOps[Self <: AnonOperation] (val x: Self) extends AnyVal {
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
    def withOptimisticResponse(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticResponseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(null)
        ret
    }
    @scala.inline
    def withOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOptimisticUpdater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticUpdaterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticUpdater")(null)
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
    @scala.inline
    def withUploadables(value: UploadableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadables")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadablesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadables")(null)
        ret
    }
  }
  
}

