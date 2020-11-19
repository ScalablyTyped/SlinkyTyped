package typingsSlinky.relayRuntime.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.relayRuntime.relayNetworkTypesMod.UploadableMap
import typingsSlinky.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typingsSlinky.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsSlinky.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends js.Object {
  
  var cacheConfig: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null = js.native
  
  var operation: OperationDescriptor = js.native
  
  var optimisticResponse: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  
  var uploadables: js.UndefOr[UploadableMap | Null] = js.native
}
object Operation {
  
  @scala.inline
  def apply(operation: OperationDescriptor): Operation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheConfig(value: typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = this.set("cacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheConfigNull: Self = this.set("cacheConfig", null)
    
    @scala.inline
    def setOptimisticResponse(value: StringDictionary[js.Any]): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    
    @scala.inline
    def setOptimisticResponseNull: Self = this.set("optimisticResponse", null)
    
    @scala.inline
    def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = this.set("optimisticUpdater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOptimisticUpdater: Self = this.set("optimisticUpdater", js.undefined)
    
    @scala.inline
    def setOptimisticUpdaterNull: Self = this.set("optimisticUpdater", null)
    
    @scala.inline
    def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = this.set("updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
    
    @scala.inline
    def setUpdaterNull: Self = this.set("updater", null)
    
    @scala.inline
    def setUploadables(value: UploadableMap): Self = this.set("uploadables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadables: Self = this.set("uploadables", js.undefined)
    
    @scala.inline
    def setUploadablesNull: Self = this.set("uploadables", null)
  }
}
