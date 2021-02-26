package typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Csv extends StObject {
  
  /** The list of data rows in a CSV file, as string arrays rather than as a single comma-separated string. */
  var dataRows: js.UndefOr[js.Array[CsvRow]] = js.native
  
  /** The list of headers for data columns in a CSV file. */
  var headers: js.UndefOr[js.Array[String]] = js.native
}
object Csv {
  
  @scala.inline
  def apply(): Csv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Csv]
  }
  
  @scala.inline
  implicit class CsvMutableBuilder[Self <: Csv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRows(value: js.Array[CsvRow]): Self = StObject.set(x, "dataRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRowsUndefined: Self = StObject.set(x, "dataRows", js.undefined)
    
    @scala.inline
    def setDataRowsVarargs(value: CsvRow*): Self = StObject.set(x, "dataRows", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
  }
}
