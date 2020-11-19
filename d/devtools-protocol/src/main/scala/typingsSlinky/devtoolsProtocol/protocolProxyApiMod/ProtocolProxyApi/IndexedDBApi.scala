package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.ClearObjectStoreRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteDatabaseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteObjectStoreEntriesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedDBApi extends js.Object {
  
  /**
    * Clears all entries from an object store.
    */
  def clearObjectStore(params: ClearObjectStoreRequest): js.Promise[Unit] = js.native
  
  /**
    * Deletes a database.
    */
  def deleteDatabase(params: DeleteDatabaseRequest): js.Promise[Unit] = js.native
  
  /**
    * Delete a range of entries from an object store
    */
  def deleteObjectStoreEntries(params: DeleteObjectStoreEntriesRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables events from backend.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables events from backend.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Gets metadata of an object store
    */
  def getMetadata(params: GetMetadataRequest): js.Promise[GetMetadataResponse] = js.native
  
  /**
    * Requests data from object store or index.
    */
  def requestData(params: RequestDataRequest): js.Promise[RequestDataResponse] = js.native
  
  /**
    * Requests database with given name in given frame.
    */
  def requestDatabase(params: RequestDatabaseRequest): js.Promise[RequestDatabaseResponse] = js.native
  
  /**
    * Requests database names for given security origin.
    */
  def requestDatabaseNames(params: RequestDatabaseNamesRequest): js.Promise[RequestDatabaseNamesResponse] = js.native
}
object IndexedDBApi {
  
  @scala.inline
  def apply(
    clearObjectStore: ClearObjectStoreRequest => js.Promise[Unit],
    deleteDatabase: DeleteDatabaseRequest => js.Promise[Unit],
    deleteObjectStoreEntries: DeleteObjectStoreEntriesRequest => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getMetadata: GetMetadataRequest => js.Promise[GetMetadataResponse],
    requestData: RequestDataRequest => js.Promise[RequestDataResponse],
    requestDatabase: RequestDatabaseRequest => js.Promise[RequestDatabaseResponse],
    requestDatabaseNames: RequestDatabaseNamesRequest => js.Promise[RequestDatabaseNamesResponse]
  ): IndexedDBApi = {
    val __obj = js.Dynamic.literal(clearObjectStore = js.Any.fromFunction1(clearObjectStore), deleteDatabase = js.Any.fromFunction1(deleteDatabase), deleteObjectStoreEntries = js.Any.fromFunction1(deleteObjectStoreEntries), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getMetadata = js.Any.fromFunction1(getMetadata), requestData = js.Any.fromFunction1(requestData), requestDatabase = js.Any.fromFunction1(requestDatabase), requestDatabaseNames = js.Any.fromFunction1(requestDatabaseNames))
    __obj.asInstanceOf[IndexedDBApi]
  }
  
  @scala.inline
  implicit class IndexedDBApiOps[Self <: IndexedDBApi] (val x: Self) extends AnyVal {
    
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
    def setClearObjectStore(value: ClearObjectStoreRequest => js.Promise[Unit]): Self = this.set("clearObjectStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteDatabase(value: DeleteDatabaseRequest => js.Promise[Unit]): Self = this.set("deleteDatabase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteObjectStoreEntries(value: DeleteObjectStoreEntriesRequest => js.Promise[Unit]): Self = this.set("deleteObjectStoreEntries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetadata(value: GetMetadataRequest => js.Promise[GetMetadataResponse]): Self = this.set("getMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestData(value: RequestDataRequest => js.Promise[RequestDataResponse]): Self = this.set("requestData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestDatabase(value: RequestDatabaseRequest => js.Promise[RequestDatabaseResponse]): Self = this.set("requestDatabase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestDatabaseNames(value: RequestDatabaseNamesRequest => js.Promise[RequestDatabaseNamesResponse]): Self = this.set("requestDatabaseNames", js.Any.fromFunction1(value))
  }
}
