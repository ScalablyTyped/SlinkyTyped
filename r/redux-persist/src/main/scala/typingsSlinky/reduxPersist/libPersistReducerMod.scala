package typingsSlinky.reduxPersist

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.reduxPersist.persistReducerMod.PersistPartial
import typingsSlinky.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/persistReducer", JSImport.Namespace)
@js.native
object libPersistReducerMod extends js.Object {
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
}

