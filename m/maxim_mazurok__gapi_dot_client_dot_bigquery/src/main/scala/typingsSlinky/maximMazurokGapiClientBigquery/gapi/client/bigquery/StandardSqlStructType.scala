package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardSqlStructType extends StObject {
  
  var fields: js.UndefOr[js.Array[StandardSqlField]] = js.native
}
object StandardSqlStructType {
  
  @scala.inline
  def apply(): StandardSqlStructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardSqlStructType]
  }
  
  @scala.inline
  implicit class StandardSqlStructTypeMutableBuilder[Self <: StandardSqlStructType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[StandardSqlField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: StandardSqlField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
