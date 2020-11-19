package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatastoreSummary extends js.Object {
  
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.native
  
  /**
    * Where data store data is stored.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorageSummary] = js.native
  
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the data store.
    */
  var status: js.UndefOr[DatastoreStatus] = js.native
}
object DatastoreSummary {
  
  @scala.inline
  def apply(): DatastoreSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreSummary]
  }
  
  @scala.inline
  implicit class DatastoreSummaryOps[Self <: DatastoreSummary] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: js.Date): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDatastoreName(value: DatastoreName): Self = this.set("datastoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreName: Self = this.set("datastoreName", js.undefined)
    
    @scala.inline
    def setDatastoreStorage(value: DatastoreStorageSummary): Self = this.set("datastoreStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreStorage: Self = this.set("datastoreStorage", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: js.Date): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: DatastoreStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
