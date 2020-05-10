package typingsSlinky.reduxOrm.databaseMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reduxOrm.ormMod.IndexedModelClasses
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSpec[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */] extends js.Object {
  var tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I] = js.native
}

object SchemaSpec {
  @scala.inline
  def apply[I](
    tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I]
  ): SchemaSpec[I] = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpec[I]]
  }
  @scala.inline
  implicit class SchemaSpecOps[Self[i] <: SchemaSpec[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withTables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
      */ typingsSlinky.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I]
    ): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

