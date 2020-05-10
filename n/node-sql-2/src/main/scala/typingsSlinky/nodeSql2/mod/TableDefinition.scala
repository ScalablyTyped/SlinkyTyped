package typingsSlinky.nodeSql2.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.nodeSql2.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDefinition[Name /* <: String */, Row] extends js.Object {
  var columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typingsSlinky.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row] = js.native
  var dialect: js.UndefOr[SQLDialects] = js.native
  var foreignKeys: js.UndefOr[AnonColumns[Row]] = js.native
  var isTemporary: js.UndefOr[Boolean] = js.native
  var name: Name = js.native
  var schema: String = js.native
}

object TableDefinition {
  @scala.inline
  def apply[Name, Row](
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
  implicit class TableDefinitionOps[Self[name, row] <: TableDefinition[name, row], Name, Row] (val x: Self[Name, Row]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Name, Row] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Name, Row]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Name, Row]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Name, Row]) with Other]
    @scala.inline
    def withColumns(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
      */ typingsSlinky.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row]
    ): Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: String): Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialect(value: SQLDialects): Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialect: Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(js.undefined)
        ret
    }
    @scala.inline
    def withForeignKeys(value: AnonColumns[Row]): Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKeys: Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTemporary(value: Boolean): Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTemporary: Self[Name, Row] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTemporary")(js.undefined)
        ret
    }
  }
  
}

