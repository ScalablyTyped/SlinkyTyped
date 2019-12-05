package typingsSlinky.reduxDashPersist

import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.redux.reduxMod.Reducer
import typingsSlinky.redux.reduxMod.ReducersMapObject
import typingsSlinky.reduxDashPersist.esPersistReducerMod.PersistPartial
import typingsSlinky.reduxDashPersist.esTypesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/persistCombineReducers", JSImport.Namespace)
@js.native
object esPersistCombineReducersMod extends js.Object {
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
}

