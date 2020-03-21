package typingsSlinky.reduxPersist.persistReducerMod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/persistReducer", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
}

