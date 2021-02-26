package typingsSlinky.mysql.mod

import typingsSlinky.mysql.anon.UntypedFieldInfotypestrin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptions extends StObject {
  
  /**
    * Either a boolean or string. If true, tables will be nested objects. If string (e.g. '_'), tables will be
    * nested as tableName_fieldName
    */
  var nestTables: js.UndefOr[js.Any] = js.native
  
  /**
    * The SQL for the query
    */
  var sql: String = js.native
  
  /**
    * Every operation takes an optional inactivity timeout option. This allows you to specify appropriate timeouts for
    * operations. It is important to note that these timeouts are not part of the MySQL protocol, and rather timeout
    * operations through the client. This means that when a timeout is reached, the connection it occurred on will be
    * destroyed and no further operations can be performed.
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Determines if column values should be converted to native JavaScript types. It is not recommended (and may go away / change in the future)
    * to disable type casting, but you can currently do so on either the connection or query level. (Default: true)
    *
    * You can also specify a function (field: any, next: () => void) => {} to do the type casting yourself.
    *
    * WARNING: YOU MUST INVOKE the parser using one of these three field functions in your custom typeCast callback. They can only be called once.
    *
    * field.string()
    * field.buffer()
    * field.geometry()
    *
    * are aliases for
    *
    * parser.parseLengthCodedString()
    * parser.parseLengthCodedBuffer()
    * parser.parseGeometryValue()
    *
    * You can find which field function you need to use by looking at: RowDataPacket.prototype._typeCast
    */
  var typeCast: js.UndefOr[TypeCast] = js.native
  
  /**
    * Values for template query
    */
  var values: js.UndefOr[js.Any] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(sql: String): QueryOptions = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNestTables(value: js.Any): Self = StObject.set(x, "nestTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestTablesUndefined: Self = StObject.set(x, "nestTables", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTypeCast(value: TypeCast): Self = StObject.set(x, "typeCast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCastFunction2(value: (/* field */ UntypedFieldInfotypestrin, /* next */ js.Function0[Unit]) => js.Any): Self = StObject.set(x, "typeCast", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTypeCastUndefined: Self = StObject.set(x, "typeCast", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
