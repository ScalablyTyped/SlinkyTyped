package typingsSlinky.pouchdbAdapterIdb.PouchDB.IdbAdapter

import typingsSlinky.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.idb
import typingsSlinky.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.persistent
import typingsSlinky.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.temporary
import typingsSlinky.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdbAdapterConfiguration extends LocalDatabaseConfiguration {
  
  @JSName("adapter")
  var adapter_IdbAdapterConfiguration: idb = js.native
  
  /**
    * Configures storage persistence.
    *
    * Only works in Firefox 26+.
    */
  var storage: js.UndefOr[persistent | temporary] = js.native
}
object IdbAdapterConfiguration {
  
  @scala.inline
  def apply(adapter: idb): IdbAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdbAdapterConfiguration]
  }
  
  @scala.inline
  implicit class IdbAdapterConfigurationOps[Self <: IdbAdapterConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: idb): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: persistent | temporary): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
