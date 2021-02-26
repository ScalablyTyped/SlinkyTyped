package typingsSlinky.reduxPersist

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.ReducersMapObject
import typingsSlinky.reduxPersist.persistReducerMod.PersistPartial
import typingsSlinky.reduxPersist.typesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object persistCombineReducersMod {
  
  @JSImport("redux-persist/es/persistCombineReducers", JSImport.Default)
  @js.native
  def default[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
}
