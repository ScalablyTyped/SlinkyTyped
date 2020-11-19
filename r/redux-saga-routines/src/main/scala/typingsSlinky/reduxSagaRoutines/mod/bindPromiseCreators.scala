package typingsSlinky.reduxSagaRoutines.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-saga-routines", "bindPromiseCreators")
@js.native
object bindPromiseCreators extends js.Object {
  
  def apply(promiseCreators: NumberDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): NumberDictionary[BoundPromiseCreator[js.Object]] = js.native
  def apply(promiseCreators: StringDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): StringDictionary[BoundPromiseCreator[js.Object]] = js.native
  def apply[TPayload](promiseCreator: PromiseCreator[TPayload], dispatch: Dispatch[AnyAction]): BoundPromiseCreator[TPayload] = js.native
}
