package typingsSlinky.reduxOrm.mod

import typingsSlinky.reduxOrm.ormMod.IndexedModelClasses
import typingsSlinky.reduxOrm.reduxMod.ORMReducer
import typingsSlinky.reduxOrm.reduxMod.defaultUpdater
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "createReducer")
@js.native
object createReducer extends js.Object {
  def apply[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](orm: typingsSlinky.reduxOrm.ormMod.ORM[I, /* keyof I */ String]): ORMReducer[I, TAction] = js.native
  def apply[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](
    orm: typingsSlinky.reduxOrm.ormMod.ORM[I, /* keyof I */ String],
    updater: defaultUpdater[I, TAction]
  ): ORMReducer[I, TAction] = js.native
}

