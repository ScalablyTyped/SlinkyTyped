package typingsSlinky.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDataList extends StObject {
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var pageToken: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[js.Array[TableRow]] = js.native
  
  var totalRows: js.UndefOr[String] = js.native
}
object TableDataList {
  
  @scala.inline
  def apply(): TableDataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataList]
  }
  
  @scala.inline
  implicit class TableDataListMutableBuilder[Self <: TableDataList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[TableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
