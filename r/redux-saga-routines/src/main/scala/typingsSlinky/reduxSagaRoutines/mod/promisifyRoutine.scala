package typingsSlinky.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-saga-routines", "promisifyRoutine")
@js.native
object promisifyRoutine extends js.Object {
  
  def apply(
    routine: Routine[
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ]
  ): PromiseCreator[js.Object] = js.native
}
