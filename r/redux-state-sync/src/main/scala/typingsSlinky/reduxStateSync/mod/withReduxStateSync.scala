package typingsSlinky.reduxStateSync.mod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-state-sync", "withReduxStateSync")
@js.native
object withReduxStateSync extends js.Object {
  
  def apply(appReducer: Reducer[_, AnyAction]): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[_, AnyAction]] = js.native
  def apply(
    appReducer: Reducer[_, AnyAction],
    prepareInitialStateForStore: js.Function1[/* state */ js.Any, _]
  ): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[_, AnyAction]] = js.native
}
