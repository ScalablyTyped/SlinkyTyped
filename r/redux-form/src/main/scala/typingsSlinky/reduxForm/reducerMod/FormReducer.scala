package typingsSlinky.reduxForm.reducerMod

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormReducer extends Reducer[FormStateMap, AnyAction] {
  
  def plugin(reducers: FormReducerMapObject): Reducer[FormStateMap, AnyAction] = js.native
}
