package typingsSlinky.combineReducers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Reducer[S, A /* <: typingsSlinky.combineReducers.mod.Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  type ReducersMapObject[S, A /* <: typingsSlinky.combineReducers.mod.Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: combine-reducers.combine-reducers.Reducer<S[K], A>}
    */ typingsSlinky.combineReducers.combineReducersStrings.ReducersMapObject with S
}
