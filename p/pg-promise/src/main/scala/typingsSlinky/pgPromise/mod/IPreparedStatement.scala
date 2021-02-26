package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgPromiseStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreparedStatement extends _QueryParam {
  
  var binary: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rowMode: js.UndefOr[array | Null | Unit] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String | QueryFile] = js.native
  
  var values: js.UndefOr[js.Array[_]] = js.native
}
object IPreparedStatement {
  
  @scala.inline
  def apply(): IPreparedStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPreparedStatement]
  }
  
  @scala.inline
  implicit class IPreparedStatementMutableBuilder[Self <: IPreparedStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRowMode(value: array | Unit): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowModeNull: Self = StObject.set(x, "rowMode", null)
    
    @scala.inline
    def setRowModeUndefined: Self = StObject.set(x, "rowMode", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setText(value: String | QueryFile): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
