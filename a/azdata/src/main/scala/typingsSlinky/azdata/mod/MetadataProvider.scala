package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataProvider extends DataProvider {
  
  def getDatabases(connectionUri: String): Thenable[js.Array[DatabaseInfo | String]] = js.native
  
  def getMetadata(connectionUri: String): Thenable[ProviderMetadata] = js.native
  
  def getTableInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]] = js.native
  
  def getViewInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]] = js.native
}
object MetadataProvider {
  
  @scala.inline
  def apply(
    getDatabases: String => Thenable[js.Array[DatabaseInfo | String]],
    getMetadata: String => Thenable[ProviderMetadata],
    getTableInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    getViewInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    providerId: String
  ): MetadataProvider = {
    val __obj = js.Dynamic.literal(getDatabases = js.Any.fromFunction1(getDatabases), getMetadata = js.Any.fromFunction1(getMetadata), getTableInfo = js.Any.fromFunction2(getTableInfo), getViewInfo = js.Any.fromFunction2(getViewInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataProvider]
  }
  
  @scala.inline
  implicit class MetadataProviderMutableBuilder[Self <: MetadataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDatabases(value: String => Thenable[js.Array[DatabaseInfo | String]]): Self = StObject.set(x, "getDatabases", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMetadata(value: String => Thenable[ProviderMetadata]): Self = StObject.set(x, "getMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTableInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = StObject.set(x, "getTableInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = StObject.set(x, "getViewInfo", js.Any.fromFunction2(value))
  }
}
