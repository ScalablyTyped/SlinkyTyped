package typingsSlinky.reduxOrm.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reduxOrm.databaseMod.Database
import typingsSlinky.reduxOrm.databaseMod.SchemaSpec
import typingsSlinky.reduxOrm.ormMod.IndexedModelClasses
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "createDatabase")
@js.native
object createDatabase extends js.Object {
  def apply[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.createDatabase with TopLevel[I]
  ] = js.native
}

