package typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDataRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String = js.native
  
  /**
    * Index name, empty string for object store data requests.
    */
  var indexName: String = js.native
  
  /**
    * Key range.
    */
  var keyRange: js.UndefOr[KeyRange] = js.native
  
  /**
    * Object store name.
    */
  var objectStoreName: String = js.native
  
  /**
    * Number of records to fetch.
    */
  var pageSize: integer = js.native
  
  /**
    * Security origin.
    */
  var securityOrigin: String = js.native
  
  /**
    * Number of records to skip.
    */
  var skipCount: integer = js.native
}
object RequestDataRequest {
  
  @scala.inline
  def apply(
    databaseName: String,
    indexName: String,
    objectStoreName: String,
    pageSize: integer,
    securityOrigin: String,
    skipCount: integer
  ): RequestDataRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], skipCount = skipCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDataRequest]
  }
  
  @scala.inline
  implicit class RequestDataRequestMutableBuilder[Self <: RequestDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRange(value: KeyRange): Self = StObject.set(x, "keyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRangeUndefined: Self = StObject.set(x, "keyRange", js.undefined)
    
    @scala.inline
    def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: integer): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipCount(value: integer): Self = StObject.set(x, "skipCount", value.asInstanceOf[js.Any])
  }
}
