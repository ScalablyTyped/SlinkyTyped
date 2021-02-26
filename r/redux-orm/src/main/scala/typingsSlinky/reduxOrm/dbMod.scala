package typingsSlinky.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.reduxOrm.databaseMod.Database
import typingsSlinky.reduxOrm.databaseMod.SchemaSpec
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.ormMod.IndexedModelClasses
import typingsSlinky.reduxOrm.tableMod.ModelTableOpts
import typingsSlinky.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbMod {
  
  object default {
    
    @JSImport("redux-orm/db", "default.default")
    @js.native
    def default[I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](schemaSpec: SchemaSpec[I]): Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typingsSlinky.reduxOrm.reduxOrmStrings.default with TopLevel[I]
      ] = js.native
    
    @JSImport("redux-orm/db", "default.createDatabase")
    @js.native
    def createDatabase[I /* <: IndexedModelClasses[
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
  
  @JSImport("redux-orm/db", "Table")
  @js.native
  /**
    * Creates a new {@link Table} instance.
    *
    * @param   userOpts - options to use.
    * @param   [userOpts.idAttribute=DefaultTableOpts.idAttribute] - the id attribute of the entity.
    * @param   [userOpts.arrName=DefaultTableOpts.arrName] - the state attribute where an array of
    *                                             entity id's are stored
    * @param   [userOpts.mapName=DefaultTableOpts.mapName] - the state attribute where the entity objects
    *                                                 are stored in a id to entity object
    *                                                 map.
    * @param   [userOpts.fields=DefaultTableOpts.fields] - mapping of field key to {@link Field} object
    */
  class Table[MClass /* <: Instantiable0[AnyModel] */] ()
    extends typingsSlinky.reduxOrm.tableMod.Table[MClass] {
    def this(userOpts: ModelTableOpts[MClass]) = this()
  }
  
  @JSImport("redux-orm/db", "createDatabase")
  @js.native
  def createDatabase[I /* <: IndexedModelClasses[
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
