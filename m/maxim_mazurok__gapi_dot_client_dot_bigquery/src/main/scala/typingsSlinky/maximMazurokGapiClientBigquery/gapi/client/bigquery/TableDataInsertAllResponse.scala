package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typingsSlinky.maximMazurokGapiClientBigquery.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDataInsertAllResponse extends StObject {
  
  /** An array of errors for rows that were not inserted. */
  var insertErrors: js.UndefOr[js.Array[Errors]] = js.native
  
  /** The resource type of the response. */
  var kind: js.UndefOr[String] = js.native
}
object TableDataInsertAllResponse {
  
  @scala.inline
  def apply(): TableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDataInsertAllResponse]
  }
  
  @scala.inline
  implicit class TableDataInsertAllResponseMutableBuilder[Self <: TableDataInsertAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertErrors(value: js.Array[Errors]): Self = StObject.set(x, "insertErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertErrorsUndefined: Self = StObject.set(x, "insertErrors", js.undefined)
    
    @scala.inline
    def setInsertErrorsVarargs(value: Errors*): Self = StObject.set(x, "insertErrors", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
