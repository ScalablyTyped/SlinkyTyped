package typingsSlinky.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTablesResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is empty, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of tables. */
  var tables: js.UndefOr[js.Array[Table]] = js.native
}
object ListTablesResponse {
  
  @scala.inline
  def apply(): ListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesResponse]
  }
  
  @scala.inline
  implicit class ListTablesResponseMutableBuilder[Self <: ListTablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTables(value: js.Array[Table]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: Table*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
