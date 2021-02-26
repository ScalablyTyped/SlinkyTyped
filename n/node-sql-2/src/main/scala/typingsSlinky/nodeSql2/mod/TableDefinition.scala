package typingsSlinky.nodeSql2.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDefinition[Name /* <: String */, Row] extends StObject {
  
  var columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typingsSlinky.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row] = js.native
  
  var dialect: js.UndefOr[SQLDialects] = js.native
  
  var foreignKeys: js.UndefOr[typingsSlinky.nodeSql2.anon.Columns[Row]] = js.native
  
  var isTemporary: js.UndefOr[Boolean] = js.native
  
  var name: Name = js.native
  
  var schema: String = js.native
}
object TableDefinition {
  
  @scala.inline
  def apply[Name /* <: String */, Row](
    columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typingsSlinky.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row],
    name: Name,
    schema: String
  ): TableDefinition[Name, Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition[Name, Row]]
  }
  
  @scala.inline
  implicit class TableDefinitionMutableBuilder[Self <: TableDefinition[_, _], Name /* <: String */, Row] (val x: Self with (TableDefinition[Name, Row])) extends AnyVal {
    
    @scala.inline
    def setColumns(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
      */ typingsSlinky.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row]
    ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialect(value: SQLDialects): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
    
    @scala.inline
    def setForeignKeys(value: typingsSlinky.nodeSql2.anon.Columns[Row]): Self = StObject.set(x, "foreignKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeysUndefined: Self = StObject.set(x, "foreignKeys", js.undefined)
    
    @scala.inline
    def setIsTemporary(value: Boolean): Self = StObject.set(x, "isTemporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTemporaryUndefined: Self = StObject.set(x, "isTemporary", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
