package typingsSlinky.reduxOrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sessionMod {
  type BatchToken = js.Any
  type OrmSession[I /* <: typingsSlinky.reduxOrm.ormMod.IndexedModelClasses[
    _, 
    typingsSlinky.std.Extract[
      /* keyof any */ java.lang.String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] = typingsSlinky.reduxOrm.helpersMod.Assign[
    typingsSlinky.reduxOrm.sessionMod.Session[I], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I], 
    (typingsSlinky.reduxOrm.helpersMod.Diff[
      typingsSlinky.reduxOrm.sessionMod.Session[I], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I]
    ]) with (typingsSlinky.reduxOrm.helpersMod.Intersection[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I], 
      typingsSlinky.reduxOrm.sessionMod.Session[I]
    ]) with (typingsSlinky.reduxOrm.helpersMod.Diff[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I], 
      typingsSlinky.reduxOrm.sessionMod.Session[I]
    ])
  ]
}
