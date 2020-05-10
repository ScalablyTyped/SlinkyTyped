package typingsSlinky.reduxOrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableMod {
  type ArrName[MClass /* <: org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel] */] = typingsSlinky.reduxOrm.tableMod.ExtractModelOption[
    MClass, 
    typingsSlinky.reduxOrm.reduxOrmStrings.arrName, 
    typingsSlinky.reduxOrm.reduxOrmStrings.items
  ]
  type ExtractModelOption[MClass /* <: org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel] */, K /* <: typingsSlinky.reduxOrm.reduxOrmStrings.idAttribute | typingsSlinky.reduxOrm.reduxOrmStrings.arrName | typingsSlinky.reduxOrm.reduxOrmStrings.mapName | typingsSlinky.reduxOrm.reduxOrmStrings.fields */, DefaultValue /* <: java.lang.String */] = DefaultValue
  type IdAttribute[MClass /* <: org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel] */] = typingsSlinky.reduxOrm.tableMod.ExtractModelOption[
    MClass, 
    typingsSlinky.reduxOrm.reduxOrmStrings.idAttribute, 
    typingsSlinky.reduxOrm.reduxOrmStrings.id
  ]
  type MapName[MClass /* <: org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel] */] = typingsSlinky.reduxOrm.tableMod.ExtractModelOption[
    MClass, 
    typingsSlinky.reduxOrm.reduxOrmStrings.mapName, 
    typingsSlinky.reduxOrm.reduxOrmStrings.itemsById
  ]
  type TableIndexes[MClass /* <: org.scalablytyped.runtime.Instantiable0[typingsSlinky.reduxOrm.modelMod.AnyModel] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in redux-orm.redux-orm/Model.FieldSpecKeys<std.InstanceType<MClass>, redux-orm.redux-orm.OneToOne | redux-orm.redux-orm.ForeignKey> ]: string}
    */ typingsSlinky.reduxOrm.reduxOrmStrings.TableIndexes with org.scalablytyped.runtime.TopLevel[js.Any]
}
