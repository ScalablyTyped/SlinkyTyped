package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataProvider extends DataProvider {
  
  def getDatabases(connectionUri: String): Thenable[js.Array[String]] = js.native
  
  def getMetadata(connectionUri: String): Thenable[ProviderMetadata] = js.native
  
  def getTableInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]] = js.native
  
  def getViewInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]] = js.native
}
object MetadataProvider {
  
  @scala.inline
  def apply(
    getDatabases: String => Thenable[js.Array[String]],
    getMetadata: String => Thenable[ProviderMetadata],
    getTableInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    getViewInfo: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]],
    providerId: String
  ): MetadataProvider = {
    val __obj = js.Dynamic.literal(getDatabases = js.Any.fromFunction1(getDatabases), getMetadata = js.Any.fromFunction1(getMetadata), getTableInfo = js.Any.fromFunction2(getTableInfo), getViewInfo = js.Any.fromFunction2(getViewInfo), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataProvider]
  }
  
  @scala.inline
  implicit class MetadataProviderOps[Self <: MetadataProvider] (val x: Self) extends AnyVal {
    
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
    def setGetDatabases(value: String => Thenable[js.Array[String]]): Self = this.set("getDatabases", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMetadata(value: String => Thenable[ProviderMetadata]): Self = this.set("getMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTableInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = this.set("getTableInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetViewInfo(value: (String, ObjectMetadata) => Thenable[js.Array[ColumnMetadata]]): Self = this.set("getViewInfo", js.Any.fromFunction2(value))
  }
}
